package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class v51 {
    public static Paint Q;
    public static Paint R;
    public static int S;
    public static float[] T;
    public static Path U;
    public int A;
    public final w5 D;
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
    public u51 j;
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
    public final int w = org.telegram.messenger.g0.L(4.0f);
    public final int x = org.telegram.messenger.g0.L(2.0f);
    public int B = 0;
    public float C = 1.0f;
    public float I = 0.0f;
    public int J = -1;
    public float M = 1.0f;
    public float P = -1.0f;

    public v51(View view) {
        if (Q == null) {
            Q = new Paint(1);
            Paint paint = new Paint(1);
            R = paint;
            paint.setStyle(Paint.Style.STROKE);
            R.setColor(-16777216);
            R.setStrokeWidth(1.0f);
        }
        this.v = view;
        S = org.telegram.messenger.g0.L(24.0f);
        this.t = org.telegram.messenger.g0.L(6.0f);
        this.D = new w5(0.0f, view, 0L, 300L, xq.h);
    }

    public static void g(float f10, int i7) {
        if (f10 < 1.0f) {
            i7 = i0.a.o(i7, (int) (Color.alpha(i7) * f10));
        }
        Q.setColor(i7);
    }

    public final void a(Canvas canvas, View view) {
        float f10;
        float f11;
        float f12;
        int i7;
        float f13;
        float f14;
        float f15;
        float f16;
        char c10;
        int i10;
        float T1 = org.telegram.messenger.g0.T1(S / 2.0f, 0.0f, this.y) + this.z;
        RectF rectF = this.o;
        rectF.left = T1;
        int i11 = this.i;
        int i12 = this.w;
        rectF.top = org.telegram.messenger.g0.T1((i11 - i12) / 2.0f, (i11 - org.telegram.messenger.g0.L(3.0f)) - this.x, this.y);
        int i13 = this.i;
        rectF.bottom = org.telegram.messenger.g0.T1((i13 + i12) / 2.0f, i13 - org.telegram.messenger.g0.L(3.0f), this.y);
        float f17 = this.b;
        float min = Math.min(this.c, f17);
        this.c = min;
        float T12 = org.telegram.messenger.g0.T1(min, f17, 0.5f);
        this.c = T12;
        float abs = Math.abs(f17 - T12);
        View view2 = this.v;
        if (abs > 0.005f) {
            view2.invalidate();
        }
        float f18 = this.c;
        float f19 = this.C;
        if (f19 != 1.0f) {
            float f20 = f19 + 0.07272727f;
            this.C = f20;
            if (f20 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = xq.f.getInterpolation(this.C);
                f18 = (f18 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float e10 = this.D.e(false, 0.0f);
        if (this.f) {
            e10 = 0.0f;
        }
        rectF.right = org.telegram.messenger.g0.T1(this.h - (S / 2.0f), view2.getWidth() - (this.z * 2.0f), this.y) + this.z;
        g(1.0f - this.y, this.k);
        b(canvas, rectF, Q);
        float f21 = this.r;
        if (f21 != 1.0f) {
            float f22 = f21 + 0.16f;
            this.r = f22;
            if (f22 > 1.0f) {
                this.r = 1.0f;
            } else {
                view2.invalidate();
            }
        }
        if (this.q) {
            float f23 = this.p;
            if (f23 > 0.0f) {
                f10 = 2.0f;
                rectF.right = org.telegram.messenger.g0.T1((f23 * (this.h - r14)) + (S / 2.0f), view2.getWidth() - (this.z * 2.0f), this.y) + this.z;
                g((1.0f - this.r) * (1.0f - this.y), this.l);
                b(canvas, rectF, Q);
            } else {
                f10 = 2.0f;
            }
            float f24 = this.s;
            if (f24 > 0.0f) {
                rectF.right = org.telegram.messenger.g0.T1((f24 * (this.h - r13)) + (S / f10), view2.getWidth() - (this.z * f10), this.y) + this.z;
                g(1.0f - this.y, this.l);
                b(canvas, rectF, Q);
            }
        } else {
            f10 = 2.0f;
            float f25 = this.p;
            float f26 = this.r;
            float f27 = (this.s * f26) + ((1.0f - f26) * f25);
            if (f27 > 0.0f) {
                rectF.right = org.telegram.messenger.g0.T1((f27 * (this.h - r13)) + (S / 2.0f), view2.getWidth() - (this.z * 2.0f), this.y) + this.z;
                g(1.0f - this.y, this.l);
                b(canvas, rectF, Q);
            }
        }
        float L = org.telegram.messenger.g0.L(this.f ? 8.0f : 6.0f);
        if (this.t != L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f11 = 3.0f;
            f12 = e10;
            long j3 = elapsedRealtime - this.u;
            this.u = elapsedRealtime;
            if (j3 > 18) {
                j3 = 16;
            }
            float f28 = this.t;
            i7 = 0;
            if (f28 < L) {
                float c11 = com.google.android.recaptcha.internal.a.c(j3, 60.0f, org.telegram.messenger.g0.L(1.0f), f28);
                this.t = c11;
                if (c11 > L) {
                    this.t = L;
                }
            } else {
                float v = org.telegram.messenger.camera.q.v(j3, 60.0f, org.telegram.messenger.g0.L(1.0f), f28);
                this.t = v;
                if (v < L) {
                    this.t = L;
                }
            }
            view2.invalidate();
        } else {
            f11 = 3.0f;
            f12 = e10;
            i7 = 0;
        }
        float T13 = org.telegram.messenger.g0.T1(this.t, 0.0f, this.y);
        if (f12 > 0.0f) {
            float f29 = rectF.left;
            f13 = 0.2f;
            f14 = 8.0f;
            float T14 = org.telegram.messenger.g0.T1((S / f10) + (this.h - r14), view2.getWidth() - (this.z * f10), this.y) + this.z;
            rectF.right = T14;
            rectF.left = org.telegram.messenger.g0.T1(f29, T14, 1.0f - f12);
            if (this.y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, i0.a.f(this.y, this.n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f29;
            g(1.0f - this.y, i0.a.f(this.y, this.m, c() == 0.0f ? i7 : this.A));
            canvas.drawCircle(org.telegram.messenger.g0.T1((S / f10) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.z * f10)), this.y) + this.z, rectF.centerY(), T13 * f12, Q);
        } else {
            f13 = 0.2f;
            f14 = 8.0f;
        }
        float f30 = this.z;
        float f31 = S / f10;
        if (this.f) {
            f18 = this.d;
        }
        rectF.right = org.telegram.messenger.g0.T1(f31 + f18, c() * (view2.getWidth() - (this.z * f10)), this.y) + f30;
        if (this.y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.y * 255.0f * f13));
            b(canvas, rectF, R);
        }
        g(1.0f, i0.a.f(this.y, this.n, this.A));
        b(canvas, rectF, Q);
        g(1.0f - this.y, i0.a.f(this.y, this.m, c() == 0.0f ? i7 : this.A));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - f12) * T13, Q);
        ArrayList arrayList = this.F;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float f32 = ((this.f || this.g) ? this.d : this.c) / (this.h - S);
        int size = this.F.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((Float) ((Pair) this.F.get(size)).first).floatValue() - 0.001f <= f32) {
                break;
            } else {
                size--;
            }
        }
        if (this.K == null) {
            this.K = new StaticLayout[2];
        }
        float T15 = org.telegram.messenger.g0.T1(S / f10, 0.0f, this.y) + this.z;
        float T16 = org.telegram.messenger.g0.T1(this.h - (S / f10), view2.getWidth() - (this.z * f10), this.y) + this.z;
        float f33 = (this.h - (S / f10)) + this.z;
        float abs2 = Math.abs(T15 - f33) - org.telegram.messenger.g0.L(16.0f);
        float f34 = this.P;
        if (f34 <= 0.0f || Math.abs(f34 - abs2) <= 0.01f) {
            f15 = 255.0f;
            f16 = f11;
        } else {
            StaticLayout[] staticLayoutArr = this.K;
            StaticLayout staticLayout = staticLayoutArr[i7];
            if (staticLayout != null) {
                f16 = f11;
                CharSequence text = staticLayout.getText();
                f15 = 255.0f;
                staticLayoutArr[i7] = d((int) abs2, text);
            } else {
                f15 = 255.0f;
                f16 = f11;
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
            staticLayoutArr3[1] = staticLayoutArr3[i7];
            if (this.f) {
                org.telegram.messenger.g0.c4(view2);
            }
            if (size < 0 || size >= this.F.size()) {
                this.K[i7] = null;
            } else {
                CharSequence charSequence = (CharSequence) ((Pair) this.F.get(size)).second;
                if (charSequence == null) {
                    this.K[i7] = null;
                } else {
                    this.K[i7] = d((int) abs2, charSequence);
                }
            }
            this.M = 0.0f;
            if (size == -1) {
                this.N = -1;
            } else {
                int i14 = this.J;
                if (i14 == -1) {
                    this.N = 1;
                } else if (size < i14) {
                    this.N = -1;
                } else if (size > i14) {
                    this.N = 1;
                }
            }
            this.J = size;
        }
        if (this.M < 1.0f) {
            c10 = 1;
            i10 = i12;
            this.M = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O)) / (this.F.size() > 8 ? 160.0f : 220.0f)) + this.M, 1.0f);
            view2.invalidate();
            this.O = SystemClock.elapsedRealtime();
        } else {
            c10 = 1;
            i10 = i12;
        }
        if (this.I < 1.0f) {
            this.I = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O)) / 200.0f) + this.I, 1.0f);
            view2.invalidate();
            SystemClock.elapsedRealtime();
        }
        float interpolation2 = xq.f.getInterpolation(this.M);
        canvas.save();
        int i15 = this.i;
        canvas.translate(((T16 - f33) * this.y) + T15, org.telegram.messenger.g0.T1((i15 + i10) / f10, i15 - org.telegram.messenger.g0.L(f16), this.y) + org.telegram.messenger.g0.L(12.0f));
        if (this.K[c10] != null) {
            canvas.save();
            if (this.N != 0) {
                canvas.translate((org.telegram.messenger.g0.L(16.0f) * (-this.N) * interpolation2) + org.telegram.messenger.g0.L(f14), 0.0f);
            }
            canvas.translate(0.0f, (-this.K[c10].getHeight()) / f10);
            this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.y) * f15 * this.I));
            this.K[c10].draw(canvas);
            canvas.restore();
        }
        if (this.K[i7] != null) {
            canvas.save();
            if (this.N != 0) {
                canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, interpolation2, org.telegram.messenger.g0.L(16.0f) * this.N, org.telegram.messenger.g0.L(f14)), 0.0f);
            }
            canvas.translate(0.0f, (-this.K[i7].getHeight()) / f10);
            this.L.setAlpha((int) (org.telegram.messenger.k5.A(1.0f, this.y, f15, interpolation2) * this.I));
            this.K[i7].draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x019f, code lost:
    
        if (r12.left >= r27.left) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0209 A[EDGE_INSN: B:71:0x0209->B:72:0x0209 BREAK  A[LOOP:2: B:28:0x00d9->B:76:0x01fe], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fe A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, RectF rectF, Paint paint) {
        int i7;
        char c10;
        char c11;
        v51 v51Var = this;
        char c12 = 2;
        boolean z9 = true;
        float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(v51Var.y, 2, 1));
        ArrayList arrayList = v51Var.F;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, L, L, paint);
            return;
        }
        float f10 = rectF.bottom;
        float f11 = 0.0f;
        float T1 = org.telegram.messenger.g0.T1(S / 2.0f, 0.0f, v51Var.y) + v51Var.z;
        float T12 = org.telegram.messenger.g0.T1(v51Var.h - (S / 2.0f), v51Var.v.getWidth() - (v51Var.z * 2.0f), v51Var.y) + v51Var.z;
        org.telegram.messenger.g0.P.set(rectF);
        float f12 = 1.0f;
        float L2 = org.telegram.messenger.g0.L(v51Var.I * 1.0f) / 2.0f;
        if (U == null) {
            U = new Path();
        }
        U.reset();
        float L3 = org.telegram.messenger.g0.L(4.0f) / (T12 - T1);
        int i10 = 0;
        while (true) {
            i7 = -1;
            if (i10 >= v51Var.F.size()) {
                i10 = -1;
                break;
            } else if (((Float) ((Pair) v51Var.F.get(i10)).first).floatValue() >= L3) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int size = v51Var.F.size() - 1;
        while (true) {
            c10 = c12;
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) v51Var.F.get(size)).first).floatValue() >= L3) {
                i7 = size + 1;
                break;
            } else {
                size--;
                c12 = c10;
            }
        }
        if (i7 < 0) {
            i7 = v51Var.F.size();
        }
        int i11 = i7;
        int i12 = i10;
        while (i12 <= i11) {
            boolean z10 = z9;
            float floatValue = i12 == i10 ? f11 : ((Float) ((Pair) v51Var.F.get(i12 - 1)).first).floatValue();
            float floatValue2 = i12 == i11 ? f12 : ((Float) ((Pair) v51Var.F.get(i12)).first).floatValue();
            while (i12 != i11 && i12 != 0 && i12 < v51Var.F.size() - 1 && ((Float) ((Pair) v51Var.F.get(i12)).first).floatValue() - floatValue <= L3) {
                i12++;
                floatValue2 = ((Float) ((Pair) v51Var.F.get(i12)).first).floatValue();
            }
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.left = org.telegram.messenger.g0.T1(T1, T12, floatValue) + (i12 > 0 ? L2 : 0.0f);
            float T13 = org.telegram.messenger.g0.T1(T1, T12, floatValue2) - (i12 < i11 ? L2 : 0.0f);
            rectF2.right = T13;
            float f13 = rectF.right;
            boolean z11 = T13 > f13 ? z10 ? 1 : 0 : false;
            if (z11) {
                rectF2.right = f13;
            }
            float f14 = rectF2.right;
            float f15 = rectF.left;
            if (f14 >= f15) {
                if (rectF2.left < f15) {
                    rectF2.left = f15;
                }
                if (T == null) {
                    T = new float[8];
                }
                if (i12 != i10) {
                    if (z11) {
                        c11 = 4;
                    } else {
                        c11 = 4;
                    }
                    if (i12 >= i11) {
                        float[] fArr = T;
                        float f16 = 0.7f * L * v51Var.I;
                        fArr[7] = f16;
                        fArr[6] = f16;
                        fArr[z10 ? 1 : 0] = f16;
                        fArr[0] = f16;
                        fArr[5] = L;
                        fArr[c11] = L;
                        fArr[3] = L;
                        fArr[c10] = L;
                    } else {
                        float[] fArr2 = T;
                        float f17 = 0.7f * L * v51Var.I;
                        fArr2[5] = f17;
                        fArr2[c11] = f17;
                        fArr2[3] = f17;
                        fArr2[c10] = f17;
                        fArr2[7] = f17;
                        fArr2[6] = f17;
                        fArr2[z10 ? 1 : 0] = f17;
                        fArr2[0] = f17;
                    }
                    U.addRoundRect(rectF2, T, Path.Direction.CW);
                    if (!z11) {
                        break;
                    }
                } else {
                    c11 = 4;
                }
                float[] fArr3 = T;
                fArr3[7] = L;
                fArr3[6] = L;
                fArr3[z10 ? 1 : 0] = L;
                fArr3[0] = L;
                float f18 = 0.7f * L * v51Var.I;
                fArr3[5] = f18;
                fArr3[c11] = f18;
                fArr3[3] = f18;
                fArr3[c10] = f18;
                U.addRoundRect(rectF2, T, Path.Direction.CW);
                if (!z11) {
                }
            }
            i12++;
            f11 = 0.0f;
            f12 = 1.0f;
            v51Var = this;
            z9 = z10 ? 1 : 0;
        }
        canvas.drawPath(U, paint);
    }

    public final float c() {
        return this.b / (this.h - S);
    }

    public final StaticLayout d(int i7, CharSequence charSequence) {
        if (this.L == null) {
            TextPaint textPaint = new TextPaint(1);
            this.L = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            this.L.setColor(-1);
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.L, i7).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(org.telegram.messenger.g0.L(400.0f), i7)).build();
    }

    public final boolean e(float f10, float f11, int i7) {
        u51 u51Var;
        if (i7 == 0) {
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
        } else if (i7 == 1 || i7 == 3) {
            if (this.f) {
                int i17 = this.d;
                this.b = i17;
                float f12 = i17;
                this.c = f12;
                if (i7 == 1 && (u51Var = this.j) != null) {
                    u51Var.a(f12 / (this.h - S));
                }
                this.f = false;
                org.telegram.messenger.g0.i3(new s51(this, 1), 50L);
                return true;
            }
        } else if (i7 == 2 && this.f) {
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
            u51 u51Var2 = this.j;
            if (u51Var2 != null) {
                u51Var2.d(this.d / (this.h - S));
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

    public final void h(boolean z9, float f10) {
        if (Math.abs(this.a - 1.0f) < 0.04f && Math.abs(f10) < 0.04f) {
            this.D.e(true, 1.0f);
            this.E = this.b;
        }
        this.a = f10;
        int ceil = (int) Math.ceil((this.h - S) * f10);
        if (z9) {
            if (Math.abs(ceil - this.b) > org.telegram.messenger.g0.L(10.0f)) {
                float interpolation = xq.f.getInterpolation(this.C);
                this.B = (int) com.google.android.recaptcha.internal.a.z(1.0f, interpolation, this.B, this.b * interpolation);
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
            int i7 = this.h - S;
            if (ceil > i7) {
                this.b = i7;
            }
        }
        if (Math.abs(this.c - this.b) > org.telegram.messenger.g0.L(8.0f)) {
            this.c = this.b;
        }
    }
}
