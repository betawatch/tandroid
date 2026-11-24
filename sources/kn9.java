// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kn9 extends il0 {
    public final RectF j0;

    public kn9(ln9 ln9Var) {
        super(ln9Var, ln9Var, ln9Var);
        this.j0 = new RectF();
    }

    @Override // il0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        hl0 hl0Var = this.S;
        Rect rect = hl0Var.m;
        if (rect.isEmpty() || this.c == 0) {
            return;
        }
        RectF rectF = this.j0;
        rectF.set(rect);
        canvas.save();
        canvas.clipPath(hl0Var.k);
        uv8.c(canvas, rectF, 0.0f, this.c / 255.0f);
        canvas.restore();
    }
}
