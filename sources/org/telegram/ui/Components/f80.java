package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f80 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ k80 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(k80 k80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = k80Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        k80 k80Var = this.p;
        k80.a(k80Var, viewGroup);
        Runnable runnable = k80Var.p;
        if (runnable != null) {
            runnable.run();
            k80Var.p = null;
        }
    }
}
