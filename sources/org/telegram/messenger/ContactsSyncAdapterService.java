package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
