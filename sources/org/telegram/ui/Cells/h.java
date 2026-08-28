package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h extends ve.d {
    public p80 d;
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

    @Override // ve.d
    public final void c(boolean z10) {
        AndroidUtilities.runOnUIThread(new g(this, 0), z10 ? 0L : 350L);
    }

    @Override // ve.d
    public final void d() {
        j jVar = this.h;
        i80 i80Var = jVar.A;
        p80 p80Var = jVar.C;
        if (p80Var != null) {
            i80Var.l(p80Var, true);
        }
        p80 i9 = i80.i(this.e, this.f, this.g);
        this.d = i9;
        jVar.C = i9;
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ld, jVar.E);
        this.d.f(org.telegram.ui.ActionBar.f6.l1(0.8f, v02), org.telegram.ui.ActionBar.f6.l1(1.3f, v02), org.telegram.ui.ActionBar.f6.l1(1.0f, v02), org.telegram.ui.ActionBar.f6.l1(4.0f, v02));
        this.d.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        i80Var.b(this.d, null);
    }
}
