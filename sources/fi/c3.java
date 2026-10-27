package fi;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
