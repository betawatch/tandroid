package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g1 extends j1 {
    public final e b;

    public g1(int i10, e eVar) {
        super(i10);
        this.b = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void a(Status status) {
        try {
            this.b.o(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void b(Exception exc) {
        try {
            this.b.o(new Status(10, a1.g.D(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void c(o0 o0Var) {
        try {
            e eVar = this.b;
            com.google.android.gms.common.api.c cVar = o0Var.b;
            eVar.getClass();
            try {
                eVar.n(cVar);
            } catch (DeadObjectException e) {
                eVar.o(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e10) {
                eVar.o(new Status(8, e10.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e11) {
            b(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j1
    public final void d(f1 f1Var, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = (Map) f1Var.a;
        e eVar = this.b;
        map.put(eVar, valueOf);
        eVar.b(new x(f1Var, eVar));
    }
}
