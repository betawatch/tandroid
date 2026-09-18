package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class fp0 extends s4.s0 {
    public final /* synthetic */ ef a;

    public fp0(ef efVar) {
        this.a = efVar;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ef efVar = this.a;
        View view = efVar.u;
        boolean z10 = efVar.w.I0() != 0;
        Boolean bool = efVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            efVar.x = Boolean.valueOf(z10);
        }
    }
}
