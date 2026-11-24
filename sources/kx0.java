// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kx0 extends FrameLayout implements wx0 {
    public final wx0 a;

    public kx0(wx0 wx0Var) {
        super(wx0Var.getContext());
        this.a = wx0Var;
    }

    @Override // wx0
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // wx0
    public void setDrawingFromOverlay(boolean z) {
        this.a.setDrawingFromOverlay(z);
    }

    @Override // wx0
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        return this.a.y(canvas, rectF, f, rectF2, f2);
    }
}
