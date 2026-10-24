package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an0 b;

    public /* synthetic */ kl0(an0 an0Var, int i10) {
        this.a = i10;
        this.b = an0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                an0 an0Var = this.b;
                ViewGroup[] viewGroupArr = an0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    an0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(an0Var.Y[0]);
                    break;
                }
                break;
            case 1:
                an0 an0Var2 = this.b;
                an0Var2.presentFragment(an0Var2.h1, true);
                an0Var2.h1 = null;
                break;
            case 2:
                an0 an0Var3 = this.b;
                EditTextBoldCursor[] editTextBoldCursorArr = an0Var3.a0;
                if (editTextBoldCursorArr != null) {
                    an0Var3.H1(editTextBoldCursorArr[0]);
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
                    an0 an0Var4 = this.b;
                    if (i10 >= an0Var4.c0.getChildCount()) {
                        an0Var4.w1();
                        an0Var4.q1.clear();
                        an0Var4.p1.clear();
                        an0Var4.y.values.clear();
                        an0Var4.Q1();
                        break;
                    } else {
                        View childAt = an0Var4.c0.getChildAt(i10);
                        if (childAt instanceof zm0) {
                            an0Var4.c0.removeView(childAt);
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
