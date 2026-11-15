package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bn0 extends v4.t0 {
    public final /* synthetic */ oe a;

    public bn0(oe oeVar) {
        this.a = oeVar;
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        oe oeVar = this.a;
        View view = oeVar.u;
        boolean z10 = oeVar.w.I0() != 0;
        Boolean bool = oeVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            oeVar.x = Boolean.valueOf(z10);
        }
    }
}
