package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v implements e0 {
    public final g0 a;

    public v(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final boolean B() {
        g0 g0Var = this.a;
        g0Var.o.getClass();
        g0Var.h();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.e0
    public final d b(d dVar) {
        g0 g0Var = this.a;
        try {
            d0 d0Var = g0Var.o;
            z0 z0Var = d0Var.N;
            ((Set) z0Var.a).add(dVar);
            dVar.g.set((y0) z0Var.b);
            com.google.android.gms.common.api.d dVar2 = dVar.o;
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) d0Var.F.get(dVar2);
            p6.m.h(cVar, "Appropriate Api was not requested.");
            if (!((p6.d) cVar).r() && g0Var.i.containsKey(dVar2)) {
                dVar.o(new Status(17, null, null, null));
                return dVar;
            }
            try {
                dVar.n(cVar);
            } catch (DeadObjectException e10) {
                dVar.o(new Status(8, e10.getLocalizedMessage(), null, null));
                throw e10;
            } catch (RemoteException e11) {
                dVar.o(new Status(8, e11.getLocalizedMessage(), null, null));
            }
            return dVar;
        } catch (DeadObjectException unused) {
            u uVar = new u(this, this);
            c0 c0Var = g0Var.e;
            c0Var.sendMessage(c0Var.obtainMessage(1, uVar));
            return dVar;
        }
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void x(int i3) {
        g0 g0Var = this.a;
        g0Var.h();
        g0Var.p.d(i3);
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void L() {
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void l(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void D(m6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
