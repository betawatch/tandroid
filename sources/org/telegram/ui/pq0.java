package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class pq0 implements org.telegram.ui.Components.nl0 {
    public final /* synthetic */ uq0 a;

    public pq0(uq0 uq0Var) {
        this.a = uq0Var;
    }

    @Override // org.telegram.ui.Components.nl0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        uq0 uq0Var = this.a;
        uq0Var.W = z10 ? 1 : 0;
        if (z10) {
            c5Var = ((org.telegram.ui.ActionBar.n2) uq0Var).parentLayout;
            c5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        uq0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.nl0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.nl0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.b(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public final boolean d(int i10) {
        uq0 uq0Var = this.a;
        MediaController.AlbumEntry albumEntry = uq0Var.J;
        return uq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) uq0Var.f.get(i10)).id);
    }
}
