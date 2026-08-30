package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.g61 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final int c;
    public final int d;
    public final af.b e;
    public final /* synthetic */ ge f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ge geVar, Context context, int i10, int i11, int i12, af.b bVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = geVar;
        this.d = i10;
        this.c = i11;
        this.b = f6Var;
        this.e = bVar;
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(context, i11, i12, true, new d5(this, 3), new a1(this, 13), null, f6Var);
        this.a = g61Var;
        addView(g61Var, k7.b6.c(-1.0f, -1));
        g61Var.setOnScrollListener(new jh.l(2, this, bVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.V2.N(false);
    }
}
