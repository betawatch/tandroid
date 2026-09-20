package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                fe0 fe0Var = ih1Var2.w;
                if (fe0Var != null && fe0Var.getVisibility() == 0) {
                    ih1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    gs[] gsVarArr = this.b.w.f;
                    if (i10 >= gsVarArr.length) {
                        break;
                    } else {
                        gsVarArr[i10].i(0.0f);
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
                for (gs gsVar : this.b.w.f) {
                    gsVar.i(0.0f);
                }
                break;
        }
    }
}
