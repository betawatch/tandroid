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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l71 {
    public static Paint Q;
    public static Paint R;
    public static int S;
    public static float[] T;
    public static Path U;
    public int A;
    public final z5 D;
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
    public k71 j;
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

    public l71(View view) {
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
        this.D = new z5(0.0f, view, 0L, 300L, pr.h);
    }

    public static void g(float f10, int i10) {
        if (f10 < 1.0f) {
            i10 = i0.a.k(i10, (int) (Color.alpha(i10) * f10));
        }
        Q.setColor(i10);
    }

    public final void a(Canvas canvas, View view) {
        float f10;
        View view2;
        char c3;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10;
        char c10;
        float lerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, this.y) + this.z;
        RectF rectF = this.o;
        rectF.left = lerp;
        int i11 = this.i;
        int i12 = this.w;
        rectF.top = AndroidUtilities.lerp((i11 - i12) / 2.0f, (i11 - AndroidUtilities.dp(3.0f)) - this.x, this.y);
        int i13 = this.i;
        rectF.bottom = AndroidUtilities.lerp((i13 + i12) / 2.0f, i13 - AndroidUtilities.dp(3.0f), this.y);
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
                float interpolation = pr.f.getInterpolation(this.C);
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
                c3 = 0;
                float c11 = w.c.c(j10, 60.0f, AndroidUtilities.dp(1.0f), f26);
                this.t = c11;
                if (c11 > dp) {
                    this.t = dp;
                }
            } else {
                c3 = 0;
                float A = org.telegram.messenger.y3.A(j10, 60.0f, AndroidUtilities.dp(1.0f), f26);
                this.t = A;
                if (A < dp) {
                    this.t = dp;
                }
            }
            view2.invalidate();
        } else {
            view2 = view3;
            c3 = 0;
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
            StaticLayout staticLayout = staticLayoutArr[c3];
            if (staticLayout != null) {
                f14 = 16.0f;
                CharSequence text = staticLayout.getText();
                f13 = 3.0f;
                staticLayoutArr[c3] = d((int) abs2, text);
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
            staticLayoutArr3[1] = staticLayoutArr3[c3];
            if (this.f) {
                AndroidUtilities.vibrateCursor(view2);
            }
            if (size < 0 || size >= this.F.size()) {
                this.K[c3] = null;
            } else {
                CharSequence charSequence = (CharSequence) ((Pair) this.F.get(size)).second;
                if (charSequence == null) {
                    this.K[c3] = null;
                } else {
                    this.K[c3] = d((int) abs2, charSequence);
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
            i10 = i12;
            c10 = 1;
            this.M = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O)) / (this.F.size() > 8 ? 160.0f : 220.0f)) + this.M, 1.0f);
            view2.invalidate();
            this.O = SystemClock.elapsedRealtime();
        } else {
            i10 = i12;
            c10 = 1;
        }
        if (this.I < 1.0f) {
            this.I = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O)) / 200.0f) + this.I, 1.0f);
            view2.invalidate();
            SystemClock.elapsedRealtime();
        }
        float interpolation2 = pr.f.getInterpolation(this.M);
        canvas.save();
        int i15 = this.i;
        canvas.translate(((lerp6 - f31) * this.y) + lerp5, AndroidUtilities.lerp((i15 + i10) / f10, i15 - AndroidUtilities.dp(f13), this.y) + AndroidUtilities.dp(12.0f));
        if (this.K[c10] != null) {
            canvas.save();
            if (this.N != 0) {
                canvas.translate((AndroidUtilities.dp(f14) * (-this.N) * interpolation2) + AndroidUtilities.dp(f12), 0.0f);
            }
            canvas.translate(0.0f, (-this.K[c10].getHeight()) / f10);
            this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.y) * 255.0f * this.I));
            this.K[c10].draw(canvas);
            canvas.restore();
        }
        if (this.K[c3] != null) {
            canvas.save();
            if (this.N != 0) {
                canvas.translate(e2.c.w(1.0f, interpolation2, AndroidUtilities.dp(f14) * this.N, AndroidUtilities.dp(f12)), 0.0f);
            }
            canvas.translate(0.0f, (-this.K[c3].getHeight()) / f10);
            this.L.setAlpha((int) (org.telegram.messenger.y3.y(1.0f, this.y, 255.0f, interpolation2) * this.I));
            this.K[c3].draw(canvas);
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
        int i10;
        char c3;
        float floatValue;
        char c10;
        l71 l71Var = this;
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(2, 1, l71Var.y));
        ArrayList arrayList = l71Var.F;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, dp, dp, paint);
            return;
        }
        float f10 = rectF.bottom;
        float lerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, l71Var.y) + l71Var.z;
        float lerp2 = AndroidUtilities.lerp(l71Var.h - (S / 2.0f), l71Var.v.getWidth() - (l71Var.z * 2.0f), l71Var.y) + l71Var.z;
        AndroidUtilities.rectTmp.set(rectF);
        float dp2 = AndroidUtilities.dp(l71Var.I * 1.0f) / 2.0f;
        if (U == null) {
            U = new Path();
        }
        U.reset();
        float dp3 = AndroidUtilities.dp(4.0f) / (lerp2 - lerp);
        int i11 = 0;
        while (true) {
            i10 = -1;
            if (i11 >= l71Var.F.size()) {
                i11 = -1;
                break;
            } else if (((Float) ((Pair) l71Var.F.get(i11)).first).floatValue() >= dp3) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            i11 = 0;
        }
        int size = l71Var.F.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) l71Var.F.get(size)).first).floatValue() >= dp3) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        if (i10 < 0) {
            i10 = l71Var.F.size();
        }
        int i12 = i10;
        int i13 = i11;
        while (i13 <= i12) {
            if (i13 == i11) {
                floatValue = 0.0f;
                c3 = 1;
            } else {
                c3 = 1;
                floatValue = ((Float) ((Pair) l71Var.F.get(i13 - 1)).first).floatValue();
            }
            float floatValue2 = i13 == i12 ? 1.0f : ((Float) ((Pair) l71Var.F.get(i13)).first).floatValue();
            while (i13 != i12 && i13 != 0 && i13 < l71Var.F.size() - 1 && ((Float) ((Pair) l71Var.F.get(i13)).first).floatValue() - floatValue <= dp3) {
                i13++;
                floatValue2 = ((Float) ((Pair) l71Var.F.get(i13)).first).floatValue();
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(lerp, lerp2, floatValue) + (i13 > 0 ? dp2 : 0.0f);
            float lerp3 = AndroidUtilities.lerp(lerp, lerp2, floatValue2) - (i13 < i12 ? dp2 : 0.0f);
            rectF2.right = lerp3;
            float f11 = rectF.right;
            boolean z4 = lerp3 > f11;
            if (z4) {
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
                if (i13 != i11) {
                    if (z4) {
                        c10 = 4;
                    } else {
                        c10 = 4;
                    }
                    if (i13 >= i12) {
                        float[] fArr = T;
                        float f14 = 0.7f * dp * l71Var.I;
                        fArr[7] = f14;
                        fArr[6] = f14;
                        fArr[c3] = f14;
                        fArr[0] = f14;
                        fArr[5] = dp;
                        fArr[c10] = dp;
                        fArr[3] = dp;
                        fArr[2] = dp;
                    } else {
                        float[] fArr2 = T;
                        float f15 = 0.7f * dp * l71Var.I;
                        fArr2[5] = f15;
                        fArr2[c10] = f15;
                        fArr2[3] = f15;
                        fArr2[2] = f15;
                        fArr2[7] = f15;
                        fArr2[6] = f15;
                        fArr2[c3] = f15;
                        fArr2[0] = f15;
                    }
                    U.addRoundRect(rectF2, T, Path.Direction.CW);
                    if (!z4) {
                        break;
                    }
                } else {
                    c10 = 4;
                }
                float[] fArr3 = T;
                fArr3[7] = dp;
                fArr3[6] = dp;
                fArr3[c3] = dp;
                fArr3[0] = dp;
                float f16 = 0.7f * dp * l71Var.I;
                fArr3[5] = f16;
                fArr3[c10] = f16;
                fArr3[3] = f16;
                fArr3[2] = f16;
                U.addRoundRect(rectF2, T, Path.Direction.CW);
                if (!z4) {
                }
            }
            i13++;
            l71Var = this;
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
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.L, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.L, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i10));
    }

    public final boolean e(float f10, float f11, int i10) {
        k71 k71Var;
        if (i10 == 0) {
            if (this.y <= 0.0f) {
                int i11 = this.i;
                int i12 = S;
                int i13 = (i11 - i12) / 2;
                if (f10 >= (-i13)) {
                    int i14 = this.h;
                    if (f10 <= i14 + i13 && f11 >= 0.0f && f11 <= i11) {
                        int i15 = this.b;
                        if (i15 - i13 > f10 || f10 > i15 + i12 + i13) {
                            int i16 = ((int) f10) - (i12 / 2);
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
                        this.e = (int) (f10 - i17);
                        return true;
                    }
                }
            }
        } else if (i10 == 1 || i10 == 3) {
            if (this.f) {
                int i18 = this.d;
                this.b = i18;
                float f12 = i18;
                this.c = f12;
                if (i10 == 1 && (k71Var = this.j) != null) {
                    k71Var.b(f12 / (this.h - S));
                }
                this.f = false;
                AndroidUtilities.runOnUIThread(new a71(this, 2), 50L);
                return true;
            }
        } else if (i10 == 2 && this.f) {
            int i19 = (int) (f10 - this.e);
            this.d = i19;
            if (i19 < 0) {
                this.d = 0;
            } else {
                int i20 = this.h - S;
                if (i19 > i20) {
                    this.d = i20;
                }
            }
            k71 k71Var2 = this.j;
            if (k71Var2 != null) {
                k71Var2.d(this.d / (this.h - S));
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

    public final void h(float f10, boolean z4) {
        if (Math.abs(this.a - 1.0f) < 0.04f && Math.abs(f10) < 0.04f) {
            this.D.d(1.0f, true);
            this.E = this.b;
        }
        this.a = f10;
        int ceil = (int) Math.ceil((this.h - S) * f10);
        if (z4) {
            if (Math.abs(ceil - this.b) > AndroidUtilities.dp(10.0f)) {
                float interpolation = pr.f.getInterpolation(this.C);
                this.B = (int) e2.c.w(1.0f, interpolation, this.B, this.b * interpolation);
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
