package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ar0 implements org.telegram.ui.Components.nm0 {
    public final /* synthetic */ fr0 a;

    public ar0(fr0 fr0Var) {
        this.a = fr0Var;
    }

    @Override // org.telegram.ui.Components.nm0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        fr0 fr0Var = this.a;
        fr0Var.W = z10 ? 1 : 0;
        if (z10) {
            b5Var = ((org.telegram.ui.ActionBar.m2) fr0Var).parentLayout;
            b5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        fr0Var.K.d1(true);
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
        fr0 fr0Var = this.a;
        MediaController.AlbumEntry albumEntry = fr0Var.J;
        return fr0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) fr0Var.f.get(i10)).id);
    }
}
