// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gu1 extends ro {
    public final /* synthetic */ byte b;
    public final /* synthetic */ fu1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu1(fu1 fu1Var, byte b) {
        super("p2", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = fu1Var;
                super("progress", (byte) 0);
                break;
            case 2:
                this.c = fu1Var;
                super("alpha", (byte) 0);
                break;
            default:
                this.c = fu1Var;
                break;
        }
    }

    @Override // ro
    public final void c(Object obj, float f) {
        byte b = this.b;
        fu1 fu1Var = this.c;
        switch (b) {
            case 0:
                ((g47) obj).e = f;
                View view = fu1Var.c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ((g47) obj).g = f;
                View view2 = fu1Var.c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                ((g47) obj).f = f;
                View view3 = fu1Var.c.R.fragmentView;
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
                return Float.valueOf(((g47) obj).e);
            case 1:
                return Float.valueOf(((g47) obj).g);
            default:
                return Float.valueOf(((g47) obj).f);
        }
    }
}
