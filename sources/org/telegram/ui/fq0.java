package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class fq0 implements org.telegram.ui.Components.jm0 {
    public final /* synthetic */ kq0 a;

    public fq0(kq0 kq0Var) {
        this.a = kq0Var;
    }

    @Override // org.telegram.ui.Components.jm0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        kq0 kq0Var = this.a;
        kq0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) kq0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        kq0Var.K.d1(true);
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
        kq0 kq0Var = this.a;
        MediaController.AlbumEntry albumEntry = kq0Var.J;
        return kq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) kq0Var.f.get(i10)).id);
    }
}
