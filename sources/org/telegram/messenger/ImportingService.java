package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class ImportingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    private e0.t builder;

    public ImportingService() {
        for (int i9 = 0; i9 < 4; i9++) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.historyImportProgressChanged);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    private boolean hasImportingHistory() {
        for (int i9 = 0; i9 < 4; i9++) {
            if (SendMessagesHelper.getInstance(i9).isImportingHistory()) {
                return true;
            }
        }
        return false;
    }

    private boolean hasImportingStickers() {
        for (int i9 = 0; i9 < 4; i9++) {
            if (SendMessagesHelper.getInstance(i9).isImportingStickers()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i9, int i10, Object... objArr) {
        if ((i9 != NotificationCenter.historyImportProgressChanged && i9 != NotificationCenter.stickersImportProgressChanged) || hasImportingStickers() || hasImportingStickers()) {
            return;
        }
        stopSelf();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new e0.n0(ApplicationLoader.applicationContext).b(5);
        for (int i9 = 0; i9 < 4; i9++) {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.historyImportProgressChanged);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("destroy import service");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i9, int i10) {
        if (!hasImportingStickers() && !hasImportingHistory()) {
            stopSelf();
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start import service");
        }
        if (this.builder == null) {
            NotificationsController.checkOtherNotificationsChannel();
            e0.t tVar = new e0.t(ApplicationLoader.applicationContext, null);
            this.builder = tVar;
            tVar.E.icon = android.R.drawable.stat_sys_upload;
            tVar.E.when = System.currentTimeMillis();
            e0.t tVar2 = this.builder;
            tVar2.y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            tVar2.g(LocaleController.getString(R.string.AppName));
            if (hasImportingHistory()) {
                this.builder.p(LocaleController.getString(R.string.ImporImportingService));
                this.builder.f(LocaleController.getString(R.string.ImporImportingService));
            } else {
                this.builder.p(LocaleController.getString(R.string.ImporImportingStickersService));
                this.builder.f(LocaleController.getString(R.string.ImporImportingStickersService));
            }
        }
        e0.t tVar3 = this.builder;
        tVar3.n = 100;
        tVar3.o = 0;
        tVar3.p = true;
        startForeground(5, tVar3.b());
        new e0.n0(ApplicationLoader.applicationContext).d(5, this.builder.b());
        return 2;
    }
}
