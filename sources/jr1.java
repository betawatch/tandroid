// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jr1 extends ma8 {
    @Override // ma8
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        if (f > 0.0f) {
            ViewGroup viewGroup = this.e;
            if (viewGroup instanceof gb2) {
                gb2 gb2Var = (gb2) viewGroup;
                int max = (int) Math.max(f4, f3);
                int min = (int) Math.min(f5, gb2Var.getMeasuredHeight() + f3);
                RectF rectF = gl.P;
                rectF.set(f2, max, gb2Var.getMeasuredWidth() + f2, min);
                canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
                canvas.translate(f2, f3 + gb2Var.getPaddingTop());
                gb2Var.Yb = true;
                gb2Var.j1(canvas);
                if (gb2Var.I3() && gb2Var.getCurrentMessagesGroup() == null) {
                    gb2Var.A1(1.0f, canvas, false);
                }
                gb2Var.Yb = false;
                canvas.restore();
            }
        }
    }
}
