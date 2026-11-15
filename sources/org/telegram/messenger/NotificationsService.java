package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class NotificationsService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        t0.w();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (np.f1().getBoolean("pushService", true)) {
            Intent intent = new Intent("org.telegram.start");
            intent.setPackage(getPackageName());
            sendBroadcast(intent);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        return 1;
    }
}
