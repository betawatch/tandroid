package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf0 b;

    public /* synthetic */ ef0(rf0 rf0Var, int i10) {
        this.a = i10;
        this.b = rf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bs[] bsVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        rf0 rf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.jj0 jj0Var = rf0Var.D;
                yr yrVar = rf0Var.f;
                int i13 = rf0Var.c0;
                if (i13 != 3 && (bsVarArr = yrVar.f) != null) {
                    for (int length = bsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || yrVar.f[length].length() != 0) {
                            yrVar.f[length].requestFocus();
                            bs bsVar = yrVar.f[length];
                            bsVar.setSelection(bsVar.length());
                            ng0.T0(rf0Var.p0, yrVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.gj0 gj0Var = rf0Var.a;
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
                AndroidUtilities.runOnUIThread(new ef0(rf0Var, 6));
                break;
            case 2:
                xd0 xd0Var = rf0Var.w;
                rf0Var.n0 = false;
                while (true) {
                    bs[] bsVarArr2 = rf0Var.f.f;
                    if (i12 < bsVarArr2.length) {
                        bsVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (xd0Var.getCurrentView() != (rf0Var.c0 == 15 ? rf0Var.C : rf0Var.y)) {
                        xd0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ef0(rf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.jj0 jj0Var2 = rf0Var.s;
                jj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.gj0 gj0Var2 = rf0Var.L;
                gj0Var2.L(0, false, false);
                gj0Var2.I(1);
                jj0Var2.setAnimation(gj0Var2);
                jj0Var2.d();
                break;
            case 5:
                try {
                    rf0Var.p0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.y3.j(new StringBuilder("+"), rf0Var.d, se.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                d2Var.setOnDismissListener(new nf0(rf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.gj0 gj0Var3 = rf0Var.M;
                gj0Var3.r0 = new ef0(rf0Var, 8);
                org.telegram.ui.Components.jj0 jj0Var3 = rf0Var.s;
                jj0Var3.setAutoRepeat(false);
                gj0Var3.L(0, false, false);
                jj0Var3.setAnimation(gj0Var3);
                jj0Var3.d();
                break;
            case 7:
                rf0Var.postDelayed(new ef0(rf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ef0(rf0Var, 10));
                break;
            case 9:
                yr yrVar2 = rf0Var.f;
                yrVar2.e = false;
                yrVar2.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = yrVar2.f;
                    if (i12 >= bsVarArr3.length) {
                        break;
                    } else {
                        bsVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.jj0 jj0Var4 = rf0Var.s;
                jj0Var4.setAutoRepeat(false);
                jj0Var4.setAnimation(rf0Var.a);
                break;
        }
    }
}
