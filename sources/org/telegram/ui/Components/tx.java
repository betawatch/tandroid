package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tx extends rz {
    public final /* synthetic */ sz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(sz szVar) {
        super(szVar, 1);
        this.d = szVar;
    }

    @Override // org.telegram.ui.Components.rz, s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.rz, s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        sz szVar = this.d;
        qx qxVar = szVar.Q;
        szVar.V(qxVar.I0());
        super.b(recyclerView, i10, i11);
        sy syVar = szVar.S;
        if (syVar == null || szVar.P.getAdapter() != syVar || syVar.x.a() || syVar.x.a.E) {
            return;
        }
        if (qxVar.N0() + 20 > syVar.h()) {
            ry ryVar = syVar.x;
            Objects.requireNonNull(ryVar);
            AndroidUtilities.runOnUIThread(new yw(ryVar, 1));
        }
    }
}
