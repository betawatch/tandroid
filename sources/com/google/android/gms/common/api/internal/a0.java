package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a0 implements k0 {
    public final m0 a;

    public a0(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final e A(e eVar) {
        m0 m0Var = this.a;
        try {
            g1 g1Var = m0Var.o.M;
            ((Set) g1Var.a).add(eVar);
            eVar.g.set((f1) g1Var.b);
            com.google.android.gms.common.api.d dVar = eVar.o;
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) m0Var.o.E.get(dVar);
            n6.l.i(cVar, "Appropriate Api was not requested.");
            if (!cVar.j() && m0Var.i.containsKey(dVar)) {
                eVar.o(new Status(17, null, null, null));
                return eVar;
            }
            try {
                eVar.n(cVar);
            } catch (DeadObjectException e7) {
                eVar.o(new Status(8, e7.getLocalizedMessage(), null, null));
                throw e7;
            } catch (RemoteException e10) {
                eVar.o(new Status(8, e10.getLocalizedMessage(), null, null));
            }
            return eVar;
        } catch (DeadObjectException unused) {
            z zVar = new z(this, this);
            h0 h0Var = m0Var.e;
            h0Var.sendMessage(h0Var.obtainMessage(1, zVar));
            return eVar;
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void w(int i10) {
        m0 m0Var = this.a;
        m0Var.h();
        m0Var.p.p(i10);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final boolean z() {
        m0 m0Var = this.a;
        m0Var.o.getClass();
        m0Var.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void f() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void x() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void c(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void u(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
