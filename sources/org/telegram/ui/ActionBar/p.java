package org.telegram.ui.ActionBar;

import ai.db;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.sl;
import org.telegram.ui.Components.l8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.v1;
                AndroidUtilities.runOnUIThread((db) obj);
                break;
            case 1:
                u0 u0Var = (u0) obj;
                if (u0Var.getParent() != null) {
                    u0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                u0Var.M(null, null);
                break;
            case 2:
                ((t0) obj).setSelectedForDelete(false);
                break;
            case 3:
                b1 b1Var = (b1) obj;
                b1Var.W = true;
                AndroidUtilities.makeGlobalBlurBitmap(new w0(b1Var, i11), 8.0f);
                break;
            case 4:
                ((o1) obj).c();
                break;
            case 5:
                View view = (View) obj;
                if (view instanceof o5) {
                    o5 o5Var = (o5) view;
                    if (!o5Var.a) {
                        o5Var.a = true;
                        o5Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                y1 y1Var = (y1) obj;
                c2 c2Var = y1Var.d;
                int i12 = AndroidUtilities.displaySize.x;
                c2Var.L = i12;
                int min = Math.min(AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f), i12 - AndroidUtilities.dp(56.0f));
                Rect rect = c2Var.C0;
                int i13 = min + rect.left + rect.right;
                if (c2Var.Z0) {
                    ViewGroup.LayoutParams layoutParams = y1Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i13) {
                        layoutParams.width = i13;
                        y1Var.requestLayout();
                        break;
                    }
                } else {
                    Window window = c2Var.getWindow();
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                    layoutParams2.copyFrom(window.getAttributes());
                    layoutParams2.width = i13;
                    try {
                        window.setAttributes(layoutParams2);
                        break;
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        return;
                    }
                }
                break;
            case 7:
                g2 g2Var = (g2) obj;
                g2Var.o1.setVisibility(0);
                g2Var.q1.setAlpha(0.0f);
                g2Var.p1.startAnimation(AnimationUtils.loadAnimation(g2Var.getContext(), g2Var.m1));
                g2Var.q1.animate().setDuration(300L).alpha(1.0f).setListener(new d2(g2Var, 0)).start();
                break;
            case 8:
                h3 h3Var = (h3) ((y2) obj).c;
                onDismissListener = h3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = h3Var.onHideListener;
                    onDismissListener2.onDismiss(h3Var);
                }
                try {
                    h3Var.dismissInternal();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                x2 x2Var = (x2) obj;
                x2Var.getClass();
                try {
                    x2Var.b.dismissInternal();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 10:
                w3 w3Var = (w3) obj;
                if (w3Var.getWindowView() != null) {
                    w3Var.getWindowView().setDrawingFromOverlay(true);
                    break;
                }
                break;
            case 11:
                ((z3) obj).f();
                break;
            case 12:
                y4 y4Var = (y4) ((e2) obj).b;
                y4Var.k();
                y4Var.j();
                break;
            case 13:
                y4 y4Var2 = ((v4) obj).b;
                y4Var2.c.dismiss();
                y4Var2.f.removeAllViews();
                break;
            case 14:
                ((v4) obj).b.c.dismiss();
                break;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                k6.d = null;
                k6.O();
                if (!k6.b) {
                    k6.i(drawable2);
                    k6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                break;
            case 16:
                ((CountDownLatch) obj).countDown();
                break;
            case 17:
                sl.o(1, (o2) obj);
                break;
            case 18:
                l8 l8Var = (l8) k6.e5.remove((MessageObject) obj);
                if (l8Var != null) {
                    l8Var.i = null;
                    break;
                }
                break;
            default:
                ((j6) obj).s();
                break;
        }
    }
}
