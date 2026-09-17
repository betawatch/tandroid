package di;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final class k3 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ x3 a;

    public k3(x3 x3Var) {
        this.a = x3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        x3 x3Var = this.a;
        if (i10 != -1) {
            if (i10 >= 10) {
                x3Var.e((MediaController.AlbumEntry) x3Var.g0.get(i10 - 10), false);
            }
        } else {
            Runnable runnable = x3Var.V;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
