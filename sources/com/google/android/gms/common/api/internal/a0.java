package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 implements k0 {
    public final m0 a;

    public a0(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final boolean A() {
        m0 m0Var = this.a;
        m0Var.o.getClass();
        m0Var.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final e C(e eVar) {
        m0 m0Var = this.a;
        try {
            g1 g1Var = m0Var.o.I;
            ((Set) g1Var.a).add(eVar);
            eVar.g.set((f1) g1Var.b);
            com.google.android.gms.common.api.d dVar = eVar.o;
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) m0Var.o.A.get(dVar);
            x5.l.i(cVar, "Appropriate Api was not requested.");
            if (!cVar.i() && m0Var.i.containsKey(dVar)) {
                eVar.o(new Status(17, null, null, null));
                return eVar;
            }
            try {
                eVar.n(cVar);
            } catch (DeadObjectException e10) {
                eVar.o(new Status(8, e10.getLocalizedMessage(), null, null));
                throw e10;
            } catch (RemoteException e11) {
                eVar.o(new Status(8, e11.getLocalizedMessage(), null, null));
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
    public final void r(int i9) {
        m0 m0Var = this.a;
        m0Var.h();
        m0Var.p.n(i9);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void j() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void v() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void b(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void p(u5.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
