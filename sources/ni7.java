// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ni7 extends c51 {
    public final /* synthetic */ byte m0;
    public final /* synthetic */ ny0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni7(ny0 ny0Var, Context context, vnb vnbVar, byte b) {
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
                pi7 pi7Var = (pi7) ny0Var;
                z = pi7Var.i2 == 0.0f;
                pi7Var.i2 = f;
                if (z) {
                    pi7Var.j2 = new tg2(pi7Var, (byte) 2);
                    pi7Var.a1(false);
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
