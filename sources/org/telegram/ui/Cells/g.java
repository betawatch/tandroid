package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.Components.t80;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g extends gf.e {
    public t80 d;
    public final /* synthetic */ Layout e;
    public final /* synthetic */ ClickableSpan f;
    public final /* synthetic */ float g;
    public final /* synthetic */ i h;

    public g(i iVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = iVar;
        this.e = layout;
        this.f = clickableSpan;
        this.g = f7;
    }

    @Override // gf.e
    public final void c(boolean z10) {
        org.telegram.messenger.i0.h3(new f(this, 0), z10 ? 0L : 350L);
    }

    @Override // gf.e
    public final void d() {
        i iVar = this.h;
        ji.a aVar = iVar.E;
        t80 t80Var = iVar.G;
        if (t80Var != null) {
            aVar.n(t80Var, true);
        }
        t80 k10 = ji.a.k(this.e, this.f, this.g);
        this.d = k10;
        iVar.G = k10;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ze, iVar.I);
        RectF rectF = ProfileActivity.R6;
        this.d.g(org.telegram.ui.ActionBar.t6.r1(0.8f, w02), org.telegram.ui.ActionBar.t6.r1(1.3f, w02), org.telegram.ui.ActionBar.t6.r1(1.0f, w02), org.telegram.ui.ActionBar.t6.r1(4.0f, w02));
        this.d.x.setStrokeWidth(org.telegram.messenger.i0.N(1.25f));
        aVar.c(this.d, null);
    }
}
