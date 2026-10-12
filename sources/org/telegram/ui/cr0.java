package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class cr0 implements org.telegram.ui.Components.nm0 {
    public final /* synthetic */ hr0 a;

    public cr0(hr0 hr0Var) {
        this.a = hr0Var;
    }

    @Override // org.telegram.ui.Components.nm0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        hr0 hr0Var = this.a;
        hr0Var.W = z10 ? 1 : 0;
        if (z10) {
            b5Var = ((org.telegram.ui.ActionBar.m2) hr0Var).parentLayout;
            b5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        hr0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.nm0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.c(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean d(int i10) {
        hr0 hr0Var = this.a;
        MediaController.AlbumEntry albumEntry = hr0Var.J;
        return hr0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) hr0Var.f.get(i10)).id);
    }
}
