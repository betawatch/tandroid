// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ja8 implements jec {
    public final /* synthetic */ byte a;
    public final /* synthetic */ po6 b;

    public /* synthetic */ ja8(po6 po6Var, byte b) {
        this.a = b;
        this.b = po6Var;
    }

    @Override // jec
    public final void a(rf4 rf4Var) {
        byte b = this.a;
        po6 po6Var = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                rf4Var.c(new ri6(po6Var, (byte) 29));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                rf4Var.c(new ri6(po6Var, (byte) 29));
                break;
        }
    }
}
