package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        gs[] gsVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        zf0 zf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.aj0 aj0Var = zf0Var.G;
                es esVar = zf0Var.f;
                int i13 = zf0Var.f0;
                if (i13 != 3 && (gsVarArr = esVar.f) != null) {
                    for (int length = gsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || esVar.f[length].length() != 0) {
                            esVar.f[length].requestFocus();
                            gs gsVar = esVar.f[length];
                            gsVar.setSelection(gsVar.length());
                            wg0.T0(zf0Var.s0, esVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.xi0 xi0Var = zf0Var.a;
                if (xi0Var != null) {
                    xi0Var.start();
                }
                if (i13 == 15) {
                    aj0Var.getAnimatedDrawable().L(0, false, false);
                    aj0Var.getAnimatedDrawable().start();
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
                    gs[] gsVarArr2 = zf0Var.f.f;
                    if (i12 < gsVarArr2.length) {
                        gsVarArr2[i12].i(0.0f);
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
                org.telegram.ui.Components.aj0 aj0Var2 = zf0Var.s;
                aj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.xi0 xi0Var2 = zf0Var.O;
                xi0Var2.L(0, false, false);
                xi0Var2.I(1);
                aj0Var2.setAnimation(xi0Var2);
                aj0Var2.d();
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
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.w1.j(new StringBuilder("+"), zf0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new vf0(zf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.xi0 xi0Var3 = zf0Var.P;
                xi0Var3.u0 = new mf0(zf0Var, 8);
                org.telegram.ui.Components.aj0 aj0Var3 = zf0Var.s;
                aj0Var3.setAutoRepeat(false);
                xi0Var3.L(0, false, false);
                aj0Var3.setAnimation(xi0Var3);
                aj0Var3.d();
                break;
            case 7:
                zf0Var.postDelayed(new mf0(zf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new mf0(zf0Var, 10));
                break;
            case 9:
                es esVar2 = zf0Var.f;
                esVar2.e = false;
                esVar2.f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr3 = esVar2.f;
                    if (i12 >= gsVarArr3.length) {
                        break;
                    } else {
                        gsVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.aj0 aj0Var4 = zf0Var.s;
                aj0Var4.setAutoRepeat(false);
                aj0Var4.setAnimation(zf0Var.a);
                break;
        }
    }
}
