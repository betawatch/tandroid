package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class ContactsSyncAdapterService extends Service {
    public static l5 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (a == null) {
            a = new l5(this, true);
        }
        return a.getSyncAdapterBinder();
    }
}
