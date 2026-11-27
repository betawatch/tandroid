// default package

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ib8 implements Runnable {
    public final /* synthetic */ PhotoViewer a;

    public ib8(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PhotoViewer photoViewer = this.a;
        r47 r47Var = photoViewer.S4;
        if (r47Var == null) {
            return;
        }
        xb4.G(r47Var.K1).b0(photoViewer.S4.F0(), true, false);
    }
}
