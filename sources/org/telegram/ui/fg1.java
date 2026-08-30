package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ og1 b;

    public /* synthetic */ fg1(og1 og1Var, int i10) {
        this.a = i10;
        this.b = og1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                og1 og1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = og1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    og1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(og1Var.n);
                    break;
                }
                break;
            case 1:
                og1 og1Var2 = this.b;
                vd0 vd0Var = og1Var2.w;
                if (vd0Var != null && vd0Var.getVisibility() == 0) {
                    og1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    bs[] bsVarArr = this.b.w.f;
                    if (i10 >= bsVarArr.length) {
                        break;
                    } else {
                        bsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                og1 og1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = og1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        og1Var3.c0[2].N(49);
                        og1Var3.c0[2].Q(0.0f, false);
                        og1Var3.a.d();
                        break;
                    } else {
                        og1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                og1 og1Var4 = this.b;
                if (og1Var4.d0 != null) {
                    og1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                og1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new fg1(this.b, 7), 150L);
                break;
            default:
                for (bs bsVar : this.b.w.f) {
                    bsVar.i(0.0f);
                }
                break;
        }
    }
}
