package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gp0 extends s4.s0 {
    public final /* synthetic */ ef a;

    public gp0(ef efVar) {
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
