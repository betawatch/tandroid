package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        } catch (IllegalStateException e6) {
            Log.w("ApiCallRunner", "Exception reporting failure", e6);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void b(Exception exc) {
        try {
            this.b.o(new Status(10, android.support.v4.media.a.z(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e6) {
            Log.w("ApiCallRunner", "Exception reporting failure", e6);
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
            } catch (DeadObjectException e6) {
                eVar.o(new Status(8, e6.getLocalizedMessage(), null, null));
                throw e6;
            } catch (RemoteException e10) {
                eVar.o(new Status(8, e10.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e11) {
            b(e11);
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
