package lh;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d3 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ p3 a;

    public d3(p3 p3Var) {
        this.a = p3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        p3 p3Var = this.a;
        if (i10 != -1) {
            if (i10 >= 10) {
                p3Var.e((MediaController.AlbumEntry) p3Var.c0.get(i10 - 10), false);
            }
        } else {
            Runnable runnable = p3Var.R;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
