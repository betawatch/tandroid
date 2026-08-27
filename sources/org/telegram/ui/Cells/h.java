package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.t80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h extends we.d {
    public t80 d;
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

    @Override // we.d
    public final void c(boolean z10) {
        AndroidUtilities.runOnUIThread(new g(this, 0), z10 ? 0L : 350L);
    }

    @Override // we.d
    public final void d() {
        j jVar = this.h;
        m80 m80Var = jVar.A;
        t80 t80Var = jVar.C;
        if (t80Var != null) {
            m80Var.l(t80Var, true);
        }
        t80 i10 = m80.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.C = i10;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, jVar.E);
        this.d.f(org.telegram.ui.ActionBar.g6.l1(0.8f, v02), org.telegram.ui.ActionBar.g6.l1(1.3f, v02), org.telegram.ui.ActionBar.g6.l1(1.0f, v02), org.telegram.ui.ActionBar.g6.l1(4.0f, v02));
        this.d.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        m80Var.b(this.d, null);
    }
}
