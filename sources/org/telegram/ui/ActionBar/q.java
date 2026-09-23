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
import org.telegram.messenger.ul;
import org.telegram.ui.Components.k8;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                AndroidUtilities.runOnUIThread((c9) obj);
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
                if (view instanceof j5) {
                    j5 j5Var = (j5) view;
                    if (!j5Var.a) {
                        j5Var.a = true;
                        j5Var.invalidate();
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
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                w2 w2Var = (w2) obj;
                w2Var.getClass();
                try {
                    w2Var.b.dismissInternal();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                u4 u4Var = (u4) ((d2) obj).b;
                u4Var.k();
                u4Var.j();
                break;
            case 13:
                u4 u4Var2 = ((r4) obj).b;
                u4Var2.c.dismiss();
                u4Var2.f.removeAllViews();
                break;
            case 14:
                ((r4) obj).b.c.dismiss();
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
                ul.n(1, (n2) obj);
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
