package org.telegram.ui.ActionBar;

import ai.c9;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.i8;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i10) {
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
                AndroidUtilities.runOnUIThread((c9) obj);
                break;
            case 1:
                w0 w0Var = (w0) obj;
                if (w0Var.getParent() != null) {
                    w0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                w0Var.M(null, null);
                break;
            case 2:
                ((v0) obj).setSelectedForDelete(false);
                break;
            case 3:
                d1 d1Var = (d1) obj;
                d1Var.U = true;
                AndroidUtilities.makeGlobalBlurBitmap(new y0(d1Var, i11), 8.0f);
                break;
            case 4:
                ((q1) obj).c();
                break;
            case 5:
                View view = (View) obj;
                if (view instanceof l5) {
                    l5 l5Var = (l5) view;
                    if (!l5Var.a) {
                        l5Var.a = true;
                        l5Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                c2 c2Var = ((a2) obj).d;
                int i12 = AndroidUtilities.displaySize.x;
                c2Var.L = i12;
                int dp = i12 - AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f);
                Window window = c2Var.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int min = Math.min(dp2, dp);
                Rect rect = c2Var.A0;
                layoutParams.width = min + rect.left + rect.right;
                try {
                    window.setAttributes(layoutParams);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 7:
                g2 g2Var = (g2) obj;
                g2Var.f1.setVisibility(0);
                g2Var.h1.setAlpha(0.0f);
                g2Var.g1.startAnimation(AnimationUtils.loadAnimation(g2Var.getContext(), g2Var.d1));
                g2Var.h1.animate().setDuration(300L).alpha(1.0f).setListener(new d2(g2Var, 0)).start();
                break;
            case 8:
                g3 g3Var = (g3) ((y2) obj).c;
                onDismissListener = g3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = g3Var.onHideListener;
                    onDismissListener2.onDismiss(g3Var);
                }
                try {
                    g3Var.dismissInternal();
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
                v3 v3Var = (v3) obj;
                if (v3Var.getWindowView() != null) {
                    v3Var.getWindowView().setDrawingFromOverlay(true);
                    break;
                }
                break;
            case 11:
                ((y3) obj).f();
                break;
            case 12:
                w4 w4Var = (w4) ((e2) obj).b;
                w4Var.k();
                w4Var.j();
                break;
            case 13:
                w4 w4Var2 = ((t4) obj).b;
                w4Var2.c.dismiss();
                w4Var2.f.removeAllViews();
                break;
            case 14:
                ((t4) obj).b.c.dismiss();
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
                wl.m(1, (o2) obj);
                break;
            case 18:
                i8 i8Var = (i8) j6.e5.remove((MessageObject) obj);
                if (i8Var != null) {
                    i8Var.i = null;
                    break;
                }
                break;
            default:
                ((i6) obj).s();
                break;
        }
    }
}
