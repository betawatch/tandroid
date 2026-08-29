package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a0 implements k0 {
    public final m0 a;

    public a0(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void B(int i10) {
        m0 m0Var = this.a;
        m0Var.h();
        m0Var.p.t(i10);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final boolean N() {
        m0 m0Var = this.a;
        m0Var.o.getClass();
        m0Var.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final e T(e eVar) {
        m0 m0Var = this.a;
        try {
            g1 g1Var = m0Var.o.I;
            ((Set) g1Var.a).add(eVar);
            eVar.g.set((f1) g1Var.b);
            com.google.android.gms.common.api.d dVar = eVar.o;
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) m0Var.o.A.get(dVar);
            z5.l.i(cVar, "Appropriate Api was not requested.");
            if (!cVar.h() && m0Var.i.containsKey(dVar)) {
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
    public final void F() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void g() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void z(w5.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
