package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn0 b;

    public /* synthetic */ nl0(dn0 dn0Var, int i10) {
        this.a = i10;
        this.b = dn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                dn0 dn0Var = this.b;
                ViewGroup[] viewGroupArr = dn0Var.W;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    dn0Var.V[0].requestFocus();
                    AndroidUtilities.showKeyboard(dn0Var.V[0]);
                    break;
                }
                break;
            case 1:
                dn0 dn0Var2 = this.b;
                dn0Var2.presentFragment(dn0Var2.e1, true);
                dn0Var2.e1 = null;
                break;
            case 2:
                dn0 dn0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = dn0Var3.X;
                if (editTextBoldCursorArr != null) {
                    dn0Var3.I1(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 3:
                AndroidUtilities.showKeyboard(this.b.V[2]);
                break;
            case 4:
                this.b.x1();
                break;
            case 5:
                int i10 = 0;
                while (true) {
                    dn0 dn0Var4 = this.b;
                    if (i10 >= dn0Var4.Z.getChildCount()) {
                        dn0Var4.x1();
                        dn0Var4.n1.clear();
                        dn0Var4.m1.clear();
                        dn0Var4.y.values.clear();
                        dn0Var4.Q1();
                        break;
                    } else {
                        View childAt = dn0Var4.Z.getChildAt(i10);
                        if (childAt instanceof cn0) {
                            dn0Var4.Z.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    }
                }
            default:
                this.b.finishFragment();
                break;
        }
    }
}
