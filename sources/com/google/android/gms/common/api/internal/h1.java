package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h1 extends k1 {
    public final e b;

    public h1(int i10, e eVar) {
        super(i10);
        this.b = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void a(Status status) {
        try {
            this.b.o(status);
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void b(Exception exc) {
        try {
            this.b.o(new Status(10, a4.a.C(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
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
            } catch (DeadObjectException e7) {
                eVar.o(new Status(8, e7.getLocalizedMessage(), null, null));
                throw e7;
            } catch (RemoteException e10) {
                eVar.o(new Status(8, e10.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e11) {
            b(e11);
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
