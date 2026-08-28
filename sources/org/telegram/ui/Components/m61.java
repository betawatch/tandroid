package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m61 {
    public static Paint Q;
    public static Paint R;
    public static int S;
    public static float[] T;
    public static Path U;
    public int A;
    public final y5 D;
    public float E;
    public ArrayList F;
    public CharSequence G;
    public long H;
    public StaticLayout[] K;
    public TextPaint L;
    public int N;
    public long O;
    public float a;
    public int h;
    public int i;
    public l61 j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float p;
    public boolean q;
    public float s;
    public float t;
    public long u;
    public final View v;
    public float y;
    public int z;
    public int b = 0;
    public float c = 0.0f;
    public int d = 0;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public final RectF o = new RectF();
    public float r = 1.0f;
    public final int w = AndroidUtilities.dp(4.0f);
    public final int x = AndroidUtilities.dp(2.0f);
    public int B = 0;
    public float C = 1.0f;
    public float I = 0.0f;
    public int J = -1;
    public float M = 1.0f;
    public float P = -1.0f;

    public m61(View view) {
        if (Q == null) {
            Q = new Paint(1);
            Paint paint = new Paint(1);
            R = paint;
            paint.setStyle(Paint.Style.STROKE);
            R.setColor(-16777216);
            R.setStrokeWidth(1.0f);
        }
        this.v = view;
        S = AndroidUtilities.dp(24.0f);
        this.t = AndroidUtilities.dp(6.0f);
        this.D = new y5(0.0f, view, 0L, 300L, gr.h);
    }

    public static void g(float f10, int i9) {
        if (f10 < 1.0f) {
            i9 = i0.a.k(i9, (int) (Color.alpha(i9) * f10));
        }
        Q.setColor(i9);
    }

    public final void a(Canvas canvas, View view) {
        float f10;
        View view2;
        char c10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i9;
        char c11;
        float lerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, this.y) + this.z;
        RectF rectF = this.o;
        rectF.left = lerp;
        int i10 = this.i;
        int i11 = this.w;
        rectF.top = AndroidUtilities.lerp((i10 - i11) / 2.0f, (i10 - AndroidUtilities.dp(3.0f)) - this.x, this.y);
        int i12 = this.i;
        rectF.bottom = AndroidUtilities.lerp((i12 + i11) / 2.0f, i12 - AndroidUtilities.dp(3.0f), this.y);
        float f15 = this.b;
        float min = Math.min(this.c, f15);
        this.c = min;
        float lerp2 = AndroidUtilities.lerp(min, f15, 0.5f);
        this.c = lerp2;
        float abs = Math.abs(f15 - lerp2);
        View view3 = this.v;
        if (abs > 0.005f) {
            view3.invalidate();
        }
        float f16 = this.c;
        float f17 = this.C;
        if (f17 != 1.0f) {
            float f18 = f17 + 0.07272727f;
            this.C = f18;
            if (f18 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = gr.f.getInterpolation(this.C);
                f16 = (f16 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float d = this.D.d(0.0f, false);
        if (this.f) {
            d = 0.0f;
        }
        rectF.right = AndroidUtilities.lerp(this.h - (S / 2.0f), view3.getWidth() - (this.z * 2.0f), this.y) + this.z;
        g(1.0f - this.y, this.k);
        b(canvas, rectF, Q);
        float f19 = this.r;
        if (f19 != 1.0f) {
            float f20 = f19 + 0.16f;
            this.r = f20;
            if (f20 > 1.0f) {
                this.r = 1.0f;
            } else {
                view3.invalidate();
            }
        }
        if (this.q) {
            float f21 = this.p;
            if (f21 > 0.0f) {
                f10 = 2.0f;
                rectF.right = AndroidUtilities.lerp((f21 * (this.h - r14)) + (S / 2.0f), view3.getWidth() - (this.z * 2.0f), this.y) + this.z;
                g((1.0f - this.r) * (1.0f - this.y), this.l);
                b(canvas, rectF, Q);
            } else {
                f10 = 2.0f;
            }
            float f22 = this.s;
            if (f22 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f22 * (this.h - r13)) + (S / f10), view3.getWidth() - (this.z * f10), this.y) + this.z;
                g(1.0f - this.y, this.l);
                b(canvas, rectF, Q);
            }
        } else {
            f10 = 2.0f;
            float f23 = this.p;
            float f24 = this.r;
            float f25 = (this.s * f24) + ((1.0f - f24) * f23);
            if (f25 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f25 * (this.h - r13)) + (S / 2.0f), view3.getWidth() - (this.z * 2.0f), this.y) + this.z;
                g(1.0f - this.y, this.l);
                b(canvas, rectF, Q);
            }
        }
        float dp = AndroidUtilities.dp(this.f ? 8.0f : 6.0f);
        if (this.t != dp) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            view2 = view3;
            long j10 = elapsedRealtime - this.u;
            this.u = elapsedRealtime;
            if (j10 > 18) {
                j10 = 16;
            }
            float f26 = this.t;
            if (f26 < dp) {
                c10 = 0;
                float b10 = org.telegram.ui.Cells.j2.b(j10, 60.0f, AndroidUtilities.dp(1.0f), f26);
                this.t = b10;
                if (b10 > dp) {
                    this.t = dp;
                }
            } else {
                c10 = 0;
                float c12 = org.telegram.messenger.ll.c(j10, 60.0f, AndroidUtilities.dp(1.0f), f26);
                this.t = c12;
                if (c12 < dp) {
                    this.t = dp;
                }
            }
            view2.invalidate();
        } else {
            view2 = view3;
            c10 = 0;
        }
        float lerp3 = AndroidUtilities.lerp(this.t, 0.0f, this.y);
        if (d > 0.0f) {
            float f27 = rectF.left;
            f11 = 0.2f;
            f12 = 8.0f;
            float lerp4 = AndroidUtilities.lerp((S / f10) + (this.h - r14), view2.getWidth() - (this.z * f10), this.y) + this.z;
            rectF.right = lerp4;
            rectF.left = AndroidUtilities.lerp(f27, lerp4, 1.0f - d);
            if (this.y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, i0.a.d(this.y, this.n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f27;
            g(1.0f - this.y, i0.a.d(this.y, this.m, c() == 0.0f ? 0 : this.A));
            canvas.drawCircle(AndroidUtilities.lerp((S / f10) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.z * f10)), this.y) + this.z, rectF.centerY(), lerp3 * d, Q);
        } else {
            f11 = 0.2f;
            f12 = 8.0f;
        }
        float f28 = this.z;
        float f29 = S / f10;
        if (this.f) {
            f16 = this.d;
        }
        rectF.right = AndroidUtilities.lerp(f29 + f16, c() * (view2.getWidth() - (this.z * f10)), this.y) + f28;
        if (this.y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.y * 255.0f * f11));
            b(canvas, rectF, R);
        }
        g(1.0f, i0.a.d(this.y, this.n, this.A));
        b(canvas, rectF, Q);
        g(1.0f - this.y, i0.a.d(this.y, this.m, c() == 0.0f ? 0 : this.A));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - d) * lerp3, Q);
        ArrayList arrayList = this.F;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float f30 = ((this.f || this.g) ? this.d : this.c) / (this.h - S);
        int size = this.F.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((Float) ((Pair) this.F.get(size)).first).floatValue() - 0.001f <= f30) {
                break;
            } else {
                size--;
            }
        }
        if (this.K == null) {
            this.K = new StaticLayout[2];
        }
        float lerp5 = AndroidUtilities.lerp(S / f10, 0.0f, this.y) + this.z;
        float lerp6 = AndroidUtilities.lerp(this.h - (S / f10), view2.getWidth() - (this.z * f10), this.y) + this.z;
        float f31 = (this.h - (S / f10)) + this.z;
        float abs2 = Math.abs(lerp5 - f31) - AndroidUtilities.dp(16.0f);
        float f32 = this.P;
        if (f32 <= 0.0f || Math.abs(f32 - abs2) <= 0.01f) {
            f13 = 3.0f;
            f14 = 16.0f;
        } else {
            StaticLayout[] staticLayoutArr = this.K;
            StaticLayout staticLayout = staticLayoutArr[c10];
            if (staticLayout != null) {
                f14 = 16.0f;
                CharSequence text = staticLayout.getText();
                f13 = 3.0f;
                staticLayoutArr[c10] = d((int) abs2, text);
            } else {
                f13 = 3.0f;
                f14 = 16.0f;
            }
            StaticLayout[] staticLayoutArr2 = this.K;
            StaticLayout staticLayout2 = staticLayoutArr2[1];
            if (staticLayout2 != null) {
                staticLayoutArr2[1] = d((int) abs2, staticLayout2.getText());
            }
        }
        this.P = abs2;
        if (size != this.J) {
            StaticLayout[] staticLayoutArr3 = this.K;
            staticLayoutArr3[1] = staticLayoutArr3[c10];
            if (this.f) {
                AndroidUtilities.vibrateCursor(view2);
            }
            if (size < 0 || size >= this.F.size()) {
                this.K[c10] = null;
            } else {
                CharSequence charSequence = (CharSequence) ((Pair) this.F.get(size)).second;
                if (charSequence == null) {
                    this.K[c10] = null;
                } else {
                    this.K[c10] = d((int) abs2, charSequence);
                }
            }
            this.M = 0.0f;
            if (size == -1) {
                this.N = -1;
            } else {
                int i13 = this.J;
                if (i13 == -1) {
                    this.N = 1;
                } else if (size < i13) {
                    this.N = -1;
                } else if (size > i13) {
                    this.N = 1;
                }
            }
            this.J = size;
        }
        if (this.M < 1.0f) {
            i9 = i11;
            c11 = 1;
            this.M = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O)) / (this.F.size() > 8 ? 160.0f : 220.0f)) + this.M, 1.0f);
            view2.invalidate();
            this.O = SystemClock.elapsedRealtime();
        } else {
            i9 = i11;
            c11 = 1;
        }
        if (this.I < 1.0f) {
            this.I = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O)) / 200.0f) + this.I, 1.0f);
            view2.invalidate();
            SystemClock.elapsedRealtime();
        }
        float interpolation2 = gr.f.getInterpolation(this.M);
        canvas.save();
        int i14 = this.i;
        canvas.translate(((lerp6 - f31) * this.y) + lerp5, AndroidUtilities.lerp((i14 + i9) / f10, i14 - AndroidUtilities.dp(f13), this.y) + AndroidUtilities.dp(12.0f));
        if (this.K[c11] != null) {
            canvas.save();
            if (this.N != 0) {
                canvas.translate((AndroidUtilities.dp(f14) * (-this.N) * interpolation2) + AndroidUtilities.dp(f12), 0.0f);
            }
            canvas.translate(0.0f, (-this.K[c11].getHeight()) / f10);
            this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.y) * 255.0f * this.I));
            this.K[c11].draw(canvas);
            canvas.restore();
        }
        if (this.K[c10] != null) {
            canvas.save();
            if (this.N != 0) {
                canvas.translate(e2.c.z(1.0f, interpolation2, AndroidUtilities.dp(f14) * this.N, AndroidUtilities.dp(f12)), 0.0f);
            }
            canvas.translate(0.0f, (-this.K[c10].getHeight()) / f10);
            this.L.setAlpha((int) (org.telegram.messenger.l0.y(1.0f, this.y, 255.0f, interpolation2) * this.I));
            this.K[c10].draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a1, code lost:
    
        if (r12.left >= r27.left) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020a A[EDGE_INSN: B:70:0x020a->B:71:0x020a BREAK  A[LOOP:2: B:28:0x00d9->B:75:0x0200], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0200 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, RectF rectF, Paint paint) {
        int i9;
        char c10;
        float floatValue;
        char c11;
        m61 m61Var = this;
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(2, 1, m61Var.y));
        ArrayList arrayList = m61Var.F;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, dp, dp, paint);
            return;
        }
        float f10 = rectF.bottom;
        float lerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, m61Var.y) + m61Var.z;
        float lerp2 = AndroidUtilities.lerp(m61Var.h - (S / 2.0f), m61Var.v.getWidth() - (m61Var.z * 2.0f), m61Var.y) + m61Var.z;
        AndroidUtilities.rectTmp.set(rectF);
        float dp2 = AndroidUtilities.dp(m61Var.I * 1.0f) / 2.0f;
        if (U == null) {
            U = new Path();
        }
        U.reset();
        float dp3 = AndroidUtilities.dp(4.0f) / (lerp2 - lerp);
        int i10 = 0;
        while (true) {
            i9 = -1;
            if (i10 >= m61Var.F.size()) {
                i10 = -1;
                break;
            } else if (((Float) ((Pair) m61Var.F.get(i10)).first).floatValue() >= dp3) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int size = m61Var.F.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) m61Var.F.get(size)).first).floatValue() >= dp3) {
                i9 = size + 1;
                break;
            }
            size--;
        }
        if (i9 < 0) {
            i9 = m61Var.F.size();
        }
        int i11 = i9;
        int i12 = i10;
        while (i12 <= i11) {
            if (i12 == i10) {
                floatValue = 0.0f;
                c10 = 1;
            } else {
                c10 = 1;
                floatValue = ((Float) ((Pair) m61Var.F.get(i12 - 1)).first).floatValue();
            }
            float floatValue2 = i12 == i11 ? 1.0f : ((Float) ((Pair) m61Var.F.get(i12)).first).floatValue();
            while (i12 != i11 && i12 != 0 && i12 < m61Var.F.size() - 1 && ((Float) ((Pair) m61Var.F.get(i12)).first).floatValue() - floatValue <= dp3) {
                i12++;
                floatValue2 = ((Float) ((Pair) m61Var.F.get(i12)).first).floatValue();
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(lerp, lerp2, floatValue) + (i12 > 0 ? dp2 : 0.0f);
            float lerp3 = AndroidUtilities.lerp(lerp, lerp2, floatValue2) - (i12 < i11 ? dp2 : 0.0f);
            rectF2.right = lerp3;
            float f11 = rectF.right;
            boolean z10 = lerp3 > f11;
            if (z10) {
                rectF2.right = f11;
            }
            float f12 = rectF2.right;
            float f13 = rectF.left;
            if (f12 >= f13) {
                if (rectF2.left < f13) {
                    rectF2.left = f13;
                }
                if (T == null) {
                    T = new float[8];
                }
                if (i12 != i10) {
                    if (z10) {
                        c11 = 4;
                    } else {
                        c11 = 4;
                    }
                    if (i12 >= i11) {
                        float[] fArr = T;
                        float f14 = 0.7f * dp * m61Var.I;
                        fArr[7] = f14;
                        fArr[6] = f14;
                        fArr[c10] = f14;
                        fArr[0] = f14;
                        fArr[5] = dp;
                        fArr[c11] = dp;
                        fArr[3] = dp;
                        fArr[2] = dp;
                    } else {
                        float[] fArr2 = T;
                        float f15 = 0.7f * dp * m61Var.I;
                        fArr2[5] = f15;
                        fArr2[c11] = f15;
                        fArr2[3] = f15;
                        fArr2[2] = f15;
                        fArr2[7] = f15;
                        fArr2[6] = f15;
                        fArr2[c10] = f15;
                        fArr2[0] = f15;
                    }
                    U.addRoundRect(rectF2, T, Path.Direction.CW);
                    if (!z10) {
                        break;
                    }
                } else {
                    c11 = 4;
                }
                float[] fArr3 = T;
                fArr3[7] = dp;
                fArr3[6] = dp;
                fArr3[c10] = dp;
                fArr3[0] = dp;
                float f16 = 0.7f * dp * m61Var.I;
                fArr3[5] = f16;
                fArr3[c11] = f16;
                fArr3[3] = f16;
                fArr3[2] = f16;
                U.addRoundRect(rectF2, T, Path.Direction.CW);
                if (!z10) {
                }
            }
            i12++;
            m61Var = this;
        }
        canvas.drawPath(U, paint);
    }

    public final float c() {
        return this.b / (this.h - S);
    }

    public final StaticLayout d(int i9, CharSequence charSequence) {
        if (this.L == null) {
            TextPaint textPaint = new TextPaint(1);
            this.L = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.L.setColor(-1);
        }
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.L, i9).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i9)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.L, i9, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i9));
    }

    public final boolean e(float f10, float f11, int i9) {
        l61 l61Var;
        if (i9 == 0) {
            if (this.y <= 0.0f) {
                int i10 = this.i;
                int i11 = S;
                int i12 = (i10 - i11) / 2;
                if (f10 >= (-i12)) {
                    int i13 = this.h;
                    if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                        int i14 = this.b;
                        if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                            int i15 = ((int) f10) - (i11 / 2);
                            this.b = i15;
                            if (i15 < 0) {
                                this.b = 0;
                            } else if (i15 > i13 - i11) {
                                this.b = i11 - i13;
                            }
                            this.c = this.b;
                        }
                        this.g = true;
                        this.f = true;
                        int i16 = this.b;
                        this.d = i16;
                        this.e = (int) (f10 - i16);
                        return true;
                    }
                }
            }
        } else if (i9 == 1 || i9 == 3) {
            if (this.f) {
                int i17 = this.d;
                this.b = i17;
                float f12 = i17;
                this.c = f12;
                if (i9 == 1 && (l61Var = this.j) != null) {
                    l61Var.b(f12 / (this.h - S));
                }
                this.f = false;
                AndroidUtilities.runOnUIThread(new b61(this, 2), 50L);
                return true;
            }
        } else if (i9 == 2 && this.f) {
            int i18 = (int) (f10 - this.e);
            this.d = i18;
            if (i18 < 0) {
                this.d = 0;
            } else {
                int i19 = this.h - S;
                if (i18 > i19) {
                    this.d = i19;
                }
            }
            l61 l61Var2 = this.j;
            if (l61Var2 != null) {
                l61Var2.e(this.d / (this.h - S));
            }
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        float f11 = this.s;
        if (f10 != f11) {
            this.p = f11;
            this.q = f10 < f11;
            this.s = f10;
            this.r = 0.0f;
        }
    }

    public final void h(float f10, boolean z10) {
        if (Math.abs(this.a - 1.0f) < 0.04f && Math.abs(f10) < 0.04f) {
            this.D.d(1.0f, true);
            this.E = this.b;
        }
        this.a = f10;
        int ceil = (int) Math.ceil((this.h - S) * f10);
        if (z10) {
            if (Math.abs(ceil - this.b) > AndroidUtilities.dp(10.0f)) {
                float interpolation = gr.f.getInterpolation(this.C);
                this.B = (int) e2.c.z(1.0f, interpolation, this.B, this.b * interpolation);
                this.C = 0.0f;
            } else if (this.C == 1.0f) {
                this.C = 0.0f;
                this.B = this.b;
            }
        }
        this.b = ceil;
        if (ceil < 0) {
            this.b = 0;
        } else {
            int i9 = this.h - S;
            if (ceil > i9) {
                this.b = i9;
            }
        }
        if (Math.abs(this.c - this.b) > AndroidUtilities.dp(8.0f)) {
            this.c = this.b;
        }
    }
}
