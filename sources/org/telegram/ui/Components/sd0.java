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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class sd0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static final qw0 I;
    public static final qw0 J;
    public static final qw0 K;
    public boolean E;
    public boolean F;
    public final org.telegram.ui.ActionBar.u6 G;
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
    public final float v;
    public final float w;
    public EditText x;
    public boolean y;

    static {
        qw0 qw0Var = new qw0(new f2(28), new f2(29));
        qw0Var.c = 100.0f;
        I = qw0Var;
        qw0 qw0Var2 = new qw0(new rd0(0), new rd0(1));
        qw0Var2.c = 100.0f;
        J = qw0Var2;
        qw0 qw0Var3 = new qw0(new rd0(2), new rd0(3));
        qw0Var3.c = 100.0f;
        K = qw0Var3;
    }

    public sd0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
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
        float max = Math.max(2, AndroidUtilities.dp(0.5f));
        this.v = max;
        this.w = AndroidUtilities.dp(1.6667f);
        this.G = u6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
    }

    public static void d(o1.j jVar, float f7) {
        float f10 = f7 * 100.0f;
        o1.k kVar = jVar.u;
        if (kVar == null || f10 != ((float) kVar.i)) {
            jVar.c();
            o1.k kVar2 = new o1.k(f10);
            kVar2.b(500.0f);
            kVar2.a(1.0f);
            kVar2.i = f10;
            jVar.u = kVar2;
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.l6));
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
        int i10 = org.telegram.ui.ActionBar.y6.H6;
        org.telegram.ui.ActionBar.u6 u6Var = this.G;
        int f7 = i0.a.f((!this.y || this.F) ? this.n : 0.0f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.I6, u6Var));
        int i11 = org.telegram.ui.ActionBar.y6.q7;
        this.d.setColor(i0.a.f(this.s, f7, org.telegram.ui.ActionBar.y6.w0(i11, u6Var)));
        setColor(i0.a.f(this.s, i0.a.f((!this.y || this.F) ? this.f : 0.0f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.k6, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.l6, u6Var)), org.telegram.ui.ActionBar.y6.w0(i11, u6Var)));
    }

    public EditText getAttachedEditText() {
        return this.x;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.y6.H6;
        org.telegram.ui.ActionBar.u6 u6Var = this.G;
        int f7 = i0.a.f((!this.y || this.F) ? this.n : 0.0f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.I6, u6Var));
        int i11 = org.telegram.ui.ActionBar.y6.q7;
        int f10 = i0.a.f(this.s, f7, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        TextPaint textPaint = this.d;
        textPaint.setColor(f10);
        int f11 = i0.a.f(this.s, i0.a.f((!this.y || this.F) ? this.f : 0.0f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.k6, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.l6, u6Var)), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        Paint paint = this.c;
        paint.setColor(f11);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.x;
        boolean z10 = (editText != null && editText.length() == 0 && TextUtils.isEmpty(this.x.getHint())) || this.y || this.E;
        if (z10) {
            paddingTop = c3.h0.z(1.0f, this.n, textSize - paddingTop, paddingTop);
        }
        float f12 = paddingTop;
        float f13 = z10 ? this.H * (1.0f - this.n) : 0.0f;
        float strokeWidth = paint.getStrokeWidth();
        float z11 = z10 ? c3.h0.z(1.0f, this.n, 0.25f, 0.75f) : 0.75f;
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
        float f14 = (measureText / 2.0f) + dp;
        canvas.drawLine(((((dp + measureText) + AndroidUtilities.dp(10.0f)) - f14) * (z10 ? this.n : 1.0f)) + f14, paddingTop2, ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f), paddingTop2, paint);
        float dp2 = f14 + AndroidUtilities.dp(4.0f);
        canvas.drawLine(dp, paddingTop2, ((dp - dp2) * (z10 ? this.n : 1.0f)) + dp2, paddingTop2, paint);
        canvas.save();
        canvas.scale(z11, z11, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f12);
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
