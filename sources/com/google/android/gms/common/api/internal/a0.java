package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a0 implements l0 {
    public final n0 a;

    public a0(n0 n0Var) {
        this.a = n0Var;
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final void K(int i10) {
        n0 n0Var = this.a;
        n0Var.h();
        n0Var.p.w(i10);
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final boolean b0() {
        n0 n0Var = this.a;
        n0Var.o.getClass();
        n0Var.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final e j0(e eVar) {
        n0 n0Var = this.a;
        try {
            h1 h1Var = n0Var.o.M;
            ((Set) h1Var.a).add(eVar);
            eVar.g.set((g1) h1Var.b);
            com.google.android.gms.common.api.d dVar = eVar.o;
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) n0Var.o.E.get(dVar);
            n6.l.h(cVar, "Appropriate Api was not requested.");
            if (!cVar.k() && n0Var.i.containsKey(dVar)) {
                eVar.o(new Status(17, null, null, null));
                return eVar;
            }
            try {
                eVar.n(cVar);
            } catch (DeadObjectException e) {
                eVar.o(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e7) {
                eVar.o(new Status(8, e7.getLocalizedMessage(), null, null));
            }
            return eVar;
        } catch (DeadObjectException unused) {
            z zVar = new z(this, this);
            i0 i0Var = n0Var.e;
            i0Var.sendMessage(i0Var.obtainMessage(1, zVar));
            return eVar;
        }
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final void Q() {
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final void q() {
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final void l(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final void I(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
