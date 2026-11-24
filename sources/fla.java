// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class fla extends ela {
    public Activity m0;
    public final Rect n0;
    public int o0;
    public boolean p0;

    public fla(Context context, Activity activity) {
        super(context, null);
        this.n0 = new Rect();
        setActivity(activity);
    }

    @Override // ela
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.n0;
        getWindowVisibleDisplayFrame(rect);
        if (this.p0) {
            return ((rootView.getHeight() - (rect.top != 0 ? gm.m : 0)) - gm.o1(rootView)) - (rect.bottom - rect.top);
        }
        int height = (this.m0.getWindow().getDecorView().getHeight() - gm.o1(rootView)) - rootView.getBottom();
        if (height <= Math.max(gm.L(10.0f), gm.m)) {
            return 0;
        }
        return height;
    }

    @Override // ela
    public void R() {
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.o0 = Q();
        Point point = gm.q;
        post(new n28((byte) 16, (Object) this, point.x > point.y));
    }

    @Override // ela
    public int getKeyboardHeight() {
        return this.o0;
    }

    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        R();
    }

    public void setActivity(Activity activity) {
        this.m0 = activity;
    }

    public void setWithoutWindow(boolean z) {
        this.p0 = z;
    }
}
