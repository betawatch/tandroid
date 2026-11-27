package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
