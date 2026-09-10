package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf0 b;

    public /* synthetic */ mf0(zf0 zf0Var, int i10) {
        this.a = i10;
        this.b = zf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hs[] hsVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        zf0 zf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.kj0 kj0Var = zf0Var.G;
                fs fsVar = zf0Var.f;
                int i13 = zf0Var.f0;
                if (i13 != 3 && (hsVarArr = fsVar.f) != null) {
                    for (int length = hsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || fsVar.f[length].length() != 0) {
                            fsVar.f[length].requestFocus();
                            hs hsVar = fsVar.f[length];
                            hsVar.setSelection(hsVar.length());
                            xg0.T0(zf0Var.s0, fsVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.hj0 hj0Var = zf0Var.a;
                if (hj0Var != null) {
                    hj0Var.start();
                }
                if (i13 == 15) {
                    kj0Var.getAnimatedDrawable().N(0, false, false);
                    kj0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 6));
                break;
            case 2:
                fe0 fe0Var = zf0Var.w;
                zf0Var.q0 = false;
                while (true) {
                    hs[] hsVarArr2 = zf0Var.f.f;
                    if (i12 < hsVarArr2.length) {
                        hsVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (fe0Var.getCurrentView() != (zf0Var.f0 == 15 ? zf0Var.F : zf0Var.y)) {
                        fe0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.kj0 kj0Var2 = zf0Var.s;
                kj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.hj0 hj0Var2 = zf0Var.O;
                hj0Var2.N(0, false, false);
                hj0Var2.K(1);
                kj0Var2.setAnimation(hj0Var2);
                kj0Var2.d();
                break;
            case 5:
                try {
                    zf0Var.s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.R = string;
                d2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.a2.j(new StringBuilder("+"), zf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                d2Var.setOnDismissListener(new vf0(zf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.hj0 hj0Var3 = zf0Var.P;
                hj0Var3.u0 = new mf0(zf0Var, 8);
                org.telegram.ui.Components.kj0 kj0Var3 = zf0Var.s;
                kj0Var3.setAutoRepeat(false);
                hj0Var3.N(0, false, false);
                kj0Var3.setAnimation(hj0Var3);
                kj0Var3.d();
                break;
            case 7:
                zf0Var.postDelayed(new mf0(zf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 10));
                break;
            case 9:
                fs fsVar2 = zf0Var.f;
                fsVar2.e = false;
                fsVar2.f[0].requestFocus();
                while (true) {
                    hs[] hsVarArr3 = fsVar2.f;
                    if (i12 >= hsVarArr3.length) {
                        break;
                    } else {
                        hsVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.kj0 kj0Var4 = zf0Var.s;
                kj0Var4.setAutoRepeat(false);
                kj0Var4.setAnimation(zf0Var.a);
                break;
        }
    }
}
