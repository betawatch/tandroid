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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                AndroidUtilities.runOnUIThread((cg.v1) obj);
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
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 10:
                t3 t3Var = (t3) obj;
                if (t3Var.getWindowView() != null) {
                    t3Var.getWindowView().setDrawingFromOverlay(true);
                    break;
                }
                break;
            case 11:
                ((w3) obj).f();
                break;
            case 12:
                w4 w4Var = (w4) ((f2) obj).b;
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
                org.telegram.ui.b.k(1, (p2) obj);
                break;
            case 18:
                d8 d8Var = (d8) j6.e5.remove((MessageObject) obj);
                if (d8Var != null) {
                    d8Var.i = null;
                    break;
                }
                break;
            default:
                ((i6) obj).s();
                break;
        }
    }
}
