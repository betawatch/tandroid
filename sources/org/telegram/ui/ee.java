package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.i61 a;
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
        org.telegram.ui.Components.i61 i61Var = new org.telegram.ui.Components.i61(context, i11, i12, true, new d5(this, 3), new a1(this, 13), null, g6Var);
        this.a = i61Var;
        addView(i61Var, k7.c6.c(-1.0f, -1));
        i61Var.setOnScrollListener(new kh.l(2, this, bVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.V2.N(false);
    }
}
