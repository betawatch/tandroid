package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mq0 implements org.telegram.ui.Components.pm0 {
    public final /* synthetic */ rq0 a;

    public mq0(rq0 rq0Var) {
        this.a = rq0Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        rq0 rq0Var = this.a;
        rq0Var.W = z10 ? 1 : 0;
        if (z10) {
            j5Var = ((org.telegram.ui.ActionBar.r2) rq0Var).parentLayout;
            j5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        rq0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.pm0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.x5)) {
            org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
            x5Var.w.b(x5Var);
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean d(int i10) {
        rq0 rq0Var = this.a;
        MediaController.AlbumEntry albumEntry = rq0Var.J;
        return rq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) rq0Var.f.get(i10)).id);
    }
}
