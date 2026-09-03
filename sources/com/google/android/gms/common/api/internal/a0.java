package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a0 implements k0 {
    public final m0 a;

    public a0(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final boolean G() {
        m0 m0Var = this.a;
        m0Var.o.getClass();
        m0Var.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final e L(e eVar) {
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
            } catch (DeadObjectException e6) {
                eVar.o(new Status(8, e6.getLocalizedMessage(), null, null));
                throw e6;
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
    public final void z(int i10) {
        m0 m0Var = this.a;
        m0Var.h();
        m0Var.p.o(i10);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void C() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void e() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void b(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void f(y5.a aVar, com.google.android.gms.common.api.e eVar, boolean z4) {
    }
}
