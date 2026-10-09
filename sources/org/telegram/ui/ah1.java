package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih1 b;

    public /* synthetic */ ah1(ih1 ih1Var, int i10) {
        this.a = i10;
        this.b = ih1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ih1 ih1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = ih1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    ih1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(ih1Var.n);
                    break;
                }
                break;
            case 1:
                ih1 ih1Var2 = this.b;
                ce0 ce0Var = ih1Var2.w;
                if (ce0Var != null && ce0Var.getVisibility() == 0) {
                    ih1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    es[] esVarArr = this.b.w.f;
                    if (i10 >= esVarArr.length) {
                        break;
                    } else {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                ih1 ih1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = ih1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        ih1Var3.f0[2].P(49);
                        ih1Var3.f0[2].T(0.0f, false);
                        ih1Var3.a.d();
                        break;
                    } else {
                        ih1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                ih1 ih1Var4 = this.b;
                if (ih1Var4.g0 != null) {
                    ih1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                ih1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ah1(this.b, 7), 150L);
                break;
            default:
                for (es esVar : this.b.w.f) {
                    esVar.i(0.0f);
                }
                break;
        }
    }
}
