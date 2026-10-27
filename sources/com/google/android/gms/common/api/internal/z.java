package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class z implements j0 {
    public final l0 a;

    public z(l0 l0Var) {
        this.a = l0Var;
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final boolean F() {
        l0 l0Var = this.a;
        l0Var.o.getClass();
        l0Var.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final e G(e eVar) {
        l0 l0Var = this.a;
        try {
            f1 f1Var = l0Var.o.M;
            ((Set) f1Var.a).add(eVar);
            eVar.g.set((e1) f1Var.b);
            com.google.android.gms.common.api.d dVar = eVar.o;
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) l0Var.o.E.get(dVar);
            o6.l.i(cVar, "Appropriate Api was not requested.");
            if (!cVar.i() && l0Var.i.containsKey(dVar)) {
                eVar.o(new Status(17, null, null, null));
                return eVar;
            }
            try {
                eVar.n(cVar);
            } catch (DeadObjectException e) {
                eVar.o(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e10) {
                eVar.o(new Status(8, e10.getLocalizedMessage(), null, null));
            }
            return eVar;
        } catch (DeadObjectException unused) {
            y yVar = new y(this, this);
            g0 g0Var = l0Var.e;
            g0Var.sendMessage(g0Var.obtainMessage(1, yVar));
            return eVar;
        }
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void o(int i10) {
        l0 l0Var = this.a;
        l0Var.h();
        l0Var.p.p(i10);
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void k() {
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void u() {
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void c(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void e(l6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
