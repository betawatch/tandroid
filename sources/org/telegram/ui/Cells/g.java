package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.Components.w70;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g extends sf.b {
    public w70 d;
    public final /* synthetic */ Layout e;
    public final /* synthetic */ ClickableSpan f;
    public final /* synthetic */ float g;
    public final /* synthetic */ j h;

    public g(j jVar, Layout layout, ClickableSpan clickableSpan, float f10) {
        this.h = jVar;
        this.e = layout;
        this.f = clickableSpan;
        this.g = f10;
    }

    @Override // sf.b
    public final void c(boolean z10) {
        org.telegram.messenger.g0.i3(new f(this, 0), z10 ? 0L : 350L);
    }

    @Override // sf.b
    public final void d() {
        j jVar = this.h;
        m2.p0 p0Var = jVar.F;
        w70 w70Var = jVar.H;
        if (w70Var != null) {
            p0Var.n(w70Var, true);
        }
        w70 k10 = m2.p0.k(this.e, this.f, this.g);
        this.d = k10;
        jVar.H = k10;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ze, jVar.J);
        RectF rectF = ProfileActivity.T6;
        this.d.g(org.telegram.ui.ActionBar.k6.r1(0.8f, w02), org.telegram.ui.ActionBar.k6.r1(1.3f, w02), org.telegram.ui.ActionBar.k6.r1(1.0f, w02), org.telegram.ui.ActionBar.k6.r1(4.0f, w02));
        this.d.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
        p0Var.c(this.d, null);
    }
}
