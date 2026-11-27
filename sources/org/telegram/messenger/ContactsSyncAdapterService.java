package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
