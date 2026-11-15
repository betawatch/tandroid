package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.Components.d80;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g extends vf.b {
    public d80 d;
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
        org.telegram.messenger.g0.i3(new f(this, 0), z10 ? 0L : 350L);
    }

    @Override // vf.b
    public final void d() {
        j jVar = this.h;
        n2.o0 o0Var = jVar.F;
        d80 d80Var = jVar.H;
        if (d80Var != null) {
            o0Var.o(d80Var, true);
        }
        d80 k10 = n2.o0.k(this.e, this.f, this.g);
        this.d = k10;
        jVar.H = k10;
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ce, jVar.J);
        RectF rectF = ProfileActivity.X6;
        this.d.g(org.telegram.ui.ActionBar.j6.r1(0.8f, w02), org.telegram.ui.ActionBar.j6.r1(1.3f, w02), org.telegram.ui.ActionBar.j6.r1(1.0f, w02), org.telegram.ui.ActionBar.j6.r1(4.0f, w02));
        this.d.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
        o0Var.c(this.d, null);
    }
}
