// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class bc1 extends View {
    public Layout.Alignment E;
    public int F;
    public float G;
    public float H;
    public float I;
    public int J;
    public float K;
    public float L;
    public float M;
    public final StaticLayout[] N;
    public final String[] O;
    public final float[] P;
    public long Q;
    public ac1 R;
    public String S;
    public String T;
    public pcc U;
    public pcc V;
    public final ac1[] a;
    public final Paint b;
    public final TextPaint c;
    public ac1 d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public float y;

    public bc1(Context context) {
        super(context);
        this.a = new ac1[]{new ac1(this, -1), new ac1(this, 1)};
        this.b = new Paint(1);
        this.c = new TextPaint(1);
        this.s = 1.0f;
        this.E = Layout.Alignment.ALIGN_CENTER;
        this.F = -1;
        this.N = new StaticLayout[2];
        this.O = new String[2];
        this.P = new float[4];
    }

    public static float c(float f, float f2, float f3) {
        return Utilities.i((f - f2) / (f3 - f2), 1.0f, 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (r9[r8 + 1] == r7.getTextSize()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, int i, String str, ac1 ac1Var, float f, float f2, float f3, float f4, float f5) {
        if (TextUtils.isEmpty(str) || f5 <= 0.0f || f4 <= 0.0f) {
            return;
        }
        int p1 = aob.p1(f5, this.F);
        TextPaint textPaint = this.c;
        textPaint.setColor(p1);
        float f6 = this.G;
        if (f6 > 0.0f) {
            textPaint.setShadowLayer(f6, this.H, this.I, aob.p1(f5 * f5, this.J));
        } else {
            textPaint.clearShadowLayer();
        }
        int max = Math.max(1, (int) Math.ceil(f4));
        StaticLayout[] staticLayoutArr = this.N;
        StaticLayout staticLayout = staticLayoutArr[i];
        float[] fArr = this.P;
        String[] strArr = this.O;
        if (staticLayout != null && str.equals(strArr[i])) {
            int i2 = i << 1;
            if (fArr[i2] == max) {
            }
        }
        strArr[i] = str;
        int i3 = i << 1;
        fArr[i3] = max;
        fArr[i3 + 1] = textPaint.getTextSize();
        staticLayoutArr[i] = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, max).setAlignment(this.E).setBreakStrategy(0).setHyphenationFrequency(0).setIncludePad(true).setMaxLines(3).build();
        StaticLayout staticLayout2 = staticLayoutArr[i];
        float N = hl.N(14.0f) / Math.max(1.0f, textPaint.getTextSize());
        float f7 = (-staticLayout2.getWidth()) / 2.0f;
        float f8 = (-staticLayout2.getHeight()) / 2.0f;
        float R1 = hl.R1(this.s, N, f);
        canvas.save();
        canvas.translate(hl.R1(this.e, ac1Var.f.isEmpty() ? this.e : ac1Var.f.centerX(), f), hl.R1(this.f, ac1Var.a(), f));
        canvas.rotate(hl.R1(this.r, 0.0f, f));
        canvas.scale(R1, R1);
        canvas.translate(hl.R1(f2, f7, f), hl.R1(f3, f8, f));
        staticLayout2.draw(canvas);
        canvas.restore();
    }

    public final void b() {
        if (this.R == null) {
            return;
        }
        this.R = null;
        for (ac1 ac1Var : this.a) {
            ac1Var.i = null;
            mm mmVar = ac1Var.e;
            pkb pkbVar = ac1Var.h;
            mmVar.e(true, pkbVar == null ? 0.0f : pkbVar.j() + hl.L(31.0f) + hl.L(31.0f));
        }
        pcc pccVar = this.V;
        if (pccVar != null) {
            pccVar.a(Float.valueOf(1.0f));
        }
        invalidate();
    }

    public final void d(float f, float f2, float f3, float f4, float f5, float f6, TextPaint textPaint, int i, float f7, float f8, float f9, Layout.Alignment alignment) {
        boolean z = (this.e == f && this.f == f2 && this.h == f3 && this.n == f4) ? false : true;
        this.e = f;
        this.f = f2;
        this.h = f3;
        this.n = f4;
        this.r = f5;
        this.s = f6;
        this.w = f7;
        this.x = f8;
        this.y = f9;
        if (alignment != null && alignment != this.E) {
            this.E = alignment;
            StaticLayout[] staticLayoutArr = this.N;
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.F = i;
        TextPaint textPaint2 = this.c;
        textPaint2.set(textPaint);
        textPaint2.setTextAlign(Paint.Align.LEFT);
        if (Build.VERSION.SDK_INT >= 29) {
            this.G = textPaint.getShadowLayerRadius();
            this.H = textPaint.getShadowLayerDx();
            this.I = textPaint.getShadowLayerDy();
            this.J = textPaint.getShadowLayerColor();
        } else {
            this.G = 0.0f;
        }
        if (z || this.R != null) {
            invalidate();
        }
    }

    public final void e(CharSequence charSequence, CharSequence charSequence2) {
        if (this.R != null) {
            return;
        }
        ac1[] ac1VarArr = this.a;
        ac1VarArr[0].b(charSequence == null ? null : charSequence.toString());
        ac1VarArr[1].b(charSequence2 != null ? charSequence2.toString() : null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        float e;
        float f3;
        float f4;
        boolean z2;
        ac1[] ac1VarArr;
        ac1 ac1Var;
        float f5;
        float c;
        Canvas canvas2 = canvas;
        boolean z3 = true;
        boolean z4 = this.R != null;
        float f6 = 1.0f;
        if (z4) {
            float elapsedRealtime = (SystemClock.elapsedRealtime() - this.Q) / 320.0f;
            if (elapsedRealtime >= 1.0f) {
                b();
                f = 1.0f;
                z = false;
            } else {
                float interpolation = k43.h.getInterpolation(elapsedRealtime);
                pcc pccVar = this.V;
                if (pccVar != null) {
                    pccVar.a(Float.valueOf(interpolation));
                }
                invalidate();
                z = z4;
                f = interpolation;
            }
        } else {
            z = z4;
            f = 1.0f;
        }
        ac1[] ac1VarArr2 = this.a;
        int length = ac1VarArr2.length;
        int i = 0;
        while (i < length) {
            ac1 ac1Var2 = ac1VarArr2[i];
            mm mmVar = ac1Var2.d;
            mm mmVar2 = ac1Var2.e;
            Drawable drawable = ac1Var2.b;
            RectF rectF = ac1Var2.f;
            float f7 = f6;
            float d = mmVar.d(ac1Var2.h != null ? z3 : false);
            pkb pkbVar = ac1Var2.h;
            float j = pkbVar == null ? 0.0f : pkbVar.j() + hl.L(31.0f) + hl.L(31.0f);
            if (z) {
                float f8 = ac1Var2.k ? ac1Var2.j : j;
                if (ac1Var2.h == null) {
                    j = ac1Var2.j;
                }
                e = hl.R1(f8, j, f);
                mmVar2.e(z3, e);
                if (ac1Var2 == this.R) {
                    f2 = 0.0f;
                    c = f7 - c(f, 0.0f, 0.25f);
                    f4 = c(f, 0.5f, f7);
                } else {
                    f2 = 0.0f;
                    c = f7 - c(f, 0.0f, 0.4f);
                    f4 = c(f, 0.75f, f7);
                }
                f3 = c;
            } else {
                f2 = 0.0f;
                e = mmVar2.e(d <= 0.0f ? z3 : false, j);
                f3 = 0.0f;
                f4 = 1.0f;
            }
            if (d <= f2 || e <= f2) {
                z2 = z;
                ac1VarArr = ac1VarArr2;
                rectF.setEmpty();
            } else {
                float a = ac1Var2.a();
                float L = hl.L(30.0f);
                float f9 = e / 2.0f;
                float f10 = f3;
                float i2 = Utilities.i(this.e, (getWidth() - hl.L(8.0f)) - f9, hl.L(8.0f) + f9);
                float f11 = L / 2.0f;
                z2 = z;
                float f12 = i2 + f9;
                ac1VarArr = ac1VarArr2;
                rectF.set(i2 - f9, a - f11, f12, a + f11);
                float R1 = hl.R1(0.8f, 1.0f, d) * ac1Var2.c.a(0.04f);
                canvas2.save();
                canvas2.scale(R1, R1, i2, a);
                int p1 = aob.p1(d, -1946157056);
                Paint paint = this.b;
                paint.setColor(p1);
                canvas2.drawRoundRect(rectF, f11, f11, paint);
                int L2 = hl.L(14.0f);
                drawable.setAlpha((int) (217.0f * d));
                int i3 = 0;
                while (i3 < 2) {
                    int L3 = (int) (i3 == 0 ? rectF.left + hl.L(10.0f) : (rectF.right - hl.L(10.0f)) - L2);
                    int i4 = (int) (a - (L2 / 2.0f));
                    int i5 = L2;
                    drawable.setBounds(L3, i4, L3 + L2, i4 + i5);
                    drawable.draw(canvas2);
                    i3++;
                    L2 = i5;
                }
                canvas2.save();
                canvas2.clipRect(rectF.left + hl.L(24.0f), rectF.top, rectF.right - hl.L(24.0f), rectF.bottom);
                pkb pkbVar2 = ac1Var2.i;
                if (pkbVar2 == null) {
                    ac1Var = ac1Var2;
                    f5 = 0.0f;
                } else if (f10 > 0.0f) {
                    ac1Var = ac1Var2;
                    f5 = 0.0f;
                    pkbVar2.c(i2 - (pkbVar2.j() / 2.0f), a, d * 0.85f * f10, -1, canvas);
                } else {
                    ac1Var = ac1Var2;
                    f5 = 0.0f;
                }
                pkb pkbVar3 = ac1Var.h;
                if (pkbVar3 != null && f4 > f5) {
                    pkbVar3.c(i2 - (pkbVar3.j() / 2.0f), a, d * 0.85f * f4, -1, canvas);
                }
                canvas.restore();
                canvas.restore();
            }
            i++;
            canvas2 = canvas;
            z = z2;
            ac1VarArr2 = ac1VarArr;
            z3 = true;
            f6 = 1.0f;
        }
        ac1[] ac1VarArr3 = ac1VarArr2;
        if (z) {
            ac1 ac1Var3 = this.R;
            ac1 ac1Var4 = ac1VarArr3[ac1Var3 == ac1VarArr3[0] ? (char) 1 : (char) 0];
            a(canvas, 0, this.S, ac1Var3, 1.0f - f, this.w, this.x, this.y, c(f, 0.0f, 0.25f));
            a(canvas, 1, this.T, ac1Var4, f, this.K, this.L, this.M, 1.0f - c(f, 0.75f, 1.0f));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            for (ac1 ac1Var : this.a) {
                String str = ac1Var.g;
                ac1Var.g = null;
                ac1Var.h = null;
                ac1Var.b(str);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pcc pccVar;
        if (motionEvent.getAction() == 0) {
            this.d = null;
            for (ac1 ac1Var : this.a) {
                if (ac1Var.h != null && ac1Var.f.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.d = ac1Var;
                    ac1Var.c.c(true);
                    return true;
                }
            }
        } else if (this.d != null) {
            if (motionEvent.getAction() == 2) {
                if (!this.d.f.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.d.c.c(false);
                    this.d = null;
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                ac1 ac1Var2 = this.d;
                this.d = null;
                ac1Var2.c.c(false);
                if (motionEvent.getAction() == 1 && (pccVar = this.U) != null) {
                    pccVar.a(Integer.valueOf(ac1Var2.a));
                }
            }
            return true;
        }
        return false;
    }

    public void setOnClick(pcc pccVar) {
        this.U = pccVar;
    }

    public void setOnSwitchProgress(pcc pccVar) {
        this.V = pccVar;
    }
}
