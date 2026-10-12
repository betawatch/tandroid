package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class em0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un0 b;

    public /* synthetic */ em0(un0 un0Var, int i10) {
        this.a = i10;
        this.b = un0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                un0 un0Var = this.b;
                ViewGroup[] viewGroupArr = un0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    un0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(un0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                un0 un0Var2 = this.b;
                un0Var2.presentFragment(un0Var2.h1, true);
                un0Var2.h1 = null;
                break;
            case 2:
                un0 un0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = un0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    un0Var3.H1(editTextBoldCursorArr[0]);
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
                    un0 un0Var4 = this.b;
                    if (i10 >= un0Var4.c0.getChildCount()) {
                        un0Var4.w1();
                        un0Var4.q1.clear();
                        un0Var4.p1.clear();
                        un0Var4.y.values.clear();
                        un0Var4.P1();
                        break;
                    } else {
                        View childAt = un0Var4.c0.getChildAt(i10);
                        if (childAt instanceof tn0) {
                            un0Var4.c0.removeView(childAt);
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
