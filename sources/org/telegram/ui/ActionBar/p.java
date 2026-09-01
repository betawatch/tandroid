package org.telegram.ui.ActionBar;

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
import org.telegram.ui.Components.d8;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                Drawable drawable = ActionBarLayout.m1;
                AndroidUtilities.runOnUIThread((dg.u1) obj);
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
                d1Var.R = true;
                AndroidUtilities.makeGlobalBlurBitmap(new y0(d1Var, i11), 8.0f);
                break;
            case 4:
                ((r1) obj).c();
                break;
            case 5:
                View view = (View) obj;
                if (view instanceof m5) {
                    m5 m5Var = (m5) view;
                    if (!m5Var.a) {
                        m5Var.a = true;
                        m5Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                d2 d2Var = ((b2) obj).d;
                int i12 = AndroidUtilities.displaySize.x;
                d2Var.I = i12;
                int dp = i12 - AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f);
                Window window = d2Var.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int min = Math.min(dp2, dp);
                Rect rect = d2Var.x0;
                layoutParams.width = min + rect.left + rect.right;
                try {
                    window.setAttributes(layoutParams);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 7:
                h2 h2Var = (h2) obj;
                h2Var.c1.setVisibility(0);
                h2Var.e1.setAlpha(0.0f);
                h2Var.d1.startAnimation(AnimationUtils.loadAnimation(h2Var.getContext(), h2Var.a1));
                h2Var.e1.animate().setDuration(300L).alpha(1.0f).setListener(new e2(h2Var, 0)).start();
                break;
            case 8:
                h3 h3Var = (h3) ((z2) obj).c;
                onDismissListener = h3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = h3Var.onHideListener;
                    onDismissListener2.onDismiss(h3Var);
                }
                try {
                    h3Var.dismissInternal();
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 9:
                y2 y2Var = (y2) obj;
                y2Var.getClass();
                try {
                    y2Var.b.dismissInternal();
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
                x4 x4Var = (x4) ((f2) obj).b;
                x4Var.k();
                x4Var.j();
                break;
            case 13:
                x4 x4Var2 = ((u4) obj).b;
                x4Var2.c.dismiss();
                x4Var2.f.removeAllViews();
                break;
            case 14:
                ((u4) obj).b.c.dismiss();
                break;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                k6.d = null;
                k6.N();
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
                org.telegram.ui.b.k(1, (p2) obj);
                break;
            case 18:
                d8 d8Var = (d8) k6.e5.remove((MessageObject) obj);
                if (d8Var != null) {
                    d8Var.i = null;
                    break;
                }
                break;
            default:
                ((j6) obj).s();
                break;
        }
    }
}
