package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.i90;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h extends af.f {
    public i90 d;
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
        b90 b90Var = jVar.B;
        i90 i90Var = jVar.D;
        if (i90Var != null) {
            b90Var.l(i90Var, true);
        }
        i90 i10 = b90.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.D = i10;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, jVar.F);
        this.d.f(org.telegram.ui.ActionBar.j6.l1(0.8f, v02), org.telegram.ui.ActionBar.j6.l1(1.3f, v02), org.telegram.ui.ActionBar.j6.l1(1.0f, v02), org.telegram.ui.ActionBar.j6.l1(4.0f, v02));
        this.d.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        b90Var.b(this.d, null);
    }
}
