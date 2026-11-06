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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class lb0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static final lt0 I;
    public static final lt0 J;
    public static final lt0 K;
    public boolean D;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.f6 G;
    public float H;
    public final RectF a;
    public String b;
    public final Paint c;
    public final TextPaint d;
    public final r1.g e;
    public float f;
    public final r1.g h;
    public float n;
    public final r1.g r;
    public float s;
    public final float w;
    public final float x;
    public EditText y;

    static {
        lt0 lt0Var = new lt0(new k2(20), new k2(21));
        lt0Var.c = 100.0f;
        I = lt0Var;
        lt0 lt0Var2 = new lt0(new k2(22), new k2(23));
        lt0Var2.c = 100.0f;
        J = lt0Var2;
        lt0 lt0Var3 = new lt0(new k2(24), new k2(25));
        lt0Var3.c = 100.0f;
        K = lt0Var3;
    }

    public lb0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = new RectF();
        this.b = "";
        Paint paint = new Paint(1);
        this.c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new r1.g(this, I);
        this.h = new r1.g(this, J);
        this.r = new r1.g(this, K);
        float max = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        this.w = max;
        this.x = org.telegram.messenger.g0.L(1.6667f);
        this.G = f6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
    }

    public static void d(r1.g gVar, float f10) {
        float f11 = f10 * 100.0f;
        r1.h hVar = gVar.m;
        if (hVar == null || f11 != ((float) hVar.i)) {
            gVar.d();
            r1.h hVar2 = new r1.h(f11);
            hVar2.b(500.0f);
            hVar2.a(1.0f);
            hVar2.i = f11;
            gVar.m = hVar2;
            gVar.h();
        }
    }

    private void setColor(int i7) {
        this.c.setColor(i7);
        invalidate();
    }

    public final void a(float f10) {
        d(this.r, f10);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.l6));
    }

    public final void b(float f10, float f11, boolean z9) {
        if (z9) {
            d(this.e, f10);
            d(this.h, f11);
            return;
        }
        this.f = f10;
        this.n = f11;
        if (!this.D) {
            float f12 = this.x;
            float f13 = this.w;
            this.c.setStrokeWidth(((f12 - f13) * f10) + f13);
        }
        f();
    }

    public final void c(boolean z9, boolean z10) {
        b(z9 ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.y = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        int i7 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        int f10 = i0.a.f((!this.D || this.F) ? this.n : 0.0f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, f6Var));
        int i10 = org.telegram.ui.ActionBar.k6.q7;
        this.d.setColor(i0.a.f(this.s, f10, org.telegram.ui.ActionBar.k6.w0(i10, f6Var)));
        setColor(i0.a.f(this.s, i0.a.f((!this.D || this.F) ? this.f : 0.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.k6, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.l6, f6Var)), org.telegram.ui.ActionBar.k6.w0(i10, f6Var)));
    }

    public EditText getAttachedEditText() {
        return this.y;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        int f10 = i0.a.f((!this.D || this.F) ? this.n : 0.0f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, f6Var));
        int i10 = org.telegram.ui.ActionBar.k6.q7;
        int f11 = i0.a.f(this.s, f10, org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f11);
        int f12 = i0.a.f(this.s, i0.a.f((!this.D || this.F) ? this.f : 0.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.k6, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.l6, f6Var)), org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        Paint paint = this.c;
        paint.setColor(f12);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - org.telegram.messenger.g0.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.y;
        boolean z9 = (editText != null && editText.length() == 0 && TextUtils.isEmpty(this.y.getHint())) || this.D || this.E;
        if (z9) {
            paddingTop = com.google.android.recaptcha.internal.a.z(1.0f, this.n, textSize - paddingTop, paddingTop);
        }
        float f13 = paddingTop;
        float f14 = z9 ? this.H * (1.0f - this.n) : 0.0f;
        float strokeWidth = paint.getStrokeWidth();
        float z10 = z9 ? com.google.android.recaptcha.internal.a.z(1.0f, this.n, 0.25f, 0.75f) : 0.75f;
        float measureText = textPaint.measureText(this.b) * z10;
        canvas.save();
        RectF rectF = this.a;
        rectF.set(org.telegram.messenger.g0.L(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - org.telegram.messenger.g0.L(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.restore();
        float L = org.telegram.messenger.g0.L(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float f15 = (measureText / 2.0f) + L;
        canvas.drawLine(((((L + measureText) + org.telegram.messenger.g0.L(10.0f)) - f15) * (z9 ? this.n : 1.0f)) + f15, paddingTop2, ((getWidth() - strokeWidth) - getPaddingRight()) - org.telegram.messenger.g0.L(6.0f), paddingTop2, paint);
        float L2 = f15 + org.telegram.messenger.g0.L(4.0f);
        canvas.drawLine(L, paddingTop2, ((L - L2) * (z9 ? this.n : 1.0f)) + L2, paddingTop2, paint);
        canvas.save();
        canvas.scale(z10, z10, org.telegram.messenger.g0.L(18.0f) + getPaddingLeft(), f13);
        canvas.drawText(this.b, org.telegram.messenger.g0.L(14.0f) + getPaddingLeft() + f14, f13, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z9) {
        this.D = z9;
        this.F = z9;
        invalidate();
    }

    public void setForceUseCenter(boolean z9) {
        this.D = z9;
        invalidate();
    }

    public void setForceUseCenter2(boolean z9) {
        this.E = z9;
    }

    public void setLeftPadding(float f10) {
        this.H = f10;
        invalidate();
    }

    public void setText(String str) {
        this.b = str;
        invalidate();
    }

    public void updateColors() {
        try {
            f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
