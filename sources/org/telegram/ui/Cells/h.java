package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ha0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class h extends pf.c {
    public ha0 d;
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

    @Override // pf.c
    public final void c(boolean z10) {
        AndroidUtilities.runOnUIThread(new g(this, 0), z10 ? 0L : 350L);
    }

    @Override // pf.c
    public final void d() {
        j jVar = this.h;
        aa0 aa0Var = jVar.E;
        ha0 ha0Var = jVar.G;
        if (ha0Var != null) {
            aa0Var.l(ha0Var, true);
        }
        ha0 i10 = aa0.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.G = i10;
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ld, jVar.I);
        this.d.g(org.telegram.ui.ActionBar.g6.m1(0.8f, w02), org.telegram.ui.ActionBar.g6.m1(1.3f, w02), org.telegram.ui.ActionBar.g6.m1(1.0f, w02), org.telegram.ui.ActionBar.g6.m1(4.0f, w02));
        this.d.x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        aa0Var.b(this.d, null);
    }
}
