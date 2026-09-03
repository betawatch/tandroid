package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.k90;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h extends af.f {
    public k90 d;
    public final /* synthetic */ Layout e;
    public final /* synthetic */ ClickableSpan f;
    public final /* synthetic */ float g;
    public final /* synthetic */ j h;

    public h(j jVar, Layout layout, ClickableSpan clickableSpan, float f10) {
        this.h = jVar;
        this.e = layout;
        this.f = clickableSpan;
        this.g = f10;
    }

    @Override // af.f
    public final void c(boolean z4) {
        AndroidUtilities.runOnUIThread(new g(this, 0), z4 ? 0L : 350L);
    }

    @Override // af.f
    public final void d() {
        j jVar = this.h;
        d90 d90Var = jVar.B;
        k90 k90Var = jVar.D;
        if (k90Var != null) {
            d90Var.l(k90Var, true);
        }
        k90 i10 = d90.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.D = i10;
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ld, jVar.F);
        this.d.f(org.telegram.ui.ActionBar.k6.l1(0.8f, v02), org.telegram.ui.ActionBar.k6.l1(1.3f, v02), org.telegram.ui.ActionBar.k6.l1(1.0f, v02), org.telegram.ui.ActionBar.k6.l1(4.0f, v02));
        this.d.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        d90Var.b(this.d, null);
    }
}
