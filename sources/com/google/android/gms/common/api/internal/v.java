package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class v implements e0 {
    public final g0 a;

    public v(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void A(int i7) {
        g0 g0Var = this.a;
        g0Var.h();
        g0Var.p.i(i7);
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final boolean I() {
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
            y0 y0Var = d0Var.M;
            ((Set) y0Var.a).add(dVar);
            dVar.g.set((x0) y0Var.b);
            com.google.android.gms.common.api.d dVar2 = dVar.o;
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) d0Var.E.get(dVar2);
            q6.m.h(cVar, "Appropriate Api was not requested.");
            if (!((q6.d) cVar).s() && g0Var.i.containsKey(dVar2)) {
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
    public final void R() {
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void c(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void q(n6.a aVar, com.google.android.gms.common.api.e eVar, boolean z9) {
    }
}
