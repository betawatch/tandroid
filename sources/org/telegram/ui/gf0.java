package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        ds[] dsVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        tf0 tf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.jj0 jj0Var = tf0Var.D;
                as asVar = tf0Var.f;
                int i13 = tf0Var.c0;
                if (i13 != 3 && (dsVarArr = asVar.f) != null) {
                    for (int length = dsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || asVar.f[length].length() != 0) {
                            asVar.f[length].requestFocus();
                            ds dsVar = asVar.f[length];
                            dsVar.setSelection(dsVar.length());
                            pg0.T0(tf0Var.p0, asVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.gj0 gj0Var = tf0Var.a;
                if (gj0Var != null) {
                    gj0Var.start();
                }
                if (i13 == 15) {
                    jj0Var.getAnimatedDrawable().L(0, false, false);
                    jj0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 6));
                break;
            case 2:
                zd0 zd0Var = tf0Var.w;
                tf0Var.n0 = false;
                while (true) {
                    ds[] dsVarArr2 = tf0Var.f.f;
                    if (i12 < dsVarArr2.length) {
                        dsVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (zd0Var.getCurrentView() != (tf0Var.c0 == 15 ? tf0Var.C : tf0Var.y)) {
                        zd0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.jj0 jj0Var2 = tf0Var.s;
                jj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.gj0 gj0Var2 = tf0Var.L;
                gj0Var2.L(0, false, false);
                gj0Var2.I(1);
                jj0Var2.setAnimation(gj0Var2);
                jj0Var2.d();
                break;
            case 5:
                try {
                    tf0Var.p0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.y3.j(new StringBuilder("+"), tf0Var.d, se.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                d2Var.setOnDismissListener(new pf0(tf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.gj0 gj0Var3 = tf0Var.M;
                gj0Var3.r0 = new gf0(tf0Var, 8);
                org.telegram.ui.Components.jj0 jj0Var3 = tf0Var.s;
                jj0Var3.setAutoRepeat(false);
                gj0Var3.L(0, false, false);
                jj0Var3.setAnimation(gj0Var3);
                jj0Var3.d();
                break;
            case 7:
                tf0Var.postDelayed(new gf0(tf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new gf0(tf0Var, 10));
                break;
            case 9:
                as asVar2 = tf0Var.f;
                asVar2.e = false;
                asVar2.f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr3 = asVar2.f;
                    if (i12 >= dsVarArr3.length) {
                        break;
                    } else {
                        dsVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.jj0 jj0Var4 = tf0Var.s;
                jj0Var4.setAutoRepeat(false);
                jj0Var4.setAnimation(tf0Var.a);
                break;
        }
    }
}
