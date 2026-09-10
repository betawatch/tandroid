package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fe extends FrameLayout {
    public final org.telegram.ui.Components.r61 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final int c;
    public final int d;
    public final bi.s e;
    public final /* synthetic */ he f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(he heVar, Context context, int i10, int i11, int i12, bi.s sVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = heVar;
        this.d = i10;
        this.c = i11;
        this.b = f6Var;
        this.e = sVar;
        org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(context, i11, i12, true, new b5(this, 3), new a1(this, 13), null, f6Var);
        this.a = r61Var;
        addView(r61Var, w7.a6.c(-1.0f, -1));
        r61Var.setOnScrollListener(new hi.p3(1, this, sVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.Y2.N(false);
    }
}
