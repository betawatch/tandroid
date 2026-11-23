package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.Components.n80;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g extends vf.b {
    public n80 d;
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

    @Override // vf.b
    public final void c(boolean z10) {
        org.telegram.messenger.g0.h3(new f(this, 0), z10 ? 0L : 350L);
    }

    @Override // vf.b
    public final void d() {
        j jVar = this.h;
        n2.p0 p0Var = jVar.F;
        n80 n80Var = jVar.H;
        if (n80Var != null) {
            p0Var.n(n80Var, true);
        }
        n80 k10 = n2.p0.k(this.e, this.f, this.g);
        this.d = k10;
        jVar.H = k10;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ce, jVar.J);
        RectF rectF = ProfileActivity.Z6;
        this.d.g(org.telegram.ui.ActionBar.n6.r1(0.8f, w02), org.telegram.ui.ActionBar.n6.r1(1.3f, w02), org.telegram.ui.ActionBar.n6.r1(1.0f, w02), org.telegram.ui.ActionBar.n6.r1(4.0f, w02));
        this.d.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
        p0Var.c(this.d, null);
    }
}
