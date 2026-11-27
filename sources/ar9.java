// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ar9 extends jl0 {
    public final RectF j0;

    public ar9(br9 br9Var) {
        super(br9Var, br9Var, br9Var);
        this.j0 = new RectF();
    }

    @Override // jl0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        il0 il0Var = this.S;
        Rect rect = il0Var.m;
        if (rect.isEmpty() || this.c == 0) {
            return;
        }
        RectF rectF = this.j0;
        rectF.set(rect);
        canvas.save();
        canvas.clipPath(il0Var.k);
        fz8.c(canvas, rectF, 0.0f, this.c / 255.0f);
        canvas.restore();
    }
}
