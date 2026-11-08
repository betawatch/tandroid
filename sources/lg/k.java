package lg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import di.m4;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class k extends g {
    @Override // lg.g
    public final void K() {
        if (g.B1) {
            ArrayList arrayList = this.d;
            int i7 = 0;
            if (((ng.f) arrayList.get(0)).n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ng.f fVar = (ng.f) obj;
                if (fVar.n) {
                    long j10 = fVar.a.e;
                    if (j10 > j3) {
                        j3 = j10;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j3 = (long) (j3 * ((mg.c) this.h0).l[1]);
            }
            if (j3 > 0) {
                float f10 = j3;
                if (f10 != this.l0) {
                    this.l0 = f10;
                    Animator animator = this.d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.j0, this.l0, new m4(this, 4));
                    this.d0 = e10;
                    e10.start();
                }
            }
        }
    }

    @Override // lg.g
    public final ng.d f(long j3, int i7, long j10) {
        float[] fArr = ((mg.c) this.h0).l;
        float f10 = 1.0f;
        if (fArr.length >= 2) {
            f10 = fArr[fArr[0] == 1.0f ? (char) 1 : (char) 0];
        }
        return new ng.d(j3, j10, this.P0, f10, i7, this.N, this.O);
    }

    @Override // lg.g
    public final ng.f h(mg.a aVar) {
        return new ng.f(aVar, false, this.W0);
    }

    @Override // lg.g
    public final void k(Canvas canvas) {
        float f10;
        boolean z9;
        boolean z10;
        float f11;
        float f12;
        float f13;
        int i7;
        float f14;
        int i10;
        boolean z11;
        if (this.h0 == null) {
            return;
        }
        float f15 = this.F0;
        j jVar = this.g0;
        float f16 = jVar.l;
        float f17 = jVar.k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.k1;
        float f20 = (f17 * f18) - f19;
        canvas.save();
        int i11 = this.y0;
        float f21 = 2.0f;
        int i12 = 2;
        boolean z12 = true;
        if (i11 == 2) {
            ng.j jVar2 = this.z0;
            float f22 = jVar2.f;
            f10 = f22 > 0.5f ? 0.0f : 1.0f - (f22 * 2.0f);
            canvas.scale((f22 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else if (i11 == 1) {
            float f23 = this.z0.f;
            f10 = f23 < 0.3f ? 0.0f : f23;
            canvas.save();
            ng.j jVar3 = this.z0;
            float f24 = jVar3.f;
            canvas.scale(f24, f24, jVar3.d, jVar3.e);
        } else {
            f10 = i11 == 3 ? this.z0.f : 1.0f;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i14 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            ng.f fVar = (ng.f) arrayList.get(i14);
            boolean z13 = fVar.n;
            float[] fArr = fVar.k;
            float f25 = f21;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z13 || fVar.o != 0.0f) {
                long[] jArr = fVar.a.a;
                path.reset();
                float[] fArr2 = ((mg.c) this.h0).b;
                z9 = z12;
                int i15 = ((int) (f19 / (fArr2.length < i12 ? 1.0f : fArr2[z9 ? 1 : 0] * f18))) + 1;
                int max = Math.max(i13, this.F - i15);
                int min = Math.min(((mg.c) this.h0).b.length - 1, this.G + i15);
                boolean z14 = z9 ? 1 : 0;
                int i16 = 0;
                while (true) {
                    z10 = g.A1;
                    if (max > min) {
                        break;
                    }
                    float f26 = f18;
                    float f27 = f20;
                    long j3 = jArr[max];
                    if (j3 < 0) {
                        f14 = f19;
                        i10 = min;
                        z11 = z14;
                    } else {
                        f14 = f19;
                        mg.c cVar = (mg.c) this.h0;
                        i10 = min;
                        float f28 = (cVar.b[max] * f26) - f27;
                        float f29 = j3 * cVar.l[i14];
                        float f30 = this.x;
                        float f31 = (f29 - f30) / (this.w - f30);
                        float strokeWidth = paint.getStrokeWidth() / f25;
                        z11 = z14;
                        float v = com.google.android.recaptcha.internal.a.v((getMeasuredHeight() - this.s) - g.n1, strokeWidth, f31, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z10) {
                            if (i16 == 0) {
                                int i17 = i16 + 1;
                                fArr[i16] = f28;
                                i16 += 2;
                                fArr[i17] = v;
                            } else {
                                fArr[i16] = f28;
                                fArr[i16 + 1] = v;
                                int i18 = i16 + 3;
                                fArr[i16 + 2] = f28;
                                i16 += 4;
                                fArr[i18] = v;
                            }
                        } else if (z11) {
                            path.moveTo(f28, v);
                            z14 = false;
                            max++;
                            f18 = f26;
                            f20 = f27;
                            f19 = f14;
                            min = i10;
                        } else {
                            path.lineTo(f28, v);
                        }
                    }
                    z14 = z11;
                    max++;
                    f18 = f26;
                    f20 = f27;
                    f19 = f14;
                    min = i10;
                }
                f11 = f18;
                f12 = f20;
                f13 = f19;
                if (this.G - this.F > 100) {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
                paint.setAlpha((int) (fVar.o * 255.0f * f10));
                if (z10) {
                    i7 = 0;
                    canvas.drawLines(fArr, 0, i16, paint);
                } else {
                    canvas.drawPath(path, paint);
                    i7 = 0;
                }
            } else {
                f11 = f18;
                f12 = f20;
                f13 = f19;
                i7 = i13;
                z9 = z12;
            }
            i14++;
            i13 = i7;
            f21 = f25;
            z12 = z9;
            f18 = f11;
            f20 = f12;
            f19 = f13;
            i12 = 2;
        }
    }

    @Override // lg.g
    public final void n(Canvas canvas) {
        boolean z9;
        int i7;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        int i13;
        float f10;
        int measuredHeight = getMeasuredHeight();
        int i14 = g.q1;
        int i15 = measuredHeight - i14;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i14;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.h0 != null) {
            int i16 = 0;
            while (i16 < size) {
                ng.f fVar = (ng.f) arrayList3.get(i16);
                boolean z10 = fVar.n;
                Paint paint = fVar.b;
                float[] fArr = fVar.l;
                Path path = fVar.e;
                if (z10 || fVar.o != 0.0f) {
                    path.reset();
                    int length = ((mg.c) this.h0).b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        z9 = g.A1;
                        if (i18 >= length) {
                            break;
                        }
                        int i19 = i16;
                        long j3 = jArr[i18];
                        if (j3 < 0) {
                            i12 = i15;
                            arrayList2 = arrayList3;
                            i13 = measuredHeight2;
                        } else {
                            i12 = i15;
                            mg.b bVar = this.h0;
                            float f11 = this.C0 * ((mg.c) bVar).b[i18];
                            if (g.B1) {
                                arrayList2 = arrayList3;
                                f10 = this.j0;
                                i13 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i13 = measuredHeight2;
                                f10 = ((mg.c) bVar).e;
                            }
                            float f12 = (1.0f - ((j3 * ((mg.c) bVar).l[i19]) / f10)) * (i12 - i13);
                            if (z9) {
                                if (i17 == 0) {
                                    int i20 = i17 + 1;
                                    fArr[i17] = f11;
                                    i17 += 2;
                                    fArr[i20] = f12;
                                } else {
                                    fArr[i17] = f11;
                                    fArr[i17 + 1] = f12;
                                    int i21 = i17 + 3;
                                    fArr[i17 + 2] = f11;
                                    i17 += 4;
                                    fArr[i21] = f12;
                                }
                            } else if (i18 == 0) {
                                path.moveTo(f11, f12);
                            } else {
                                path.lineTo(f11, f12);
                            }
                        }
                        i18++;
                        i16 = i19;
                        i15 = i12;
                        arrayList3 = arrayList2;
                        measuredHeight2 = i13;
                    }
                    i7 = i15;
                    arrayList = arrayList3;
                    i10 = measuredHeight2;
                    i11 = i16;
                    fVar.j = i17;
                    if (fVar.n || fVar.o != 0.0f) {
                        paint.setAlpha((int) (fVar.o * 255.0f));
                        if (z9) {
                            canvas.drawLines(fArr, 0, fVar.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i16 = i11 + 1;
                        i15 = i7;
                        arrayList3 = arrayList;
                        measuredHeight2 = i10;
                    }
                } else {
                    i7 = i15;
                    arrayList = arrayList3;
                    i10 = measuredHeight2;
                    i11 = i16;
                }
                i16 = i11 + 1;
                i15 = i7;
                arrayList3 = arrayList;
                measuredHeight2 = i10;
            }
        }
    }

    @Override // lg.g
    public final void o(Canvas canvas) {
        int i7 = this.s0;
        if (i7 < 0 || !this.u0) {
            return;
        }
        int i10 = (int) (this.r * this.v0);
        float f10 = this.F0;
        j jVar = this.g0;
        float f11 = jVar.l;
        float f12 = jVar.k;
        float f13 = f10 / (f11 - f12);
        float f14 = (((mg.c) this.h0).b[i7] * f13) - ((f12 * f13) - g.k1);
        Paint paint = this.M;
        paint.setAlpha(i10);
        canvas.drawLine(f14, 0.0f, f14, this.H0.bottom, paint);
        ArrayList arrayList = this.d;
        this.m0 = arrayList.size();
        int i11 = 0;
        while (true) {
            this.n0 = i11;
            int i12 = this.n0;
            if (i12 >= this.m0) {
                return;
            }
            ng.f fVar = (ng.f) arrayList.get(i12);
            boolean z9 = fVar.n;
            Paint paint2 = fVar.d;
            if (z9 || fVar.o != 0.0f) {
                float f15 = fVar.a.a[this.s0] * ((mg.c) this.h0).l[this.n0];
                float f16 = this.x;
                float measuredHeight = (getMeasuredHeight() - this.s) - (((f15 - f16) / (this.w - f16)) * ((getMeasuredHeight() - this.s) - g.n1));
                paint2.setAlpha((int) (fVar.o * 255.0f * this.v0));
                int i13 = (int) (fVar.o * 255.0f * this.v0);
                Paint paint3 = this.S;
                paint3.setAlpha(i13);
                canvas.drawPoint(f14, measuredHeight, paint2);
                canvas.drawPoint(f14, measuredHeight, paint3);
            }
            i11 = this.n0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004b  */
    @Override // lg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Canvas canvas, ng.d dVar) {
        float f10;
        int i7;
        int i10;
        int i11;
        TextPaint textPaint;
        int i12;
        boolean z9;
        int i13;
        ng.d dVar2 = dVar;
        long[] jArr = dVar2.a;
        CharSequence[] charSequenceArr = dVar2.c;
        int length = jArr.length;
        int i14 = 0;
        float f11 = 1.0f;
        int i15 = ((mg.c) this.h0).l[0] == 1.0f ? 1 : 0;
        int i16 = (i15 + 1) % 2;
        if (length > 2) {
            float f12 = (jArr[1] - jArr[0]) / (this.w - this.x);
            if (f12 < 0.1d) {
                f10 = f12 / 0.1f;
                i7 = this.y0;
                if (i7 != 2) {
                    f11 = 1.0f - this.z0.f;
                } else if (i7 == 1) {
                    f11 = this.z0.f;
                } else if (i7 == 3) {
                    f11 = this.z0.f;
                }
                float f13 = f11;
                this.L.setAlpha((int) (dVar2.f * 0.1f * f13));
                int measuredHeight = getMeasuredHeight() - this.s;
                int i17 = g.n1;
                int i18 = measuredHeight - i17;
                TextPaint textPaint2 = this.N;
                int textSize = (int) (i17 - textPaint2.getTextSize());
                while (i14 < length) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    int i19 = i16;
                    float f14 = dVar2.a[i14];
                    float f15 = this.x;
                    int i20 = (int) (measuredHeight2 - (((f14 - f15) / (this.w - f15)) * i18));
                    CharSequence[] charSequenceArr2 = dVar2.b;
                    ArrayList arrayList = this.d;
                    if (charSequenceArr2 == null || arrayList.size() <= 0) {
                        i10 = i18;
                        i11 = textSize;
                        textPaint = textPaint2;
                        i12 = i19;
                    } else {
                        if (charSequenceArr == null || arrayList.size() < 2) {
                            i13 = i19;
                            textPaint2.setColor(k6.w0(k6.Mj, this.W0));
                            textPaint2.setAlpha((int) com.google.android.recaptcha.internal.a.D(dVar2.f, this.f, f13, f10));
                        } else {
                            i13 = i19;
                            textPaint2.setColor(((ng.f) arrayList.get(i13)).m);
                            textPaint2.setAlpha((int) com.google.android.recaptcha.internal.a.D(dVar2.f, ((ng.f) arrayList.get(i13)).o, f13, f10));
                        }
                        i12 = i13;
                        i11 = textSize;
                        i10 = i18;
                        dVar2.a(canvas, 0, i14, g.k1, i20 - textSize, textPaint2);
                        textPaint = textPaint2;
                    }
                    if (charSequenceArr == null) {
                        z9 = true;
                    } else if (arrayList.size() > 1) {
                        int i21 = ((ng.f) arrayList.get(i15)).m;
                        TextPaint textPaint3 = this.O;
                        textPaint3.setColor(i21);
                        textPaint3.setAlpha((int) com.google.android.recaptcha.internal.a.D(dVar2.f, ((ng.f) arrayList.get(i15)).o, f13, f10));
                        z9 = true;
                        dVar2.a(canvas, 1, i14, getMeasuredWidth() - g.k1, i20 - i11, textPaint3);
                    } else {
                        z9 = true;
                    }
                    i14++;
                    dVar2 = dVar;
                    i18 = i10;
                    i16 = i12;
                    textSize = i11;
                    textPaint2 = textPaint;
                }
            }
        }
        f10 = 1.0f;
        i7 = this.y0;
        if (i7 != 2) {
        }
        float f132 = f11;
        this.L.setAlpha((int) (dVar2.f * 0.1f * f132));
        int measuredHeight3 = getMeasuredHeight() - this.s;
        int i172 = g.n1;
        int i182 = measuredHeight3 - i172;
        TextPaint textPaint22 = this.N;
        int textSize2 = (int) (i172 - textPaint22.getTextSize());
        while (i14 < length) {
        }
    }

    @Override // lg.g
    public final long r(int i7, int i10) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j3 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long w02 = ((ng.f) arrayList.get(i11)).n ? (long) (((mg.a) ((mg.c) this.h0).d.get(i11)).b.w0(i7, i10) * ((mg.c) this.h0).l[i11]) : 0L;
            if (w02 > j3) {
                j3 = w02;
            }
        }
        return j3;
    }

    @Override // lg.g
    public final long s(int i7, int i10) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            long H0 = ((ng.f) arrayList.get(i11)).n ? (int) (((mg.a) ((mg.c) this.h0).d.get(i11)).b.H0(i7, i10) * ((mg.c) this.h0).l[i11]) : 2147483647L;
            if (H0 < j3) {
                j3 = H0;
            }
        }
        return j3;
    }

    @Override // lg.g
    public final void t() {
        this.P0 = true;
        super.t();
    }
}
