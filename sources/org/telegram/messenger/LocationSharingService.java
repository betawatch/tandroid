package org.telegram.messenger;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import java.util.ArrayList;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class LocationSharingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private e0.q builder;
    private Handler handler;
    private Runnable runnable;

    public LocationSharingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
    }

    private ArrayList<LocationController.SharingLocationInfo> getInfos() {
        ArrayList<LocationController.SharingLocationInfo> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList2 = LocationController.getInstance(i10).sharingLocationsUI;
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didReceivedNotification$2() {
        if (getInfos().isEmpty()) {
            stopSelf();
        } else {
            updateNotification(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreate$0() {
        for (int i10 = 0; i10 < 4; i10++) {
            LocationController.getInstance(i10).update();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1() {
        this.handler.postDelayed(this.runnable, 1000L);
        Utilities.stageQueue.postRunnable(new y1(14));
    }

    private void updateNotification(boolean z10) {
        String formatPluralString;
        String string;
        if (this.builder == null) {
            return;
        }
        ArrayList<LocationController.SharingLocationInfo> infos = getInfos();
        if (infos.size() == 1) {
            LocationController.SharingLocationInfo sharingLocationInfo = infos.get(0);
            long dialogId = sharingLocationInfo.messageObject.getDialogId();
            int i10 = sharingLocationInfo.messageObject.currentAccount;
            if (DialogObject.isUserDialog(dialogId)) {
                formatPluralString = UserObject.getFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(dialogId)));
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharing);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialogId));
                formatPluralString = chat != null ? chat.title : "";
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChat);
            }
        } else {
            formatPluralString = LocaleController.formatPluralString("Chats", infos.size(), new Object[0]);
            string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChats);
        }
        String format = String.format(string, LocaleController.getString(R.string.AttachLiveLocation), formatPluralString);
        this.builder.p(format);
        this.builder.f(format);
        if (z10) {
            new e0.k0(ApplicationLoader.applicationContext).e(null, 6, this.builder.b());
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        Handler handler;
        if (i10 != NotificationCenter.liveLocationsChanged || (handler = this.handler) == null) {
            return;
        }
        handler.post(new y5(this, 1));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Handler handler = new Handler();
        this.handler = handler;
        y5 y5Var = new y5(this, 0);
        this.runnable = y5Var;
        handler.postDelayed(y5Var, 1000L);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.runnable);
        }
        stopForeground(true);
        new e0.k0(ApplicationLoader.applicationContext).b(6, null);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (getInfos().isEmpty()) {
            stopSelf();
        }
        try {
            if (this.builder == null) {
                Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                intent2.setAction("org.tmessages.openlocations");
                intent2.addCategory("android.intent.category.LAUNCHER");
                PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160);
                e0.q qVar = new e0.q(ApplicationLoader.applicationContext, null);
                this.builder = qVar;
                qVar.E.when = System.currentTimeMillis();
                e0.q qVar2 = this.builder;
                qVar2.E.icon = R.drawable.live_loc;
                qVar2.g = activity;
                NotificationsController.checkOtherNotificationsChannel();
                e0.q qVar3 = this.builder;
                qVar3.y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
                qVar3.g(LocaleController.getString(R.string.AppName));
                this.builder.a(0, LocaleController.getString(R.string.StopLiveLocation), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, new Intent(ApplicationLoader.applicationContext, (Class<?>) StopLiveLocationReceiver.class), 167772160));
            }
            updateNotification(false);
            startForeground(6, this.builder.b());
            return 2;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return 2;
        }
    }
}
