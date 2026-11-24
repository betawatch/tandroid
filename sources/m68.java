// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m68 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lm6 b;

    public /* synthetic */ m68(lm6 lm6Var, byte b) {
        this.a = b;
        this.b = lm6Var;
    }

    @Override // jac
    public final void a(td4 td4Var) {
        byte b = this.a;
        lm6 lm6Var = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.f9;
                td4Var.c(new z24(lm6Var, (byte) 1));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.f9;
                td4Var.c(new z24(lm6Var, (byte) 1));
                break;
        }
    }
}
