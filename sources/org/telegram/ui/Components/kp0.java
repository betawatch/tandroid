package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class kp0 extends s4.s0 {
    public final /* synthetic */ gf a;

    public kp0(gf gfVar) {
        this.a = gfVar;
    }

    @Override // s4.s0
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
