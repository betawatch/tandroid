package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf0 b;

    public /* synthetic */ gf0(tf0 tf0Var, int i10) {
        this.a = i10;
        this.b = tf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        as[] asVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        tf0 tf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.lj0 lj0Var = tf0Var.G;
                yr yrVar = tf0Var.f;
                int i13 = tf0Var.f0;
                if (i13 != 3 && (asVarArr = yrVar.f) != null) {
                    for (int length = asVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || yrVar.f[length].length() != 0) {
                            yrVar.f[length].requestFocus();
                            as asVar = yrVar.f[length];
                            asVar.setSelection(asVar.length());
                            qg0.T0(tf0Var.s0, yrVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ij0 ij0Var = tf0Var.a;
                if (ij0Var != null) {
                    ij0Var.start();
                }
                if (i13 == 15) {
                    lj0Var.getAnimatedDrawable().N(0, false, false);
                    lj0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 6));
                break;
            case 2:
                zd0 zd0Var = tf0Var.w;
                tf0Var.q0 = false;
                while (true) {
                    as[] asVarArr2 = tf0Var.f.f;
                    if (i12 < asVarArr2.length) {
                        asVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (zd0Var.getCurrentView() != (tf0Var.f0 == 15 ? tf0Var.F : tf0Var.y)) {
                        zd0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.lj0 lj0Var2 = tf0Var.s;
                lj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ij0 ij0Var2 = tf0Var.O;
                ij0Var2.N(0, false, false);
                ij0Var2.K(1);
                lj0Var2.setAnimation(ij0Var2);
                lj0Var2.d();
                break;
            case 5:
                try {
                    tf0Var.s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.ok.h(new StringBuilder("+"), tf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                a2Var.setOnDismissListener(new pf0(tf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.ij0 ij0Var3 = tf0Var.P;
                ij0Var3.t0 = new gf0(tf0Var, 8);
                org.telegram.ui.Components.lj0 lj0Var3 = tf0Var.s;
                lj0Var3.setAutoRepeat(false);
                ij0Var3.N(0, false, false);
                lj0Var3.setAnimation(ij0Var3);
                lj0Var3.d();
                break;
            case 7:
                tf0Var.postDelayed(new gf0(tf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 10));
                break;
            case 9:
                yr yrVar2 = tf0Var.f;
                yrVar2.e = false;
                yrVar2.f[0].requestFocus();
                while (true) {
                    as[] asVarArr3 = yrVar2.f;
                    if (i12 >= asVarArr3.length) {
                        break;
                    } else {
                        asVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.lj0 lj0Var4 = tf0Var.s;
                lj0Var4.setAutoRepeat(false);
                lj0Var4.setAnimation(tf0Var.a);
                break;
        }
    }
}
