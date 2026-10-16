package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                ge0 ge0Var = oh1Var2.w;
                if (ge0Var != null && ge0Var.getVisibility() == 0) {
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
