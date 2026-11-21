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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class yb0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final xt0 J;
    public static final xt0 K;
    public static final xt0 L;
    public boolean E;
    public boolean F;
    public boolean G;
    public final org.telegram.ui.ActionBar.h6 H;
    public float I;
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
        xt0 xt0Var = new xt0(new l2(25), new l2(26));
        xt0Var.c = 100.0f;
        J = xt0Var;
        xt0 xt0Var2 = new xt0(new l2(27), new l2(28));
        xt0Var2.c = 100.0f;
        K = xt0Var2;
        xt0 xt0Var3 = new xt0(new l2(29), new xb0(0));
        xt0Var3.c = 100.0f;
        L = xt0Var3;
    }

    public yb0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = new RectF();
        this.b = "";
        Paint paint = new Paint(1);
        this.c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new r1.g(this, J);
        this.h = new r1.g(this, K);
        this.r = new r1.g(this, L);
        float max = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        this.w = max;
        this.x = org.telegram.messenger.g0.L(1.6667f);
        this.H = h6Var;
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.l6));
    }

    public final void b(float f10, float f11, boolean z10) {
        if (z10) {
            d(this.e, f10);
            d(this.h, f11);
            return;
        }
        this.f = f10;
        this.n = f11;
        if (!this.E) {
            float f12 = this.x;
            float f13 = this.w;
            this.c.setStrokeWidth(((f12 - f13) * f10) + f13);
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
        int i7 = org.telegram.ui.ActionBar.m6.H6;
        org.telegram.ui.ActionBar.h6 h6Var = this.H;
        int f10 = i0.a.f((!this.E || this.G) ? this.n : 0.0f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I6, h6Var));
        int i10 = org.telegram.ui.ActionBar.m6.q7;
        this.d.setColor(i0.a.f(this.s, f10, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
        setColor(i0.a.f(this.s, i0.a.f((!this.E || this.G) ? this.f : 0.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.k6, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.l6, h6Var)), org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
    }

    public EditText getAttachedEditText() {
        return this.y;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.m6.H6;
        org.telegram.ui.ActionBar.h6 h6Var = this.H;
        int f10 = i0.a.f((!this.E || this.G) ? this.n : 0.0f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I6, h6Var));
        int i10 = org.telegram.ui.ActionBar.m6.q7;
        int f11 = i0.a.f(this.s, f10, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f11);
        int f12 = i0.a.f(this.s, i0.a.f((!this.E || this.G) ? this.f : 0.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.k6, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.l6, h6Var)), org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        Paint paint = this.c;
        paint.setColor(f12);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - org.telegram.messenger.g0.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.y;
        boolean z10 = (editText != null && editText.length() == 0 && TextUtils.isEmpty(this.y.getHint())) || this.E || this.F;
        if (z10) {
            paddingTop = com.google.android.gms.internal.vision.e2.z(1.0f, this.n, textSize - paddingTop, paddingTop);
        }
        float f13 = paddingTop;
        float f14 = z10 ? this.I * (1.0f - this.n) : 0.0f;
        float strokeWidth = paint.getStrokeWidth();
        float z11 = z10 ? com.google.android.gms.internal.vision.e2.z(1.0f, this.n, 0.25f, 0.75f) : 0.75f;
        float measureText = textPaint.measureText(this.b) * z11;
        canvas.save();
        RectF rectF = this.a;
        rectF.set(org.telegram.messenger.g0.L(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - org.telegram.messenger.g0.L(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.restore();
        float L2 = org.telegram.messenger.g0.L(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float f15 = (measureText / 2.0f) + L2;
        canvas.drawLine(((((L2 + measureText) + org.telegram.messenger.g0.L(10.0f)) - f15) * (z10 ? this.n : 1.0f)) + f15, paddingTop2, ((getWidth() - strokeWidth) - getPaddingRight()) - org.telegram.messenger.g0.L(6.0f), paddingTop2, paint);
        float L3 = f15 + org.telegram.messenger.g0.L(4.0f);
        canvas.drawLine(L2, paddingTop2, ((L2 - L3) * (z10 ? this.n : 1.0f)) + L3, paddingTop2, paint);
        canvas.save();
        canvas.scale(z11, z11, org.telegram.messenger.g0.L(18.0f) + getPaddingLeft(), f13);
        canvas.drawText(this.b, org.telegram.messenger.g0.L(14.0f) + getPaddingLeft() + f14, f13, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.E = z10;
        this.G = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setForceUseCenter2(boolean z10) {
        this.F = z10;
    }

    public void setLeftPadding(float f10) {
        this.I = f10;
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
