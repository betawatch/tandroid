package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class uw extends py {
    public final /* synthetic */ qy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(qy qyVar) {
        super(qyVar, 1);
        this.d = qyVar;
    }

    @Override // org.telegram.ui.Components.py, v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            this.d.g0 = false;
        }
        super.a(recyclerView, i7);
    }

    @Override // org.telegram.ui.Components.py, v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        qy qyVar = this.d;
        rw rwVar = qyVar.R;
        qyVar.V(rwVar.I0());
        super.b(recyclerView, i7, i10);
        px pxVar = qyVar.T;
        if (pxVar == null || qyVar.Q.getAdapter() != pxVar) {
            return;
        }
        px pxVar2 = pxVar.y.a;
        if (pxVar2.G.W.G || pxVar2.F) {
            return;
        }
        if (rwVar.N0() + 20 > pxVar.b()) {
            ox oxVar = pxVar.y;
            Objects.requireNonNull(oxVar);
            org.telegram.messenger.g0.g3(new zv(oxVar, 1));
        }
    }
}
