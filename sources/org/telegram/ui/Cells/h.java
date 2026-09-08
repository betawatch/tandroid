package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.h90;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h extends of.e {
    public h90 d;
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

    @Override // of.e
    public final void c(boolean z10) {
        AndroidUtilities.runOnUIThread(new g(this, 0), z10 ? 0L : 350L);
    }

    @Override // of.e
    public final void d() {
        j jVar = this.h;
        a90 a90Var = jVar.E;
        h90 h90Var = jVar.G;
        if (h90Var != null) {
            a90Var.l(h90Var, true);
        }
        h90 i10 = a90.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.G = i10;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, jVar.I);
        this.d.f(org.telegram.ui.ActionBar.j6.l1(0.8f, v02), org.telegram.ui.ActionBar.j6.l1(1.3f, v02), org.telegram.ui.ActionBar.j6.l1(1.0f, v02), org.telegram.ui.ActionBar.j6.l1(4.0f, v02));
        this.d.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        a90Var.b(this.d, null);
    }
}
