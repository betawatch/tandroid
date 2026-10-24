package ei;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
