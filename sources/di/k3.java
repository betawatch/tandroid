package di;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
