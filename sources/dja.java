// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class dja extends cja {
    public Activity m0;
    public final Rect n0;
    public int o0;
    public boolean p0;

    public dja(Context context, Activity activity) {
        super(context, null);
        this.n0 = new Rect();
        setActivity(activity);
    }

    @Override // cja
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.n0;
        getWindowVisibleDisplayFrame(rect);
        if (this.p0) {
            return ((rootView.getHeight() - (rect.top != 0 ? gl.m : 0)) - gl.o1(rootView)) - (rect.bottom - rect.top);
        }
        int height = (this.m0.getWindow().getDecorView().getHeight() - gl.o1(rootView)) - rootView.getBottom();
        if (height <= Math.max(gl.L(10.0f), gl.m)) {
            return 0;
        }
        return height;
    }

    @Override // cja
    public void R() {
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.o0 = Q();
        Point point = gl.q;
        post(new k08((byte) 16, (Object) this, point.x > point.y));
    }

    @Override // cja
    public int getKeyboardHeight() {
        return this.o0;
    }

    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
