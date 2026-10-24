package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class i30 extends s4.r0 {
    public final /* synthetic */ u50 a;

    public i30(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        u50 u50Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.invalidate();
        u50Var.a2.invalidate();
    }
}
