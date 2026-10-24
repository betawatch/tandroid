package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class hq0 implements org.telegram.ui.Components.nm0 {
    public final /* synthetic */ mq0 a;

    public hq0(mq0 mq0Var) {
        this.a = mq0Var;
    }

    @Override // org.telegram.ui.Components.nm0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        mq0 mq0Var = this.a;
        mq0Var.W = z10 ? 1 : 0;
        if (z10) {
            h5Var = ((org.telegram.ui.ActionBar.o2) mq0Var).parentLayout;
            h5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        mq0Var.K.e1(true);
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.nm0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.w.b(s5Var);
        }
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean d(int i10) {
        mq0 mq0Var = this.a;
        MediaController.AlbumEntry albumEntry = mq0Var.J;
        return mq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) mq0Var.f.get(i10)).id);
    }
}
