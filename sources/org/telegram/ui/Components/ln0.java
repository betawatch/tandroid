package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ln0 extends v4.u0 {
    public final /* synthetic */ ye a;

    public ln0(ye yeVar) {
        this.a = yeVar;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        ye yeVar = this.a;
        View view = yeVar.u;
        boolean z10 = yeVar.w.I0() != 0;
        Boolean bool = yeVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            yeVar.x = Boolean.valueOf(z10);
        }
    }
}
