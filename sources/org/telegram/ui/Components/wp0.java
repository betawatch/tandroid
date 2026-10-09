package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wp0 extends s4.t0 {
    public final /* synthetic */ hf a;

    public wp0(hf hfVar) {
        this.a = hfVar;
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        hf hfVar = this.a;
        View view = hfVar.u;
        boolean z10 = hfVar.w.I0() != 0;
        Boolean bool = hfVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            hfVar.x = Boolean.valueOf(z10);
        }
    }
}
