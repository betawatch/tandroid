package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l90 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l90(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                org.telegram.messenger.l0.n(AndroidUtilities.displaySize.y, j3.r0.p(measuredHeight, "height = ", " displayHeight = "));
                int i10 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i10 > AndroidUtilities.dp(100.0f) && i10 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i10;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i10;
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.l0.n(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            break;
                        }
                    }
                }
                break;
            default:
                oc1 oc1Var = (oc1) obj;
                oc1Var.L = SystemClock.elapsedRealtime() + 1500;
                oc1Var.g0.invalidate();
                break;
        }
    }
}
