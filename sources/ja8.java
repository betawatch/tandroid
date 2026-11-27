// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
