package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg1 b;

    public /* synthetic */ ng1(wg1 wg1Var, int i10) {
        this.a = i10;
        this.b = wg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wg1 wg1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = wg1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    wg1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(wg1Var.n);
                    break;
                }
                break;
            case 1:
                wg1 wg1Var2 = this.b;
                xd0 xd0Var = wg1Var2.w;
                if (xd0Var != null && xd0Var.getVisibility() == 0) {
                    wg1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    ds[] dsVarArr = this.b.w.f;
                    if (i10 >= dsVarArr.length) {
                        break;
                    } else {
                        dsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                wg1 wg1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = wg1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        wg1Var3.c0[2].N(49);
                        wg1Var3.c0[2].Q(0.0f, false);
                        wg1Var3.a.d();
                        break;
                    } else {
                        wg1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                wg1 wg1Var4 = this.b;
                if (wg1Var4.d0 != null) {
                    wg1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                wg1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ng1(this.b, 7), 150L);
                break;
            default:
                for (ds dsVar : this.b.w.f) {
                    dsVar.i(0.0f);
                }
                break;
        }
    }
}
