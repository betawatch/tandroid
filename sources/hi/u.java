package hi;

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
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class u extends View {
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
    public t R;
    public String S;
    public String T;
    public w10 U;
    public w10 V;
    public final t[] a;
    public final Paint b;
    public final TextPaint c;
    public t d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public float y;

    public u(Context context) {
        super(context);
        this.a = new t[]{new t(this, -1), new t(this, 1)};
        this.b = new Paint(1);
        this.c = new TextPaint(1);
        this.s = 1.0f;
        this.E = Layout.Alignment.ALIGN_CENTER;
        this.F = -1;
        this.N = new StaticLayout[2];
        this.O = new String[2];
        this.P = new float[4];
    }

    public static float c(float f10, float f11, float f12) {
        return Utilities.i((f10 - f11) / (f12 - f11), 1.0f, 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (r9[r8 + 1] == r7.getTextSize()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, int i7, String str, t tVar, float f10, float f11, float f12, float f13, float f14) {
        if (TextUtils.isEmpty(str) || f14 <= 0.0f || f13 <= 0.0f) {
            return;
        }
        int r12 = org.telegram.ui.ActionBar.n6.r1(f14, this.F);
        TextPaint textPaint = this.c;
        textPaint.setColor(r12);
        float f15 = this.G;
        if (f15 > 0.0f) {
            textPaint.setShadowLayer(f15, this.H, this.I, org.telegram.ui.ActionBar.n6.r1(f14 * f14, this.J));
        } else {
            textPaint.clearShadowLayer();
        }
        int max = Math.max(1, (int) Math.ceil(f13));
        StaticLayout[] staticLayoutArr = this.N;
        StaticLayout staticLayout = staticLayoutArr[i7];
        float[] fArr = this.P;
        String[] strArr = this.O;
        if (staticLayout != null && str.equals(strArr[i7])) {
            int i10 = i7 * 2;
            if (fArr[i10] == max) {
            }
        }
        strArr[i7] = str;
        int i11 = i7 * 2;
        fArr[i11] = max;
        fArr[i11 + 1] = textPaint.getTextSize();
        staticLayoutArr[i7] = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, max).setAlignment(this.E).setBreakStrategy(0).setHyphenationFrequency(0).setIncludePad(true).setMaxLines(3).build();
        StaticLayout staticLayout2 = staticLayoutArr[i7];
        float N = org.telegram.messenger.g0.N(14.0f) / Math.max(1.0f, textPaint.getTextSize());
        float f16 = (-staticLayout2.getWidth()) / 2.0f;
        float f17 = (-staticLayout2.getHeight()) / 2.0f;
        float T1 = org.telegram.messenger.g0.T1(this.s, N, f10);
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.T1(this.e, tVar.f.isEmpty() ? this.e : tVar.f.centerX(), f10), org.telegram.messenger.g0.T1(this.f, tVar.a(), f10));
        canvas.rotate(org.telegram.messenger.g0.T1(this.r, 0.0f, f10));
        canvas.scale(T1, T1);
        canvas.translate(org.telegram.messenger.g0.T1(f11, f16, f10), org.telegram.messenger.g0.T1(f12, f17, f10));
        staticLayout2.draw(canvas);
        canvas.restore();
    }

    public final void b() {
        if (this.R == null) {
            return;
        }
        this.R = null;
        for (t tVar : this.a) {
            tVar.i = null;
            org.telegram.ui.Components.c6 c6Var = tVar.e;
            wy0 wy0Var = tVar.h;
            c6Var.e(true, wy0Var == null ? 0.0f : wy0Var.k() + org.telegram.messenger.g0.L(31.0f) + org.telegram.messenger.g0.L(31.0f));
        }
        w10 w10Var = this.V;
        if (w10Var != null) {
            w10Var.a(Float.valueOf(1.0f));
        }
        invalidate();
    }

    public final void d(float f10, float f11, float f12, float f13, float f14, float f15, TextPaint textPaint, int i7, float f16, float f17, float f18, Layout.Alignment alignment) {
        boolean z10 = (this.e == f10 && this.f == f11 && this.h == f12 && this.n == f13) ? false : true;
        this.e = f10;
        this.f = f11;
        this.h = f12;
        this.n = f13;
        this.r = f14;
        this.s = f15;
        this.w = f16;
        this.x = f17;
        this.y = f18;
        if (alignment != null && alignment != this.E) {
            this.E = alignment;
            StaticLayout[] staticLayoutArr = this.N;
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.F = i7;
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
        if (z10 || this.R != null) {
            invalidate();
        }
    }

    public final void e(CharSequence charSequence, CharSequence charSequence2) {
        if (this.R != null) {
            return;
        }
        t[] tVarArr = this.a;
        tVarArr[0].b(charSequence == null ? null : charSequence.toString());
        tVarArr[1].b(charSequence2 != null ? charSequence2.toString() : null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        float e10;
        float f12;
        float f13;
        boolean z11;
        t[] tVarArr;
        t tVar;
        float f14;
        float c10;
        Canvas canvas2 = canvas;
        boolean z12 = true;
        boolean z13 = this.R != null;
        float f15 = 1.0f;
        if (z13) {
            float elapsedRealtime = (SystemClock.elapsedRealtime() - this.Q) / 320.0f;
            if (elapsedRealtime >= 1.0f) {
                b();
                f10 = 1.0f;
                z10 = false;
            } else {
                float interpolation = kr.h.getInterpolation(elapsedRealtime);
                w10 w10Var = this.V;
                if (w10Var != null) {
                    w10Var.a(Float.valueOf(interpolation));
                }
                invalidate();
                z10 = z13;
                f10 = interpolation;
            }
        } else {
            z10 = z13;
            f10 = 1.0f;
        }
        t[] tVarArr2 = this.a;
        int length = tVarArr2.length;
        int i7 = 0;
        while (i7 < length) {
            t tVar2 = tVarArr2[i7];
            org.telegram.ui.Components.c6 c6Var = tVar2.d;
            org.telegram.ui.Components.c6 c6Var2 = tVar2.e;
            Drawable drawable = tVar2.b;
            RectF rectF = tVar2.f;
            float f16 = f15;
            float d = c6Var.d(tVar2.h != null ? z12 : false);
            wy0 wy0Var = tVar2.h;
            float k10 = wy0Var == null ? 0.0f : wy0Var.k() + org.telegram.messenger.g0.L(31.0f) + org.telegram.messenger.g0.L(31.0f);
            if (z10) {
                float f17 = tVar2.k ? tVar2.j : k10;
                if (tVar2.h == null) {
                    k10 = tVar2.j;
                }
                e10 = org.telegram.messenger.g0.T1(f17, k10, f10);
                c6Var2.e(z12, e10);
                if (tVar2 == this.R) {
                    f11 = 0.0f;
                    c10 = f16 - c(f10, 0.0f, 0.25f);
                    f13 = c(f10, 0.5f, f16);
                } else {
                    f11 = 0.0f;
                    c10 = f16 - c(f10, 0.0f, 0.4f);
                    f13 = c(f10, 0.75f, f16);
                }
                f12 = c10;
            } else {
                f11 = 0.0f;
                e10 = c6Var2.e(d <= 0.0f ? z12 : false, k10);
                f12 = 0.0f;
                f13 = 1.0f;
            }
            if (d <= f11 || e10 <= f11) {
                z11 = z10;
                tVarArr = tVarArr2;
                rectF.setEmpty();
            } else {
                float a10 = tVar2.a();
                float L = org.telegram.messenger.g0.L(30.0f);
                float f18 = e10 / 2.0f;
                float f19 = f12;
                float i10 = Utilities.i(this.e, (getWidth() - org.telegram.messenger.g0.L(8.0f)) - f18, org.telegram.messenger.g0.L(8.0f) + f18);
                float f20 = L / 2.0f;
                z11 = z10;
                float f21 = i10 + f18;
                tVarArr = tVarArr2;
                rectF.set(i10 - f18, a10 - f20, f21, a10 + f20);
                float T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, d) * tVar2.c.a(0.04f);
                canvas2.save();
                canvas2.scale(T1, T1, i10, a10);
                int r12 = org.telegram.ui.ActionBar.n6.r1(d, -1946157056);
                Paint paint = this.b;
                paint.setColor(r12);
                canvas2.drawRoundRect(rectF, f20, f20, paint);
                int L2 = org.telegram.messenger.g0.L(14.0f);
                drawable.setAlpha((int) (217.0f * d));
                int i11 = 0;
                while (i11 < 2) {
                    int L3 = (int) (i11 == 0 ? rectF.left + org.telegram.messenger.g0.L(10.0f) : (rectF.right - org.telegram.messenger.g0.L(10.0f)) - L2);
                    int i12 = (int) (a10 - (L2 / 2.0f));
                    int i13 = L2;
                    drawable.setBounds(L3, i12, L3 + L2, i12 + i13);
                    drawable.draw(canvas2);
                    i11++;
                    L2 = i13;
                }
                canvas2.save();
                canvas2.clipRect(rectF.left + org.telegram.messenger.g0.L(24.0f), rectF.top, rectF.right - org.telegram.messenger.g0.L(24.0f), rectF.bottom);
                wy0 wy0Var2 = tVar2.i;
                if (wy0Var2 == null) {
                    tVar = tVar2;
                    f14 = 0.0f;
                } else if (f19 > 0.0f) {
                    tVar = tVar2;
                    f14 = 0.0f;
                    wy0Var2.c(i10 - (wy0Var2.k() / 2.0f), a10, d * 0.85f * f19, -1, canvas);
                } else {
                    tVar = tVar2;
                    f14 = 0.0f;
                }
                wy0 wy0Var3 = tVar.h;
                if (wy0Var3 != null && f13 > f14) {
                    wy0Var3.c(i10 - (wy0Var3.k() / 2.0f), a10, d * 0.85f * f13, -1, canvas);
                }
                canvas.restore();
                canvas.restore();
            }
            i7++;
            canvas2 = canvas;
            z10 = z11;
            tVarArr2 = tVarArr;
            z12 = true;
            f15 = 1.0f;
        }
        t[] tVarArr3 = tVarArr2;
        if (z10) {
            t tVar3 = this.R;
            t tVar4 = tVarArr3[tVar3 == tVarArr3[0] ? (char) 1 : (char) 0];
            a(canvas, 0, this.S, tVar3, 1.0f - f10, this.w, this.x, this.y, c(f10, 0.0f, 0.25f));
            a(canvas, 1, this.T, tVar4, f10, this.K, this.L, this.M, 1.0f - c(f10, 0.75f, 1.0f));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 == i11) {
            return;
        }
        for (t tVar : this.a) {
            String str = tVar.g;
            tVar.g = null;
            tVar.h = null;
            tVar.b(str);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        w10 w10Var;
        if (motionEvent.getAction() == 0) {
            this.d = null;
            for (t tVar : this.a) {
                if (tVar.h != null && tVar.f.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.d = tVar;
                    tVar.c.c(true);
                    return true;
                }
            }
            return false;
        }
        if (this.d == null) {
            return false;
        }
        if (motionEvent.getAction() == 2) {
            if (!this.d.f.contains(motionEvent.getX(), motionEvent.getY())) {
                this.d.c.c(false);
                this.d = null;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            t tVar2 = this.d;
            this.d = null;
            tVar2.c.c(false);
            if (motionEvent.getAction() == 1 && (w10Var = this.U) != null) {
                w10Var.a(Integer.valueOf(tVar2.a));
            }
        }
        return true;
    }

    public void setOnClick(w10 w10Var) {
        this.U = w10Var;
    }

    public void setOnSwitchProgress(w10 w10Var) {
        this.V = w10Var;
    }
}
