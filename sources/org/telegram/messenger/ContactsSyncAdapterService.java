package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
