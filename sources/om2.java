// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class om2 extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    public float e;
    public final Drawable f;
    public final float[] h;
    public final /* synthetic */ sm2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om2(sm2 sm2Var, Context context) {
        super(context);
        this.n = sm2Var;
        this.a = new Paint(1);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        this.h = new float[3];
        setPadding(hl.L(14.0f), hl.L(3.0f), hl.L(14.0f), hl.L(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(hl.L(3.0f));
        this.f = context.getDrawable(R.drawable.knob_shadow);
    }

    public final void a(MotionEvent motionEvent) {
        float f;
        this.d = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float y = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
        this.e = y;
        float[] fArr = this.h;
        fArr[0] = y * 360.0f;
        float f2 = this.d;
        if (f2 <= 0.22f) {
            f = 1.0f - (f2 / 0.22f);
        } else {
            if (f2 < 0.78f) {
                fArr[1] = 1.0f;
                fArr[2] = 1.0f;
                int HSVToColor = Color.HSVToColor(fArr);
                sm2 sm2Var = this.n;
                sm2Var.p1 = HSVToColor;
                sm2Var.E0(HSVToColor, 0);
                invalidate();
            }
            f = (f2 - 0.78f) / 0.22000003f;
        }
        fArr[1] = hl.R1(1.0f, 0.0f, f);
        float f3 = this.d;
        fArr[2] = f3 > 0.22f ? hl.R1(1.0f, 0.0f, (f3 - 0.78f) / 0.22000003f) : 1.0f;
        int HSVToColor2 = Color.HSVToColor(fArr);
        sm2 sm2Var2 = this.n;
        sm2Var2.p1 = HSVToColor2;
        sm2Var2.E0(HSVToColor2, 0);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = hl.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), this.a);
        canvas.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), this.b);
        float L = hl.L(13.0f);
        Paint paint = this.c;
        float strokeWidth = L - (paint.getStrokeWidth() / 2.0f);
        float L2 = hl.L(16.0f);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f = width;
        float a = ete.a(this.d * f, L2, f - L2) + getPaddingLeft();
        float f2 = height;
        float a2 = ete.a(this.e * f2, L2, f2 - L2) + getPaddingTop();
        Rect rect = hl.Q;
        Drawable drawable = this.f;
        drawable.getPadding(rect);
        int i = (int) ((a - L) - rect.left);
        int i2 = (int) ((a2 - L) - rect.top);
        float f3 = rect.bottom;
        drawable.setBounds(i, i2, (int) (a + L + f3), (int) (a2 + L + f3));
        drawable.draw(canvas);
        canvas.drawCircle(a, a2, L, paint);
        gv7.B1(a, a2, strokeWidth, vm2.o(this.n.p1, jn7.d4), canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i2 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
        this.b.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            a(motionEvent);
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            a(motionEvent);
        } else if (actionMasked == 2) {
            a(motionEvent);
        } else if (actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }
}
