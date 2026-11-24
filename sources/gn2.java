// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gn2 extends View {
    public final Paint a;
    public final Paint b;
    public byte c;
    public int d;
    public final /* synthetic */ ln2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn2(ln2 ln2Var, Context context) {
        super(context);
        this.e = ln2Var;
        this.a = new Paint(1);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(gm.L(3.0f));
    }

    public final void a() {
        int argb;
        int argb2;
        byte b = this.c;
        ln2 ln2Var = this.e;
        if (b != 1) {
            int i = ln2Var.p1;
            if (b != 2) {
                argb = Color.argb(nm7.d4, 0, Color.green(i), Color.blue(ln2Var.p1));
                argb2 = Color.argb(nm7.d4, nm7.d4, Color.green(ln2Var.p1), Color.blue(ln2Var.p1));
            } else {
                argb = Color.argb(nm7.d4, Color.red(i), Color.green(ln2Var.p1), 0);
                argb2 = Color.argb(nm7.d4, Color.red(ln2Var.p1), Color.green(ln2Var.p1), nm7.d4);
            }
        } else {
            argb = Color.argb(nm7.d4, Color.red(ln2Var.p1), 0, Color.blue(ln2Var.p1));
            argb2 = Color.argb(nm7.d4, Color.red(ln2Var.p1), nm7.d4, Color.blue(ln2Var.p1));
        }
        this.a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{argb, argb2}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f) {
        int argb;
        float L = gm.L(6.0f);
        float a = pqe.a(((f - L) + (gm.L(13.0f) - (this.b.getStrokeWidth() / 2.0f))) / (getWidth() - (L * 2.0f)), 0.0f, 1.0f);
        byte b = this.c;
        ln2 ln2Var = this.e;
        if (b != 1) {
            int i = ln2Var.p1;
            argb = b != 2 ? Color.argb(nm7.d4, (int) (a * 255.0f), Color.green(i), Color.blue(ln2Var.p1)) : Color.argb(nm7.d4, Color.red(i), Color.green(ln2Var.p1), (int) (a * 255.0f));
        } else {
            argb = Color.argb(nm7.d4, Color.red(ln2Var.p1), (int) (a * 255.0f), Color.blue(ln2Var.p1));
        }
        ln2Var.D0(on2.p(argb, Color.alpha(ln2Var.p1)), 4);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int green;
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float L = gm.L(6.0f);
        RectF rectF = gm.P;
        rectF.set(L, height - L, getWidth() - L, height + L);
        canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), this.a);
        byte b = this.c;
        ln2 ln2Var = this.e;
        if (b != 1) {
            int i = ln2Var.p1;
            green = b != 2 ? Color.red(i) : Color.blue(i);
        } else {
            green = Color.green(ln2Var.p1);
        }
        float f = green / 255.0f;
        float L2 = gm.L(13.0f);
        Paint paint = this.b;
        float strokeWidth = L2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(L + strokeWidth, (((getWidth() - (2.0f * L)) * f) + L) - strokeWidth);
        canvas.drawCircle(max, height, L2, paint);
        bu7.A1(max, height, strokeWidth, this.d, canvas);
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
