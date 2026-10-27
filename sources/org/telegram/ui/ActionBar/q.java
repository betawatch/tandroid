package org.telegram.ui.ActionBar;

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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.n8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i10) {
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
                AndroidUtilities.runOnUIThread((ai.h1) obj);
                break;
            case 1:
                w0 w0Var = (w0) obj;
                if (w0Var.getParent() != null) {
                    w0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                w0Var.U(null, null);
                break;
            case 2:
                ((v0) obj).setSelectedForDelete(false);
                break;
            case 3:
                d1 d1Var = (d1) obj;
                d1Var.W = true;
                AndroidUtilities.makeGlobalBlurBitmap(new y0(d1Var, i11), 8.0f);
                break;
            case 4:
                ((q1) obj).c();
                break;
            case 5:
                View view = (View) obj;
                if (view instanceof c6) {
                    c6 c6Var = (c6) view;
                    if (!c6Var.a) {
                        c6Var.a = true;
                        c6Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                a2 a2Var = (a2) obj;
                e2 e2Var = a2Var.d;
                int i12 = AndroidUtilities.displaySize.x;
                e2Var.L = i12;
                int min = Math.min(AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f), i12 - AndroidUtilities.dp(56.0f));
                Rect rect = e2Var.C0;
                int i13 = min + rect.left + rect.right;
                if (e2Var.Z0) {
                    ViewGroup.LayoutParams layoutParams = a2Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i13) {
                        layoutParams.width = i13;
                        a2Var.requestLayout();
                        break;
                    }
                } else {
                    Window window = e2Var.getWindow();
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
                i2 i2Var = (i2) obj;
                i2Var.o1.setVisibility(0);
                i2Var.q1.setAlpha(0.0f);
                i2Var.p1.startAnimation(AnimationUtils.loadAnimation(i2Var.getContext(), i2Var.m1));
                i2Var.q1.animate().setDuration(300L).alpha(1.0f).setListener(new f2(i2Var, 0)).start();
                break;
            case 8:
                k3 k3Var = (k3) ((b3) obj).c;
                onDismissListener = k3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = k3Var.onHideListener;
                    onDismissListener2.onDismiss(k3Var);
                }
                try {
                    k3Var.dismissInternal();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                a3 a3Var = (a3) obj;
                a3Var.getClass();
                try {
                    a3Var.b.dismissInternal();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 10:
                y3 y3Var = (y3) obj;
                if (y3Var.getWindowView() != null) {
                    y3Var.getWindowView().setDrawingFromOverlay(true);
                    break;
                }
                break;
            case 11:
                ((b4) obj).f();
                break;
            case 12:
                a5 a5Var = (a5) ((g2) obj).b;
                a5Var.k();
                a5Var.j();
                break;
            case 13:
                a5 a5Var2 = ((x4) obj).b;
                a5Var2.c.dismiss();
                a5Var2.f.removeAllViews();
                break;
            case 14:
                ((x4) obj).b.c.dismiss();
                break;
            case 15:
                z5 z5Var = (z5) obj;
                if (!z5Var.n && z5Var.H) {
                    z5Var.d();
                    break;
                }
                break;
            case 16:
                Drawable drawable2 = (Drawable) obj;
                y6.d = null;
                y6.O();
                if (!y6.b) {
                    y6.i(drawable2);
                    y6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                break;
            case 17:
                ((CountDownLatch) obj).countDown();
                break;
            case 18:
                wh.l(1, (r2) obj);
                break;
            case 19:
                n8 n8Var = (n8) y6.e5.remove((MessageObject) obj);
                if (n8Var != null) {
                    n8Var.i = null;
                    break;
                }
                break;
            default:
                ((x6) obj).s();
                break;
        }
    }
}
