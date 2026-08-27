package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm0 b;

    public /* synthetic */ hl0(xm0 xm0Var, int i10) {
        this.a = i10;
        this.b = xm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                xm0 xm0Var = this.b;
                ViewGroup[] viewGroupArr = xm0Var.V;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    xm0Var.U[0].requestFocus();
                    AndroidUtilities.showKeyboard(xm0Var.U[0]);
                    break;
                }
                break;
            case 1:
                xm0 xm0Var2 = this.b;
                xm0Var2.presentFragment(xm0Var2.d1, true);
                xm0Var2.d1 = null;
                break;
            case 2:
                xm0 xm0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = xm0Var3.W;
                if (editTextBoldCursorArr != null) {
                    xm0Var3.I1(editTextBoldCursorArr[0]);
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
                    xm0 xm0Var4 = this.b;
                    if (i10 >= xm0Var4.Y.getChildCount()) {
                        xm0Var4.x1();
                        xm0Var4.m1.clear();
                        xm0Var4.l1.clear();
                        xm0Var4.y.values.clear();
                        xm0Var4.Q1();
                        break;
                    } else {
                        View childAt = xm0Var4.Y.getChildAt(i10);
                        if (childAt instanceof wm0) {
                            xm0Var4.Y.removeView(childAt);
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
