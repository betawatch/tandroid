// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gb9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vn1 b;
    public final /* synthetic */ d31 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ w53 e;

    public /* synthetic */ gb9(vn1 vn1Var, d31 d31Var, Context context, w53 w53Var, byte b) {
        this.a = b;
        this.b = vn1Var;
        this.c = d31Var;
        this.d = context;
        this.e = w53Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        w53 w53Var = this.e;
        Context context = this.d;
        d31 d31Var = this.c;
        vn1 vn1Var = this.b;
        switch (b) {
            case 0:
                vn1Var.run();
                d31Var.c(hl.N2(ob6.M0(2131754480, null), -1, 2, new xf1(context, (byte) 10), w53Var)).j();
                break;
            case 1:
                vn1Var.run();
                d31Var.c(hl.N2(ob6.M0(2131754480, null), -1, 2, new xf1(context, (byte) 12), w53Var)).j();
                break;
            default:
                vn1Var.run();
                d31Var.c(hl.N2(ob6.M0(2131754480, null), -1, 2, new xf1(context, (byte) 13), w53Var)).j();
                break;
        }
    }
}
