package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ContactsSyncAdapterService extends Service {
    public static fw2 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        fw2 fw2Var = a;
        if (fw2Var == null) {
            fw2Var = new fw2(this, true);
            a = fw2Var;
        }
        return fw2Var.getSyncAdapterBinder();
    }
}
