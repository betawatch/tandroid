package ei;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class e3 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ q3 a;

    public e3(q3 q3Var) {
        this.a = q3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        q3 q3Var = this.a;
        if (i10 != -1) {
            if (i10 >= 10) {
                q3Var.e((MediaController.AlbumEntry) q3Var.g0.get(i10 - 10), false);
            }
        } else {
            Runnable runnable = q3Var.V;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
