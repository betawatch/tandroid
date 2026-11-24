// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
