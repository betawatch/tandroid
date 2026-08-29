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
import org.telegram.ui.Components.h8;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                Drawable drawable = ActionBarLayout.l1;
                AndroidUtilities.runOnUIThread((ag.z1) obj);
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
                d1Var.Q = true;
                AndroidUtilities.makeGlobalBlurBitmap(new y0(d1Var, i11), 8.0f);
                break;
            case 4:
                ((q1) obj).c();
                break;
            case 5:
                View view = (View) obj;
                if (view instanceof i5) {
                    i5 i5Var = (i5) view;
                    if (!i5Var.a) {
                        i5Var.a = true;
                        i5Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                c2 c2Var = ((a2) obj).d;
                int i12 = AndroidUtilities.displaySize.x;
                c2Var.H = i12;
                int dp = i12 - AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f);
                Window window = c2Var.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int min = Math.min(dp2, dp);
                Rect rect = c2Var.w0;
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
                g2Var.b1.setVisibility(0);
                g2Var.d1.setAlpha(0.0f);
                g2Var.c1.startAnimation(AnimationUtils.loadAnimation(g2Var.getContext(), g2Var.Z0));
                g2Var.d1.animate().setDuration(300L).alpha(1.0f).setListener(new d2(g2Var, 0)).start();
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 9:
                w2 w2Var = (w2) obj;
                w2Var.getClass();
                try {
                    w2Var.b.dismissInternal();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 10:
                s3 s3Var = (s3) obj;
                if (s3Var.getWindowView() != null) {
                    s3Var.getWindowView().setDrawingFromOverlay(true);
                    break;
                }
                break;
            case 11:
                ((v3) obj).f();
                break;
            case 12:
                t4 t4Var = (t4) ((e2) obj).b;
                t4Var.k();
                t4Var.j();
                break;
            case 13:
                t4 t4Var2 = ((q4) obj).b;
                t4Var2.c.dismiss();
                t4Var2.f.removeAllViews();
                break;
            case 14:
                ((q4) obj).b.c.dismiss();
                break;
            case 15:
                Drawable drawable2 = (Drawable) obj;
                g6.d = null;
                g6.N();
                if (!g6.b) {
                    g6.i(drawable2);
                    g6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                break;
            case 16:
                ((CountDownLatch) obj).countDown();
                break;
            case 17:
                org.telegram.ui.b.l(1, (o2) obj);
                break;
            case 18:
                h8 h8Var = (h8) g6.e5.remove((MessageObject) obj);
                if (h8Var != null) {
                    h8Var.i = null;
                    break;
                }
                break;
            default:
                ((f6) obj).s();
                break;
        }
    }
}
