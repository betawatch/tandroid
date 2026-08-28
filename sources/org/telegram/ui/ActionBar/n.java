package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.o, m1, b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        int i9 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i9) {
            case 0:
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.l1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(m1Var, true);
                actionBarLayout.j1 = defaultWindowInsets;
                actionBarLayout.k1 = defaultWindowInsets2;
                actionBarLayout.i1 = m1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i10 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i10), m1Var);
                    i10++;
                }
                break;
            case 2:
            case 3:
            case 5:
            default:
                x3 x3Var = (x3) obj;
                x3Var.e = m1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(m1Var, true);
                if (!x3Var.f.equals(defaultWindowInsets3) || !x3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    x3Var.f = defaultWindowInsets3;
                    x3Var.h = defaultWindowInsets4;
                    x3Var.requestLayout();
                }
                int childCount2 = x3Var.getChildCount();
                while (i10 < childCount2) {
                    View childAt = x3Var.getChildAt(i10);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.j0.b(childAt, m1Var);
                    }
                    i10++;
                }
                x3Var.invalidate();
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
                v3 v3Var = (v3) obj;
                v3Var.s = m1Var.a.f(2).d;
                v3Var.invalidate();
                break;
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        c2 c2Var2 = (c2) this.b;
        DialogInterface.OnCancelListener onCancelListener = c2Var2.F;
        if (onCancelListener != null) {
            onCancelListener.onCancel(c2Var2);
        }
        c2Var2.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void k(KeyEvent keyEvent) {
        o1 o1Var;
        w0 w0Var = (w0) this.b;
        w0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = w0Var.d) != null && o1Var.isShowing()) {
            w0Var.d.d(true);
        }
    }
}
