package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.z80;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class h extends nf.e {
    public g90 d;
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
        z80 z80Var = jVar.E;
        g90 g90Var = jVar.G;
        if (g90Var != null) {
            z80Var.l(g90Var, true);
        }
        g90 i10 = z80.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.G = i10;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ld, jVar.I);
        this.d.f(org.telegram.ui.ActionBar.i6.l1(0.8f, v02), org.telegram.ui.ActionBar.i6.l1(1.3f, v02), org.telegram.ui.ActionBar.i6.l1(1.0f, v02), org.telegram.ui.ActionBar.i6.l1(4.0f, v02));
        this.d.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        z80Var.b(this.d, null);
    }
}
