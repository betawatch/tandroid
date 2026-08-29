package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.v80;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h extends ye.c {
    public c90 d;
    public final /* synthetic */ Layout e;
    public final /* synthetic */ ClickableSpan f;
    public final /* synthetic */ float g;
    public final /* synthetic */ j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f9) {
        this.h = jVar;
        this.e = layout;
        this.f = clickableSpan;
        this.g = f9;
    }

    @Override // ye.c
    public final void c(boolean z10) {
        AndroidUtilities.runOnUIThread(new g(this, 0), z10 ? 0L : 350L);
    }

    @Override // ye.c
    public final void d() {
        j jVar = this.h;
        v80 v80Var = jVar.A;
        c90 c90Var = jVar.C;
        if (c90Var != null) {
            v80Var.l(c90Var, true);
        }
        c90 i10 = v80.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.C = i10;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, jVar.E);
        this.d.f(org.telegram.ui.ActionBar.g6.l1(0.8f, v02), org.telegram.ui.ActionBar.g6.l1(1.3f, v02), org.telegram.ui.ActionBar.g6.l1(1.0f, v02), org.telegram.ui.ActionBar.g6.l1(4.0f, v02));
        this.d.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        v80Var.b(this.d, null);
    }
}
