package fi;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class c3 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ o3 a;

    public c3(o3 o3Var) {
        this.a = o3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        o3 o3Var = this.a;
        if (i10 != -1) {
            if (i10 >= 10) {
                o3Var.e((MediaController.AlbumEntry) o3Var.g0.get(i10 - 10), false);
            }
        } else {
            Runnable runnable = o3Var.V;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
