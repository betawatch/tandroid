// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gy5 extends px3 {
    public final /* synthetic */ ry5 D1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy5(ry5 ry5Var, Context context, tx5 tx5Var) {
        super(tx5Var, context, false, false);
        this.D1 = ry5Var;
    }

    @Override // px3
    public final boolean E0(Integer num) {
        if (num.intValue() != 6) {
            return num.intValue() == 2;
        }
        gd1 gd1Var = this.D1.P1;
        return gd1Var != null && gd1Var.c();
    }
}
