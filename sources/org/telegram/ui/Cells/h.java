package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.r90;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class h extends nf.e {
    public r90 d;
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
        k90 k90Var = jVar.E;
        r90 r90Var = jVar.G;
        if (r90Var != null) {
            k90Var.l(r90Var, true);
        }
        r90 i10 = k90.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.G = i10;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, jVar.I);
        this.d.f(org.telegram.ui.ActionBar.j6.l1(0.8f, v02), org.telegram.ui.ActionBar.j6.l1(1.3f, v02), org.telegram.ui.ActionBar.j6.l1(1.0f, v02), org.telegram.ui.ActionBar.j6.l1(4.0f, v02));
        this.d.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        k90Var.b(this.d, null);
    }
}
