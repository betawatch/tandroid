package ig;

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
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    public float e;
    public final Drawable f;
    public final float[] h;
    public final /* synthetic */ u n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, Context context) {
        super(context);
        this.n = uVar;
        this.a = new Paint(1);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        this.h = new float[3];
        setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        this.f = context.getDrawable(R.drawable.knob_shadow);
    }

    public final void a(MotionEvent motionEvent) {
        this.d = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float y3 = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
        this.e = y3;
        float[] fArr = this.h;
        fArr[0] = y3 * 360.0f;
        float f7 = this.d;
        if (f7 <= 0.22f || f7 >= 0.78f) {
            fArr[1] = org.telegram.messenger.i0.T1(1.0f, 0.0f, f7 <= 0.22f ? 1.0f - (f7 / 0.22f) : (f7 - 0.78f) / 0.22000003f);
            float f10 = this.d;
            fArr[2] = f10 > 0.22f ? org.telegram.messenger.i0.T1(1.0f, 0.0f, (f10 - 0.78f) / 0.22000003f) : 1.0f;
        } else {
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        u uVar = this.n;
        uVar.m1 = HSVToColor;
        uVar.I0(HSVToColor, 0);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.a);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.b);
        float L = org.telegram.messenger.i0.L(13.0f);
        Paint paint = this.c;
        float strokeWidth = L - (paint.getStrokeWidth() / 2.0f);
        float L2 = org.telegram.messenger.i0.L(16.0f);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f7 = width;
        float a2 = w7.u.a(this.d * f7, L2, f7 - L2) + getPaddingLeft();
        float f10 = height;
        float a10 = w7.u.a(this.e * f10, L2, f10 - L2) + getPaddingTop();
        Rect rect = org.telegram.messenger.i0.Q;
        Drawable drawable = this.f;
        drawable.getPadding(rect);
        int i10 = (int) ((a2 - L) - rect.left);
        int i11 = (int) ((a10 - L) - rect.top);
        int i12 = rect.bottom;
        drawable.setBounds(i10, i11, (int) (a2 + L + i12), (int) (a10 + L + i12));
        drawable.draw(canvas);
        canvas.drawCircle(a2, a10, L, paint);
        jg.n1.A1(a2, a10, strokeWidth, i0.b.o(this.n.m1, zs.e4), canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.a.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i11 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
        this.b.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i10 - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
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
