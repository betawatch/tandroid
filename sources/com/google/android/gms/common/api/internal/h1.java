package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        } catch (IllegalStateException e9) {
            Log.w("ApiCallRunner", "Exception reporting failure", e9);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void b(Exception exc) {
        try {
            this.b.o(new Status(10, a9.p.w(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e9) {
            Log.w("ApiCallRunner", "Exception reporting failure", e9);
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
            } catch (DeadObjectException e9) {
                eVar.o(new Status(8, e9.getLocalizedMessage(), null, null));
                throw e9;
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
