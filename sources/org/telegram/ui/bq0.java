package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bq0 implements org.telegram.ui.Components.ul0 {
    public final /* synthetic */ fq0 a;

    public bq0(fq0 fq0Var) {
        this.a = fq0Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.e5 e5Var;
        fq0 fq0Var = this.a;
        fq0Var.T = z4 ? 1 : 0;
        if (z4) {
            e5Var = ((org.telegram.ui.ActionBar.p2) fq0Var).parentLayout;
            e5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        fq0Var.H.d1(true);
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean b(int i10) {
        return this.a.I.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void c(View view, boolean z4) {
        if (z4 == this.a.U && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.b(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean d(int i10) {
        fq0 fq0Var = this.a;
        MediaController.AlbumEntry albumEntry = fq0Var.G;
        return fq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) fq0Var.f.get(i10)).id);
    }
}
