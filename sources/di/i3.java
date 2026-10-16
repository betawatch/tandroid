package di;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
