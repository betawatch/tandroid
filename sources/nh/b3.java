package nh;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b3 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ n3 a;

    public b3(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        n3 n3Var = this.a;
        if (i10 != -1) {
            if (i10 >= 10) {
                n3Var.e((MediaController.AlbumEntry) n3Var.c0.get(i10 - 10), false);
            }
        } else {
            Runnable runnable = n3Var.R;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
