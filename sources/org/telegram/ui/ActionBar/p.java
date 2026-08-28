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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.d8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterface.OnDismissListener onDismissListener;
        DialogInterface.OnDismissListener onDismissListener2;
        int i9 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i9) {
            case 0:
                Drawable drawable = ActionBarLayout.l1;
                AndroidUtilities.runOnUIThread((c3.d) obj);
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
                AndroidUtilities.makeGlobalBlurBitmap(new y0(d1Var, i10), 8.0f);
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
                int i11 = AndroidUtilities.displaySize.x;
                c2Var.H = i11;
                int dp = i11 - AndroidUtilities.dp(56.0f);
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
                } catch (Throwable th) {
                    FileLog.e(th);
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
                f6.d = null;
                f6.N();
                if (!f6.b) {
                    f6.i(drawable2);
                    f6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                break;
            case 16:
                ((CountDownLatch) obj).countDown();
                break;
            case 17:
                ll.m(1, (o2) obj);
                break;
            case 18:
                d8 d8Var = (d8) f6.e5.remove((MessageObject) obj);
                if (d8Var != null) {
                    d8Var.i = null;
                    break;
                }
                break;
            default:
                ((e6) obj).s();
                break;
        }
    }
}
