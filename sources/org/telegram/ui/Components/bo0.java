package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bo0 extends f2.b1 {
    public final /* synthetic */ re a;

    public bo0(re reVar) {
        this.a = reVar;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        re reVar = this.a;
        View view = reVar.u;
        boolean z10 = reVar.w.I0() != 0;
        Boolean bool = reVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            reVar.x = Boolean.valueOf(z10);
        }
    }
}
