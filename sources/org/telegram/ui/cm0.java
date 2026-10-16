package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn0 b;

    public /* synthetic */ cm0(sn0 sn0Var, int i10) {
        this.a = i10;
        this.b = sn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                sn0 sn0Var = this.b;
                ViewGroup[] viewGroupArr = sn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    sn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(sn0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                sn0 sn0Var2 = this.b;
                sn0Var2.presentFragment(sn0Var2.h1, true);
                sn0Var2.h1 = null;
                break;
            case 2:
                sn0 sn0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = sn0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    sn0Var3.H1(editTextBoldCursorArr[0]);
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
                    sn0 sn0Var4 = this.b;
                    if (i10 >= sn0Var4.c0.getChildCount()) {
                        sn0Var4.w1();
                        sn0Var4.q1.clear();
                        sn0Var4.p1.clear();
                        sn0Var4.y.values.clear();
                        sn0Var4.P1();
                        break;
                    } else {
                        View childAt = sn0Var4.c0.getChildAt(i10);
                        if (childAt instanceof rn0) {
                            sn0Var4.c0.removeView(childAt);
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
