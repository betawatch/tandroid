// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ix4 extends wsa {
    public final /* synthetic */ byte y3 = 0;
    public final /* synthetic */ mz0 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix4(ux4 ux4Var, Context context, int i, long j, ylb ylbVar) {
        super(context, i, j, ylbVar, null);
        this.z3 = ux4Var;
    }

    @Override // my0
    public final int O() {
        switch (this.y3) {
            case 1:
                return ((wsa) this.z3).O();
            default:
                return super.O();
        }
    }

    @Override // wsa, my0, ah0
    public final c41 j() {
        switch (this.y3) {
            case 0:
                ux4 ux4Var = (ux4) this.z3;
                return new c41(ux4Var.c, ux4Var.J0);
            default:
                return super.j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix4(wsa wsaVar, Context context, int i, long j, ylb ylbVar, View view) {
        super(context, i, j, ylbVar, view);
        this.z3 = wsaVar;
    }
}
