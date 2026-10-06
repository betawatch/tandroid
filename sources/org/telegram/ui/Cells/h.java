package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.u90;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class h extends nf.e {
    public u90 d;
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
        n90 n90Var = jVar.E;
        u90 u90Var = jVar.G;
        if (u90Var != null) {
            n90Var.l(u90Var, true);
        }
        u90 i10 = n90.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.G = i10;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ld, jVar.I);
        this.d.f(org.telegram.ui.ActionBar.i6.l1(0.8f, v02), org.telegram.ui.ActionBar.i6.l1(1.3f, v02), org.telegram.ui.ActionBar.i6.l1(1.0f, v02), org.telegram.ui.ActionBar.i6.l1(4.0f, v02));
        this.d.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        n90Var.b(this.d, null);
    }
}
