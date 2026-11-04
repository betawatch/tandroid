package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class an0 extends u4.t0 {
    public final /* synthetic */ le a;

    public an0(le leVar) {
        this.a = leVar;
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        le leVar = this.a;
        View view = leVar.u;
        boolean z10 = leVar.w.I0() != 0;
        Boolean bool = leVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            leVar.x = Boolean.valueOf(z10);
        }
    }
}
