package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
            this.b.o(new Status(10, android.support.v4.media.a.z(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l1
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
            } catch (RemoteException e6) {
                eVar.o(new Status(8, e6.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void d(h1 h1Var, boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        Map map = (Map) h1Var.a;
        e eVar = this.b;
        map.put(eVar, valueOf);
        eVar.b(new y(h1Var, eVar));
    }
}
