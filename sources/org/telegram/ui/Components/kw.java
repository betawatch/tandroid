package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class kw extends gy {
    public final /* synthetic */ hy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(hy hyVar) {
        super(hyVar, 1);
        this.d = hyVar;
    }

    @Override // org.telegram.ui.Components.gy, v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            this.d.f0 = false;
        }
        super.a(recyclerView, i7);
    }

    @Override // org.telegram.ui.Components.gy, v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        hy hyVar = this.d;
        hw hwVar = hyVar.Q;
        hyVar.U(hwVar.I0());
        super.b(recyclerView, i7, i10);
        hx hxVar = hyVar.S;
        if (hxVar == null || hyVar.P.getAdapter() != hxVar) {
            return;
        }
        hx hxVar2 = hxVar.y.a;
        if (hxVar2.F.V.F || hxVar2.E) {
            return;
        }
        if (hwVar.N0() + 20 > hxVar.b()) {
            gx gxVar = hxVar.y;
            Objects.requireNonNull(gxVar);
            org.telegram.messenger.g0.h3(new pv(gxVar, 1));
        }
    }
}
