package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.h61 a;
    public final org.telegram.ui.ActionBar.g6 b;
    public final int c;
    public final int d;
    public final af.b e;
    public final /* synthetic */ ge f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ge geVar, Context context, int i10, int i11, int i12, af.b bVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f = geVar;
        this.d = i10;
        this.c = i11;
        this.b = g6Var;
        this.e = bVar;
        org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(context, i11, i12, true, new d5(this, 3), new a1(this, 13), null, g6Var);
        this.a = h61Var;
        addView(h61Var, k7.c6.c(-1.0f, -1));
        h61Var.setOnScrollListener(new kh.l(2, this, bVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.V2.N(false);
    }
}
