package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class xm0 extends v4.s0 {
    public final /* synthetic */ ne a;

    public xm0(ne neVar) {
        this.a = neVar;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        ne neVar = this.a;
        View view = neVar.u;
        boolean z9 = neVar.w.I0() != 0;
        Boolean bool = neVar.x;
        if (bool == null || z9 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z9 ? 1.0f : 0.0f).setDuration(150L).start();
            neVar.x = Boolean.valueOf(z9);
        }
    }
}
