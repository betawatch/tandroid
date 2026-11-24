// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j00 extends ox4 {
    public final /* synthetic */ m00 A0;
    public final RectF x0;
    public final RectF y0;
    public final Path z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j00(m00 m00Var, Context context, int i, ylb ylbVar) {
        super(i, ylbVar, context);
        this.A0 = m00Var;
        this.x0 = new RectF();
        this.y0 = new RectF();
        this.z0 = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        m00 m00Var = this.A0;
        h00 h00Var = m00Var.V1;
        boolean drawChild = super.drawChild(canvas, view, j);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = h00Var.b;
            g00 g00Var = m00Var.T1;
            RectF rectF = this.x0;
            if (!zgc.c(frameLayout2, g00Var, rectF)) {
                return true;
            }
            RectF rectF2 = this.y0;
            if (!zgc.c(frameLayout, this, rectF2)) {
                return true;
            }
            float centerX = rectF2.centerX() - gm.L(40.0f);
            float centerY = rectF2.centerY() - gm.L(40.0f);
            if (!rectF.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.z0);
                canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                hg9.m(h00Var.getHeight(), 2.0f, rectF2.centerY(), rectF2.centerX() - (h00Var.getWidth() / 2.0f), canvas);
                h00Var.b(h00Var.getWidth() / 2.0f, gm.L(104.0f), h00Var.getWidth(), h00Var.getHeight(), canvas);
                h00Var.c(h00Var.getWidth() / 2.0f, gm.L(104.0f), h00Var.getWidth(), h00Var.getHeight(), canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(centerX, centerY);
                canvas.scale(gm.L(80.0f) / rectF.width(), gm.L(80.0f) / rectF.height());
                h00Var.b.draw(canvas);
                canvas.restore();
            }
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.z0;
        path.rewind();
        RectF rectF = this.x0;
        rectF.set(0.0f, 0.0f, i, i2);
        rectF.inset(gm.L(3.33f), gm.L(4.0f));
        path.addRoundRect(rectF, gm.L(11.0f), gm.L(11.0f), Path.Direction.CW);
    }
}
