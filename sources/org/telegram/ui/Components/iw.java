package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class iw extends dy {
    public final /* synthetic */ ey d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(ey eyVar) {
        super(eyVar, 1);
        this.d = eyVar;
    }

    @Override // org.telegram.ui.Components.dy, u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        if (i3 == 0) {
            this.d.g0 = false;
        }
        super.a(recyclerView, i3);
    }

    @Override // org.telegram.ui.Components.dy, u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        ey eyVar = this.d;
        fw fwVar = eyVar.R;
        eyVar.U(fwVar.I0());
        super.b(recyclerView, i3, i10);
        ex exVar = eyVar.T;
        if (exVar == null || eyVar.Q.getAdapter() != exVar) {
            return;
        }
        ex exVar2 = exVar.y.a;
        if (exVar2.G.W.G || exVar2.F) {
            return;
        }
        if (fwVar.N0() + 20 > exVar.b()) {
            dx dxVar = exVar.y;
            Objects.requireNonNull(dxVar);
            org.telegram.messenger.g0.h3(new nv(dxVar, 1));
        }
    }
}
