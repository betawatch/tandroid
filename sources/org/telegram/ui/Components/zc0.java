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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class zc0 extends FrameLayout {
    public static final hv0 I;
    public static final hv0 J;
    public static final hv0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.f6 G;
    public float H;
    public final RectF a;
    public String b;
    public final Paint c;
    public final TextPaint d;
    public final o1.k e;
    public float f;
    public final o1.k h;
    public float n;
    public final o1.k r;
    public float s;
    public final float v;
    public final float w;
    public EditText x;
    public boolean y;

    static {
        hv0 hv0Var = new hv0(new p2(14), new p2(15));
        hv0Var.c = 100.0f;
        I = hv0Var;
        hv0 hv0Var2 = new hv0(new p2(16), new p2(17));
        hv0Var2.c = 100.0f;
        J = hv0Var2;
        hv0 hv0Var3 = new hv0(new p2(18), new p2(19));
        hv0Var3.c = 100.0f;
        K = hv0Var3;
    }

    public zc0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = new RectF();
        this.b = "";
        Paint paint = new Paint(1);
        this.c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new o1.k(this, I);
        this.h = new o1.k(this, J);
        this.r = new o1.k(this, K);
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.w = AndroidUtilities.dp(1.6667f);
        this.G = f6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
    }

    public static void d(o1.k kVar, float f7) {
        float f10 = f7 * 100.0f;
        o1.l lVar = kVar.u;
        if (lVar == null || f10 != ((float) lVar.i)) {
            kVar.c();
            o1.l lVar2 = new o1.l(f10);
            lVar2.b(500.0f);
            lVar2.a(1.0f);
            lVar2.i = f10;
            kVar.u = lVar2;
            kVar.f();
        }
    }

    private void setColor(int i10) {
        this.c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.r, f7);
    }

    public final void b(float f7, float f10, boolean z10) {
        if (z10) {
            d(this.e, f7);
            d(this.h, f10);
            return;
        }
        this.f = f7;
        this.n = f10;
        if (!this.y) {
            float f11 = this.w;
            float f12 = this.v;
            this.c.setStrokeWidth(((f11 - f12) * f7) + f12);
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
        int i10 = org.telegram.ui.ActionBar.j6.H6;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        int d = i0.a.d((!this.y || this.F) ? this.n : 0.0f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.q7;
        this.d.setColor(i0.a.d(this.s, d, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        setColor(i0.a.d(this.s, i0.a.d((!this.y || this.F) ? this.f : 0.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l6, f6Var)), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
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
        boolean z10 = (editText != null && editText.length() == 0 && TextUtils.isEmpty(this.x.getHint())) || this.y || this.E;
        if (z10) {
            paddingTop = com.google.android.gms.internal.vision.e2.z(1.0f, this.n, textSize - paddingTop, paddingTop);
        }
        float f7 = paddingTop;
        float f10 = z10 ? (1.0f - this.n) * this.H : 0.0f;
        Paint paint = this.c;
        float strokeWidth = paint.getStrokeWidth();
        float z11 = z10 ? com.google.android.gms.internal.vision.e2.z(1.0f, this.n, 0.25f, 0.75f) : 0.75f;
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
        float f11 = (measureText / 2.0f) + dp;
        canvas.drawLine(((((dp + measureText) + AndroidUtilities.dp(10.0f)) - f11) * (z10 ? this.n : 1.0f)) + f11, paddingTop2, ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f), paddingTop2, paint);
        float dp2 = f11 + AndroidUtilities.dp(4.0f);
        canvas.drawLine(dp, paddingTop2, ((dp - dp2) * (z10 ? this.n : 1.0f)) + dp2, paddingTop2, paint);
        canvas.save();
        canvas.scale(z11, z11, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f7);
        canvas.drawText(this.b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f10, f7, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z10) {
        this.y = z10;
        this.F = z10;
        invalidate();
    }

    public void setForceUseCenter(boolean z10) {
        this.y = z10;
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
}
