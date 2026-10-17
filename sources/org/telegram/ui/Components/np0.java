package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class np0 extends s4.r0 {
    public final /* synthetic */ ef a;

    public np0(ef efVar) {
        this.a = efVar;
    }

    @Override // s4.r0
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
