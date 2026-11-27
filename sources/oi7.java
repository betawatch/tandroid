// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class oi7 extends c51 {
    public final /* synthetic */ byte m0;
    public final /* synthetic */ ny0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi7(ny0 ny0Var, Context context, vnb vnbVar, byte b) {
        super(vnbVar, context, true);
        this.m0 = b;
        this.n0 = ny0Var;
    }

    @Override // c51
    public final float b(float f, float f2) {
        boolean z;
        byte b = this.m0;
        ny0 ny0Var = this.n0;
        switch (b) {
            case 0:
                qi7 qi7Var = (qi7) ny0Var;
                z = qi7Var.i2 == 0.0f;
                qi7Var.i2 = f;
                if (z) {
                    qi7Var.j2 = new tg2(qi7Var, (byte) 2);
                    qi7Var.a1(false);
                    break;
                }
                break;
            default:
                sbc sbcVar = (sbc) ny0Var;
                z = sbcVar.n2 == 0.0f;
                sbcVar.n2 = f;
                if (z) {
                    sbcVar.o2 = new tg2(sbcVar, (byte) 4);
                    sbcVar.f1(false);
                    break;
                }
                break;
        }
        return f;
    }
}
