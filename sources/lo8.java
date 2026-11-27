// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lo8 implements tw8 {
    public final /* synthetic */ byte a = 0;
    public final tw8 b;
    public final aj3 c;

    public lo8(aj3 aj3Var, tw8 tw8Var) {
        this.c = aj3Var;
        this.b = tw8Var;
    }

    @Override // uw8
    public final Object get() {
        byte b = this.a;
        aj3 aj3Var = this.c;
        tw8 tw8Var = this.b;
        switch (b) {
            case 0:
                return new ko8((Context) aj3Var.b, (vcc) tw8Var.get());
            default:
                return new ca9((tr) tw8Var.get(), (mx2) aj3Var.b);
        }
    }

    public lo8(tw8 tw8Var, aj3 aj3Var) {
        this.b = tw8Var;
        this.c = aj3Var;
    }
}
