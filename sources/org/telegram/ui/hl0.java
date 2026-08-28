package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm0 b;

    public /* synthetic */ hl0(wm0 wm0Var, int i9) {
        this.a = i9;
        this.b = wm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                wm0 wm0Var = this.b;
                ViewGroup[] viewGroupArr = wm0Var.V;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    wm0Var.U[0].requestFocus();
                    AndroidUtilities.showKeyboard(wm0Var.U[0]);
                    break;
                }
                break;
            case 1:
                wm0 wm0Var2 = this.b;
                wm0Var2.presentFragment(wm0Var2.d1, true);
                wm0Var2.d1 = null;
                break;
            case 2:
                wm0 wm0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = wm0Var3.W;
                if (editTextBoldCursorArr != null) {
                    wm0Var3.I1(editTextBoldCursorArr[0]);
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
                int i9 = 0;
                while (true) {
                    wm0 wm0Var4 = this.b;
                    if (i9 >= wm0Var4.Y.getChildCount()) {
                        wm0Var4.x1();
                        wm0Var4.m1.clear();
                        wm0Var4.l1.clear();
                        wm0Var4.y.values.clear();
                        wm0Var4.Q1();
                        break;
                    } else {
                        View childAt = wm0Var4.Y.getChildAt(i9);
                        if (childAt instanceof vm0) {
                            wm0Var4.Y.removeView(childAt);
                            i9--;
                        }
                        i9++;
                    }
                }
            default:
                this.b.finishFragment();
                break;
        }
    }
}
