package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class w implements f0 {
    public final h0 a;

    public w(h0 h0Var) {
        this.a = h0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.f0
    public final d b(d dVar) {
        h0 h0Var = this.a;
        try {
            e0 e0Var = h0Var.o;
            z0 z0Var = e0Var.N;
            ((Set) z0Var.a).add(dVar);
            dVar.g.set((y0) z0Var.b);
            com.google.android.gms.common.api.d dVar2 = dVar.o;
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) e0Var.F.get(dVar2);
            q6.m.i(cVar, "Appropriate Api was not requested.");
            if (!((q6.d) cVar).s() && h0Var.i.containsKey(dVar2)) {
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
            v vVar = new v(this, this);
            d0 d0Var = h0Var.e;
            d0Var.sendMessage(d0Var.obtainMessage(1, vVar));
            return dVar;
        }
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void o(int i7) {
        h0 h0Var = this.a;
        h0Var.h();
        h0Var.p.j(i7);
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final boolean p() {
        h0 h0Var = this.a;
        h0Var.o.getClass();
        h0Var.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void s() {
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void c(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void j(n6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
