package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a0 implements k0 {
    public final m0 a;

    public a0(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void l(int i10) {
        m0 m0Var = this.a;
        m0Var.h();
        m0Var.p.v(i10);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final boolean r() {
        m0 m0Var = this.a;
        m0Var.o.getClass();
        m0Var.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final e t(e eVar) {
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
            } catch (DeadObjectException e) {
                eVar.o(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e7) {
                eVar.o(new Status(8, e7.getLocalizedMessage(), null, null));
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
    public final void f() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void m() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void d(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void k(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
