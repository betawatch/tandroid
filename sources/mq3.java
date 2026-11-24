// default package

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mq3 extends ng0 {
    @Override // ng0
    public final void K() {
        if (ng0.C1) {
            ArrayList arrayList = this.d;
            int i = 0;
            if (((l46) arrayList.get(0)).n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l46 l46Var = (l46) obj;
                if (l46Var.n) {
                    long j2 = l46Var.a.e;
                    if (j2 > j) {
                        j = j2;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j = (long) (j * ((lq3) this.i0).l[1]);
            }
            if (j > 0) {
                float f = j;
                if (f != this.m0) {
                    this.m0 = f;
                    Animator animator = this.e0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = ng0.e(this.k0, this.m0, new af0(this, (byte) 5));
                    this.e0 = e;
                    e.start();
                }
            }
        }
    }

    @Override // ng0
    public final ql1 f(long j, int i, long j2) {
        float[] fArr = ((lq3) this.i0).l;
        float f = 1.0f;
        if (fArr.length >= 2) {
            f = fArr[fArr[0] == 1.0f ? (char) 1 : (char) 0];
        }
        return new ql1(j, j2, this.Q0, f, i, this.O, this.P);
    }

    @Override // ng0
    public final l46 h(ml1 ml1Var) {
        return new l46(ml1Var, false, this.X0);
    }

    @Override // ng0
    public final void n(Canvas canvas) {
        boolean z;
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList2;
        int i6;
        int i7;
        float f;
        int measuredHeight = getMeasuredHeight();
        int i8 = ng0.r1;
        int i9 = measuredHeight - i8;
        int measuredHeight2 = (getMeasuredHeight() - this.C0) - i8;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.i0 != null) {
            int i10 = 0;
            while (i10 < size) {
                l46 l46Var = (l46) arrayList3.get(i10);
                boolean z2 = l46Var.n;
                float[] fArr = l46Var.l;
                Paint paint = l46Var.b;
                Path path = l46Var.e;
                if (z2 || l46Var.o != 0.0f) {
                    path.reset();
                    int length = ((lq3) this.i0).b.length;
                    long[] jArr = l46Var.a.a;
                    l46Var.f.reset();
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        z = ng0.B1;
                        if (i12 >= length) {
                            break;
                        }
                        int i13 = i10;
                        long j = jArr[i12];
                        if (j < 0) {
                            i5 = i9;
                            arrayList2 = arrayList3;
                            i6 = measuredHeight2;
                            i7 = size;
                        } else {
                            i5 = i9;
                            lq3 lq3Var = (lq3) this.i0;
                            arrayList2 = arrayList3;
                            float f2 = this.D0 * lq3Var.b[i12];
                            if (ng0.C1) {
                                i6 = measuredHeight2;
                                f = this.k0;
                                i7 = size;
                            } else {
                                i6 = measuredHeight2;
                                i7 = size;
                                f = lq3Var.e;
                            }
                            float f3 = (1.0f - ((j * lq3Var.l[i13]) / f)) * (i5 - i6);
                            if (z) {
                                int i14 = i11 + 1;
                                if (i11 == 0) {
                                    fArr[i11] = f2;
                                    i11 += 2;
                                    fArr[i14] = f3;
                                } else {
                                    fArr[i11] = f2;
                                    fArr[i14] = f3;
                                    int i15 = i11 + 3;
                                    fArr[i11 + 2] = f2;
                                    i11 += 4;
                                    fArr[i15] = f3;
                                }
                            } else if (i12 == 0) {
                                path.moveTo(f2, f3);
                            } else {
                                path.lineTo(f2, f3);
                            }
                        }
                        i12++;
                        i10 = i13;
                        i9 = i5;
                        arrayList3 = arrayList2;
                        measuredHeight2 = i6;
                        size = i7;
                    }
                    i = i9;
                    arrayList = arrayList3;
                    i2 = measuredHeight2;
                    i3 = size;
                    i4 = i10;
                    l46Var.j = i11;
                    if (l46Var.n || l46Var.o != 0.0f) {
                        paint.setAlpha((int) (l46Var.o * 255.0f));
                        if (z) {
                            canvas.drawLines(fArr, 0, l46Var.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                } else {
                    i = i9;
                    arrayList = arrayList3;
                    i2 = measuredHeight2;
                    i3 = size;
                    i4 = i10;
                }
                i10 = i4 + 1;
                i9 = i;
                arrayList3 = arrayList;
                measuredHeight2 = i2;
                size = i3;
            }
        }
    }

    @Override // ng0
    public final void o(Canvas canvas) {
        int i = this.t0;
        if (i < 0 || !this.v0) {
            return;
        }
        int i2 = (int) (this.r * this.w0);
        float f = this.G0;
        tl1 tl1Var = this.h0;
        float f2 = tl1Var.l;
        float f3 = tl1Var.k;
        float f4 = f / (f2 - f3);
        float f5 = (((lq3) this.i0).b[i] * f4) - ((f3 * f4) - ng0.l1);
        Paint paint = this.N;
        paint.setAlpha(i2);
        canvas.drawLine(f5, 0.0f, f5, this.I0.bottom, paint);
        ArrayList arrayList = this.d;
        this.n0 = arrayList.size();
        int i3 = 0;
        while (true) {
            this.o0 = i3;
            int i4 = this.o0;
            if (i4 >= this.n0) {
                return;
            }
            l46 l46Var = (l46) arrayList.get(i4);
            boolean z = l46Var.n;
            Paint paint2 = l46Var.d;
            if (z || l46Var.o != 0.0f) {
                float f6 = l46Var.a.a[this.t0] * ((lq3) this.i0).l[this.o0];
                float f7 = this.x;
                float measuredHeight = (getMeasuredHeight() - this.s) - (((f6 - f7) / (this.w - f7)) * ((getMeasuredHeight() - this.s) - ng0.o1));
                paint2.setAlpha((int) (l46Var.o * 255.0f * this.w0));
                int i5 = (int) (l46Var.o * 255.0f * this.w0);
                Paint paint3 = this.T;
                paint3.setAlpha(i5);
                canvas.drawPoint(f5, measuredHeight, paint2);
                canvas.drawPoint(f5, measuredHeight, paint3);
            }
            i3 = this.o0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    @Override // ng0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Canvas canvas, ql1 ql1Var) {
        float f;
        byte b;
        int i;
        int i2;
        TextPaint textPaint;
        int i3;
        int i4;
        ql1 ql1Var2 = ql1Var;
        long[] jArr = ql1Var2.a;
        CharSequence[] charSequenceArr = ql1Var2.c;
        int length = jArr.length;
        int i5 = 0;
        float f2 = 1.0f;
        int i6 = ((lq3) this.i0).l[0] == 1.0f ? 1 : 0;
        int i7 = (i6 + 1) % 2;
        if (length > 2) {
            float f3 = (jArr[1] - jArr[0]) / (this.w - this.x);
            if (f3 < 0.1d) {
                f = f3 / 0.1f;
                b = this.z0;
                if (b != 2) {
                    f2 = 1.0f - this.A0.f;
                } else if (b == 1) {
                    f2 = this.A0.f;
                } else if (b == 3) {
                    f2 = this.A0.f;
                }
                float f4 = f2;
                this.M.setAlpha((int) (ql1Var2.f * 0.1f * f4));
                int measuredHeight = getMeasuredHeight() - this.s;
                int i8 = ng0.o1;
                int i9 = measuredHeight - i8;
                TextPaint textPaint2 = this.O;
                int textSize = (int) (i8 - textPaint2.getTextSize());
                while (i5 < length) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    int i10 = i7;
                    float f5 = ql1Var2.a[i5];
                    float f6 = this.x;
                    int i11 = (int) (measuredHeight2 - (((f5 - f6) / (this.w - f6)) * i9));
                    CharSequence[] charSequenceArr2 = ql1Var2.b;
                    ArrayList arrayList = this.d;
                    if (charSequenceArr2 == null || arrayList.size() <= 0) {
                        i = i9;
                        i2 = textSize;
                        textPaint = textPaint2;
                        i3 = i10;
                    } else {
                        if (charSequenceArr == null || arrayList.size() < 2) {
                            i4 = i10;
                            textPaint2.setColor(cmb.v0(cmb.Oj, this.X0));
                            textPaint2.setAlpha((int) mlb.C(ql1Var2.f, this.f, f4, f));
                        } else {
                            i4 = i10;
                            textPaint2.setColor(((l46) arrayList.get(i4)).m);
                            textPaint2.setAlpha((int) mlb.C(ql1Var2.f, ((l46) arrayList.get(i4)).o, f4, f));
                        }
                        i3 = i4;
                        i2 = textSize;
                        i = i9;
                        ql1Var2.a(canvas, 0, i5, ng0.l1, i11 - textSize, textPaint2);
                        textPaint = textPaint2;
                    }
                    if (charSequenceArr != null && arrayList.size() > 1) {
                        int i12 = ((l46) arrayList.get(i6)).m;
                        TextPaint textPaint3 = this.P;
                        textPaint3.setColor(i12);
                        textPaint3.setAlpha((int) mlb.C(ql1Var2.f, ((l46) arrayList.get(i6)).o, f4, f));
                        ql1Var2.a(canvas, 1, i5, getMeasuredWidth() - ng0.l1, i11 - i2, textPaint3);
                    }
                    i5++;
                    ql1Var2 = ql1Var;
                    i9 = i;
                    i7 = i3;
                    textSize = i2;
                    textPaint2 = textPaint;
                }
            }
        }
        f = 1.0f;
        b = this.z0;
        if (b != 2) {
        }
        float f42 = f2;
        this.M.setAlpha((int) (ql1Var2.f * 0.1f * f42));
        int measuredHeight3 = getMeasuredHeight() - this.s;
        int i82 = ng0.o1;
        int i92 = measuredHeight3 - i82;
        TextPaint textPaint22 = this.O;
        int textSize2 = (int) (i82 - textPaint22.getTextSize());
        while (i5 < length) {
        }
    }

    @Override // ng0
    public final long r(int i, int i2) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long t = ((l46) arrayList.get(i3)).n ? (long) (((ml1) ((lq3) this.i0).d.get(i3)).b.t(i, i2) * ((lq3) this.i0).l[i3]) : 0L;
            if (t > j) {
                j = t;
            }
        }
        return j;
    }

    @Override // ng0
    public final long s(int i, int i2) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            long v = ((l46) arrayList.get(i3)).n ? (int) (((ml1) ((lq3) this.i0).d.get(i3)).b.v(i, i2) * ((lq3) this.i0).l[i3]) : 2147483647L;
            if (v < j) {
                j = v;
            }
        }
        return j;
    }

    @Override // ng0
    public final void t() {
        this.Q0 = true;
        super.t();
    }
}
