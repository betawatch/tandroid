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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class fc0 extends FrameLayout {
    public static final pu0 E;
    public static final pu0 F;
    public static final pu0 G;
    public boolean A;
    public boolean B;
    public final org.telegram.ui.ActionBar.b6 C;
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
        pu0 pu0Var = new pu0(new g2(19), new g2(20));
        pu0Var.c = 100.0f;
        E = pu0Var;
        pu0 pu0Var2 = new pu0(new g2(21), new g2(22));
        pu0Var2.c = 100.0f;
        F = pu0Var2;
        pu0 pu0Var3 = new pu0(new g2(23), new g2(24));
        pu0Var3.c = 100.0f;
        G = pu0Var3;
    }

    public fc0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
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
        this.C = b6Var;
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

    private void setColor(int i9) {
        this.c.setColor(i9);
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
        int i9 = org.telegram.ui.ActionBar.f6.H6;
        org.telegram.ui.ActionBar.b6 b6Var = this.C;
        int d = i0.a.d((!this.y || this.B) ? this.n : 0.0f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I6, b6Var));
        int i10 = org.telegram.ui.ActionBar.f6.q7;
        this.d.setColor(i0.a.d(this.s, d, org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        setColor(i0.a.d(this.s, i0.a.d((!this.y || this.B) ? this.f : 0.0f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.k6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.l6, b6Var)), org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
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
            paddingTop = e2.c.z(1.0f, this.n, textSize - paddingTop, paddingTop);
        }
        float f10 = paddingTop;
        float f11 = z10 ? (1.0f - this.n) * this.D : 0.0f;
        Paint paint = this.c;
        float strokeWidth = paint.getStrokeWidth();
        float z11 = z10 ? e2.c.z(1.0f, this.n, 0.25f, 0.75f) : 0.75f;
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
