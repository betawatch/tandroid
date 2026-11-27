// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mx4 extends wua {
    public final /* synthetic */ byte y3 = 1;
    public final /* synthetic */ ny0 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx4(yx4 yx4Var, Context context, int i, long j, vnb vnbVar) {
        super(context, i, j, vnbVar, null);
        this.z3 = yx4Var;
    }

    @Override // nx0
    public final int O() {
        switch (this.y3) {
            case 1:
                return ((wua) this.z3).O();
            default:
                return super.O();
        }
    }

    @Override // wua, nx0, ag0
    public final d31 j() {
        switch (this.y3) {
            case 0:
                yx4 yx4Var = (yx4) this.z3;
                return new d31(yx4Var.c, yx4Var.J0);
            default:
                return super.j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx4(wua wuaVar, Context context, int i, long j, vnb vnbVar, View view) {
        super(context, i, j, vnbVar, view);
        this.z3 = wuaVar;
    }
}
