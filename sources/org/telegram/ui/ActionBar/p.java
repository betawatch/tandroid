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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.c8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                Drawable drawable = ActionBarLayout.l1;
                AndroidUtilities.runOnUIThread((ag.k0) obj);
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
                c1Var.Q = true;
                AndroidUtilities.makeGlobalBlurBitmap(new x0(c1Var, i11), 8.0f);
                break;
            case 4:
                ((p1) obj).c();
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
                b2 b2Var = ((z1) obj).d;
                int i12 = AndroidUtilities.displaySize.x;
                b2Var.H = i12;
                int dp = i12 - AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f);
                Window window = b2Var.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int min = Math.min(dp2, dp);
                Rect rect = b2Var.w0;
                layoutParams.width = min + rect.left + rect.right;
                try {
                    window.setAttributes(layoutParams);
                    break;
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
            case 7:
                f2 f2Var = (f2) obj;
                f2Var.b1.setVisibility(0);
                f2Var.d1.setAlpha(0.0f);
                f2Var.c1.startAnimation(AnimationUtils.loadAnimation(f2Var.getContext(), f2Var.Z0));
                f2Var.d1.animate().setDuration(300L).alpha(1.0f).setListener(new c2(f2Var, 0)).start();
                break;
            case 8:
                e3 e3Var = (e3) ((w2) obj).c;
                onDismissListener = e3Var.onHideListener;
                if (onDismissListener != null) {
                    onDismissListener2 = e3Var.onHideListener;
                    onDismissListener2.onDismiss(e3Var);
                }
                try {
                    e3Var.dismissInternal();
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 9:
                v2 v2Var = (v2) obj;
                v2Var.getClass();
                try {
                    v2Var.b.dismissInternal();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
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
                t4 t4Var = (t4) ((d2) obj).b;
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
                rl.k(1, (n2) obj);
                break;
            case 18:
                c8 c8Var = (c8) g6.e5.remove((MessageObject) obj);
                if (c8Var != null) {
                    c8Var.i = null;
                    break;
                }
                break;
            default:
                ((f6) obj).s();
                break;
        }
    }
}
