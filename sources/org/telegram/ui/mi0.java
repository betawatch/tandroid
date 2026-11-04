package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj0 b;

    public /* synthetic */ mi0(yj0 yj0Var, int i3) {
        this.a = i3;
        this.b = yj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                yj0 yj0Var = this.b;
                ViewGroup[] viewGroupArr = yj0Var.a0;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    yj0Var.Z[0].requestFocus();
                    org.telegram.messenger.g0.K3(yj0Var.Z[0]);
                    break;
                }
                break;
            case 1:
                yj0 yj0Var2 = this.b;
                yj0Var2.presentFragment(yj0Var2.i1, true);
                yj0Var2.i1 = null;
                break;
            case 2:
                yj0 yj0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = yj0Var3.b0;
                if (editTextBoldCursorArr != null) {
                    yj0Var3.M1(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.K3(this.b.Z[2]);
                break;
            case 4:
                this.b.B1();
                break;
            case 5:
                int i3 = 0;
                while (true) {
                    yj0 yj0Var4 = this.b;
                    if (i3 >= yj0Var4.d0.getChildCount()) {
                        yj0Var4.B1();
                        yj0Var4.r1.clear();
                        yj0Var4.q1.clear();
                        yj0Var4.E.values.clear();
                        yj0Var4.V1();
                        break;
                    } else {
                        View childAt = yj0Var4.d0.getChildAt(i3);
                        if (childAt instanceof xj0) {
                            yj0Var4.d0.removeView(childAt);
                            i3--;
                        }
                        i3++;
                    }
                }
            default:
                this.b.finishFragment();
                break;
        }
    }
}
