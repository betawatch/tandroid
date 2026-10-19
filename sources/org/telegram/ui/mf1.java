package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf1 b;

    public /* synthetic */ mf1(vf1 vf1Var, int i10) {
        this.a = i10;
        this.b = vf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vf1 vf1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = vf1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    vf1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(vf1Var.n);
                    break;
                }
                break;
            case 1:
                vf1 vf1Var2 = this.b;
                id0 id0Var = vf1Var2.w;
                if (id0Var != null && id0Var.getVisibility() == 0) {
                    vf1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    tr[] trVarArr = this.b.w.f;
                    if (i10 >= trVarArr.length) {
                        break;
                    } else {
                        trVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                vf1 vf1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = vf1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        vf1Var3.f0[2].P(49);
                        vf1Var3.f0[2].T(0.0f, false);
                        vf1Var3.a.d();
                        break;
                    } else {
                        vf1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                vf1 vf1Var4 = this.b;
                if (vf1Var4.g0 != null) {
                    vf1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                vf1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new mf1(this.b, 7), 150L);
                break;
            default:
                for (tr trVar : this.b.w.f) {
                    trVar.i(0.0f);
                }
                break;
        }
    }
}
