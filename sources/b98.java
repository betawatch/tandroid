// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b98 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ b98(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                this.b.F1(false, 0, 0, true, false, false);
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer.i2();
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.d9;
                this.b.F1(false, 0, 0, false, false, false);
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.d9;
                photoViewer.A(false, false);
                i22 i22Var = photoViewer.b2;
                if (i22Var != null) {
                    i22Var.a(true);
                }
                d dVar = photoViewer.l4;
                if (dVar != null) {
                    dVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                Drawable[] drawableArr5 = PhotoViewer.d9;
                photoViewer.s7 = null;
                break;
            case 5:
                Drawable[] drawableArr6 = PhotoViewer.d9;
                photoViewer.A(true, false);
                break;
            default:
                Drawable[] drawableArr7 = PhotoViewer.d9;
                photoViewer.F2();
                break;
        }
    }
}
