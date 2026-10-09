package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf0 b;

    public /* synthetic */ lf0(zf0 zf0Var, int i10) {
        this.a = i10;
        this.b = zf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        es[] esVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        zf0 zf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.fk0 fk0Var = zf0Var.G;
                cs csVar = zf0Var.f;
                int i13 = zf0Var.f0;
                if (i13 != 3 && (esVarArr = csVar.f) != null) {
                    for (int length = esVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || csVar.f[length].length() != 0) {
                            csVar.f[length].requestFocus();
                            es esVar = csVar.f[length];
                            esVar.setSelection(esVar.length());
                            wg0.T0(zf0Var.s0, csVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ck0 ck0Var = zf0Var.a;
                if (ck0Var != null) {
                    ck0Var.start();
                }
                if (i13 == 15) {
                    fk0Var.getAnimatedDrawable().N(0, false, false);
                    fk0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new lf0(zf0Var, 6));
                break;
            case 2:
                ee0 ee0Var = zf0Var.w;
                zf0Var.q0 = false;
                while (true) {
                    es[] esVarArr2 = zf0Var.f.f;
                    if (i12 < esVarArr2.length) {
                        esVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (ee0Var.getCurrentView() != (zf0Var.f0 == 15 ? zf0Var.F : zf0Var.y)) {
                        ee0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new lf0(zf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.fk0 fk0Var2 = zf0Var.s;
                fk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ck0 ck0Var2 = zf0Var.O;
                ck0Var2.N(0, false, false);
                ck0Var2.K(1);
                fk0Var2.setAnimation(ck0Var2);
                fk0Var2.d();
                break;
            case 5:
                try {
                    zf0Var.s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.bi.g(new StringBuilder("+"), zf0Var.d, hf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new vf0(zf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.ck0 ck0Var3 = zf0Var.P;
                ck0Var3.t0 = new lf0(zf0Var, 8);
                org.telegram.ui.Components.fk0 fk0Var3 = zf0Var.s;
                fk0Var3.setAutoRepeat(false);
                ck0Var3.N(0, false, false);
                fk0Var3.setAnimation(ck0Var3);
                fk0Var3.d();
                break;
            case 7:
                zf0Var.postDelayed(new lf0(zf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new lf0(zf0Var, 10));
                break;
            case 9:
                cs csVar2 = zf0Var.f;
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
                org.telegram.ui.Components.fk0 fk0Var4 = zf0Var.s;
                fk0Var4.setAutoRepeat(false);
                fk0Var4.setAnimation(zf0Var.a);
                break;
        }
    }
}
