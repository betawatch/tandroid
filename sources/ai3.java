// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ai3 extends rn {
    public final /* synthetic */ byte b;
    public final /* synthetic */ uj3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai3(uj3 uj3Var, byte b) {
        super("animationValue", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = uj3Var;
                super("viewPagerTranslation", (byte) 0);
                break;
            default:
                this.c = uj3Var;
                break;
        }
    }

    @Override // rn
    public final void c(Object obj, float f) {
        switch (this.b) {
            case 0:
                ((uj3) obj).W4(f);
                break;
            default:
                uj3 uj3Var = this.c;
                uj3Var.J0 = f;
                ((View) obj).setTranslationY(uj3Var.K0 + f);
                uj3Var.b3();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        byte b = this.b;
        uj3 uj3Var = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(uj3Var.O);
            default:
                return Float.valueOf(uj3Var.J0);
        }
    }
}
