package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ hl0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                vm0 vm0Var = this.b;
                ViewGroup[] viewGroupArr = vm0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    vm0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(vm0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                vm0 vm0Var2 = this.b;
                vm0Var2.presentFragment(vm0Var2.h1, true);
                vm0Var2.h1 = null;
                break;
            case 2:
                vm0 vm0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = vm0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    vm0Var3.H1(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 3:
                AndroidUtilities.showKeyboard(this.b.Y[2]);
                break;
            case 4:
                this.b.w1();
                break;
            case 5:
                int i10 = 0;
                while (true) {
                    vm0 vm0Var4 = this.b;
                    if (i10 >= vm0Var4.c0.getChildCount()) {
                        vm0Var4.w1();
                        vm0Var4.q1.clear();
                        vm0Var4.p1.clear();
                        vm0Var4.y.values.clear();
                        vm0Var4.P1();
                        break;
                    } else {
                        View childAt = vm0Var4.c0.getChildAt(i10);
                        if (childAt instanceof um0) {
                            vm0Var4.c0.removeView(childAt);
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
