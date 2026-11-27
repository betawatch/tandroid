// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class f79 extends d79 {
    public boolean f3;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d79
    public final void L0(Canvas canvas, RectF rectF, long j) {
        super.L0(canvas, rectF, j);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof e79) {
                float x = childAt.getX();
                float y = childAt.getY();
                if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                    canvas.save();
                    canvas.translate(x, y);
                    x2b x2bVar = (x2b) ((e79) childAt);
                    if (x2bVar.M) {
                        x2bVar.b(canvas, this);
                    }
                    canvas.restore();
                }
            }
        }
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f3 = false;
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof e79) {
                e79 e79Var = (e79) getChildAt(i);
                canvas.save();
                canvas.translate(e79Var.getX(), e79Var.getY());
                x2b x2bVar = (x2b) e79Var;
                if (x2bVar.M) {
                    x2bVar.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f3) {
            return;
        }
        super.invalidate();
        this.f3 = true;
    }
}
