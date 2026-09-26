package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class oq0 implements org.telegram.ui.Components.xl0 {
    public final /* synthetic */ tq0 a;

    public oq0(tq0 tq0Var) {
        this.a = tq0Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        tq0 tq0Var = this.a;
        tq0Var.W = z10 ? 1 : 0;
        if (z10) {
            b5Var = ((org.telegram.ui.ActionBar.m2) tq0Var).parentLayout;
            b5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        tq0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.a(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean d(int i10) {
        tq0 tq0Var = this.a;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        return tq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) tq0Var.f.get(i10)).id);
    }
}
