package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class qx extends mz {
    public final /* synthetic */ nz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(nz nzVar) {
        super(nzVar, 1);
        this.d = nzVar;
    }

    @Override // org.telegram.ui.Components.mz, s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.mz, s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        nz nzVar = this.d;
        nx nxVar = nzVar.Q;
        nzVar.S(nxVar.I0());
        super.b(recyclerView, i10, i11);
        ny nyVar = nzVar.S;
        if (nyVar == null || nzVar.P.getAdapter() != nyVar || nyVar.x.a() || nyVar.x.a.E) {
            return;
        }
        if (nxVar.N0() + 20 > nyVar.h()) {
            my myVar = nyVar.x;
            Objects.requireNonNull(myVar);
            AndroidUtilities.runOnUIThread(new uw(myVar, 1));
        }
    }
}
