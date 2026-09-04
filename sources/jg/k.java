package jg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import bi.u5;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class k extends g {
    @Override // jg.g
    public final void K() {
        if (g.B1) {
            ArrayList arrayList = this.d;
            int i10 = 0;
            if (((lg.f) arrayList.get(0)).n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                lg.f fVar = (lg.f) obj;
                if (fVar.n) {
                    long j10 = fVar.a.e;
                    if (j10 > j3) {
                        j3 = j10;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j3 = (long) (j3 * ((kg.c) this.h0).l[1]);
            }
            if (j3 > 0) {
                float f7 = j3;
                if (f7 != this.l0) {
                    this.l0 = f7;
                    Animator animator = this.d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e7 = g.e(this.j0, this.l0, new u5(this, 4));
                    this.d0 = e7;
                    e7.start();
                }
            }
        }
    }

    @Override // jg.g
    public final lg.d f(int i10, long j3, long j10) {
        float f7;
        float[] fArr = ((kg.c) this.h0).l;
        if (fArr.length < 2) {
            f7 = 1.0f;
        } else {
            f7 = fArr[fArr[0] == 1.0f ? (char) 1 : (char) 0];
        }
        return new lg.d(j3, j10, this.P0, f7, i10, this.N, this.O);
    }

    @Override // jg.g
    public final lg.f h(kg.a aVar) {
        return new lg.f(aVar, false, this.W0);
    }

    @Override // jg.g
    public final void k(Canvas canvas) {
        float f7;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        boolean z11;
        if (this.h0 == null) {
            return;
        }
        float f14 = this.F0;
        j jVar = this.g0;
        float f15 = jVar.l;
        float f16 = jVar.k;
        float f17 = f14 / (f15 - f16);
        float f18 = g.k1;
        float f19 = (f16 * f17) - f18;
        canvas.save();
        int i11 = this.y0;
        int i12 = 2;
        if (i11 == 2) {
            lg.j jVar2 = this.z0;
            float f20 = jVar2.f;
            f7 = f20 > 0.5f ? 0.0f : 1.0f - (f20 * 2.0f);
            canvas.scale((f20 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else if (i11 == 1) {
            float f21 = this.z0.f;
            f7 = f21 < 0.3f ? 0.0f : f21;
            canvas.save();
            lg.j jVar3 = this.z0;
            float f22 = jVar3.f;
            canvas.scale(f22, f22, jVar3.d, jVar3.e);
        } else {
            f7 = i11 == 3 ? this.z0.f : 1.0f;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i14 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            lg.f fVar = (lg.f) arrayList.get(i14);
            boolean z12 = fVar.n;
            float[] fArr = fVar.k;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z12 || fVar.o != 0.0f) {
                long[] jArr = fVar.a.a;
                path.reset();
                float[] fArr2 = ((kg.c) this.h0).b;
                int i15 = ((int) (f18 / (fArr2.length < i12 ? 1.0f : fArr2[1] * f17))) + 1;
                int max = Math.max(i13, this.F - i15);
                int min = Math.min(((kg.c) this.h0).b.length - 1, this.G + i15);
                boolean z13 = true;
                int i16 = 0;
                while (true) {
                    z10 = g.A1;
                    if (max > min) {
                        break;
                    }
                    float f23 = f17;
                    float f24 = f19;
                    long j3 = jArr[max];
                    if (j3 < 0) {
                        f13 = f18;
                        i10 = min;
                        z11 = z13;
                    } else {
                        f13 = f18;
                        kg.c cVar = (kg.c) this.h0;
                        i10 = min;
                        float f25 = (cVar.b[max] * f23) - f24;
                        float f26 = j3 * cVar.l[i14];
                        float f27 = this.w;
                        float f28 = (f26 - f27) / (this.v - f27);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        z11 = z13;
                        float b10 = e2.b((getMeasuredHeight() - this.s) - g.n1, strokeWidth, f28, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z10) {
                            if (i16 == 0) {
                                int i17 = i16 + 1;
                                fArr[i16] = f25;
                                i16 += 2;
                                fArr[i17] = b10;
                            } else {
                                fArr[i16] = f25;
                                fArr[i16 + 1] = b10;
                                int i18 = i16 + 3;
                                fArr[i16 + 2] = f25;
                                i16 += 4;
                                fArr[i18] = b10;
                            }
                        } else if (z11) {
                            path.moveTo(f25, b10);
                            z13 = false;
                            max++;
                            f17 = f23;
                            f19 = f24;
                            f18 = f13;
                            min = i10;
                        } else {
                            path.lineTo(f25, b10);
                        }
                    }
                    z13 = z11;
                    max++;
                    f17 = f23;
                    f19 = f24;
                    f18 = f13;
                    min = i10;
                }
                f10 = f17;
                f11 = f19;
                f12 = f18;
                if (this.G - this.F > 100) {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
                paint.setAlpha((int) (fVar.o * 255.0f * f7));
                if (z10) {
                    canvas.drawLines(fArr, 0, i16, paint);
                } else {
                    canvas.drawPath(path, paint);
                }
            } else {
                f10 = f17;
                f11 = f19;
                f12 = f18;
            }
            i14++;
            f17 = f10;
            f19 = f11;
            f18 = f12;
            i13 = 0;
            i12 = 2;
        }
    }

    @Override // jg.g
    public final void n(Canvas canvas) {
        boolean z10;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        int i14;
        float f7;
        int measuredHeight = getMeasuredHeight();
        int i15 = g.q1;
        int i16 = measuredHeight - i15;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i15;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.h0 != null) {
            int i17 = 0;
            while (i17 < size) {
                lg.f fVar = (lg.f) arrayList3.get(i17);
                boolean z11 = fVar.n;
                Paint paint = fVar.b;
                float[] fArr = fVar.l;
                Path path = fVar.e;
                if (z11 || fVar.o != 0.0f) {
                    path.reset();
                    int length = ((kg.c) this.h0).b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        z10 = g.A1;
                        if (i19 >= length) {
                            break;
                        }
                        int i20 = i17;
                        long j3 = jArr[i19];
                        if (j3 < 0) {
                            i13 = i16;
                            arrayList2 = arrayList3;
                            i14 = measuredHeight2;
                        } else {
                            i13 = i16;
                            kg.b bVar = this.h0;
                            float f10 = this.C0 * ((kg.c) bVar).b[i19];
                            if (g.B1) {
                                arrayList2 = arrayList3;
                                f7 = this.j0;
                                i14 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i14 = measuredHeight2;
                                f7 = ((kg.c) bVar).e;
                            }
                            float f11 = (1.0f - ((j3 * ((kg.c) bVar).l[i20]) / f7)) * (i13 - i14);
                            if (z10) {
                                if (i18 == 0) {
                                    int i21 = i18 + 1;
                                    fArr[i18] = f10;
                                    i18 += 2;
                                    fArr[i21] = f11;
                                } else {
                                    fArr[i18] = f10;
                                    fArr[i18 + 1] = f11;
                                    int i22 = i18 + 3;
                                    fArr[i18 + 2] = f10;
                                    i18 += 4;
                                    fArr[i22] = f11;
                                }
                            } else if (i19 == 0) {
                                path.moveTo(f10, f11);
                            } else {
                                path.lineTo(f10, f11);
                            }
                        }
                        i19++;
                        i17 = i20;
                        i16 = i13;
                        arrayList3 = arrayList2;
                        measuredHeight2 = i14;
                    }
                    i10 = i16;
                    arrayList = arrayList3;
                    i11 = measuredHeight2;
                    i12 = i17;
                    fVar.j = i18;
                    if (fVar.n || fVar.o != 0.0f) {
                        paint.setAlpha((int) (fVar.o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i17 = i12 + 1;
                        i16 = i10;
                        arrayList3 = arrayList;
                        measuredHeight2 = i11;
                    }
                } else {
                    i10 = i16;
                    arrayList = arrayList3;
                    i11 = measuredHeight2;
                    i12 = i17;
                }
                i17 = i12 + 1;
                i16 = i10;
                arrayList3 = arrayList;
                measuredHeight2 = i11;
            }
        }
    }

    @Override // jg.g
    public final void o(Canvas canvas) {
        int i10 = this.s0;
        if (i10 < 0 || !this.u0) {
            return;
        }
        int i11 = (int) (this.r * this.v0);
        float f7 = this.F0;
        j jVar = this.g0;
        float f10 = jVar.l;
        float f11 = jVar.k;
        float f12 = f7 / (f10 - f11);
        float f13 = (((kg.c) this.h0).b[i10] * f12) - ((f11 * f12) - g.k1);
        Paint paint = this.M;
        paint.setAlpha(i11);
        canvas.drawLine(f13, 0.0f, f13, this.H0.bottom, paint);
        ArrayList arrayList = this.d;
        this.m0 = arrayList.size();
        int i12 = 0;
        while (true) {
            this.n0 = i12;
            int i13 = this.n0;
            if (i13 >= this.m0) {
                return;
            }
            lg.f fVar = (lg.f) arrayList.get(i13);
            boolean z10 = fVar.n;
            Paint paint2 = fVar.d;
            if (z10 || fVar.o != 0.0f) {
                float f14 = fVar.a.a[this.s0] * ((kg.c) this.h0).l[this.n0];
                float f15 = this.w;
                float measuredHeight = (getMeasuredHeight() - this.s) - (((f14 - f15) / (this.v - f15)) * ((getMeasuredHeight() - this.s) - g.n1));
                paint2.setAlpha((int) (fVar.o * 255.0f * this.v0));
                int i14 = (int) (fVar.o * 255.0f * this.v0);
                Paint paint3 = this.S;
                paint3.setAlpha(i14);
                canvas.drawPoint(f13, measuredHeight, paint2);
                canvas.drawPoint(f13, measuredHeight, paint3);
            }
            i12 = this.n0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    @Override // jg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Canvas canvas, lg.d dVar) {
        float f7;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        TextPaint textPaint;
        int i13;
        int i14;
        lg.d dVar2 = dVar;
        long[] jArr = dVar2.a;
        CharSequence[] charSequenceArr = dVar2.c;
        int length = jArr.length;
        int i15 = 0;
        int i16 = ((kg.c) this.h0).l[0] == 1.0f ? 1 : 0;
        int i17 = (i16 + 1) % 2;
        if (length > 2) {
            float f12 = (jArr[1] - jArr[0]) / (this.v - this.w);
            if (f12 < 0.1d) {
                f7 = f12 / 0.1f;
                i10 = this.y0;
                if (i10 != 2) {
                    f11 = 1.0f - this.z0.f;
                } else if (i10 == 1) {
                    f11 = this.z0.f;
                } else {
                    if (i10 != 3) {
                        f10 = 1.0f;
                        this.L.setAlpha((int) (dVar2.f * 0.1f * f10));
                        int measuredHeight = getMeasuredHeight() - this.s;
                        int i18 = g.n1;
                        int i19 = measuredHeight - i18;
                        TextPaint textPaint2 = this.N;
                        int textSize = (int) (i18 - textPaint2.getTextSize());
                        while (i15 < length) {
                            float measuredHeight2 = getMeasuredHeight() - this.s;
                            int i20 = i17;
                            float f13 = dVar2.a[i15];
                            float f14 = this.w;
                            int i21 = (int) (measuredHeight2 - (((f13 - f14) / (this.v - f14)) * i19));
                            CharSequence[] charSequenceArr2 = dVar2.b;
                            ArrayList arrayList = this.d;
                            if (charSequenceArr2 == null || arrayList.size() <= 0) {
                                i11 = i19;
                                i12 = textSize;
                                textPaint = textPaint2;
                                i13 = i20;
                            } else {
                                if (charSequenceArr == null || arrayList.size() < 2) {
                                    i14 = i20;
                                    textPaint2.setColor(j6.v0(j6.Yi, this.W0));
                                    textPaint2.setAlpha((int) e2.C(dVar2.f, this.f, f10, f7));
                                } else {
                                    i14 = i20;
                                    textPaint2.setColor(((lg.f) arrayList.get(i14)).m);
                                    textPaint2.setAlpha((int) e2.C(dVar2.f, ((lg.f) arrayList.get(i14)).o, f10, f7));
                                }
                                i13 = i14;
                                i12 = textSize;
                                i11 = i19;
                                dVar2.a(canvas, 0, i15, g.k1, i21 - textSize, textPaint2);
                                textPaint = textPaint2;
                            }
                            if (charSequenceArr != null && arrayList.size() > 1) {
                                int i22 = ((lg.f) arrayList.get(i16)).m;
                                TextPaint textPaint3 = this.O;
                                textPaint3.setColor(i22);
                                textPaint3.setAlpha((int) e2.C(dVar2.f, ((lg.f) arrayList.get(i16)).o, f10, f7));
                                dVar2.a(canvas, 1, i15, getMeasuredWidth() - g.k1, i21 - i12, textPaint3);
                            }
                            i15++;
                            dVar2 = dVar;
                            i19 = i11;
                            i17 = i13;
                            textSize = i12;
                            textPaint2 = textPaint;
                        }
                    }
                    f11 = this.z0.f;
                }
                f10 = f11;
                this.L.setAlpha((int) (dVar2.f * 0.1f * f10));
                int measuredHeight3 = getMeasuredHeight() - this.s;
                int i182 = g.n1;
                int i192 = measuredHeight3 - i182;
                TextPaint textPaint22 = this.N;
                int textSize2 = (int) (i182 - textPaint22.getTextSize());
                while (i15 < length) {
                }
            }
        }
        f7 = 1.0f;
        i10 = this.y0;
        if (i10 != 2) {
        }
        f10 = f11;
        this.L.setAlpha((int) (dVar2.f * 0.1f * f10));
        int measuredHeight32 = getMeasuredHeight() - this.s;
        int i1822 = g.n1;
        int i1922 = measuredHeight32 - i1822;
        TextPaint textPaint222 = this.N;
        int textSize22 = (int) (i1822 - textPaint222.getTextSize());
        while (i15 < length) {
        }
    }

    @Override // jg.g
    public final long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j3 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            long rMaxQ = ((lg.f) arrayList.get(i12)).n ? (long) (((kg.a) ((kg.c) this.h0).d.get(i12)).b.rMaxQ(i10, i11) * ((kg.c) this.h0).l[i12]) : 0L;
            if (rMaxQ > j3) {
                j3 = rMaxQ;
            }
        }
        return j3;
    }

    @Override // jg.g
    public final long s(int i10, int i11) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j3 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            long rMinQ = ((lg.f) arrayList.get(i12)).n ? (int) (((kg.a) ((kg.c) this.h0).d.get(i12)).b.rMinQ(i10, i11) * ((kg.c) this.h0).l[i12]) : 2147483647L;
            if (rMinQ < j3) {
                j3 = rMinQ;
            }
        }
        return j3;
    }

    @Override // jg.g
    public final void t() {
        this.P0 = true;
        super.t();
    }
}
