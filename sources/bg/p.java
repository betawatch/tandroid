package bg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import c3.i0;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p extends i {
    @Override // bg.i
    public final void K() {
        if (i.B1) {
            ArrayList arrayList = this.d;
            int i10 = 0;
            if (((dg.g) arrayList.get(0)).n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                dg.g gVar = (dg.g) obj;
                if (gVar.n) {
                    long j11 = gVar.a.e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j10 = (long) (j10 * ((cg.c) this.h0).l[1]);
            }
            if (j10 > 0) {
                float f7 = j10;
                if (f7 != this.l0) {
                    this.l0 = f7;
                    Animator animator = this.d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = i.e(this.j0, this.l0, new o(this, 0));
                    this.d0 = e;
                    e.start();
                }
            }
        }
    }

    @Override // bg.i
    public final dg.e f(long j10, int i10, long j11) {
        float[] fArr = ((cg.c) this.h0).l;
        float f7 = 1.0f;
        if (fArr.length >= 2) {
            f7 = fArr[fArr[0] == 1.0f ? (char) 1 : (char) 0];
        }
        return new dg.e(j10, j11, this.P0, f7, i10, this.N, this.O);
    }

    @Override // bg.i
    public final dg.g h(cg.a aVar) {
        return new dg.g(aVar, false, this.W0);
    }

    @Override // bg.i
    public final void k(Canvas canvas) {
        float f7;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        int i11;
        boolean z12;
        if (this.h0 == null) {
            return;
        }
        float f14 = this.F0;
        n nVar = this.g0;
        float f15 = nVar.l;
        float f16 = nVar.k;
        float f17 = f14 / (f15 - f16);
        float f18 = i.k1;
        float f19 = (f16 * f17) - f18;
        canvas.save();
        int i12 = this.y0;
        float f20 = 2.0f;
        int i13 = 2;
        boolean z13 = true;
        if (i12 == 2) {
            dg.k kVar = this.z0;
            float f21 = kVar.f;
            f7 = f21 > 0.5f ? 0.0f : 1.0f - (f21 * 2.0f);
            canvas.scale((f21 * 2.0f) + 1.0f, 1.0f, kVar.d, kVar.e);
        } else if (i12 == 1) {
            float f22 = this.z0.f;
            f7 = f22 < 0.3f ? 0.0f : f22;
            canvas.save();
            dg.k kVar2 = this.z0;
            float f23 = kVar2.f;
            canvas.scale(f23, f23, kVar2.d, kVar2.e);
        } else {
            f7 = i12 == 3 ? this.z0.f : 1.0f;
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i15 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            dg.g gVar = (dg.g) arrayList.get(i15);
            boolean z14 = gVar.n;
            float[] fArr = gVar.k;
            float f24 = f20;
            Path path = gVar.f;
            Paint paint = gVar.c;
            if (z14 || gVar.o != 0.0f) {
                long[] jArr = gVar.a.a;
                path.reset();
                float[] fArr2 = ((cg.c) this.h0).b;
                z10 = z13;
                int i16 = ((int) (f18 / (fArr2.length < i13 ? 1.0f : fArr2[z10 ? 1 : 0] * f17))) + 1;
                int max = Math.max(i14, this.F - i16);
                int min = Math.min(((cg.c) this.h0).b.length - 1, this.G + i16);
                boolean z15 = z10 ? 1 : 0;
                int i17 = 0;
                while (true) {
                    z11 = i.A1;
                    if (max > min) {
                        break;
                    }
                    float f25 = f17;
                    float f26 = f19;
                    long j10 = jArr[max];
                    if (j10 < 0) {
                        f13 = f18;
                        i11 = min;
                        z12 = z15;
                    } else {
                        f13 = f18;
                        cg.c cVar = (cg.c) this.h0;
                        i11 = min;
                        float f27 = (cVar.b[max] * f25) - f26;
                        float f28 = j10 * cVar.l[i15];
                        float f29 = this.x;
                        float f30 = (f28 - f29) / (this.w - f29);
                        float strokeWidth = paint.getStrokeWidth() / f24;
                        z12 = z15;
                        float z16 = sc.e.z((getMeasuredHeight() - this.s) - i.n1, strokeWidth, f30, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z11) {
                            if (i17 == 0) {
                                int i18 = i17 + 1;
                                fArr[i17] = f27;
                                i17 += 2;
                                fArr[i18] = z16;
                            } else {
                                fArr[i17] = f27;
                                fArr[i17 + 1] = z16;
                                int i19 = i17 + 3;
                                fArr[i17 + 2] = f27;
                                i17 += 4;
                                fArr[i19] = z16;
                            }
                        } else if (z12) {
                            path.moveTo(f27, z16);
                            z15 = false;
                            max++;
                            f17 = f25;
                            f19 = f26;
                            f18 = f13;
                            min = i11;
                        } else {
                            path.lineTo(f27, z16);
                        }
                    }
                    z15 = z12;
                    max++;
                    f17 = f25;
                    f19 = f26;
                    f18 = f13;
                    min = i11;
                }
                f10 = f17;
                f11 = f19;
                f12 = f18;
                if (this.G - this.F > 100) {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
                paint.setAlpha((int) (gVar.o * 255.0f * f7));
                if (z11) {
                    i10 = 0;
                    canvas.drawLines(fArr, 0, i17, paint);
                } else {
                    canvas.drawPath(path, paint);
                    i10 = 0;
                }
            } else {
                f10 = f17;
                f11 = f19;
                f12 = f18;
                i10 = i14;
                z10 = z13;
            }
            i15++;
            i14 = i10;
            f20 = f24;
            z13 = z10;
            f17 = f10;
            f19 = f11;
            f18 = f12;
            i13 = 2;
        }
    }

    @Override // bg.i
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
        int i15 = i.q1;
        int i16 = measuredHeight - i15;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i15;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.h0 != null) {
            int i17 = 0;
            while (i17 < size) {
                dg.g gVar = (dg.g) arrayList3.get(i17);
                boolean z11 = gVar.n;
                Paint paint = gVar.b;
                float[] fArr = gVar.l;
                Path path = gVar.e;
                if (z11 || gVar.o != 0.0f) {
                    path.reset();
                    int length = ((cg.c) this.h0).b.length;
                    long[] jArr = gVar.a.a;
                    gVar.f.reset();
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        z10 = i.A1;
                        if (i19 >= length) {
                            break;
                        }
                        int i20 = i17;
                        long j10 = jArr[i19];
                        if (j10 < 0) {
                            i13 = i16;
                            arrayList2 = arrayList3;
                            i14 = measuredHeight2;
                        } else {
                            i13 = i16;
                            cg.b bVar = this.h0;
                            float f10 = this.C0 * ((cg.c) bVar).b[i19];
                            if (i.B1) {
                                arrayList2 = arrayList3;
                                f7 = this.j0;
                                i14 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i14 = measuredHeight2;
                                f7 = ((cg.c) bVar).e;
                            }
                            float f11 = (1.0f - ((j10 * ((cg.c) bVar).l[i20]) / f7)) * (i13 - i14);
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
                    gVar.j = i18;
                    if (gVar.n || gVar.o != 0.0f) {
                        paint.setAlpha((int) (gVar.o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, gVar.j, paint);
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

    @Override // bg.i
    public final void o(Canvas canvas) {
        int i10 = this.s0;
        if (i10 < 0 || !this.u0) {
            return;
        }
        int i11 = (int) (this.r * this.v0);
        float f7 = this.F0;
        n nVar = this.g0;
        float f10 = nVar.l;
        float f11 = nVar.k;
        float f12 = f7 / (f10 - f11);
        float f13 = (((cg.c) this.h0).b[i10] * f12) - ((f11 * f12) - i.k1);
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
            dg.g gVar = (dg.g) arrayList.get(i13);
            boolean z10 = gVar.n;
            Paint paint2 = gVar.d;
            if (z10 || gVar.o != 0.0f) {
                float f14 = gVar.a.a[this.s0] * ((cg.c) this.h0).l[this.n0];
                float f15 = this.x;
                float measuredHeight = (getMeasuredHeight() - this.s) - (((f14 - f15) / (this.w - f15)) * ((getMeasuredHeight() - this.s) - i.n1));
                paint2.setAlpha((int) (gVar.o * 255.0f * this.v0));
                int i14 = (int) (gVar.o * 255.0f * this.v0);
                Paint paint3 = this.S;
                paint3.setAlpha(i14);
                canvas.drawPoint(f13, measuredHeight, paint2);
                canvas.drawPoint(f13, measuredHeight, paint3);
            }
            i12 = this.n0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004b  */
    @Override // bg.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Canvas canvas, dg.e eVar) {
        float f7;
        int i10;
        int i11;
        int i12;
        TextPaint textPaint;
        int i13;
        boolean z10;
        int i14;
        dg.e eVar2 = eVar;
        long[] jArr = eVar2.a;
        CharSequence[] charSequenceArr = eVar2.c;
        int length = jArr.length;
        int i15 = 0;
        float f10 = 1.0f;
        int i16 = ((cg.c) this.h0).l[0] == 1.0f ? 1 : 0;
        int i17 = (i16 + 1) % 2;
        if (length > 2) {
            float f11 = (jArr[1] - jArr[0]) / (this.w - this.x);
            if (f11 < 0.1d) {
                f7 = f11 / 0.1f;
                i10 = this.y0;
                if (i10 != 2) {
                    f10 = 1.0f - this.z0.f;
                } else if (i10 == 1) {
                    f10 = this.z0.f;
                } else if (i10 == 3) {
                    f10 = this.z0.f;
                }
                float f12 = f10;
                this.L.setAlpha((int) (eVar2.f * 0.1f * f12));
                int measuredHeight = getMeasuredHeight() - this.s;
                int i18 = i.n1;
                int i19 = measuredHeight - i18;
                TextPaint textPaint2 = this.N;
                int textSize = (int) (i18 - textPaint2.getTextSize());
                while (i15 < length) {
                    float measuredHeight2 = getMeasuredHeight() - this.s;
                    int i20 = i17;
                    float f13 = eVar2.a[i15];
                    float f14 = this.x;
                    int i21 = (int) (measuredHeight2 - (((f13 - f14) / (this.w - f14)) * i19));
                    CharSequence[] charSequenceArr2 = eVar2.b;
                    ArrayList arrayList = this.d;
                    if (charSequenceArr2 == null || arrayList.size() <= 0) {
                        i11 = i19;
                        i12 = textSize;
                        textPaint = textPaint2;
                        i13 = i20;
                    } else {
                        if (charSequenceArr == null || arrayList.size() < 2) {
                            i14 = i20;
                            textPaint2.setColor(t6.w0(t6.Mj, this.W0));
                            textPaint2.setAlpha((int) i0.E(eVar2.f, this.f, f12, f7));
                        } else {
                            i14 = i20;
                            textPaint2.setColor(((dg.g) arrayList.get(i14)).m);
                            textPaint2.setAlpha((int) i0.E(eVar2.f, ((dg.g) arrayList.get(i14)).o, f12, f7));
                        }
                        i13 = i14;
                        i12 = textSize;
                        i11 = i19;
                        eVar2.a(canvas, 0, i15, i.k1, i21 - textSize, textPaint2);
                        textPaint = textPaint2;
                    }
                    if (charSequenceArr == null) {
                        z10 = true;
                    } else if (arrayList.size() > 1) {
                        int i22 = ((dg.g) arrayList.get(i16)).m;
                        TextPaint textPaint3 = this.O;
                        textPaint3.setColor(i22);
                        textPaint3.setAlpha((int) i0.E(eVar2.f, ((dg.g) arrayList.get(i16)).o, f12, f7));
                        z10 = true;
                        eVar2.a(canvas, 1, i15, getMeasuredWidth() - i.k1, i21 - i12, textPaint3);
                    } else {
                        z10 = true;
                    }
                    i15++;
                    eVar2 = eVar;
                    i19 = i11;
                    i17 = i13;
                    textSize = i12;
                    textPaint2 = textPaint;
                }
            }
        }
        f7 = 1.0f;
        i10 = this.y0;
        if (i10 != 2) {
        }
        float f122 = f10;
        this.L.setAlpha((int) (eVar2.f * 0.1f * f122));
        int measuredHeight3 = getMeasuredHeight() - this.s;
        int i182 = i.n1;
        int i192 = measuredHeight3 - i182;
        TextPaint textPaint22 = this.N;
        int textSize2 = (int) (i182 - textPaint22.getTextSize());
        while (i15 < length) {
        }
    }

    @Override // bg.i
    public final long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            long j02 = ((dg.g) arrayList.get(i12)).n ? (long) (((cg.a) ((cg.c) this.h0).d.get(i12)).b.j0(i10, i11) * ((cg.c) this.h0).l[i12]) : 0L;
            if (j02 > j10) {
                j10 = j02;
            }
        }
        return j10;
    }

    @Override // bg.i
    public final long s(int i10, int i11) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            long n02 = ((dg.g) arrayList.get(i12)).n ? (int) (((cg.a) ((cg.c) this.h0).d.get(i12)).b.n0(i10, i11) * ((cg.c) this.h0).l[i12]) : 2147483647L;
            if (n02 < j10) {
                j10 = n02;
            }
        }
        return j10;
    }

    @Override // bg.i
    public final void t() {
        this.P0 = true;
        super.t();
    }
}
