package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
