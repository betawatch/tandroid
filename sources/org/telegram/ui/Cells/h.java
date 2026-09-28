package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.t90;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class h extends nf.e {
    public t90 d;
    public final /* synthetic */ Layout e;
    public final /* synthetic */ ClickableSpan f;
    public final /* synthetic */ float g;
    public final /* synthetic */ j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f7) {
        this.h = jVar;
        this.e = layout;
        this.f = clickableSpan;
        this.g = f7;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        AndroidUtilities.runOnUIThread(new g(this, 0), z10 ? 0L : 350L);
    }

    @Override // nf.e
    public final void d() {
        j jVar = this.h;
        m90 m90Var = jVar.E;
        t90 t90Var = jVar.G;
        if (t90Var != null) {
            m90Var.l(t90Var, true);
        }
        t90 i10 = m90.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.G = i10;
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ld, jVar.I);
        this.d.f(org.telegram.ui.ActionBar.h6.l1(0.8f, v02), org.telegram.ui.ActionBar.h6.l1(1.3f, v02), org.telegram.ui.ActionBar.h6.l1(1.0f, v02), org.telegram.ui.ActionBar.h6.l1(4.0f, v02));
        this.d.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        m90Var.b(this.d, null);
    }
}
