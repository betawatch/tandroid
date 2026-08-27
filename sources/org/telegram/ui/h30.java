package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h30 extends f2.b1 {
    public final /* synthetic */ s50 a;

    public h30(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        s50 s50Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) s50Var).containerView;
        viewGroup.invalidate();
        s50Var.W1.invalidate();
    }
}
