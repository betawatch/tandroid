package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yw extends uy {
    public final /* synthetic */ vy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(vy vyVar) {
        super(vyVar, 1);
        this.d = vyVar;
    }

    @Override // org.telegram.ui.Components.uy, s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.uy, s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        vy vyVar = this.d;
        vw vwVar = vyVar.Q;
        vyVar.V(vwVar.I0());
        super.b(recyclerView, i10, i11);
        ux uxVar = vyVar.S;
        if (uxVar == null || vyVar.P.getAdapter() != uxVar) {
            return;
        }
        ux uxVar2 = uxVar.y.a;
        if (uxVar2.F.V.F || uxVar2.E) {
            return;
        }
        if (vwVar.N0() + 20 > uxVar.b()) {
            tx txVar = uxVar.y;
            Objects.requireNonNull(txVar);
            org.telegram.messenger.i0.g3(new aw(txVar, 1));
        }
    }
}
