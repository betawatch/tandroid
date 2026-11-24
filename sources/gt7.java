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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class gt7 extends FrameLayout implements vlb {
    public static final ika J;
    public static final ika K;
    public static final ika L;
    public boolean E;
    public boolean F;
    public boolean G;
    public final ylb H;
    public float I;
    public final RectF a;
    public String b;
    public final Paint c;
    public final TextPaint d;
    public final zna e;
    public float f;
    public final zna h;
    public float n;
    public final zna r;
    public float s;
    public final float w;
    public final float x;
    public EditTextBoldCursor y;

    static {
        ika ikaVar = new ika(new bh7((byte) 9), new bh7((byte) 10));
        ikaVar.c = 100.0f;
        J = ikaVar;
        ika ikaVar2 = new ika(new bh7((byte) 11), new bh7((byte) 12));
        ikaVar2.c = 100.0f;
        K = ikaVar2;
        ika ikaVar3 = new ika(new bh7((byte) 13), new bh7((byte) 14));
        ikaVar3.c = 100.0f;
        L = ikaVar3;
    }

    public gt7(Context context, ylb ylbVar) {
        super(context);
        this.a = new RectF();
        this.b = "";
        Paint paint = new Paint(1);
        this.c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new zna(this, J);
        this.h = new zna(this, K);
        this.r = new zna(this, L);
        float max = Math.max(2, gm.L(0.5f));
        this.w = max;
        this.x = gm.L(1.6667f);
        this.H = ylbVar;
        setWillNotDraw(false);
        textPaint.setTextSize(gm.L(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, gm.L(6.0f), 0, 0);
    }

    public static void d(zna znaVar, float f) {
        float f2 = f * 100.0f;
        aoa aoaVar = znaVar.m;
        if (aoaVar == null || f2 != ((float) aoaVar.i)) {
            znaVar.d();
            aoa aoaVar2 = new aoa(f2);
            aoaVar2.b(500.0f);
            aoaVar2.a(1.0f);
            aoaVar2.i = f2;
            znaVar.m = aoaVar2;
            znaVar.h();
        }
    }

    private void setColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public final void a(float f) {
        d(this.r, f);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.G6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.p7));
        hashSet.add(Integer.valueOf(cmb.j6));
        hashSet.add(Integer.valueOf(cmb.k6));
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
        int i = cmb.G6;
        ylb ylbVar = this.H;
        int f = on2.f((!this.E || this.G) ? this.n : 0.0f, cmb.v0(i, ylbVar), cmb.v0(cmb.H6, ylbVar));
        int i2 = cmb.p7;
        this.d.setColor(on2.f(this.s, f, cmb.v0(i2, ylbVar)));
        setColor(on2.f(this.s, on2.f((!this.E || this.G) ? this.f : 0.0f, cmb.v0(cmb.j6, ylbVar), cmb.v0(cmb.k6, ylbVar)), cmb.v0(i2, ylbVar)));
    }

    public EditText getAttachedEditText() {
        return this.y;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        int i = cmb.G6;
        ylb ylbVar = this.H;
        int f2 = on2.f((!this.E || this.G) ? this.n : 0.0f, cmb.v0(i, ylbVar), cmb.v0(cmb.H6, ylbVar));
        int i2 = cmb.p7;
        int f3 = on2.f(this.s, f2, cmb.v0(i2, ylbVar));
        TextPaint textPaint = this.d;
        textPaint.setColor(f3);
        int f4 = on2.f(this.s, on2.f((!this.E || this.G) ? this.f : 0.0f, cmb.v0(cmb.j6, ylbVar), cmb.v0(cmb.k6, ylbVar)), cmb.v0(i2, ylbVar));
        Paint paint = this.c;
        paint.setColor(f4);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - gm.L(1.75f));
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
        float A = z ? td4.A(1.0f, this.n, 0.25f, 0.75f) : 0.75f;
        float measureText = textPaint.measureText(this.b) * A;
        canvas.save();
        RectF rectF = this.a;
        rectF.set(gm.L(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - gm.L(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), paint);
        canvas.restore();
        float L2 = gm.L(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float f7 = (measureText / 2.0f) + L2;
        canvas.drawLine(((((L2 + measureText) + gm.L(10.0f)) - f7) * (z ? this.n : 1.0f)) + f7, paddingTop2, ((getWidth() - strokeWidth) - getPaddingRight()) - gm.L(6.0f), paddingTop2, paint);
        float L3 = f7 + gm.L(4.0f);
        canvas.drawLine(L2, paddingTop2, ((L2 - L3) * (z ? this.n : 1.0f)) + L3, paddingTop2, paint);
        canvas.save();
        canvas.scale(A, A, gm.L(18.0f) + getPaddingLeft(), f6);
        canvas.drawText(this.b, gm.L(14.0f) + getPaddingLeft() + f, f6, textPaint);
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
            fc4.g(e, true);
        }
    }
}
