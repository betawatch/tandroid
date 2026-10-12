package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh1 b;

    public /* synthetic */ gh1(oh1 oh1Var, int i10) {
        this.a = i10;
        this.b = oh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oh1 oh1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = oh1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    oh1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(oh1Var.n);
                    break;
                }
                break;
            case 1:
                oh1 oh1Var2 = this.b;
                ie0 ie0Var = oh1Var2.w;
                if (ie0Var != null && ie0Var.getVisibility() == 0) {
                    oh1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    ks[] ksVarArr = this.b.w.f;
                    if (i10 >= ksVarArr.length) {
                        break;
                    } else {
                        ksVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                oh1 oh1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = oh1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        oh1Var3.f0[2].P(49);
                        oh1Var3.f0[2].T(0.0f, false);
                        oh1Var3.a.d();
                        break;
                    } else {
                        oh1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                oh1 oh1Var4 = this.b;
                if (oh1Var4.g0 != null) {
                    oh1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                oh1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new gh1(this.b, 7), 150L);
                break;
            default:
                for (ks ksVar : this.b.w.f) {
                    ksVar.i(0.0f);
                }
                break;
        }
    }
}
