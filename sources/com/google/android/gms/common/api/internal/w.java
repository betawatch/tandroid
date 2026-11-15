package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class w implements g0 {
    public final i0 a;

    public w(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final boolean C() {
        i0 i0Var = this.a;
        i0Var.o.getClass();
        i0Var.h();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.g0
    public final d b(d dVar) {
        i0 i0Var = this.a;
        try {
            f0 f0Var = i0Var.o;
            a1 a1Var = f0Var.N;
            ((Set) a1Var.a).add(dVar);
            dVar.g.set((z0) a1Var.b);
            com.google.android.gms.common.api.d dVar2 = dVar.o;
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) f0Var.F.get(dVar2);
            q6.m.h(cVar, "Appropriate Api was not requested.");
            if (!((q6.d) cVar).s() && i0Var.i.containsKey(dVar2)) {
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
            e0 e0Var = i0Var.e;
            e0Var.sendMessage(e0Var.obtainMessage(1, vVar));
            return dVar;
        }
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void y(int i7) {
        i0 i0Var = this.a;
        i0Var.h();
        i0Var.p.i(i7);
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void E() {
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void c(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void l(n6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
