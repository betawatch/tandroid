// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class km2 extends View {
    public final Paint a;
    public final Paint b;
    public float c;
    public final /* synthetic */ sm2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km2(sm2 sm2Var, Context context) {
        super(context);
        this.d = sm2Var;
        this.a = new Paint(1);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(hl.L(3.0f));
    }

    public final void a() {
        this.a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, this.d.p1}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f) {
        float L = hl.L(6.0f);
        float a = ete.a(((f - L) + (hl.L(13.0f) - (this.b.getStrokeWidth() / 2.0f))) / (getWidth() - (L * 2.0f)), 0.0f, 1.0f);
        this.c = a;
        sm2 sm2Var = this.d;
        sm2Var.E0(vm2.o(sm2Var.p1, (int) (a * 255.0f)), 1);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float L = hl.L(6.0f);
        RectF rectF = hl.P;
        float f = height - L;
        float f2 = height + L;
        rectF.set(L, f, getWidth() - L, f2);
        canvas.save();
        sm2 sm2Var = this.d;
        Path path = sm2Var.o1;
        path.rewind();
        path.addRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), Path.Direction.CW);
        canvas.clipPath(path);
        gv7.A1(canvas, rectF, hl.L(6.0f));
        canvas.restore();
        rectF.set(L, f, getWidth() - L, f2);
        canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), this.a);
        float L2 = hl.L(13.0f);
        Paint paint = this.b;
        float strokeWidth = L2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(L + strokeWidth, (((getWidth() - (2.0f * L)) * this.c) + L) - strokeWidth);
        canvas.drawCircle(max, height, L2, paint);
        gv7.B1(max, height, strokeWidth, vm2.o(sm2Var.p1, (int) (this.c * 255.0f)), canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                b(motionEvent.getX());
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return true;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        b(motionEvent.getX());
        return true;
    }
}
