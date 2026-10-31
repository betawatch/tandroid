package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i1 extends l1 {
    public final e b;

    public i1(int i10, e eVar) {
        super(i10);
        this.b = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void a(Status status) {
        try {
            this.b.o(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void b(Exception exc) {
        try {
            this.b.o(new Status(10, a1.g.C(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void c(q0 q0Var) {
        try {
            e eVar = this.b;
            com.google.android.gms.common.api.c cVar = q0Var.b;
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

    @Override // com.google.android.gms.common.api.internal.l1
    public final void d(h1 h1Var, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = (Map) h1Var.a;
        e eVar = this.b;
        map.put(eVar, valueOf);
        eVar.b(new y(h1Var, eVar));
    }
}
