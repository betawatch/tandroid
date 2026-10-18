package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.u90;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class h extends pf.c {
    public ba0 d;
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
        u90 u90Var = jVar.E;
        ba0 ba0Var = jVar.G;
        if (ba0Var != null) {
            u90Var.l(ba0Var, true);
        }
        ba0 i10 = u90.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.G = i10;
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, jVar.I);
        this.d.g(org.telegram.ui.ActionBar.h6.m1(0.8f, w02), org.telegram.ui.ActionBar.h6.m1(1.3f, w02), org.telegram.ui.ActionBar.h6.m1(1.0f, w02), org.telegram.ui.ActionBar.h6.m1(4.0f, w02));
        this.d.x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        u90Var.b(this.d, null);
    }
}
