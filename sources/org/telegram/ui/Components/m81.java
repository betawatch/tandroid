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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class m81 {
    public static Paint Q;
    public static Paint R;
    public static int S;
    public static float[] T;
    public static Path U;
    public int A;
    public final g6 D;
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
    public l81 j;
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

    public m81(View view) {
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
        this.D = new g6(0.0f, view, 0L, 300L, hs.h);
    }

    public static void g(float f7, int i10) {
        if (f7 < 1.0f) {
            i10 = i0.a.k(i10, (int) (Color.alpha(i10) * f7));
        }
        Q.setColor(i10);
    }

    public final void a(Canvas canvas, View view) {
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        float f15;
        char c10;
        int i11;
        float lerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, this.y) + this.z;
        RectF rectF = this.o;
        rectF.left = lerp;
        int i12 = this.i;
        int i13 = this.w;
        rectF.top = AndroidUtilities.lerp((i12 - i13) / 2.0f, (i12 - AndroidUtilities.dp(3.0f)) - this.x, this.y);
        int i14 = this.i;
        rectF.bottom = AndroidUtilities.lerp((i14 + i13) / 2.0f, i14 - AndroidUtilities.dp(3.0f), this.y);
        float f16 = this.b;
        float min = Math.min(this.c, f16);
        this.c = min;
        float lerp2 = AndroidUtilities.lerp(min, f16, 0.5f);
        this.c = lerp2;
        float abs = Math.abs(f16 - lerp2);
        View view2 = this.v;
        if (abs > 0.005f) {
            view2.invalidate();
        }
        float f17 = this.c;
        float f18 = this.C;
        if (f18 != 1.0f) {
            float f19 = f18 + 0.07272727f;
            this.C = f19;
            if (f19 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = hs.f.getInterpolation(this.C);
                f17 = (f17 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float d = this.D.d(0.0f, false);
        if (this.f) {
            d = 0.0f;
        }
        rectF.right = AndroidUtilities.lerp(this.h - (S / 2.0f), view2.getWidth() - (this.z * 2.0f), this.y) + this.z;
        g(1.0f - this.y, this.k);
        b(canvas, rectF, Q);
        float f20 = this.r;
        if (f20 != 1.0f) {
            float f21 = f20 + 0.16f;
            this.r = f21;
            if (f21 > 1.0f) {
                this.r = 1.0f;
            } else {
                view2.invalidate();
            }
        }
        if (this.q) {
            float f22 = this.p;
            if (f22 > 0.0f) {
                f7 = 2.0f;
                rectF.right = AndroidUtilities.lerp((f22 * (this.h - r14)) + (S / 2.0f), view2.getWidth() - (this.z * 2.0f), this.y) + this.z;
                g((1.0f - this.r) * (1.0f - this.y), this.l);
                b(canvas, rectF, Q);
            } else {
                f7 = 2.0f;
            }
            float f23 = this.s;
            if (f23 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f23 * (this.h - r13)) + (S / f7), view2.getWidth() - (this.z * f7), this.y) + this.z;
                g(1.0f - this.y, this.l);
                b(canvas, rectF, Q);
            }
        } else {
            f7 = 2.0f;
            float f24 = this.p;
            float f25 = this.r;
            float f26 = (this.s * f25) + ((1.0f - f25) * f24);
            if (f26 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f26 * (this.h - r13)) + (S / 2.0f), view2.getWidth() - (this.z * 2.0f), this.y) + this.z;
                g(1.0f - this.y, this.l);
                b(canvas, rectF, Q);
            }
        }
        float dp = AndroidUtilities.dp(this.f ? 8.0f : 6.0f);
        if (this.t != dp) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f10 = 3.0f;
            f11 = d;
            long j3 = elapsedRealtime - this.u;
            this.u = elapsedRealtime;
            if (j3 > 18) {
                j3 = 16;
            }
            float f27 = this.t;
            i10 = 0;
            if (f27 < dp) {
                float e7 = a1.g.e(j3, 60.0f, AndroidUtilities.dp(1.0f), f27);
                this.t = e7;
                if (e7 > dp) {
                    this.t = dp;
                }
            } else {
                float b10 = org.telegram.messenger.bi.b(j3, 60.0f, AndroidUtilities.dp(1.0f), f27);
                this.t = b10;
                if (b10 < dp) {
                    this.t = dp;
                }
            }
            view2.invalidate();
        } else {
            f10 = 3.0f;
            f11 = d;
            i10 = 0;
        }
        float lerp3 = AndroidUtilities.lerp(this.t, 0.0f, this.y);
        if (f11 > 0.0f) {
            float f28 = rectF.left;
            f12 = 0.2f;
            f13 = 8.0f;
            float lerp4 = AndroidUtilities.lerp((S / f7) + (this.h - r14), view2.getWidth() - (this.z * f7), this.y) + this.z;
            rectF.right = lerp4;
            rectF.left = AndroidUtilities.lerp(f28, lerp4, 1.0f - f11);
            if (this.y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, i0.a.d(this.y, this.n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f28;
            g(1.0f - this.y, i0.a.d(this.y, this.m, c() == 0.0f ? i10 : this.A));
            canvas.drawCircle(AndroidUtilities.lerp((S / f7) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.z * f7)), this.y) + this.z, rectF.centerY(), lerp3 * f11, Q);
        } else {
            f12 = 0.2f;
            f13 = 8.0f;
        }
        float f29 = this.z;
        float f30 = S / f7;
        if (this.f) {
            f17 = this.d;
        }
        rectF.right = AndroidUtilities.lerp(f30 + f17, c() * (view2.getWidth() - (this.z * f7)), this.y) + f29;
        if (this.y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.y * 255.0f * f12));
            b(canvas, rectF, R);
        }
        g(1.0f, i0.a.d(this.y, this.n, this.A));
        b(canvas, rectF, Q);
        g(1.0f - this.y, i0.a.d(this.y, this.m, c() == 0.0f ? i10 : this.A));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - f11) * lerp3, Q);
        ArrayList arrayList = this.F;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float f31 = ((this.f || this.g) ? this.d : this.c) / (this.h - S);
        int size = this.F.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((Float) ((Pair) this.F.get(size)).first).floatValue() - 0.001f <= f31) {
                break;
            } else {
                size--;
            }
        }
        if (this.K == null) {
            this.K = new StaticLayout[2];
        }
        float lerp5 = AndroidUtilities.lerp(S / f7, 0.0f, this.y) + this.z;
        float lerp6 = AndroidUtilities.lerp(this.h - (S / f7), view2.getWidth() - (this.z * f7), this.y) + this.z;
        float f32 = (this.h - (S / f7)) + this.z;
        float abs2 = Math.abs(lerp5 - f32) - AndroidUtilities.dp(16.0f);
        float f33 = this.P;
        if (f33 <= 0.0f || Math.abs(f33 - abs2) <= 0.01f) {
            f14 = 255.0f;
            f15 = f10;
        } else {
            StaticLayout[] staticLayoutArr = this.K;
            StaticLayout staticLayout = staticLayoutArr[i10];
            if (staticLayout != null) {
                f15 = f10;
                CharSequence text = staticLayout.getText();
                f14 = 255.0f;
                staticLayoutArr[i10] = d((int) abs2, text);
            } else {
                f14 = 255.0f;
                f15 = f10;
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
            staticLayoutArr3[1] = staticLayoutArr3[i10];
            if (this.f) {
                AndroidUtilities.vibrateCursor(view2);
            }
            if (size < 0 || size >= this.F.size()) {
                this.K[i10] = null;
            } else {
                CharSequence charSequence = (CharSequence) ((Pair) this.F.get(size)).second;
                if (charSequence == null) {
                    this.K[i10] = null;
                } else {
                    this.K[i10] = d((int) abs2, charSequence);
                }
            }
            this.M = 0.0f;
            if (size == -1) {
                this.N = -1;
            } else {
                int i15 = this.J;
                if (i15 == -1) {
                    this.N = 1;
                } else if (size < i15) {
                    this.N = -1;
                } else if (size > i15) {
                    this.N = 1;
                }
            }
            this.J = size;
        }
        if (this.M < 1.0f) {
            c10 = 1;
            i11 = i13;
            this.M = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O)) / (this.F.size() > 8 ? 160.0f : 220.0f)) + this.M, 1.0f);
            view2.invalidate();
            this.O = SystemClock.elapsedRealtime();
        } else {
            c10 = 1;
            i11 = i13;
        }
        if (this.I < 1.0f) {
            this.I = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O)) / 200.0f) + this.I, 1.0f);
            view2.invalidate();
            SystemClock.elapsedRealtime();
        }
        float interpolation2 = hs.f.getInterpolation(this.M);
        canvas.save();
        int i16 = this.i;
        canvas.translate(((lerp6 - f32) * this.y) + lerp5, AndroidUtilities.lerp((i16 + i11) / f7, i16 - AndroidUtilities.dp(f15), this.y) + AndroidUtilities.dp(12.0f));
        if (this.K[c10] != null) {
            canvas.save();
            if (this.N != 0) {
                canvas.translate((AndroidUtilities.dp(16.0f) * (-this.N) * interpolation2) + AndroidUtilities.dp(f13), 0.0f);
            }
            canvas.translate(0.0f, (-this.K[c10].getHeight()) / f7);
            this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.y) * f14 * this.I));
            this.K[c10].draw(canvas);
            canvas.restore();
        }
        if (this.K[i10] != null) {
            canvas.save();
            if (this.N != 0) {
                canvas.translate(com.google.android.gms.internal.vision.e2.y(1.0f, interpolation2, AndroidUtilities.dp(16.0f) * this.N, AndroidUtilities.dp(f13)), 0.0f);
            }
            canvas.translate(0.0f, (-this.K[i10].getHeight()) / f7);
            this.L.setAlpha((int) (org.telegram.messenger.q.z(1.0f, this.y, f14, interpolation2) * this.I));
            this.K[i10].draw(canvas);
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
        int i10;
        char c10;
        char c11;
        m81 m81Var = this;
        char c12 = 2;
        boolean z10 = true;
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(2, 1, m81Var.y));
        ArrayList arrayList = m81Var.F;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, dp, dp, paint);
            return;
        }
        float f7 = rectF.bottom;
        float f10 = 0.0f;
        float lerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, m81Var.y) + m81Var.z;
        float lerp2 = AndroidUtilities.lerp(m81Var.h - (S / 2.0f), m81Var.v.getWidth() - (m81Var.z * 2.0f), m81Var.y) + m81Var.z;
        AndroidUtilities.rectTmp.set(rectF);
        float f11 = 1.0f;
        float dp2 = AndroidUtilities.dp(m81Var.I * 1.0f) / 2.0f;
        if (U == null) {
            U = new Path();
        }
        U.reset();
        float dp3 = AndroidUtilities.dp(4.0f) / (lerp2 - lerp);
        int i11 = 0;
        while (true) {
            i10 = -1;
            if (i11 >= m81Var.F.size()) {
                i11 = -1;
                break;
            } else if (((Float) ((Pair) m81Var.F.get(i11)).first).floatValue() >= dp3) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            i11 = 0;
        }
        int size = m81Var.F.size() - 1;
        while (true) {
            c10 = c12;
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) m81Var.F.get(size)).first).floatValue() >= dp3) {
                i10 = size + 1;
                break;
            } else {
                size--;
                c12 = c10;
            }
        }
        if (i10 < 0) {
            i10 = m81Var.F.size();
        }
        int i12 = i10;
        int i13 = i11;
        while (i13 <= i12) {
            boolean z11 = z10;
            float floatValue = i13 == i11 ? f10 : ((Float) ((Pair) m81Var.F.get(i13 - 1)).first).floatValue();
            float floatValue2 = i13 == i12 ? f11 : ((Float) ((Pair) m81Var.F.get(i13)).first).floatValue();
            while (i13 != i12 && i13 != 0 && i13 < m81Var.F.size() - 1 && ((Float) ((Pair) m81Var.F.get(i13)).first).floatValue() - floatValue <= dp3) {
                i13++;
                floatValue2 = ((Float) ((Pair) m81Var.F.get(i13)).first).floatValue();
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(lerp, lerp2, floatValue) + (i13 > 0 ? dp2 : 0.0f);
            float lerp3 = AndroidUtilities.lerp(lerp, lerp2, floatValue2) - (i13 < i12 ? dp2 : 0.0f);
            rectF2.right = lerp3;
            float f12 = rectF.right;
            boolean z12 = lerp3 > f12 ? z11 ? 1 : 0 : false;
            if (z12) {
                rectF2.right = f12;
            }
            float f13 = rectF2.right;
            float f14 = rectF.left;
            if (f13 >= f14) {
                if (rectF2.left < f14) {
                    rectF2.left = f14;
                }
                if (T == null) {
                    T = new float[8];
                }
                if (i13 != i11) {
                    if (z12) {
                        c11 = 4;
                    } else {
                        c11 = 4;
                    }
                    if (i13 >= i12) {
                        float[] fArr = T;
                        float f15 = 0.7f * dp * m81Var.I;
                        fArr[7] = f15;
                        fArr[6] = f15;
                        fArr[z11 ? 1 : 0] = f15;
                        fArr[0] = f15;
                        fArr[5] = dp;
                        fArr[c11] = dp;
                        fArr[3] = dp;
                        fArr[c10] = dp;
                    } else {
                        float[] fArr2 = T;
                        float f16 = 0.7f * dp * m81Var.I;
                        fArr2[5] = f16;
                        fArr2[c11] = f16;
                        fArr2[3] = f16;
                        fArr2[c10] = f16;
                        fArr2[7] = f16;
                        fArr2[6] = f16;
                        fArr2[z11 ? 1 : 0] = f16;
                        fArr2[0] = f16;
                    }
                    U.addRoundRect(rectF2, T, Path.Direction.CW);
                    if (!z12) {
                        break;
                    }
                } else {
                    c11 = 4;
                }
                float[] fArr3 = T;
                fArr3[7] = dp;
                fArr3[6] = dp;
                fArr3[z11 ? 1 : 0] = dp;
                fArr3[0] = dp;
                float f17 = 0.7f * dp * m81Var.I;
                fArr3[5] = f17;
                fArr3[c11] = f17;
                fArr3[3] = f17;
                fArr3[c10] = f17;
                U.addRoundRect(rectF2, T, Path.Direction.CW);
                if (!z12) {
                }
            }
            i13++;
            f10 = 0.0f;
            f11 = 1.0f;
            m81Var = this;
            z10 = z11 ? 1 : 0;
        }
        canvas.drawPath(U, paint);
    }

    public final float c() {
        return this.b / (this.h - S);
    }

    public final StaticLayout d(int i10, CharSequence charSequence) {
        if (this.L == null) {
            TextPaint textPaint = new TextPaint(1);
            this.L = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.L.setColor(-1);
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.L, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
    }

    public final boolean e(float f7, float f10, int i10) {
        l81 l81Var;
        if (i10 == 0) {
            if (this.y <= 0.0f) {
                int i11 = this.i;
                int i12 = S;
                int i13 = (i11 - i12) / 2;
                if (f7 >= (-i13)) {
                    int i14 = this.h;
                    if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                        int i15 = this.b;
                        if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                            int i16 = ((int) f7) - (i12 / 2);
                            this.b = i16;
                            if (i16 < 0) {
                                this.b = 0;
                            } else if (i16 > i14 - i12) {
                                this.b = i12 - i14;
                            }
                            this.c = this.b;
                        }
                        this.g = true;
                        this.f = true;
                        int i17 = this.b;
                        this.d = i17;
                        this.e = (int) (f7 - i17);
                        return true;
                    }
                }
            }
        } else if (i10 == 1 || i10 == 3) {
            if (this.f) {
                int i18 = this.d;
                this.b = i18;
                float f11 = i18;
                this.c = f11;
                if (i10 == 1 && (l81Var = this.j) != null) {
                    l81Var.b(f11 / (this.h - S));
                }
                this.f = false;
                AndroidUtilities.runOnUIThread(new c81(this, 2), 50L);
                return true;
            }
        } else if (i10 == 2 && this.f) {
            int i19 = (int) (f7 - this.e);
            this.d = i19;
            if (i19 < 0) {
                this.d = 0;
            } else {
                int i20 = this.h - S;
                if (i19 > i20) {
                    this.d = i20;
                }
            }
            l81 l81Var2 = this.j;
            if (l81Var2 != null) {
                l81Var2.d(this.d / (this.h - S));
            }
            return true;
        }
        return false;
    }

    public final void f(float f7) {
        float f10 = this.s;
        if (f7 != f10) {
            this.p = f10;
            this.q = f7 < f10;
            this.s = f7;
            this.r = 0.0f;
        }
    }

    public final void h(float f7, boolean z10) {
        if (Math.abs(this.a - 1.0f) < 0.04f && Math.abs(f7) < 0.04f) {
            this.D.d(1.0f, true);
            this.E = this.b;
        }
        this.a = f7;
        int ceil = (int) Math.ceil((this.h - S) * f7);
        if (z10) {
            if (Math.abs(ceil - this.b) > AndroidUtilities.dp(10.0f)) {
                float interpolation = hs.f.getInterpolation(this.C);
                this.B = (int) com.google.android.gms.internal.vision.e2.y(1.0f, interpolation, this.B, this.b * interpolation);
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
            int i10 = this.h - S;
            if (ceil > i10) {
                this.b = i10;
            }
        }
        if (Math.abs(this.c - this.b) > AndroidUtilities.dp(8.0f)) {
            this.c = this.b;
        }
    }
}
