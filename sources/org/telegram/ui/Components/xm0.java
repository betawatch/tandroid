package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xm0 extends v4.s0 {
    public final /* synthetic */ me a;

    public xm0(me meVar) {
        this.a = meVar;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        me meVar = this.a;
        View view = meVar.u;
        boolean z9 = meVar.w.I0() != 0;
        Boolean bool = meVar.x;
        if (bool == null || z9 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z9 ? 1.0f : 0.0f).setDuration(150L).start();
            meVar.x = Boolean.valueOf(z9);
        }
    }
}
