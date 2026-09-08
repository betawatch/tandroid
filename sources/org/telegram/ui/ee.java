package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.d61 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final int c;
    public final int d;
    public final ah.g e;
    public final /* synthetic */ ge f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ge geVar, Context context, int i10, int i11, int i12, ah.g gVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = geVar;
        this.d = i10;
        this.c = i11;
        this.b = f6Var;
        this.e = gVar;
        org.telegram.ui.Components.d61 d61Var = new org.telegram.ui.Components.d61(context, i11, i12, true, new b5(this, 3), new z0(this, 13), null, f6Var);
        this.a = d61Var;
        addView(d61Var, w7.x5.c(-1.0f, -1));
        d61Var.setOnScrollListener(new ji.l3(1, this, gVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.Y2.N(false);
    }
}
