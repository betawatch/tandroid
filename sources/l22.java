// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class l22 extends evc {
    public final /* synthetic */ byte x;
    public final /* synthetic */ c79 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l22(ly0 ly0Var, Context context) {
        super(context, 1);
        this.x = (byte) 0;
        this.y = ly0Var;
    }

    @Override // evc
    public final void a(int i, Object obj) {
        byte b = this.x;
        c79 c79Var = this.y;
        switch (b) {
            case 0:
                pt2 pt2Var = ((m22) ((ly0) c79Var).f).y;
                if (pt2Var != null) {
                    pt2Var.accept(obj);
                    break;
                }
                break;
            case 1:
                ((awc) c79Var).d.F0(this, obj, i);
                break;
            default:
                ((cwc) c79Var).F.presentFragment(new pqb(obj, null, true));
                break;
        }
    }

    @Override // evc
    public final boolean b(Object obj, int i) {
        switch (this.x) {
            case 1:
                return ((awc) this.y).d.G0(this, obj, i);
            default:
                return super.b(obj, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l22(c79 c79Var, Context context, byte b) {
        super(context, 5);
        this.x = b;
        this.y = c79Var;
    }
}
