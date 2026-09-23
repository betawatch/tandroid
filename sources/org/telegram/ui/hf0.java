package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uf0 b;

    public /* synthetic */ hf0(uf0 uf0Var, int i10) {
        this.a = i10;
        this.b = uf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bs[] bsVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        uf0 uf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.bj0 bj0Var = uf0Var.G;
                zr zrVar = uf0Var.f;
                int i13 = uf0Var.f0;
                if (i13 != 3 && (bsVarArr = zrVar.f) != null) {
                    for (int length = bsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || zrVar.f[length].length() != 0) {
                            zrVar.f[length].requestFocus();
                            bs bsVar = zrVar.f[length];
                            bsVar.setSelection(bsVar.length());
                            rg0.T0(uf0Var.s0, zrVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.yi0 yi0Var = uf0Var.a;
                if (yi0Var != null) {
                    yi0Var.start();
                }
                if (i13 == 15) {
                    bj0Var.getAnimatedDrawable().N(0, false, false);
                    bj0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new hf0(uf0Var, 6));
                break;
            case 2:
                ae0 ae0Var = uf0Var.w;
                uf0Var.q0 = false;
                while (true) {
                    bs[] bsVarArr2 = uf0Var.f.f;
                    if (i12 < bsVarArr2.length) {
                        bsVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (ae0Var.getCurrentView() != (uf0Var.f0 == 15 ? uf0Var.F : uf0Var.y)) {
                        ae0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new hf0(uf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.bj0 bj0Var2 = uf0Var.s;
                bj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.yi0 yi0Var2 = uf0Var.O;
                yi0Var2.N(0, false, false);
                yi0Var2.K(1);
                bj0Var2.setAnimation(yi0Var2);
                bj0Var2.d();
                break;
            case 5:
                try {
                    uf0Var.s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.ul.h(new StringBuilder("+"), uf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new qf0(uf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.yi0 yi0Var3 = uf0Var.P;
                yi0Var3.t0 = new hf0(uf0Var, 8);
                org.telegram.ui.Components.bj0 bj0Var3 = uf0Var.s;
                bj0Var3.setAutoRepeat(false);
                yi0Var3.N(0, false, false);
                bj0Var3.setAnimation(yi0Var3);
                bj0Var3.d();
                break;
            case 7:
                uf0Var.postDelayed(new hf0(uf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new hf0(uf0Var, 10));
                break;
            case 9:
                zr zrVar2 = uf0Var.f;
                zrVar2.e = false;
                zrVar2.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = zrVar2.f;
                    if (i12 >= bsVarArr3.length) {
                        break;
                    } else {
                        bsVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.bj0 bj0Var4 = uf0Var.s;
                bj0Var4.setAutoRepeat(false);
                bj0Var4.setAnimation(uf0Var.a);
                break;
        }
    }
}
