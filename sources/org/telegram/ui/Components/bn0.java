package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
