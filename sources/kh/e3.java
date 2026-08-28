package kh;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class e3 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ q3 a;

    public e3(q3 q3Var) {
        this.a = q3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        q3 q3Var = this.a;
        if (i9 != -1) {
            if (i9 >= 10) {
                q3Var.e((MediaController.AlbumEntry) q3Var.c0.get(i9 - 10), false);
            }
        } else {
            Runnable runnable = q3Var.R;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
