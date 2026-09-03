package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.j90;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h extends ze.c {
    public j90 d;
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

    @Override // ze.c
    public final void c(boolean z4) {
        AndroidUtilities.runOnUIThread(new g(this, 0), z4 ? 0L : 350L);
    }

    @Override // ze.c
    public final void d() {
        j jVar = this.h;
        c90 c90Var = jVar.B;
        j90 j90Var = jVar.D;
        if (j90Var != null) {
            c90Var.l(j90Var, true);
        }
        j90 i10 = c90.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.D = i10;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, jVar.F);
        this.d.f(org.telegram.ui.ActionBar.j6.l1(0.8f, v02), org.telegram.ui.ActionBar.j6.l1(1.3f, v02), org.telegram.ui.ActionBar.j6.l1(1.0f, v02), org.telegram.ui.ActionBar.j6.l1(4.0f, v02));
        this.d.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        c90Var.b(this.d, null);
    }
}
