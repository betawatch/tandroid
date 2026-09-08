package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.n, l1, a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.p1;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.c defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                actionBarLayout.n1 = defaultWindowInsets;
                actionBarLayout.o1 = defaultWindowInsets2;
                actionBarLayout.m1 = l1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), l1Var);
                    i11++;
                }
                break;
            case 2:
            case 3:
            case 5:
            default:
                z3 z3Var = (z3) obj;
                z3Var.e = l1Var;
                i0.c defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.c defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
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
                        r0.i0.b(childAt, l1Var);
                    }
                    i11++;
                }
                z3Var.invalidate();
                break;
            case 4:
                r0.i1 i1Var = l1Var.a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.c f7 = i1Var.f(527);
                    rect.set(f7.a, f7.b, f7.c, f7.d);
                } else {
                    rect.set(i1Var.i().a, i1Var.i().b, i1Var.i().c, i1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                break;
            case 6:
                break;
            case 7:
                x3 x3Var = (x3) obj;
                x3Var.s = l1Var.a.f(2).d;
                x3Var.invalidate();
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        b2 b2Var2 = (b2) this.b;
        DialogInterface.OnCancelListener onCancelListener = b2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(b2Var2);
        }
        b2Var2.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void n(KeyEvent keyEvent) {
        n1 n1Var;
        v0 v0Var = (v0) this.b;
        v0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = v0Var.d) != null && n1Var.isShowing()) {
            v0Var.d.d(true);
        }
    }
}
