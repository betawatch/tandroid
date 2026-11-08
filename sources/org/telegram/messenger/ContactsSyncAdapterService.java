package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class ContactsSyncAdapterService extends Service {
    public static j5 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (a == null) {
            a = new j5(this, true);
        }
        return a.getSyncAdapterBinder();
    }
}
