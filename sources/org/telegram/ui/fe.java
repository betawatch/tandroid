package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fe extends FrameLayout {
    public final org.telegram.ui.Components.u51 a;
    public final org.telegram.ui.ActionBar.p6 b;
    public final int c;
    public final int d;
    public final ag.d3 e;
    public final /* synthetic */ he f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(he heVar, Context context, int i10, int i11, int i12, ag.d3 d3Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f = heVar;
        this.d = i10;
        this.c = i11;
        this.b = p6Var;
        this.e = d3Var;
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(context, i11, i12, true, new z4(this, 3), new y0(this, 15), null, p6Var);
        this.a = u51Var;
        setClipChildren(false);
        setClipToPadding(false);
        u51Var.setClipToPadding(false);
        u51Var.s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), false);
        u51Var.f3.r = false;
        u51Var.setCaptureSectionsDecoratorAllowed(true);
        u51Var.setOverScrollMode(0);
        addView(u51Var, w7.b6.c(-1.0f, -1));
        u51Var.setOnScrollListener(new bi.t3(3, this, d3Var));
        ei.r rVar = heVar.x.d1;
        if (rVar != null) {
            rVar.b(u51Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f3.O(false);
    }
}
