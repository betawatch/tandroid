package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ec0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final ou0 I;
    public static final ou0 J;
    public static final ou0 K;
    public boolean D;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.p6 G;
    public float H;
    public final RectF a;
    public String b;
    public final Paint c;
    public final TextPaint d;
    public final o1.j e;
    public float f;
    public final o1.j h;
    public float n;
    public final o1.j r;
    public float s;
    public final float w;
    public final float x;
    public EditText y;

    static {
        ou0 ou0Var = new ou0(new au(3), new au(4));
        ou0Var.c = 100.0f;
        I = ou0Var;
        ou0 ou0Var2 = new ou0(new au(5), new au(6));
        ou0Var2.c = 100.0f;
        J = ou0Var2;
        ou0 ou0Var3 = new ou0(new au(7), new au(8));
        ou0Var3.c = 100.0f;
        K = ou0Var3;
    }

    public ec0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = new RectF();
        this.b = "";
        Paint paint = new Paint(1);
        this.c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.j(this, I);
        this.h = new o1.j(this, J);
        this.r = new o1.j(this, K);
        float max = Math.max(2, org.telegram.messenger.i0.L(0.5f));
        this.w = max;
        this.x = org.telegram.messenger.i0.L(1.6667f);
        this.G = p6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, 0);
    }

    public static void d(o1.j jVar, float f7) {
        float f10 = f7 * 100.0f;
        o1.k kVar = jVar.m;
        if (kVar == null || f10 != ((float) kVar.i)) {
            jVar.d();
            o1.k kVar2 = new o1.k(f10);
            kVar2.b(500.0f);
            kVar2.a(1.0f);
            kVar2.i = f10;
            jVar.m = kVar2;
            jVar.h();
        }
    }

    private void setColor(int i10) {
        this.c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.r, f7);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.l6));
    }

    public final void b(float f7, float f10, boolean z10) {
        if (z10) {
            d(this.e, f7);
            d(this.h, f10);
            return;
        }
        this.f = f7;
        this.n = f10;
        if (!this.D) {
            float f11 = this.x;
            float f12 = this.w;
            this.c.setStrokeWidth(((f11 - f12) * f7) + f12);
        }
        f();
    }

    public final void c(boolean z10, boolean z11) {
        b(z10 ? 1.0f : 0.0f, z11 ? 1.0f : 0.0f, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.y = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        int i10 = org.telegram.ui.ActionBar.t6.H6;
        org.telegram.ui.ActionBar.p6 p6Var = this.G;
        int f7 = i0.b.f((!this.D || this.F) ? this.n : 0.0f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.I6, p6Var));
        int i11 = org.telegram.ui.ActionBar.t6.q7;
        this.d.setColor(i0.b.f(this.s, f7, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        setColor(i0.b.f(this.s, i0.b.f((!this.D || this.F) ? this.f : 0.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.k6, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.l6, p6Var)), org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
    }

    public EditText getAttachedEditText() {
        return this.y;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.t6.H6;
        org.telegram.ui.ActionBar.p6 p6Var = this.G;
        int f7 = i0.b.f((!this.D || this.F) ? this.n : 0.0f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.I6, p6Var));
        int i11 = org.telegram.ui.ActionBar.t6.q7;
        int f10 = i0.b.f(this.s, f7, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f10);
        int f11 = i0.b.f(this.s, i0.b.f((!this.D || this.F) ? this.f : 0.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.k6, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.l6, p6Var)), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        Paint paint = this.c;
        paint.setColor(f11);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - org.telegram.messenger.i0.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.y;
        boolean z10 = (editText != null && editText.length() == 0 && TextUtils.isEmpty(this.y.getHint())) || this.D || this.E;
        if (z10) {
            paddingTop = c3.i0.z(1.0f, this.n, textSize - paddingTop, paddingTop);
        }
        float f12 = paddingTop;
        float f13 = z10 ? this.H * (1.0f - this.n) : 0.0f;
        float strokeWidth = paint.getStrokeWidth();
        float z11 = z10 ? c3.i0.z(1.0f, this.n, 0.25f, 0.75f) : 0.75f;
        float measureText = textPaint.measureText(this.b) * z11;
        canvas.save();
        RectF rectF = this.a;
        rectF.set(org.telegram.messenger.i0.L(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - org.telegram.messenger.i0.L(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        canvas.restore();
        float L = org.telegram.messenger.i0.L(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float f14 = (measureText / 2.0f) + L;
        canvas.drawLine(((((L + measureText) + org.telegram.messenger.i0.L(10.0f)) - f14) * (z10 ? this.n : 1.0f)) + f14, paddingTop2, ((getWidth() - strokeWidth) - getPaddingRight()) - org.telegram.messenger.i0.L(6.0f), paddingTop2, paint);
        float L2 = f14 + org.telegram.messenger.i0.L(4.0f);
        canvas.drawLine(L, paddingTop2, ((L - L2) * (z10 ? this.n : 1.0f)) + L2, paddingTop2, paint);
        canvas.save();
        canvas.scale(z11, z11, org.telegram.messenger.i0.L(18.0f) + getPaddingLeft(), f12);
        canvas.drawText(this.b, org.telegram.messenger.i0.L(14.0f) + getPaddingLeft() + f13, f12, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.D = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.D = z10;
        invalidate();
    }

    public void setForceUseCenter2(boolean z10) {
        this.E = z10;
    }

    public void setLeftPadding(float f7) {
        this.H = f7;
        invalidate();
    }

    public void setText(String str) {
        this.b = str;
        invalidate();
    }

    public void updateColors() {
        try {
            f();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
