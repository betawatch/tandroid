package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.ia0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h extends of.e {
    public ia0 d;
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
        ba0 ba0Var = jVar.E;
        ia0 ia0Var = jVar.G;
        if (ia0Var != null) {
            ba0Var.l(ia0Var, true);
        }
        ia0 i10 = ba0.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.G = i10;
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ld, jVar.I);
        this.d.g(org.telegram.ui.ActionBar.i6.m1(0.8f, w02), org.telegram.ui.ActionBar.i6.m1(1.3f, w02), org.telegram.ui.ActionBar.i6.m1(1.0f, w02), org.telegram.ui.ActionBar.i6.m1(4.0f, w02));
        this.d.x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        ba0Var.b(this.d, null);
    }
}
