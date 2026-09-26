package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ba0(Object obj, int i10) {
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
                org.telegram.messenger.f0.n(AndroidUtilities.displaySize.y, hg.c.j(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.f0.n(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            break;
                        }
                    }
                }
                break;
            default:
                od1 od1Var = (od1) obj;
                od1Var.P = SystemClock.elapsedRealtime() + 1500;
                od1Var.k0.invalidate();
                break;
        }
    }
}
