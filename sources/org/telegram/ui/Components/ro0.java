package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ro0 extends s4.s0 {
    public final /* synthetic */ cf a;

    public ro0(cf cfVar) {
        this.a = cfVar;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        cf cfVar = this.a;
        View view = cfVar.u;
        boolean z10 = cfVar.w.I0() != 0;
        Boolean bool = cfVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            cfVar.x = Boolean.valueOf(z10);
        }
    }
}
