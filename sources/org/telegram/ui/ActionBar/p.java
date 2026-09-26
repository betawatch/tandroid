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
import org.telegram.messenger.ok;
import org.telegram.ui.Components.k8;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                Drawable drawable = ActionBarLayout.p1;
                AndroidUtilities.runOnUIThread((c9) obj);
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
                b1Var.U = true;
                AndroidUtilities.makeGlobalBlurBitmap(new w0(b1Var, i11), 8.0f);
                break;
            case 4:
                ((o1) obj).c();
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
                a2 a2Var = ((y1) obj).d;
                int i12 = AndroidUtilities.displaySize.x;
                a2Var.L = i12;
                int dp = i12 - AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.isTablet() ? AndroidUtilities.isSmallTablet() ? AndroidUtilities.dp(446.0f) : AndroidUtilities.dp(496.0f) : AndroidUtilities.dp(356.0f);
                Window window = a2Var.getWindow();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                int min = Math.min(dp2, dp);
                Rect rect = a2Var.A0;
                layoutParams.width = min + rect.left + rect.right;
                try {
                    window.setAttributes(layoutParams);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 7:
                e2 e2Var = (e2) obj;
                e2Var.f1.setVisibility(0);
                e2Var.h1.setAlpha(0.0f);
                e2Var.g1.startAnimation(AnimationUtils.loadAnimation(e2Var.getContext(), e2Var.d1));
                e2Var.h1.animate().setDuration(300L).alpha(1.0f).setListener(new b2(e2Var, 0)).start();
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
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                v2 v2Var = (v2) obj;
                v2Var.getClass();
                try {
                    v2Var.b.dismissInternal();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                t4 t4Var = (t4) ((c2) obj).b;
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
                h6.d = null;
                h6.N();
                if (!h6.b) {
                    h6.i(drawable2);
                    h6.h(drawable2);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
                break;
            case 16:
                ((CountDownLatch) obj).countDown();
                break;
            case 17:
                ok.m(1, (m2) obj);
                break;
            case 18:
                k8 k8Var = (k8) h6.e5.remove((MessageObject) obj);
                if (k8Var != null) {
                    k8Var.i = null;
                    break;
                }
                break;
            default:
                ((g6) obj).s();
                break;
        }
    }
}
