package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf1 b;

    public /* synthetic */ of1(xf1 xf1Var, int i10) {
        this.a = i10;
        this.b = xf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xf1 xf1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = xf1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    xf1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(xf1Var.n);
                    break;
                }
                break;
            case 1:
                xf1 xf1Var2 = this.b;
                kd0 kd0Var = xf1Var2.w;
                if (kd0Var != null && kd0Var.getVisibility() == 0) {
                    xf1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    vr[] vrVarArr = this.b.w.f;
                    if (i10 >= vrVarArr.length) {
                        break;
                    } else {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                xf1 xf1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = xf1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        xf1Var3.f0[2].P(49);
                        xf1Var3.f0[2].T(0.0f, false);
                        xf1Var3.a.d();
                        break;
                    } else {
                        xf1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                xf1 xf1Var4 = this.b;
                if (xf1Var4.g0 != null) {
                    xf1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                xf1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new of1(this.b, 7), 150L);
                break;
            default:
                for (vr vrVar : this.b.w.f) {
                    vrVar.i(0.0f);
                }
                break;
        }
    }
}
