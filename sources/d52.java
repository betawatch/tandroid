// default package

import android.location.Location;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class d52 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n52 b;

    public /* synthetic */ d52(n52 n52Var, byte b) {
        this.a = b;
        this.b = n52Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        byte b = this.a;
        n52 n52Var = this.b;
        switch (b) {
            case 0:
            case 2:
                n52Var.O();
                break;
            case 1:
                n52Var.c0();
                break;
            case 3:
                double[] dArr = n52Var.b.x4;
                n52Var.g0(dArr[0], dArr[1]);
                break;
            case 4:
                n52Var.getClass();
                gm.c3(new d52(n52Var, (byte) 7));
                break;
            case 5:
                qc6 qc6Var = n52Var.L;
                if (!n52Var.l0) {
                    s05 s05Var = n52Var.E;
                    if (s05Var != null && (location = n52Var.j0) != null) {
                        location.setLatitude(((xj5) s05Var.d().b).a);
                        n52Var.j0.setLongitude(((xj5) n52Var.E.d().b).b);
                    }
                    qc6Var.L(n52Var.j0);
                    qc6Var.H();
                    break;
                } else {
                    n52Var.l0 = false;
                    break;
                }
            case 6:
                View view = n52Var.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    break;
                }
                break;
            case 7:
                View view2 = n52Var.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                break;
            default:
                n52Var.g0(0.0d, 0.0d);
                break;
        }
    }
}
