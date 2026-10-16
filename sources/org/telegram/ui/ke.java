package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ke extends FrameLayout {
    public final org.telegram.ui.Components.i71 a;
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
        org.telegram.ui.Components.i71 i71Var = new org.telegram.ui.Components.i71(context, i11, i12, true, new f5(this, 3), new b1(this, 13), null, c6Var);
        this.a = i71Var;
        addView(i71Var, w7.z5.d(-1.0f, -1));
        i71Var.setOnScrollListener(new ji.n3(1, this, gVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.W2.N(false);
    }
}
