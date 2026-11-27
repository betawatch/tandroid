// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class jz extends sx4 {
    public final /* synthetic */ mz A0;
    public final RectF x0;
    public final RectF y0;
    public final Path z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz(mz mzVar, Context context, int i, vnb vnbVar) {
        super(i, vnbVar, context);
        this.A0 = mzVar;
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
        mz mzVar = this.A0;
        hz hzVar = mzVar.V1;
        boolean drawChild = super.drawChild(canvas, view, j);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = hzVar.b;
            gz gzVar = mzVar.T1;
            RectF rectF = this.x0;
            if (!yic.c(frameLayout2, gzVar, rectF)) {
                return true;
            }
            RectF rectF2 = this.y0;
            if (!yic.c(frameLayout, this, rectF2)) {
                return true;
            }
            float centerX = rectF2.centerX() - hl.L(40.0f);
            float centerY = rectF2.centerY() - hl.L(40.0f);
            if (!rectF.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.z0);
                canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                uh9.n(hzVar.getHeight(), 2.0f, rectF2.centerY(), rectF2.centerX() - (hzVar.getWidth() / 2.0f), canvas);
                hzVar.b(hzVar.getWidth() / 2.0f, hl.L(104.0f), hzVar.getWidth(), hzVar.getHeight(), canvas);
                hzVar.c(hzVar.getWidth() / 2.0f, hl.L(104.0f), hzVar.getWidth(), hzVar.getHeight(), canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(centerX, centerY);
                canvas.scale(hl.L(80.0f) / rectF.width(), hl.L(80.0f) / rectF.height());
                hzVar.b.draw(canvas);
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
        rectF.inset(hl.L(3.33f), hl.L(4.0f));
        path.addRoundRect(rectF, hl.L(11.0f), hl.L(11.0f), Path.Direction.CW);
    }
}
