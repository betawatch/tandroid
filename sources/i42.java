// default package

import android.location.Location;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class i42 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s42 b;

    public /* synthetic */ i42(s42 s42Var, byte b) {
        this.a = b;
        this.b = s42Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        byte b = this.a;
        s42 s42Var = this.b;
        switch (b) {
            case 0:
            case 3:
                s42Var.O();
                break;
            case 1:
                s42Var.b0();
                break;
            case 2:
                double[] dArr = s42Var.b.x4;
                s42Var.f0(dArr[0], dArr[1]);
                break;
            case 4:
                s42Var.getClass();
                hl.c3(new i42(s42Var, (byte) 7));
                break;
            case 5:
                vc6 vc6Var = s42Var.L;
                if (!s42Var.l0) {
                    x05 x05Var = s42Var.E;
                    if (x05Var != null && (location = s42Var.j0) != null) {
                        location.setLatitude(((ak5) x05Var.d().b).a);
                        s42Var.j0.setLongitude(((ak5) s42Var.E.d().b).b);
                    }
                    vc6Var.L(s42Var.j0);
                    vc6Var.H();
                    break;
                } else {
                    s42Var.l0 = false;
                    break;
                }
            case 6:
                View view = s42Var.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    break;
                }
                break;
            case 7:
                View view2 = s42Var.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                break;
            default:
                s42Var.f0(0.0d, 0.0d);
                break;
        }
    }
}
