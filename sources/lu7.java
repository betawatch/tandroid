// default package

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
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class lu7 extends FrameLayout implements snb {
    public static final bma J;
    public static final bma K;
    public static final bma L;
    public boolean E;
    public boolean F;
    public boolean G;
    public final vnb H;
    public float I;
    public final RectF a;
    public String b;
    public final Paint c;
    public final TextPaint d;
    public final vpa e;
    public float f;
    public final vpa h;
    public float n;
    public final vpa r;
    public float s;
    public final float w;
    public final float x;
    public EditTextBoldCursor y;

    static {
        bma bmaVar = new bma(new hz6((byte) 25), new hz6((byte) 26));
        bmaVar.c = 100.0f;
        J = bmaVar;
        bma bmaVar2 = new bma(new hz6((byte) 27), new hz6((byte) 28));
        bmaVar2.c = 100.0f;
        K = bmaVar2;
        bma bmaVar3 = new bma(new hz6((byte) 29), new ku7((byte) 0));
        bmaVar3.c = 100.0f;
        L = bmaVar3;
    }

    public lu7(Context context, vnb vnbVar) {
        super(context);
        this.a = new RectF();
        this.b = "";
        Paint paint = new Paint(1);
        this.c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new vpa(this, J);
        this.h = new vpa(this, K);
        this.r = new vpa(this, L);
        float max = Math.max(2, hl.L(0.5f));
        this.w = max;
        this.x = hl.L(1.6667f);
        this.H = vnbVar;
        setWillNotDraw(false);
        textPaint.setTextSize(hl.L(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, hl.L(6.0f), 0, 0);
    }

    public static void d(vpa vpaVar, float f) {
        float f2 = f * 100.0f;
        wpa wpaVar = vpaVar.m;
        if (wpaVar == null || f2 != ((float) wpaVar.i)) {
            vpaVar.d();
            wpa wpaVar2 = new wpa(f2);
            wpaVar2.b(500.0f);
            wpaVar2.a(1.0f);
            wpaVar2.i = f2;
            vpaVar.m = wpaVar2;
            vpaVar.h();
        }
    }

    private void setColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public final void a(float f) {
        d(this.r, f);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.H6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.q7));
        hashSet.add(Integer.valueOf(aob.k6));
        hashSet.add(Integer.valueOf(aob.l6));
    }

    public final void b(float f, float f2, boolean z) {
        if (z) {
            d(this.e, f);
            d(this.h, f2);
            return;
        }
        this.f = f;
        this.n = f2;
        if (!this.E) {
            float f3 = this.x;
            float f4 = this.w;
            this.c.setStrokeWidth(((f3 - f4) * f) + f4);
        }
        f();
    }

    public final void c(boolean z, boolean z2) {
        b(z ? 1.0f : 0.0f, z2 ? 1.0f : 0.0f, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.y = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        int i = aob.H6;
        vnb vnbVar = this.H;
        int f = vm2.f((!this.E || this.G) ? this.n : 0.0f, aob.v0(i, vnbVar), aob.v0(aob.I6, vnbVar));
        int i2 = aob.q7;
        this.d.setColor(vm2.f(this.s, f, aob.v0(i2, vnbVar)));
        setColor(vm2.f(this.s, vm2.f((!this.E || this.G) ? this.f : 0.0f, aob.v0(aob.k6, vnbVar), aob.v0(aob.l6, vnbVar)), aob.v0(i2, vnbVar)));
    }

    public EditText getAttachedEditText() {
        return this.y;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        int i = aob.H6;
        vnb vnbVar = this.H;
        int f2 = vm2.f((!this.E || this.G) ? this.n : 0.0f, aob.v0(i, vnbVar), aob.v0(aob.I6, vnbVar));
        int i2 = aob.q7;
        int f3 = vm2.f(this.s, f2, aob.v0(i2, vnbVar));
        TextPaint textPaint = this.d;
        textPaint.setColor(f3);
        int f4 = vm2.f(this.s, vm2.f((!this.E || this.G) ? this.f : 0.0f, aob.v0(aob.k6, vnbVar), aob.v0(aob.l6, vnbVar)), aob.v0(i2, vnbVar));
        Paint paint = this.c;
        paint.setColor(f4);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - hl.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditTextBoldCursor editTextBoldCursor = this.y;
        boolean z = (editTextBoldCursor != null && editTextBoldCursor.length() == 0 && TextUtils.isEmpty(this.y.getHint())) || this.E || this.F;
        if (z) {
            float f5 = 1.0f - this.n;
            paddingTop += (textSize - paddingTop) * f5;
            f = f5 * this.I;
        } else {
            f = 0.0f;
        }
        float f6 = paddingTop;
        float strokeWidth = paint.getStrokeWidth();
        float A = z ? qd4.A(1.0f, this.n, 0.25f, 0.75f) : 0.75f;
        float measureText = textPaint.measureText(this.b) * A;
        canvas.save();
        RectF rectF = this.a;
        rectF.set(hl.L(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - hl.L(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), paint);
        canvas.restore();
        float L2 = hl.L(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float f7 = (measureText / 2.0f) + L2;
        canvas.drawLine(((((L2 + measureText) + hl.L(10.0f)) - f7) * (z ? this.n : 1.0f)) + f7, paddingTop2, ((getWidth() - strokeWidth) - getPaddingRight()) - hl.L(6.0f), paddingTop2, paint);
        float L3 = f7 + hl.L(4.0f);
        canvas.drawLine(L2, paddingTop2, ((L2 - L3) * (z ? this.n : 1.0f)) + L3, paddingTop2, paint);
        canvas.save();
        canvas.scale(A, A, hl.L(18.0f) + getPaddingLeft(), f6);
        canvas.drawText(this.b, hl.L(14.0f) + getPaddingLeft() + f, f6, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z) {
        this.E = z;
        this.G = z;
        invalidate();
    }

    public void setForceUseCenter(boolean z) {
        this.E = z;
        invalidate();
    }

    public void setForceUseCenter2(boolean z) {
        this.F = z;
    }

    public void setLeftPadding(float f) {
        this.I = f;
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
            cc4.g(e, true);
        }
    }
}
