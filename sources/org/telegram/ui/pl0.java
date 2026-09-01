package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn0 b;

    public /* synthetic */ pl0(fn0 fn0Var, int i10) {
        this.a = i10;
        this.b = fn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                fn0 fn0Var = this.b;
                ViewGroup[] viewGroupArr = fn0Var.W;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    fn0Var.V[0].requestFocus();
                    AndroidUtilities.showKeyboard(fn0Var.V[0]);
                    break;
                }
                break;
            case 1:
                fn0 fn0Var2 = this.b;
                fn0Var2.presentFragment(fn0Var2.e1, true);
                fn0Var2.e1 = null;
                break;
            case 2:
                fn0 fn0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = fn0Var3.X;
                if (editTextBoldCursorArr != null) {
                    fn0Var3.I1(editTextBoldCursorArr[0]);
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
                    fn0 fn0Var4 = this.b;
                    if (i10 >= fn0Var4.Z.getChildCount()) {
                        fn0Var4.x1();
                        fn0Var4.n1.clear();
                        fn0Var4.m1.clear();
                        fn0Var4.y.values.clear();
                        fn0Var4.Q1();
                        break;
                    } else {
                        View childAt = fn0Var4.Z.getChildAt(i10);
                        if (childAt instanceof en0) {
                            fn0Var4.Z.removeView(childAt);
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
