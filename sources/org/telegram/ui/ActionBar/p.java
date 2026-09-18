package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements r0.n, m1, b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i10) {
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
            case 1:
            case 2:
            case 4:
            default:
                a4 a4Var = (a4) obj;
                a4Var.e = l1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(l1Var, true);
                if (!a4Var.f.equals(defaultWindowInsets3) || !a4Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    a4Var.f = defaultWindowInsets3;
                    a4Var.h = defaultWindowInsets4;
                    a4Var.requestLayout();
                }
                int childCount2 = a4Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = a4Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, l1Var);
                    }
                    i11++;
                }
                a4Var.invalidate();
                break;
            case 3:
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
            case 5:
                break;
            case 6:
                y3 y3Var = (y3) obj;
                y3Var.s = l1Var.a.f(2).d;
                y3Var.invalidate();
                break;
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i10) {
        c2 c2Var2 = (c2) this.b;
        DialogInterface.OnCancelListener onCancelListener = c2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(c2Var2);
        }
        c2Var2.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        o1 o1Var;
        w0 w0Var = (w0) this.b;
        w0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = w0Var.d) != null && o1Var.isShowing()) {
            w0Var.d.d(true);
        }
    }
}
