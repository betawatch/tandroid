// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class be4 extends FrameLayout implements snb {
    public Paint a;
    public float[] b;
    public Path c;
    public float d;

    public final void a(float f, float f2) {
        float[] fArr = this.b;
        fArr[7] = f;
        fArr[6] = f;
        fArr[1] = f;
        fArr[0] = f;
        fArr[5] = f2;
        fArr[4] = f2;
        fArr[3] = f2;
        fArr[2] = f2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        Path path = this.c;
        path.rewind();
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, measuredWidth - hl.U1(this.d, 0, hl.L(4.0f)), getMeasuredHeight());
        a(hl.L(8.0f), hl.U1(this.d, 0, hl.L(8.0f)));
        float[] fArr = this.b;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        Paint paint = this.a;
        canvas.drawPath(path, paint);
        path.rewind();
        rectF.set(measuredWidth + hl.U1(this.d, 0, hl.L(4.0f)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        a(hl.U1(this.d, 0, hl.L(8.0f)), hl.L(8.0f));
        path.addRoundRect(rectF, fArr, direction);
        canvas.drawPath(path, paint);
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.a.setColor(aob.w0(null, aob.Fi, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
