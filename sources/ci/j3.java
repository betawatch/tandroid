package ci;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class j3 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ w3 a;

    public j3(w3 w3Var) {
        this.a = w3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        w3 w3Var = this.a;
        if (i10 != -1) {
            if (i10 >= 10) {
                w3Var.e((MediaController.AlbumEntry) w3Var.g0.get(i10 - 10), false);
            }
        } else {
            Runnable runnable = w3Var.V;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
