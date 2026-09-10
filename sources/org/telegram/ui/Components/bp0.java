package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bp0 extends s4.s0 {
    public final /* synthetic */ ff a;

    public bp0(ff ffVar) {
        this.a = ffVar;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ff ffVar = this.a;
        View view = ffVar.u;
        boolean z10 = ffVar.w.I0() != 0;
        Boolean bool = ffVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            ffVar.x = Boolean.valueOf(z10);
        }
    }
}
