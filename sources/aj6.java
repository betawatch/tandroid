// default package

import android.os.Build;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class aj6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fj6 b;

    public /* synthetic */ aj6(fj6 fj6Var, byte b) {
        this.a = b;
        this.b = fj6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rz4 rz4Var;
        uz4[] uz4VarArr;
        byte b = this.a;
        fj6 fj6Var = this.b;
        switch (b) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (rz4Var = fj6Var.V) != null) {
                    rz4Var.c.d = 0L;
                    fj6Var.W.c.d = 0L;
                    fj6Var.c0();
                    break;
                }
                break;
            case 1:
                fj6Var.o0();
                break;
            case 2:
                i91.j0(fj6Var);
                break;
            case 3:
                fj6Var.p0();
                break;
            case 4:
                new sl7(fj6Var, fj6Var.getParentActivity()).show();
                break;
            case 5:
                fj6Var.presentFragment(new i91(bs2.l("needFinishFragment", false)));
                break;
            case 6:
                fj6Var.h0(false);
                break;
            case 7:
                if (fj6Var.getParentActivity() != null && (uz4VarArr = fj6Var.N) != null) {
                    float width = ((r0.getWidth() / 2.0f) + (fj6Var.b.getWidth() - ((uz4VarArr[5].getX() + fj6Var.I.getX()) + r0.getWidth()))) / hl.p;
                    kg5 kg5Var = new kg5(fj6Var.getParentActivity(), 3);
                    fj6Var.S = kg5Var;
                    kg5Var.setTranslationY(hl.L(4.0f) + (-fj6Var.O));
                    fj6Var.S.setPadding(hl.L(7.33f), 0, hl.L(7.33f), 0);
                    fj6Var.S.p(false);
                    fj6Var.S.j(true);
                    fj6Var.S.t(ob6.M0(2131743954, null));
                    fj6Var.S.n(1.0f, (-width) + 7.33f);
                    fj6Var.b.addView(fj6Var.S, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    kg5 kg5Var2 = fj6Var.S;
                    kg5Var2.r0 = new aj6(fj6Var, (byte) 8);
                    kg5Var2.d = 8000L;
                    kg5Var2.v();
                    mg5.r.b();
                    break;
                }
                break;
            default:
                hl.B2(fj6Var.S);
                break;
        }
    }
}
