// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gh3 extends qn {
    public final /* synthetic */ byte b;
    public final /* synthetic */ cj3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh3(cj3 cj3Var, byte b) {
        super("animationValue", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = cj3Var;
                super("viewPagerTranslation", (byte) 0);
                break;
            default:
                this.c = cj3Var;
                break;
        }
    }

    @Override // qn
    public final void c(Object obj, float f) {
        switch (this.b) {
            case 0:
                ((cj3) obj).S4(f);
                break;
            default:
                cj3 cj3Var = this.c;
                cj3Var.J0 = f;
                ((View) obj).setTranslationY(cj3Var.K0 + f);
                cj3Var.Z2();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        byte b = this.b;
        cj3 cj3Var = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(cj3Var.O);
            default:
                return Float.valueOf(cj3Var.J0);
        }
    }
}
