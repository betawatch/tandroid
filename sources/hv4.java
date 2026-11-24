// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hv4 extends vqa {
    public final /* synthetic */ byte y3 = 0;
    public final /* synthetic */ fy0 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv4(tv4 tv4Var, Context context, int i, long j, wjb wjbVar) {
        super(context, i, j, wjbVar, null);
        this.z3 = tv4Var;
    }

    @Override // fx0
    public final int P() {
        switch (this.y3) {
            case 1:
                return ((vqa) this.z3).P();
            default:
                return super.P();
        }
    }

    @Override // vqa, fx0, zf0
    public final u21 j() {
        switch (this.y3) {
            case 0:
                tv4 tv4Var = (tv4) this.z3;
                return new u21(tv4Var.c, tv4Var.J0);
            default:
                return super.j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv4(vqa vqaVar, Context context, int i, long j, wjb wjbVar, View view) {
        super(context, i, j, wjbVar, view);
        this.z3 = vqaVar;
    }
}
