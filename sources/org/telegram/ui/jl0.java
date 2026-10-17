package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm0 b;

    public /* synthetic */ jl0(xm0 xm0Var, int i10) {
        this.a = i10;
        this.b = xm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                xm0 xm0Var = this.b;
                ViewGroup[] viewGroupArr = xm0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    xm0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(xm0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                xm0 xm0Var2 = this.b;
                xm0Var2.presentFragment(xm0Var2.h1, true);
                xm0Var2.h1 = null;
                break;
            case 2:
                xm0 xm0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = xm0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    xm0Var3.H1(editTextBoldCursorArr[0]);
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
                    xm0 xm0Var4 = this.b;
                    if (i10 >= xm0Var4.c0.getChildCount()) {
                        xm0Var4.w1();
                        xm0Var4.q1.clear();
                        xm0Var4.p1.clear();
                        xm0Var4.y.values.clear();
                        xm0Var4.P1();
                        break;
                    } else {
                        View childAt = xm0Var4.c0.getChildAt(i10);
                        if (childAt instanceof wm0) {
                            xm0Var4.c0.removeView(childAt);
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
