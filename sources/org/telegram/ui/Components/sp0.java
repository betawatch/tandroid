package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class sp0 extends s4.r0 {
    public final /* synthetic */ gf a;

    public sp0(gf gfVar) {
        this.a = gfVar;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        gf gfVar = this.a;
        View view = gfVar.u;
        boolean z10 = gfVar.w.I0() != 0;
        Boolean bool = gfVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            gfVar.x = Boolean.valueOf(z10);
        }
    }
}
