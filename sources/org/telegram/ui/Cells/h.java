package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.v90;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class h extends pf.c {
    public ca0 d;
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
        v90 v90Var = jVar.E;
        ca0 ca0Var = jVar.G;
        if (ca0Var != null) {
            v90Var.l(ca0Var, true);
        }
        ca0 i10 = v90.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.G = i10;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ld, jVar.I);
        this.d.g(org.telegram.ui.ActionBar.k6.o1(0.8f, w02), org.telegram.ui.ActionBar.k6.o1(1.3f, w02), org.telegram.ui.ActionBar.k6.o1(1.0f, w02), org.telegram.ui.ActionBar.k6.o1(4.0f, w02));
        this.d.x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        v90Var.b(this.d, null);
    }
}
