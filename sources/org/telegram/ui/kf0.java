package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf0 b;

    public /* synthetic */ kf0(xf0 xf0Var, int i10) {
        this.a = i10;
        this.b = xf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        es[] esVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        xf0 xf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.nj0 nj0Var = xf0Var.G;
                cs csVar = xf0Var.f;
                int i13 = xf0Var.f0;
                if (i13 != 3 && (esVarArr = csVar.f) != null) {
                    for (int length = esVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || csVar.f[length].length() != 0) {
                            csVar.f[length].requestFocus();
                            es esVar = csVar.f[length];
                            esVar.setSelection(esVar.length());
                            ug0.T0(xf0Var.s0, csVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.kj0 kj0Var = xf0Var.a;
                if (kj0Var != null) {
                    kj0Var.start();
                }
                if (i13 == 15) {
                    nj0Var.getAnimatedDrawable().N(0, false, false);
                    nj0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new kf0(xf0Var, 6));
                break;
            case 2:
                de0 de0Var = xf0Var.w;
                xf0Var.q0 = false;
                while (true) {
                    es[] esVarArr2 = xf0Var.f.f;
                    if (i12 < esVarArr2.length) {
                        esVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (de0Var.getCurrentView() != (xf0Var.f0 == 15 ? xf0Var.F : xf0Var.y)) {
                        de0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new kf0(xf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.nj0 nj0Var2 = xf0Var.s;
                nj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.kj0 kj0Var2 = xf0Var.O;
                kj0Var2.N(0, false, false);
                kj0Var2.K(1);
                nj0Var2.setAnimation(kj0Var2);
                nj0Var2.d();
                break;
            case 5:
                try {
                    xf0Var.s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.bi.g(new StringBuilder("+"), xf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new tf0(xf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.kj0 kj0Var3 = xf0Var.P;
                kj0Var3.t0 = new kf0(xf0Var, 8);
                org.telegram.ui.Components.nj0 nj0Var3 = xf0Var.s;
                nj0Var3.setAutoRepeat(false);
                kj0Var3.N(0, false, false);
                nj0Var3.setAnimation(kj0Var3);
                nj0Var3.d();
                break;
            case 7:
                xf0Var.postDelayed(new kf0(xf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new kf0(xf0Var, 10));
                break;
            case 9:
                cs csVar2 = xf0Var.f;
                csVar2.e = false;
                csVar2.f[0].requestFocus();
                while (true) {
                    es[] esVarArr3 = csVar2.f;
                    if (i12 >= esVarArr3.length) {
                        break;
                    } else {
                        esVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.nj0 nj0Var4 = xf0Var.s;
                nj0Var4.setAutoRepeat(false);
                nj0Var4.setAnimation(xf0Var.a);
                break;
        }
    }
}
