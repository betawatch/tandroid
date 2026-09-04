package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import bi.k8;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.l8;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                Drawable drawable = ActionBarLayout.p1;
                AndroidUtilities.runOnUIThread((k8) obj);
                break;
            case 1:
                v0 v0Var = (v0) obj;
                if (v0Var.getParent() != null) {
                    v0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                v0Var.M(null, null);
                break;
            case 2:
                ((u0) obj).setSelectedForDelete(false);
                break;
            case 3:
                c1 c1Var = (c1) obj;
                c1Var.U = true;
                AndroidUtilities.makeGlobalBlurBitmap(new x0(c1Var, i11), 8.0f);
                break;
            case 4:
                ((p1) obj).c();
                break;
            case 5:
                View view = (View) obj;
                if (view instanceof k5) {
                    k5 k5Var = (k5) view;
                    if (!k5Var.a) {
                        k5Var.a = true;
                        k5Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                b2 b2Var = ((z1) obj).d;
                int i12 = AndroidUtilities.displaySize.x;
                b2Var.L = i12;
                int dp = i12 - AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f);
                Window window = b2Var.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int min = Math.min(dp2, dp);
                Rect rect = b2Var.A0;
                layoutParams.width = min + rect.left + rect.right;
                try {
                    window.setAttributes(layoutParams);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 7:
                f2 f2Var = (f2) obj;
                f2Var.f1.setVisibility(0);
                f2Var.h1.setAlpha(0.0f);
                f2Var.g1.startAnimation(AnimationUtils.loadAnimation(f2Var.getContext(), f2Var.d1));
                f2Var.h1.animate().setDuration(300L).alpha(1.0f).setListener(new c2(f2Var, 0)).start();
                break;
            case 8:
                f3 f3Var = (f3) ((x2) obj).c;
                onDismissListener = f3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = f3Var.onHideListener;
                    onDismissListener2.onDismiss(f3Var);
                }
                try {
                    f3Var.dismissInternal();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 9:
                w2 w2Var = (w2) obj;
                w2Var.getClass();
                try {
                    w2Var.b.dismissInternal();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 10:
                u3 u3Var = (u3) obj;
                if (u3Var.getWindowView() != null) {
                    u3Var.getWindowView().setDrawingFromOverlay(true);
                    break;
                }
                break;
            case 11:
                ((x3) obj).f();
                break;
            case 12:
                v4 v4Var = (v4) ((d2) obj).b;
                v4Var.k();
                v4Var.j();
                break;
            case 13:
                v4 v4Var2 = ((s4) obj).b;
                v4Var2.c.dismiss();
                v4Var2.f.removeAllViews();
                break;
            case 14:
                ((s4) obj).b.c.dismiss();
                break;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                j6.d = null;
                j6.N();
                if (!j6.b) {
                    j6.i(drawable2);
                    j6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                break;
            case 16:
                ((CountDownLatch) obj).countDown();
                break;
            case 17:
                wl.m(1, (n2) obj);
                break;
            case 18:
                l8 l8Var = (l8) j6.e5.remove((MessageObject) obj);
                if (l8Var != null) {
                    l8Var.i = null;
                    break;
                }
                break;
            default:
                ((i6) obj).s();
                break;
        }
    }
}
