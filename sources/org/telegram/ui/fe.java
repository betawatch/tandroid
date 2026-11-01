package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fe extends FrameLayout {
    public final org.telegram.ui.Components.v51 a;
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
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(context, i11, i12, true, new z4(this, 3), new y0(this, 15), null, p6Var);
        this.a = v51Var;
        setClipChildren(false);
        setClipToPadding(false);
        v51Var.setClipToPadding(false);
        v51Var.s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), false);
        v51Var.f3.r = false;
        v51Var.setCaptureSectionsDecoratorAllowed(true);
        v51Var.setOverScrollMode(0);
        addView(v51Var, w7.b6.c(-1.0f, -1));
        v51Var.setOnScrollListener(new bi.t3(3, this, d3Var));
        ei.r rVar = heVar.x.d1;
        if (rVar != null) {
            rVar.b(v51Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f3.O(false);
    }
}
