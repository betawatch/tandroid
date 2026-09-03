package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vo0 extends f2.a1 {
    public final /* synthetic */ ve a;

    public vo0(ve veVar) {
        this.a = veVar;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ve veVar = this.a;
        View view = veVar.u;
        boolean z4 = veVar.w.I0() != 0;
        Boolean bool = veVar.x;
        if (bool == null || z4 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z4 ? 1.0f : 0.0f).setDuration(150L).start();
            veVar.x = Boolean.valueOf(z4);
        }
    }
}
