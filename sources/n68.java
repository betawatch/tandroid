// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class n68 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lm6 b;

    public /* synthetic */ n68(lm6 lm6Var, byte b) {
        this.a = b;
        this.b = lm6Var;
    }

    @Override // jac
    public final void a(td4 td4Var) {
        byte b = this.a;
        lm6 lm6Var = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                td4Var.c(new z24(lm6Var, (byte) 1));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                td4Var.c(new z24(lm6Var, (byte) 1));
                break;
        }
    }
}
