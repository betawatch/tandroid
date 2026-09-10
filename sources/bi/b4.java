package bi;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class b4 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ p4 a;

    public b4(p4 p4Var) {
        this.a = p4Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        p4 p4Var = this.a;
        if (i10 != -1) {
            if (i10 >= 10) {
                p4Var.e((MediaController.AlbumEntry) p4Var.g0.get(i10 - 10), false);
            }
        } else {
            Runnable runnable = p4Var.V;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
