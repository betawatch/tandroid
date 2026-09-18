package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ia0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                hg.k0.p(AndroidUtilities.displaySize.y, hg.k0.l(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            hg.k0.p(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            break;
                        }
                    }
                }
                break;
            default:
                xd1 xd1Var = (xd1) obj;
                xd1Var.P = SystemClock.elapsedRealtime() + 1500;
                xd1Var.k0.invalidate();
                break;
        }
    }
}
