// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ee6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qe6 b;

    public /* synthetic */ ee6(qe6 qe6Var, byte b) {
        this.a = b;
        this.b = qe6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj2[] sj2VarArr;
        byte b = this.a;
        byte b2 = 1;
        int i = 0;
        qe6 qe6Var = this.b;
        switch (b) {
            case 0:
                ry8 ry8Var = qe6Var.H;
                fj2 fj2Var = qe6Var.f;
                byte b3 = qe6Var.i0;
                if (b3 != 3 && (sj2VarArr = fj2Var.f) != null) {
                    for (int length = sj2VarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || fj2Var.f[length].length() != 0) {
                            fj2Var.f[length].requestFocus();
                            sj2 sj2Var = fj2Var.f[length];
                            sj2Var.setSelection(sj2Var.length());
                            qe6Var.v0.L1(fj2Var.f[length]);
                        }
                    }
                }
                oy8 oy8Var = qe6Var.a;
                if (oy8Var != null) {
                    oy8Var.start();
                }
                if (b3 == 15) {
                    ry8Var.getAnimatedDrawable().I(0, false, false);
                    ry8Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                gl.d3(new ee6(qe6Var, (byte) 6));
                break;
            case 2:
                zc6 zc6Var = qe6Var.x;
                qe6Var.t0 = false;
                while (true) {
                    sj2[] sj2VarArr2 = qe6Var.f.f;
                    if (i < sj2VarArr2.length) {
                        sj2VarArr2[i].A(0.0f);
                        i++;
                    } else if (zc6Var.getCurrentView() != (qe6Var.i0 == 15 ? qe6Var.G : qe6Var.E)) {
                        zc6Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                gl.d3(new ee6(qe6Var, (byte) 4));
                break;
            case 4:
                ry8 ry8Var2 = qe6Var.s;
                ry8Var2.setAutoRepeat(true);
                oy8 oy8Var2 = qe6Var.R;
                oy8Var2.I(0, false, false);
                oy8Var2.F(1);
                ry8Var2.setAnimation(oy8Var2);
                ry8Var2.d();
                break;
            case 5:
                try {
                    qe6Var.v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qe6Var.getContext());
                String M0 = k96.M0(2131742535, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.a0(null, null, 2131752522, yjb.k(new StringBuilder("+"), qe6Var.d, p38.f()));
                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                hdVar.setOnDismissListener(new me6(qe6Var, b2));
                alertDialog$Builder.o();
                break;
            case 6:
                oy8 oy8Var3 = qe6Var.S;
                oy8Var3.u0 = new ee6(qe6Var, (byte) 8);
                ry8 ry8Var3 = qe6Var.s;
                ry8Var3.setAutoRepeat(false);
                oy8Var3.I(0, false, false);
                ry8Var3.setAnimation(oy8Var3);
                ry8Var3.d();
                break;
            case 7:
                qe6Var.postDelayed(new ee6(qe6Var, (byte) 9), 150L);
                break;
            case 8:
                gl.d3(new ee6(qe6Var, (byte) 10));
                break;
            case 9:
                fj2 fj2Var2 = qe6Var.f;
                fj2Var2.e = false;
                fj2Var2.f[0].requestFocus();
                while (true) {
                    sj2[] sj2VarArr3 = fj2Var2.f;
                    if (i >= sj2VarArr3.length) {
                        break;
                    } else {
                        sj2VarArr3[i].A(0.0f);
                        i++;
                    }
                }
            default:
                ry8 ry8Var4 = qe6Var.s;
                ry8Var4.setAutoRepeat(false);
                ry8Var4.setAnimation(qe6Var.a);
                break;
        }
    }
}
