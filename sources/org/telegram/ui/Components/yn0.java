package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yn0 extends s4.s0 {
    public final /* synthetic */ ie a;

    public yn0(ie ieVar) {
        this.a = ieVar;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ie ieVar = this.a;
        View view = ieVar.u;
        boolean z10 = ieVar.w.I0() != 0;
        Boolean bool = ieVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            ieVar.x = Boolean.valueOf(z10);
        }
    }
}
