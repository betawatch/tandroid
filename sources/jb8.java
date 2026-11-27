// default package

import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class jb8 implements vd5 {
    public final /* synthetic */ PhotoViewer a;

    public jb8(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i) {
        PhotoViewer photoViewer = this.a;
        photoViewer.O4 = -1;
        mn5 mn5Var = photoViewer.i5;
        if (mn5Var != null) {
            mn5Var.a();
            photoViewer.i5 = null;
        }
        photoViewer.k5 = true;
        photoViewer.K1(i);
        photoViewer.k5 = false;
    }
}
