// default package

import android.graphics.Canvas;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nv8 extends o39 {
    public ay2 f3;
    public aw8 g3;

    @Override // o39, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        if (this.g3 != null) {
            canvas2 = canvas;
            i = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i = -1;
        }
        ay2 ay2Var = this.f3;
        if (ay2Var != null) {
            ay2Var.x(canvas2);
        }
        super.dispatchDraw(canvas2);
        aw8 aw8Var = this.g3;
        if (aw8Var != null) {
            aw8Var.x(canvas2);
            canvas2.restoreToCount(i);
        }
    }
}
