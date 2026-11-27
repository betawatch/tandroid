// default package

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
