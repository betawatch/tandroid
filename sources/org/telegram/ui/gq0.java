package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class gq0 implements org.telegram.ui.Components.jm0 {
    public final /* synthetic */ lq0 a;

    public gq0(lq0 lq0Var) {
        this.a = lq0Var;
    }

    @Override // org.telegram.ui.Components.jm0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        lq0 lq0Var = this.a;
        lq0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) lq0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        lq0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.jm0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.jm0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.w.c(s5Var);
        }
    }

    @Override // org.telegram.ui.Components.jm0
    public final boolean d(int i10) {
        lq0 lq0Var = this.a;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        return lq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) lq0Var.f.get(i10)).id);
    }
}
