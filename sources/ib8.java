// default package

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
