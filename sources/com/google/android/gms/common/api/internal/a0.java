package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a0 implements k0 {
    public final m0 a;

    public a0(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final boolean D() {
        m0 m0Var = this.a;
        m0Var.o.getClass();
        m0Var.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final e H(e eVar) {
        m0 m0Var = this.a;
        try {
            h1 h1Var = m0Var.o.J;
            ((Set) h1Var.a).add(eVar);
            eVar.g.set((g1) h1Var.b);
            com.google.android.gms.common.api.d dVar = eVar.o;
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) m0Var.o.B.get(dVar);
            b6.m.i(cVar, "Appropriate Api was not requested.");
            if (!cVar.h() && m0Var.i.containsKey(dVar)) {
                eVar.o(new Status(17, null, null, null));
                return eVar;
            }
            try {
                eVar.n(cVar);
            } catch (DeadObjectException e) {
                eVar.o(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e6) {
                eVar.o(new Status(8, e6.getLocalizedMessage(), null, null));
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
    public final void t(int i10) {
        m0 m0Var = this.a;
        m0Var.h();
        m0Var.p.m(i10);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void h() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void w() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void d(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void k(y5.a aVar, com.google.android.gms.common.api.e eVar, boolean z4) {
    }
}
