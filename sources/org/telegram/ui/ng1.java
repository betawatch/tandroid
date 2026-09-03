package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg1 b;

    public /* synthetic */ ng1(vg1 vg1Var, int i10) {
        this.a = i10;
        this.b = vg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vg1 vg1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = vg1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    vg1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(vg1Var.n);
                    break;
                }
                break;
            case 1:
                vg1 vg1Var2 = this.b;
                wd0 wd0Var = vg1Var2.w;
                if (wd0Var != null && wd0Var.getVisibility() == 0) {
                    vg1Var2.w.f[0].requestFocus();
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
                vg1 vg1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = vg1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        vg1Var3.c0[2].N(49);
                        vg1Var3.c0[2].Q(0.0f, false);
                        vg1Var3.a.d();
                        break;
                    } else {
                        vg1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                vg1 vg1Var4 = this.b;
                if (vg1Var4.d0 != null) {
                    vg1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                vg1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ng1(this.b, 7), 150L);
                break;
            default:
                for (cs csVar : this.b.w.f) {
                    csVar.i(0.0f);
                }
                break;
        }
    }
}
