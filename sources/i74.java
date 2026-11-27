// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class i74 extends l9c {
    public final /* synthetic */ byte Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i74(d79 d79Var, Context context, int i, int i2, boolean z, icc iccVar, vnb vnbVar, byte b) {
        super(d79Var, context, i, i2, z, iccVar, vnbVar);
        this.Q = b;
    }

    @Override // l9c, c79
    public final boolean D(f89 f89Var) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.D(f89Var);
        }
    }

    @Override // l9c
    public final int I(int i) {
        switch (this.Q) {
            case 1:
                if (i == aob.i5) {
                    return -15921907;
                }
                return aob.v0(i, this.x);
            default:
                return super.I(i);
        }
    }
}
