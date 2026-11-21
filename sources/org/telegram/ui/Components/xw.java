package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class xw extends sy {
    public final /* synthetic */ ty d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(ty tyVar) {
        super(tyVar, 1);
        this.d = tyVar;
    }

    @Override // org.telegram.ui.Components.sy, v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            this.d.g0 = false;
        }
        super.a(recyclerView, i7);
    }

    @Override // org.telegram.ui.Components.sy, v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        ty tyVar = this.d;
        uw uwVar = tyVar.R;
        tyVar.V(uwVar.I0());
        super.b(recyclerView, i7, i10);
        sx sxVar = tyVar.T;
        if (sxVar == null || tyVar.Q.getAdapter() != sxVar) {
            return;
        }
        sx sxVar2 = sxVar.y.a;
        if (sxVar2.G.W.G || sxVar2.F) {
            return;
        }
        if (uwVar.N0() + 20 > sxVar.b()) {
            rx rxVar = sxVar.y;
            Objects.requireNonNull(rxVar);
            org.telegram.messenger.g0.g3(new cw(rxVar, 1));
        }
    }
}
