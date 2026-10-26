package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h extends qf.c {
    public da0 d;
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

    @Override // qf.c
    public final void c(boolean z10) {
        AndroidUtilities.runOnUIThread(new g(this, 0), z10 ? 0L : 350L);
    }

    @Override // qf.c
    public final void d() {
        j jVar = this.h;
        w90 w90Var = jVar.E;
        da0 da0Var = jVar.G;
        if (da0Var != null) {
            w90Var.l(da0Var, true);
        }
        da0 i10 = w90.i(this.e, this.f, this.g);
        this.d = i10;
        jVar.G = i10;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ld, jVar.I);
        int i11 = ProfileActivity.R6;
        this.d.g(org.telegram.ui.ActionBar.y6.o1(0.8f, w02), org.telegram.ui.ActionBar.y6.o1(1.3f, w02), org.telegram.ui.ActionBar.y6.o1(1.0f, w02), org.telegram.ui.ActionBar.y6.o1(4.0f, w02));
        this.d.x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
        w90Var.b(this.d, null);
    }
}
