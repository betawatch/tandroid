package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.n, k1, z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.p1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
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
                x3 x3Var = (x3) obj;
                x3Var.e = l1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                if (!x3Var.f.equals(defaultWindowInsets3) || !x3Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    x3Var.f = defaultWindowInsets3;
                    x3Var.h = defaultWindowInsets4;
                    x3Var.requestLayout();
                }
                int childCount2 = x3Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = x3Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, l1Var);
                    }
                    i11++;
                }
                x3Var.invalidate();
                break;
            case 4:
                r0.i1 i1Var = l1Var.a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f7 = i1Var.f(527);
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
                v3 v3Var = (v3) obj;
                v3Var.s = l1Var.a.f(2).d;
                v3Var.invalidate();
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(a2 a2Var, int i10) {
        a2 a2Var2 = (a2) this.b;
        DialogInterface.OnCancelListener onCancelListener = a2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(a2Var2);
        }
        a2Var2.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void p(KeyEvent keyEvent) {
        m1 m1Var;
        u0 u0Var = (u0) this.b;
        u0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = u0Var.d) != null && m1Var.isShowing()) {
            u0Var.d.d(true);
        }
    }
}
