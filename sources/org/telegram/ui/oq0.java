package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class oq0 implements org.telegram.ui.Components.qm0 {
    public final /* synthetic */ tq0 a;

    public oq0(tq0 tq0Var) {
        this.a = tq0Var;
    }

    @Override // org.telegram.ui.Components.qm0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        tq0 tq0Var = this.a;
        tq0Var.W = z10 ? 1 : 0;
        if (z10) {
            j5Var = ((org.telegram.ui.ActionBar.r2) tq0Var).parentLayout;
            j5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        tq0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.qm0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.x5)) {
            org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
            x5Var.w.b(x5Var);
        }
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean d(int i10) {
        tq0 tq0Var = this.a;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        return tq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) tq0Var.f.get(i10)).id);
    }
}
