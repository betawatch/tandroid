package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class sp0 extends s4.r0 {
    public final /* synthetic */ ef a;

    public sp0(ef efVar) {
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
