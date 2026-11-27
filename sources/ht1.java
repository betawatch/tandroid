// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ht1 extends rn {
    public final /* synthetic */ byte b;
    public final /* synthetic */ gt1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht1(gt1 gt1Var, byte b) {
        super("p2", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = gt1Var;
                super("progress", (byte) 0);
                break;
            case 2:
                this.c = gt1Var;
                super("alpha", (byte) 0);
                break;
            default:
                this.c = gt1Var;
                break;
        }
    }

    @Override // rn
    public final void c(Object obj, float f) {
        byte b = this.b;
        gt1 gt1Var = this.c;
        switch (b) {
            case 0:
                ((n47) obj).e = f;
                View view = gt1Var.c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ((n47) obj).g = f;
                View view2 = gt1Var.c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                ((n47) obj).f = f;
                View view3 = gt1Var.c.R.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((n47) obj).e);
            case 1:
                return Float.valueOf(((n47) obj).g);
            default:
                return Float.valueOf(((n47) obj).f);
        }
    }
}
