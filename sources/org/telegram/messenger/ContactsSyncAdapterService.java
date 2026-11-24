package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ContactsSyncAdapterService extends Service {
    public static uu2 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        uu2 uu2Var = a;
        if (uu2Var == null) {
            uu2Var = new uu2(this, true);
            a = uu2Var;
        }
        return uu2Var.getSyncAdapterBinder();
    }
}
