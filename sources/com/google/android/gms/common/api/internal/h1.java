package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void b(Exception exc) {
        try {
            this.b.o(new Status(10, a4.a.C(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
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
            } catch (DeadObjectException e) {
                eVar.o(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e7) {
                eVar.o(new Status(8, e7.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e10) {
            b(e10);
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
