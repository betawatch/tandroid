package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf0 b;

    public /* synthetic */ ff0(sf0 sf0Var, int i10) {
        this.a = i10;
        this.b = sf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cs[] csVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        sf0 sf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.kj0 kj0Var = sf0Var.D;
                zr zrVar = sf0Var.f;
                int i13 = sf0Var.c0;
                if (i13 != 3 && (csVarArr = zrVar.f) != null) {
                    for (int length = csVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || zrVar.f[length].length() != 0) {
                            zrVar.f[length].requestFocus();
                            cs csVar = zrVar.f[length];
                            csVar.setSelection(csVar.length());
                            og0.T0(sf0Var.p0, zrVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.hj0 hj0Var = sf0Var.a;
                if (hj0Var != null) {
                    hj0Var.start();
                }
                if (i13 == 15) {
                    kj0Var.getAnimatedDrawable().L(0, false, false);
                    kj0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ff0(sf0Var, 6));
                break;
            case 2:
                yd0 yd0Var = sf0Var.w;
                sf0Var.n0 = false;
                while (true) {
                    cs[] csVarArr2 = sf0Var.f.f;
                    if (i12 < csVarArr2.length) {
                        csVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (yd0Var.getCurrentView() != (sf0Var.c0 == 15 ? sf0Var.C : sf0Var.y)) {
                        yd0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ff0(sf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.kj0 kj0Var2 = sf0Var.s;
                kj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.hj0 hj0Var2 = sf0Var.L;
                hj0Var2.L(0, false, false);
                hj0Var2.I(1);
                kj0Var2.setAnimation(hj0Var2);
                kj0Var2.d();
                break;
            case 5:
                try {
                    sf0Var.p0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.y3.j(new StringBuilder("+"), sf0Var.d, se.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                d2Var.setOnDismissListener(new of0(sf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.hj0 hj0Var3 = sf0Var.M;
                hj0Var3.r0 = new ff0(sf0Var, 8);
                org.telegram.ui.Components.kj0 kj0Var3 = sf0Var.s;
                kj0Var3.setAutoRepeat(false);
                hj0Var3.L(0, false, false);
                kj0Var3.setAnimation(hj0Var3);
                kj0Var3.d();
                break;
            case 7:
                sf0Var.postDelayed(new ff0(sf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ff0(sf0Var, 10));
                break;
            case 9:
                zr zrVar2 = sf0Var.f;
                zrVar2.e = false;
                zrVar2.f[0].requestFocus();
                while (true) {
                    cs[] csVarArr3 = zrVar2.f;
                    if (i12 >= csVarArr3.length) {
                        break;
                    } else {
                        csVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.kj0 kj0Var4 = sf0Var.s;
                kj0Var4.setAutoRepeat(false);
                kj0Var4.setAnimation(sf0Var.a);
                break;
        }
    }
}
