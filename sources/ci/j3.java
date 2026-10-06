package ci;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
