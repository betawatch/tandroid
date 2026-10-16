package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
