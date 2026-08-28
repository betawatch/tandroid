package org.telegram.ui.Stories.recorder;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.n0;
import e0.t;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class StoryUploadingService extends Service implements NotificationCenter.NotificationCenterDelegate {
    public t a;
    public String b;
    public float c;
    public int d = -1;

    public StoryUploadingService() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        String str;
        if (i9 != NotificationCenter.uploadStoryProgress) {
            if (i9 == NotificationCenter.uploadStoryEnd && (str = this.b) != null && str.equals((String) objArr[0])) {
                stopSelf();
                return;
            }
            return;
        }
        String str2 = this.b;
        if (str2 == null || !str2.equals((String) objArr[0])) {
            return;
        }
        float floatValue = ((Float) objArr[1]).floatValue();
        this.c = floatValue;
        t tVar = this.a;
        int round = Math.round(floatValue * 100.0f);
        boolean z10 = this.c <= 0.0f;
        tVar.n = 100;
        tVar.o = round;
        tVar.p = z10;
        try {
            new n0(ApplicationLoader.applicationContext).d(33, this.a.b());
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        try {
            stopForeground(true);
        } catch (Exception unused) {
        }
        new n0(ApplicationLoader.applicationContext).b(33);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
        NotificationCenter.getInstance(this.d).removeObserver(this, NotificationCenter.uploadStoryProgress);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("upload story destroy");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i9, int i10) {
        this.b = intent.getStringExtra("path");
        int i11 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        this.d = intExtra;
        if (!UserConfig.isValidAccount(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i11 != this.d) {
            if (i11 != -1) {
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.uploadStoryProgress);
            }
            int i12 = this.d;
            if (i12 != -1) {
                NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.uploadStoryProgress);
            }
        }
        if (this.b == null) {
            stopSelf();
            return 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload story");
        }
        if (this.a == null) {
            NotificationsController.checkOtherNotificationsChannel();
            t tVar = new t(ApplicationLoader.applicationContext, null);
            this.a = tVar;
            tVar.E.icon = R.drawable.stat_sys_upload;
            tVar.E.when = System.currentTimeMillis();
            t tVar2 = this.a;
            tVar2.y = NotificationsController.OTHER_NOTIFICATIONS_CHANNEL;
            tVar2.g(LocaleController.getString(org.telegram.messenger.R.string.AppName));
            this.a.p(LocaleController.getString(org.telegram.messenger.R.string.StoryUploading));
            this.a.f(LocaleController.getString(org.telegram.messenger.R.string.StoryUploading));
        }
        this.c = 0.0f;
        t tVar3 = this.a;
        int round = Math.round(0.0f);
        tVar3.n = 100;
        tVar3.o = round;
        tVar3.p = false;
        startForeground(33, this.a.b());
        try {
            new n0(ApplicationLoader.applicationContext).d(33, this.a.b());
            return 2;
        } catch (Throwable th) {
            FileLog.e(th);
            return 2;
        }
    }
}
