package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class ContactsSyncAdapterService extends Service {
    public static pv2 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        pv2 pv2Var = a;
        if (pv2Var == null) {
            pv2Var = new pv2(this, true);
            a = pv2Var;
        }
        return pv2Var.getSyncAdapterBinder();
    }
}
