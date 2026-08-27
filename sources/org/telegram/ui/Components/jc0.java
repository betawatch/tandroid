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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class jc0 extends FrameLayout {
    public static final su0 E;
    public static final su0 F;
    public static final su0 G;
    public boolean A;
    public boolean B;
    public final org.telegram.ui.ActionBar.c6 C;
    public float D;
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
    public final float v;
    public final float w;
    public EditText x;
    public boolean y;

    static {
        su0 su0Var = new su0(new c2(24), new c2(25));
        su0Var.c = 100.0f;
        E = su0Var;
        su0 su0Var2 = new su0(new c2(26), new c2(27));
        su0Var2.c = 100.0f;
        F = su0Var2;
        su0 su0Var3 = new su0(new c2(28), new c2(29));
        su0Var3.c = 100.0f;
        G = su0Var3;
    }

    public jc0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = new RectF();
        this.b = "";
        Paint paint = new Paint(1);
        this.c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.j(this, E);
        this.h = new o1.j(this, F);
        this.r = new o1.j(this, G);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.w = AndroidUtilities.dp(1.6667f);
        this.C = c6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
    }

    public static void d(o1.j jVar, float f10) {
        float f11 = f10 * 100.0f;
        o1.k kVar = jVar.u;
        if (kVar == null || f11 != ((float) kVar.i)) {
            jVar.c();
            o1.k kVar2 = new o1.k(f11);
            kVar2.b(500.0f);
            kVar2.a(1.0f);
            kVar2.i = f11;
            jVar.u = kVar2;
            jVar.f();
        }
    }

    private void setColor(int i10) {
        this.c.setColor(i10);
        invalidate();
    }

    public final void a(float f10) {
        d(this.r, f10);
    }

    public final void b(float f10, float f11, boolean z10) {
        if (z10) {
            d(this.e, f10);
            d(this.h, f11);
            return;
        }
        this.f = f10;
        this.n = f11;
        if (!this.y) {
            float f12 = this.w;
            float f13 = this.v;
            this.c.setStrokeWidth(((f12 - f13) * f10) + f13);
        }
        f();
    }

    public final void c(boolean z10, boolean z11) {
        b(z10 ? 1.0f : 0.0f, z11 ? 1.0f : 0.0f, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.x = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        int i10 = org.telegram.ui.ActionBar.g6.H6;
        org.telegram.ui.ActionBar.c6 c6Var = this.C;
        int d = i0.b.d((!this.y || this.B) ? this.n : 0.0f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I6, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.q7;
        this.d.setColor(i0.b.d(this.s, d, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        setColor(i0.b.d(this.s, i0.b.d((!this.y || this.B) ? this.f : 0.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.k6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.l6, c6Var)), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
    }

    public EditText getAttachedEditText() {
        return this.x;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TextPaint textPaint = this.d;
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.x;
        boolean z10 = (editText != null && editText.length() == 0 && TextUtils.isEmpty(this.x.getHint())) || this.y || this.A;
        if (z10) {
            paddingTop = com.google.android.recaptcha.internal.a.z(1.0f, this.n, textSize - paddingTop, paddingTop);
        }
        float f10 = paddingTop;
        float f11 = z10 ? (1.0f - this.n) * this.D : 0.0f;
        Paint paint = this.c;
        float strokeWidth = paint.getStrokeWidth();
        float z11 = z10 ? com.google.android.recaptcha.internal.a.z(1.0f, this.n, 0.25f, 0.75f) : 0.75f;
        float measureText = textPaint.measureText(this.b) * z11;
        canvas.save();
        RectF rectF = this.a;
        rectF.set(AndroidUtilities.dp(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.restore();
        float dp = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float f12 = (measureText / 2.0f) + dp;
        canvas.drawLine(((((dp + measureText) + AndroidUtilities.dp(10.0f)) - f12) * (z10 ? this.n : 1.0f)) + f12, paddingTop2, ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f), paddingTop2, paint);
        float dp2 = f12 + AndroidUtilities.dp(4.0f);
        canvas.drawLine(dp, paddingTop2, ((dp - dp2) * (z10 ? this.n : 1.0f)) + dp2, paddingTop2, paint);
        canvas.save();
        canvas.scale(z11, z11, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f10);
        canvas.drawText(this.b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f11, f10, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.y = z10;
        this.B = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.y = z10;
        invalidate();
    }

    public void setForceUseCenter2(boolean z10) {
        this.A = z10;
    }

    public void setLeftPadding(float f10) {
        this.D = f10;
        invalidate();
    }

    public void setText(String str) {
        this.b = str;
        invalidate();
    }
}
