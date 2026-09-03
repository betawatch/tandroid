package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class i30 extends f2.a1 {
    public final /* synthetic */ d60 a;

    public i30(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.a).containerView;
        viewGroup.invalidate();
    }
}
