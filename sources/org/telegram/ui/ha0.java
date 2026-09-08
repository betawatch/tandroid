package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ha0(Object obj, int i10) {
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
                i2.g.o(AndroidUtilities.displaySize.y, i2.g.l(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            i2.g.o(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            break;
                        }
                    }
                }
                break;
            default:
                wd1 wd1Var = (wd1) obj;
                wd1Var.P = SystemClock.elapsedRealtime() + 1500;
                wd1Var.k0.invalidate();
                break;
        }
    }
}
