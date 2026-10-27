package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m30 extends s4.u0 {
    public final /* synthetic */ x50 a;

    public m30(x50 x50Var) {
        this.a = x50Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        x50 x50Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.invalidate();
        x50Var.a2.invalidate();
    }
}
