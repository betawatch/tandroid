// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dg6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rg6 b;

    public /* synthetic */ dg6(rg6 rg6Var, byte b) {
        this.a = b;
        this.b = rg6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gl2[] gl2VarArr;
        byte b = this.a;
        byte b2 = 1;
        int i = 0;
        rg6 rg6Var = this.b;
        switch (b) {
            case 0:
                s09 s09Var = rg6Var.H;
                tk2 tk2Var = rg6Var.f;
                byte b3 = rg6Var.i0;
                if (b3 != 3 && (gl2VarArr = tk2Var.f) != null) {
                    for (int length = gl2VarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || tk2Var.f[length].length() != 0) {
                            tk2Var.f[length].requestFocus();
                            gl2 gl2Var = tk2Var.f[length];
                            gl2Var.setSelection(gl2Var.length());
                            rg6Var.v0.M1(tk2Var.f[length]);
                        }
                    }
                }
                p09 p09Var = rg6Var.a;
                if (p09Var != null) {
                    p09Var.start();
                }
                if (b3 == 15) {
                    s09Var.getAnimatedDrawable().I(0, false, false);
                    s09Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                gm.c3(new dg6(rg6Var, (byte) 6));
                break;
            case 2:
                ye6 ye6Var = rg6Var.x;
                rg6Var.t0 = false;
                while (true) {
                    gl2[] gl2VarArr2 = rg6Var.f.f;
                    if (i < gl2VarArr2.length) {
                        gl2VarArr2[i].A(0.0f);
                        i++;
                    } else if (ye6Var.getCurrentView() != (rg6Var.i0 == 15 ? rg6Var.G : rg6Var.E)) {
                        ye6Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                gm.c3(new dg6(rg6Var, (byte) 4));
                break;
            case 4:
                s09 s09Var2 = rg6Var.s;
                s09Var2.setAutoRepeat(true);
                p09 p09Var2 = rg6Var.R;
                p09Var2.I(0, false, false);
                p09Var2.F(1);
                s09Var2.setAnimation(p09Var2);
                s09Var2.d();
                break;
            case 5:
                try {
                    rg6Var.v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rg6Var.getContext());
                String M0 = jb6.M0(2131742461, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.a0(null, null, 2131752487, mlb.l(new StringBuilder("+"), rg6Var.d, r58.f()));
                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                heVar.setOnDismissListener(new lg6(rg6Var, b2));
                alertDialog$Builder.o();
                break;
            case 6:
                p09 p09Var3 = rg6Var.S;
                p09Var3.u0 = new dg6(rg6Var, (byte) 8);
                s09 s09Var3 = rg6Var.s;
                s09Var3.setAutoRepeat(false);
                p09Var3.I(0, false, false);
                s09Var3.setAnimation(p09Var3);
                s09Var3.d();
                break;
            case 7:
                rg6Var.postDelayed(new dg6(rg6Var, (byte) 9), 150L);
                break;
            case 8:
                gm.c3(new dg6(rg6Var, (byte) 10));
                break;
            case 9:
                tk2 tk2Var2 = rg6Var.f;
                tk2Var2.e = false;
                tk2Var2.f[0].requestFocus();
                while (true) {
                    gl2[] gl2VarArr3 = tk2Var2.f;
                    if (i >= gl2VarArr3.length) {
                        break;
                    } else {
                        gl2VarArr3[i].A(0.0f);
                        i++;
                    }
                }
            default:
                s09 s09Var4 = rg6Var.s;
                s09Var4.setAutoRepeat(false);
                s09Var4.setAnimation(rg6Var.a);
                break;
        }
    }
}
