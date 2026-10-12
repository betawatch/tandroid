package di;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class i3 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ v3 a;

    public i3(v3 v3Var) {
        this.a = v3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        v3 v3Var = this.a;
        if (i10 != -1) {
            if (i10 >= 10) {
                v3Var.e((MediaController.AlbumEntry) v3Var.g0.get(i10 - 10), false);
            }
        } else {
            Runnable runnable = v3Var.V;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
