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
import org.telegram.messenger.em;
import org.telegram.ui.Components.k8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                AndroidUtilities.runOnUIThread((di.q) obj);
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
                d2Var.L = i12;
                int dp = i12 - AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f);
                Window window = d2Var.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int min = Math.min(dp2, dp);
                Rect rect = d2Var.A0;
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
                h2Var.f1.setVisibility(0);
                h2Var.h1.setAlpha(0.0f);
                h2Var.g1.startAnimation(AnimationUtils.loadAnimation(h2Var.getContext(), h2Var.d1));
                h2Var.h1.animate().setDuration(300L).alpha(1.0f).setListener(new e2(h2Var, 0)).start();
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
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                y2 y2Var = (y2) obj;
                y2Var.getClass();
                try {
                    y2Var.b.dismissInternal();
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
                em.m(1, (p2) obj);
                break;
            case 18:
                k8 k8Var = (k8) j6.e5.remove((MessageObject) obj);
                if (k8Var != null) {
                    k8Var.i = null;
                    break;
                }
                break;
            default:
                ((i6) obj).s();
                break;
        }
    }
}
