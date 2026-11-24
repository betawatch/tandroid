// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class oe6 extends qc6 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ jja f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe6(qe6 qe6Var, Context context, byte b) {
        super(qe6Var.v0, context);
        this.e = b;
        switch (b) {
            case 1:
                this.f = qe6Var;
                super(qe6Var.v0, context);
                break;
            default:
                this.f = qe6Var;
                break;
        }
    }

    @Override // qc6
    public final boolean a() {
        byte b = this.e;
        jja jjaVar = this.f;
        switch (b) {
            case 0:
                return ((qe6) jjaVar).l0;
            case 1:
                return ((qe6) jjaVar).l0;
            default:
                return ((qd6) jjaVar).N;
        }
    }

    @Override // qc6
    public final boolean b() {
        byte b = this.e;
        jja jjaVar = this.f;
        switch (b) {
            case 0:
                if (getVisibility() == 0) {
                    qe6 qe6Var = (qe6) jjaVar;
                    if (qe6Var.b0 <= 0 || qe6Var.U == null) {
                        break;
                    }
                }
                break;
            case 1:
                qe6 qe6Var2 = (qe6) jjaVar;
                if (isClickable() && getVisibility() == 0 && !qe6Var2.g0) {
                    oe6 oe6Var = qe6Var2.w;
                    if ((oe6Var == null || oe6Var.getVisibility() == 8) && !qe6Var2.l0) {
                        break;
                    }
                }
                break;
            default:
                if (getVisibility() == 0) {
                    qd6 qd6Var = (qd6) jjaVar;
                    if (qd6Var.Q <= 0 || qd6Var.O == null) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe6(qd6 qd6Var, Context context) {
        super(qd6Var.b0, context);
        this.e = (byte) 2;
        this.f = qd6Var;
    }
}
