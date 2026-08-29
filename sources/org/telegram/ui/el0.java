package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class el0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ el0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                vm0 vm0Var = this.b;
                ViewGroup[] viewGroupArr = vm0Var.V;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    vm0Var.U[0].requestFocus();
                    AndroidUtilities.showKeyboard(vm0Var.U[0]);
                    break;
                }
                break;
            case 1:
                vm0 vm0Var2 = this.b;
                vm0Var2.presentFragment(vm0Var2.d1, true);
                vm0Var2.d1 = null;
                break;
            case 2:
                vm0 vm0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = vm0Var3.W;
                if (editTextBoldCursorArr != null) {
                    vm0Var3.I1(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 3:
                AndroidUtilities.showKeyboard(this.b.U[2]);
                break;
            case 4:
                this.b.x1();
                break;
            case 5:
                int i10 = 0;
                while (true) {
                    vm0 vm0Var4 = this.b;
                    if (i10 >= vm0Var4.Y.getChildCount()) {
                        vm0Var4.x1();
                        vm0Var4.m1.clear();
                        vm0Var4.l1.clear();
                        vm0Var4.y.values.clear();
                        vm0Var4.Q1();
                        break;
                    } else {
                        View childAt = vm0Var4.Y.getChildAt(i10);
                        if (childAt instanceof um0) {
                            vm0Var4.Y.removeView(childAt);
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
