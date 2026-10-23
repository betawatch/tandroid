package ei;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
