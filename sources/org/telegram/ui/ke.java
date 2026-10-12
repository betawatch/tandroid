package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ke extends FrameLayout {
    public final org.telegram.ui.Components.h71 a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final int c;
    public final int d;
    public final ah.g e;
    public final /* synthetic */ me f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke(me meVar, Context context, int i10, int i11, int i12, ah.g gVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f = meVar;
        this.d = i10;
        this.c = i11;
        this.b = c6Var;
        this.e = gVar;
        org.telegram.ui.Components.h71 h71Var = new org.telegram.ui.Components.h71(context, i11, i12, true, new f5(this, 3), new b1(this, 13), null, c6Var);
        this.a = h71Var;
        addView(h71Var, w7.a6.d(-1.0f, -1));
        h71Var.setOnScrollListener(new ji.n3(1, this, gVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.W2.N(false);
    }
}
