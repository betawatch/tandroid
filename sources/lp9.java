// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lp9 extends im0 {
    public final RectF j0;

    public lp9(mp9 mp9Var) {
        super(mp9Var, mp9Var, mp9Var);
        this.j0 = new RectF();
    }

    @Override // im0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        hm0 hm0Var = this.S;
        Rect rect = hm0Var.m;
        if (rect.isEmpty() || this.c == 0) {
            return;
        }
        RectF rectF = this.j0;
        rectF.set(rect);
        canvas.save();
        canvas.clipPath(hm0Var.k);
        vx8.c(canvas, rectF, 0.0f, this.c / 255.0f);
        canvas.restore();
    }
}
