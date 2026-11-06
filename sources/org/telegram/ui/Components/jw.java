package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class jw extends fy {
    public final /* synthetic */ gy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(gy gyVar) {
        super(gyVar, 1);
        this.d = gyVar;
    }

    @Override // org.telegram.ui.Components.fy, v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            this.d.f0 = false;
        }
        super.a(recyclerView, i7);
    }

    @Override // org.telegram.ui.Components.fy, v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        gy gyVar = this.d;
        gw gwVar = gyVar.Q;
        gyVar.U(gwVar.I0());
        super.b(recyclerView, i7, i10);
        gx gxVar = gyVar.S;
        if (gxVar == null || gyVar.P.getAdapter() != gxVar) {
            return;
        }
        gx gxVar2 = gxVar.y.a;
        if (gxVar2.F.V.F || gxVar2.E) {
            return;
        }
        if (gwVar.N0() + 20 > gxVar.b()) {
            fx fxVar = gxVar.y;
            Objects.requireNonNull(fxVar);
            org.telegram.messenger.g0.h3(new ov(fxVar, 1));
        }
    }
}
