package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg1 b;

    public /* synthetic */ hg1(qg1 qg1Var, int i10) {
        this.a = i10;
        this.b = qg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qg1 qg1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = qg1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    qg1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(qg1Var.n);
                    break;
                }
                break;
            case 1:
                qg1 qg1Var2 = this.b;
                wd0 wd0Var = qg1Var2.w;
                if (wd0Var != null && wd0Var.getVisibility() == 0) {
                    qg1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    cs[] csVarArr = this.b.w.f;
                    if (i10 >= csVarArr.length) {
                        break;
                    } else {
                        csVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                qg1 qg1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = qg1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        qg1Var3.c0[2].N(49);
                        qg1Var3.c0[2].Q(0.0f, false);
                        qg1Var3.a.d();
                        break;
                    } else {
                        qg1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                qg1 qg1Var4 = this.b;
                if (qg1Var4.d0 != null) {
                    qg1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                qg1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new hg1(this.b, 7), 150L);
                break;
            default:
                for (cs csVar : this.b.w.f) {
                    csVar.i(0.0f);
                }
                break;
        }
    }
}
