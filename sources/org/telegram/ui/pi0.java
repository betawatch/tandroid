package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk0 b;

    public /* synthetic */ pi0(bk0 bk0Var, int i7) {
        this.a = i7;
        this.b = bk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                bk0 bk0Var = this.b;
                ViewGroup[] viewGroupArr = bk0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    bk0Var.Y[0].requestFocus();
                    org.telegram.messenger.g0.K3(bk0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                bk0 bk0Var2 = this.b;
                bk0Var2.presentFragment(bk0Var2.h1, true);
                bk0Var2.h1 = null;
                break;
            case 2:
                bk0 bk0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = bk0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    bk0Var3.M1(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.K3(this.b.Y[2]);
                break;
            case 4:
                this.b.B1();
                break;
            case 5:
                int i7 = 0;
                while (true) {
                    bk0 bk0Var4 = this.b;
                    if (i7 >= bk0Var4.c0.getChildCount()) {
                        bk0Var4.B1();
                        bk0Var4.q1.clear();
                        bk0Var4.p1.clear();
                        bk0Var4.D.values.clear();
                        bk0Var4.V1();
                        break;
                    } else {
                        View childAt = bk0Var4.c0.getChildAt(i7);
                        if (childAt instanceof ak0) {
                            bk0Var4.c0.removeView(childAt);
                            i7--;
                        }
                        i7++;
                    }
                }
            default:
                this.b.finishFragment();
                break;
        }
    }
}
