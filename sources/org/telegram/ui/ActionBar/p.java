package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements r0.n, m1, b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.v1;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, true);
                actionBarLayout.t1 = defaultWindowInsets;
                actionBarLayout.u1 = defaultWindowInsets2;
                actionBarLayout.s1 = k1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), k1Var);
                    i11++;
                }
                break;
            case 1:
            case 2:
            case 4:
            default:
                d4 d4Var = (d4) obj;
                d4Var.e = k1Var;
                i0.b defaultWindowInsets3 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                i0.b defaultWindowInsets4 = AndroidUtilities.getDefaultWindowInsets(k1Var, true);
                if (!d4Var.f.equals(defaultWindowInsets3) || !d4Var.h.equals(defaultWindowInsets4)) {
                    AndroidUtilities.statusBarHeight = defaultWindowInsets3.b;
                    AndroidUtilities.navigationBarHeight = defaultWindowInsets3.d;
                    d4Var.f = defaultWindowInsets3;
                    d4Var.h = defaultWindowInsets4;
                    d4Var.requestLayout();
                }
                int childCount2 = d4Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = d4Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, k1Var);
                    }
                    i11++;
                }
                d4Var.invalidate();
                break;
            case 3:
                r0.h1 h1Var = k1Var.a;
                FrameLayout frameLayout = (FrameLayout) obj;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 30) {
                    i0.b f7 = h1Var.f(527);
                    rect.set(f7.a, f7.b, f7.c, f7.d);
                } else {
                    rect.set(h1Var.i().a, h1Var.i().b, h1Var.i().c, h1Var.i().d);
                }
                frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + AndroidUtilities.navigationBarHeight);
                frameLayout.requestLayout();
                break;
            case 5:
                break;
            case 6:
                b4 b4Var = (b4) obj;
                b4Var.s = k1Var.a.f(2).d;
                b4Var.invalidate();
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        e2 e2Var2 = (e2) this.b;
        DialogInterface.OnCancelListener onCancelListener = e2Var2.J;
        if (onCancelListener != null) {
            onCancelListener.onCancel(e2Var2);
        }
        e2Var2.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        o1 o1Var;
        w0 w0Var = (w0) this.b;
        w0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = w0Var.d) != null && o1Var.isShowing()) {
            w0Var.d.d(true);
        }
    }
}
