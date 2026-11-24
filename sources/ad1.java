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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ad1 extends View {
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
    public zc1 R;
    public String S;
    public String T;
    public qac U;
    public qac V;
    public final zc1[] a;
    public final Paint b;
    public final TextPaint c;
    public zc1 d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public float y;

    public ad1(Context context) {
        super(context);
        this.a = new zc1[]{new zc1(this, -1), new zc1(this, 1)};
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
    public final void a(Canvas canvas, int i, String str, zc1 zc1Var, float f, float f2, float f3, float f4, float f5) {
        if (TextUtils.isEmpty(str) || f5 <= 0.0f || f4 <= 0.0f) {
            return;
        }
        int p1 = cmb.p1(f5, this.F);
        TextPaint textPaint = this.c;
        textPaint.setColor(p1);
        float f6 = this.G;
        if (f6 > 0.0f) {
            textPaint.setShadowLayer(f6, this.H, this.I, cmb.p1(f5 * f5, this.J));
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
        float N = gm.N(14.0f) / Math.max(1.0f, textPaint.getTextSize());
        float f7 = (-staticLayout2.getWidth()) / 2.0f;
        float f8 = (-staticLayout2.getHeight()) / 2.0f;
        float R1 = gm.R1(this.s, N, f);
        canvas.save();
        canvas.translate(gm.R1(this.e, zc1Var.f.isEmpty() ? this.e : zc1Var.f.centerX(), f), gm.R1(this.f, zc1Var.a(), f));
        canvas.rotate(gm.R1(this.r, 0.0f, f));
        canvas.scale(R1, R1);
        canvas.translate(gm.R1(f2, f7, f), gm.R1(f3, f8, f));
        staticLayout2.draw(canvas);
        canvas.restore();
    }

    public final void b() {
        if (this.R == null) {
            return;
        }
        this.R = null;
        for (zc1 zc1Var : this.a) {
            zc1Var.i = null;
            ln lnVar = zc1Var.e;
            uib uibVar = zc1Var.h;
            lnVar.e(true, uibVar == null ? 0.0f : uibVar.j() + gm.L(31.0f) + gm.L(31.0f));
        }
        qac qacVar = this.V;
        if (qacVar != null) {
            qacVar.a(Float.valueOf(1.0f));
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
        zc1[] zc1VarArr = this.a;
        zc1VarArr[0].b(charSequence == null ? null : charSequence.toString());
        zc1VarArr[1].b(charSequence2 != null ? charSequence2.toString() : null);
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
        zc1[] zc1VarArr;
        zc1 zc1Var;
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
                float interpolation = d53.h.getInterpolation(elapsedRealtime);
                qac qacVar = this.V;
                if (qacVar != null) {
                    qacVar.a(Float.valueOf(interpolation));
                }
                invalidate();
                z = z4;
                f = interpolation;
            }
        } else {
            z = z4;
            f = 1.0f;
        }
        zc1[] zc1VarArr2 = this.a;
        int length = zc1VarArr2.length;
        int i = 0;
        while (i < length) {
            zc1 zc1Var2 = zc1VarArr2[i];
            ln lnVar = zc1Var2.d;
            ln lnVar2 = zc1Var2.e;
            Drawable drawable = zc1Var2.b;
            RectF rectF = zc1Var2.f;
            float f7 = f6;
            float d = lnVar.d(zc1Var2.h != null ? z3 : false);
            uib uibVar = zc1Var2.h;
            float j = uibVar == null ? 0.0f : uibVar.j() + gm.L(31.0f) + gm.L(31.0f);
            if (z) {
                float f8 = zc1Var2.k ? zc1Var2.j : j;
                if (zc1Var2.h == null) {
                    j = zc1Var2.j;
                }
                e = gm.R1(f8, j, f);
                lnVar2.e(z3, e);
                if (zc1Var2 == this.R) {
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
                e = lnVar2.e(d <= 0.0f ? z3 : false, j);
                f3 = 0.0f;
                f4 = 1.0f;
            }
            if (d <= f2 || e <= f2) {
                z2 = z;
                zc1VarArr = zc1VarArr2;
                rectF.setEmpty();
            } else {
                float a = zc1Var2.a();
                float L = gm.L(30.0f);
                float f9 = e / 2.0f;
                float f10 = f3;
                float i2 = Utilities.i(this.e, (getWidth() - gm.L(8.0f)) - f9, gm.L(8.0f) + f9);
                float f11 = L / 2.0f;
                z2 = z;
                float f12 = i2 + f9;
                zc1VarArr = zc1VarArr2;
                rectF.set(i2 - f9, a - f11, f12, a + f11);
                float R1 = gm.R1(0.8f, 1.0f, d) * zc1Var2.c.a(0.04f);
                canvas2.save();
                canvas2.scale(R1, R1, i2, a);
                int p1 = cmb.p1(d, -1946157056);
                Paint paint = this.b;
                paint.setColor(p1);
                canvas2.drawRoundRect(rectF, f11, f11, paint);
                int L2 = gm.L(14.0f);
                drawable.setAlpha((int) (217.0f * d));
                int i3 = 0;
                while (i3 < 2) {
                    int L3 = (int) (i3 == 0 ? rectF.left + gm.L(10.0f) : (rectF.right - gm.L(10.0f)) - L2);
                    int i4 = (int) (a - (L2 / 2.0f));
                    int i5 = L2;
                    drawable.setBounds(L3, i4, L3 + L2, i4 + i5);
                    drawable.draw(canvas2);
                    i3++;
                    L2 = i5;
                }
                canvas2.save();
                canvas2.clipRect(rectF.left + gm.L(24.0f), rectF.top, rectF.right - gm.L(24.0f), rectF.bottom);
                uib uibVar2 = zc1Var2.i;
                if (uibVar2 == null) {
                    zc1Var = zc1Var2;
                    f5 = 0.0f;
                } else if (f10 > 0.0f) {
                    zc1Var = zc1Var2;
                    f5 = 0.0f;
                    uibVar2.c(i2 - (uibVar2.j() / 2.0f), a, d * 0.85f * f10, -1, canvas);
                } else {
                    zc1Var = zc1Var2;
                    f5 = 0.0f;
                }
                uib uibVar3 = zc1Var.h;
                if (uibVar3 != null && f4 > f5) {
                    uibVar3.c(i2 - (uibVar3.j() / 2.0f), a, d * 0.85f * f4, -1, canvas);
                }
                canvas.restore();
                canvas.restore();
            }
            i++;
            canvas2 = canvas;
            z = z2;
            zc1VarArr2 = zc1VarArr;
            z3 = true;
            f6 = 1.0f;
        }
        zc1[] zc1VarArr3 = zc1VarArr2;
        if (z) {
            zc1 zc1Var3 = this.R;
            zc1 zc1Var4 = zc1VarArr3[zc1Var3 == zc1VarArr3[0] ? (char) 1 : (char) 0];
            a(canvas, 0, this.S, zc1Var3, 1.0f - f, this.w, this.x, this.y, c(f, 0.0f, 0.25f));
            a(canvas, 1, this.T, zc1Var4, f, this.K, this.L, this.M, 1.0f - c(f, 0.75f, 1.0f));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            for (zc1 zc1Var : this.a) {
                String str = zc1Var.g;
                zc1Var.g = null;
                zc1Var.h = null;
                zc1Var.b(str);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qac qacVar;
        if (motionEvent.getAction() == 0) {
            this.d = null;
            for (zc1 zc1Var : this.a) {
                if (zc1Var.h != null && zc1Var.f.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.d = zc1Var;
                    zc1Var.c.c(true);
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
                zc1 zc1Var2 = this.d;
                this.d = null;
                zc1Var2.c.c(false);
                if (motionEvent.getAction() == 1 && (qacVar = this.U) != null) {
                    qacVar.a(Integer.valueOf(zc1Var2.a));
                }
            }
            return true;
        }
        return false;
    }

    public void setOnClick(qac qacVar) {
        this.U = qacVar;
    }

    public void setOnSwitchProgress(qac qacVar) {
        this.V = qacVar;
    }
}
