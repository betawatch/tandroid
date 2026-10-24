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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class vd0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final hw0 I;
    public static final hw0 J;
    public static final hw0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.g6 G;
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
        hw0 hw0Var = new hw0(new e2(25), new e2(26));
        hw0Var.c = 100.0f;
        I = hw0Var;
        hw0 hw0Var2 = new hw0(new e2(27), new e2(28));
        hw0Var2.c = 100.0f;
        J = hw0Var2;
        hw0 hw0Var3 = new hw0(new e2(29), new ud0(0));
        hw0Var3.c = 100.0f;
        K = hw0Var3;
    }

    public vd0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.G = g6Var;
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
            kVar.h();
        }
    }

    private void setColor(int i10) {
        this.c.setColor(i10);
        invalidate();
    }

    public final void a(float f7) {
        d(this.r, f7);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.l6));
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
        int i10 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.g6 g6Var = this.G;
        int f7 = i0.a.f((!this.y || this.F) ? this.n : 0.0f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, g6Var));
        int i11 = org.telegram.ui.ActionBar.k6.q7;
        this.d.setColor(i0.a.f(this.s, f7, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        setColor(i0.a.f(this.s, i0.a.f((!this.y || this.F) ? this.f : 0.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.k6, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.l6, g6Var)), org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
    }

    public EditText getAttachedEditText() {
        return this.x;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.g6 g6Var = this.G;
        int f7 = i0.a.f((!this.y || this.F) ? this.n : 0.0f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, g6Var));
        int i11 = org.telegram.ui.ActionBar.k6.q7;
        int f10 = i0.a.f(this.s, f7, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f10);
        int f11 = i0.a.f(this.s, i0.a.f((!this.y || this.F) ? this.f : 0.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.k6, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.l6, g6Var)), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        Paint paint = this.c;
        paint.setColor(f11);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.x;
        boolean z10 = (editText != null && editText.length() == 0 && TextUtils.isEmpty(this.x.getHint())) || this.y || this.E;
        if (z10) {
            paddingTop = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.n, textSize - paddingTop, paddingTop);
        }
        float f12 = paddingTop;
        float f13 = z10 ? this.H * (1.0f - this.n) : 0.0f;
        float strokeWidth = paint.getStrokeWidth();
        float y3 = z10 ? com.google.android.gms.internal.play_billing.k3.y(1.0f, this.n, 0.25f, 0.75f) : 0.75f;
        float measureText = textPaint.measureText(this.b) * y3;
        canvas.save();
        RectF rectF = this.a;
        rectF.set(AndroidUtilities.dp(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.restore();
        float dp = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float f14 = (measureText / 2.0f) + dp;
        canvas.drawLine(((((dp + measureText) + AndroidUtilities.dp(10.0f)) - f14) * (z10 ? this.n : 1.0f)) + f14, paddingTop2, ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f), paddingTop2, paint);
        float dp2 = f14 + AndroidUtilities.dp(4.0f);
        canvas.drawLine(dp, paddingTop2, ((dp - dp2) * (z10 ? this.n : 1.0f)) + dp2, paddingTop2, paint);
        canvas.save();
        canvas.scale(y3, y3, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f12);
        canvas.drawText(this.b, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f13, f12, textPaint);
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

    public void updateColors() {
        try {
            f();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
