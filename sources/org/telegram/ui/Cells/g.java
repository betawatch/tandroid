package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.Components.a80;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class g extends vf.b {
    public a80 d;
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
    public final void c(boolean z9) {
        org.telegram.messenger.g0.i3(new f(this, 0), z9 ? 0L : 350L);
    }

    @Override // vf.b
    public final void d() {
        j jVar = this.h;
        n2.n0 n0Var = jVar.E;
        a80 a80Var = jVar.G;
        if (a80Var != null) {
            n0Var.n(a80Var, true);
        }
        a80 k10 = n2.n0.k(this.e, this.f, this.g);
        this.d = k10;
        jVar.G = k10;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ze, jVar.I);
        RectF rectF = ProfileActivity.S6;
        this.d.g(org.telegram.ui.ActionBar.k6.r1(0.8f, w02), org.telegram.ui.ActionBar.k6.r1(1.3f, w02), org.telegram.ui.ActionBar.k6.r1(1.0f, w02), org.telegram.ui.ActionBar.k6.r1(4.0f, w02));
        this.d.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
        n0Var.c(this.d, null);
    }
}
