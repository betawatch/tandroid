package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class rv0 extends qv0 {
    public Activity t0;
    public final Rect u0;
    public int v0;
    public boolean w0;

    public rv0(Context context, Activity activity) {
        super(context, null);
        this.u0 = new Rect();
        setActivity(activity);
    }

    @Override // org.telegram.ui.Components.qv0
    public int R() {
        View rootView = getRootView();
        Rect rect = this.u0;
        getWindowVisibleDisplayFrame(rect);
        if (this.w0) {
            return ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top);
        }
        int height = (this.t0.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height;
    }

    @Override // org.telegram.ui.Components.qv0
    public void S() {
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.v0 = R();
        Point point = AndroidUtilities.displaySize;
        post(new kv0(1, this, point.x > point.y));
    }

    @Override // org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.qv0
    public int getKeyboardHeight() {
        return this.v0;
    }

    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        S();
    }

    public void setActivity(Activity activity) {
        this.t0 = activity;
    }

    public void setWithoutWindow(boolean z4) {
        this.w0 = z4;
    }
}
