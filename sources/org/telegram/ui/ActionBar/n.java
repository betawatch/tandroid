package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.o, n1, c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.m1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, true);
                actionBarLayout.k1 = defaultWindowInsets;
                actionBarLayout.l1 = defaultWindowInsets2;
                actionBarLayout.j1 = m1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), m1Var);
                    i11++;
                }
                break;
            case 2:
            case 3:
            case 5:
            default:
                z3 z3Var = (z3) obj;
                z3Var.e = m1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(m1Var, true);
                if (!z3Var.f.equals(defaultWindowInsets3) || !z3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    z3Var.f = defaultWindowInsets3;
                    z3Var.h = defaultWindowInsets4;
                    z3Var.requestLayout();
                }
                int childCount2 = z3Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = z3Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.j0.b(childAt, m1Var);
                    }
                    i11++;
                }
                z3Var.invalidate();
                break;
            case 4:
                r0.j1 j1Var = m1Var.a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f10 = j1Var.f(527);
                    rect.set(f10.a, f10.b, f10.c, f10.d);
                } else {
                    rect.set(j1Var.i().a, j1Var.i().b, j1Var.i().c, j1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                break;
            case 6:
                x3 x3Var = (x3) obj;
                x3Var.s = m1Var.a.f(2).d;
                x3Var.invalidate();
                break;
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
        d2 d2Var2 = (d2) this.b;
        DialogInterface.OnCancelListener onCancelListener = d2Var2.G;
        if (onCancelListener != null) {
            onCancelListener.onCancel(d2Var2);
        }
        d2Var2.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        p1 p1Var;
        w0 w0Var = (w0) this.b;
        w0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = w0Var.d) != null && p1Var.isShowing()) {
            w0Var.d.d(true);
        }
    }
}
