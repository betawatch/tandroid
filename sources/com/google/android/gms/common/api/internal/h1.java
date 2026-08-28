package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h1 extends k1 {
    public final e b;

    public h1(int i9, e eVar) {
        super(i9);
        this.b = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void a(Status status) {
        try {
            this.b.o(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void b(Exception exc) {
        try {
            this.b.o(new Status(10, aa.d.z(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void c(p0 p0Var) {
        try {
            e eVar = this.b;
            com.google.android.gms.common.api.c cVar = p0Var.b;
            eVar.getClass();
            try {
                eVar.n(cVar);
            } catch (DeadObjectException e10) {
                eVar.o(new Status(8, e10.getLocalizedMessage(), null, null));
                throw e10;
            } catch (RemoteException e11) {
                eVar.o(new Status(8, e11.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e12) {
            b(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void d(g1 g1Var, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = (Map) g1Var.a;
        e eVar = this.b;
        map.put(eVar, valueOf);
        eVar.b(new y(g1Var, eVar));
    }
}
