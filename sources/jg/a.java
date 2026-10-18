package jg;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.kk;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class a extends g {
    @Override // jg.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // jg.g
    public final lg.f h(kg.a aVar) {
        return new lg.a(aVar, this.W0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01af A[SYNTHETIC] */
    @Override // jg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        ArrayList arrayList;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        Canvas canvas2 = canvas;
        kg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        float f15 = this.F0;
        j jVar = this.g0;
        float f16 = jVar.l;
        float f17 = jVar.k;
        float f18 = f15 / (f16 - f17);
        float f19 = (f17 * f18) - g.k1;
        int i13 = 1;
        int i14 = this.F - 1;
        int i15 = 0;
        int i16 = i14 < 0 ? 0 : i14;
        int i17 = this.G + 1;
        if (i17 > ((kg.a) bVar.d.get(0)).a.length - 1) {
            i17 = ((kg.a) this.h0.d.get(0)).a.length - 1;
        }
        int i18 = i17;
        canvas2.save();
        float f20 = 0.0f;
        canvas2.clipRect(this.D0, 0.0f, this.E0, getMeasuredHeight() - this.s);
        canvas2.save();
        int i19 = this.y0;
        float f21 = 2.0f;
        int i20 = 2;
        float f22 = 1.0f;
        if (i19 == 2) {
            this.f0 = true;
            this.v0 = 0.0f;
            lg.j jVar2 = this.z0;
            float f23 = jVar2.f;
            f10 = 1.0f - f23;
            canvas2.scale((f23 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else if (i19 == 1) {
            lg.j jVar3 = this.z0;
            f10 = jVar3.f;
            canvas2.scale(f10, 1.0f, jVar3.d, jVar3.e);
        } else {
            f7 = 1.0f;
            i10 = 0;
            while (true) {
                arrayList = this.d;
                if (i10 < arrayList.size()) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                lg.a aVar = (lg.a) arrayList.get(i10);
                boolean z10 = aVar.n;
                float[] fArr = aVar.k;
                float f24 = f22;
                Paint paint = aVar.r;
                int i21 = i13;
                Paint paint2 = aVar.c;
                if (z10 || aVar.o != f20) {
                    float[] fArr2 = this.h0.b;
                    f11 = f21;
                    float f25 = fArr2.length < i20 ? f24 : fArr2[i21] * f18;
                    long[] jArr = aVar.a.a;
                    float f26 = aVar.o;
                    i11 = i10;
                    int i22 = i15;
                    float f27 = f20;
                    float f28 = f27;
                    int i23 = i22;
                    int i24 = i16;
                    while (i24 <= i18) {
                        float f29 = f27;
                        float f30 = ((this.h0.b[i24] * f18) + (f25 / f11)) - f19;
                        float f31 = f18;
                        float f32 = f19;
                        float measuredHeight = (getMeasuredHeight() - this.s) - (((jArr[i24] / this.v) * f26) * ((getMeasuredHeight() - this.s) - g.n1));
                        if (i24 == this.s0 && this.u0) {
                            f28 = measuredHeight;
                            i22 = i21;
                            f27 = f30;
                        } else {
                            fArr[i23] = f30;
                            fArr[i23 + 1] = measuredHeight;
                            int i25 = i23 + 3;
                            fArr[i23 + 2] = f30;
                            i23 += 4;
                            fArr[i25] = getMeasuredHeight() - this.s;
                            f27 = f29;
                        }
                        i24++;
                        f18 = f31;
                        f19 = f32;
                    }
                    float f33 = f27;
                    f12 = f18;
                    f13 = f19;
                    Paint paint3 = (i22 != 0 || this.f0) ? paint : paint2;
                    paint3.setStrokeWidth(f25);
                    if (i22 != 0) {
                        paint.setColor(i0.a.f(f24 - this.v0, aVar.m, aVar.s));
                    }
                    if (this.f0) {
                        f14 = 0.0f;
                        paint.setColor(i0.a.f(0.0f, aVar.m, aVar.s));
                    } else {
                        f14 = 0.0f;
                    }
                    int i26 = (int) (255.0f * f7);
                    paint3.setAlpha(i26);
                    i12 = 0;
                    canvas2.drawLines(fArr, 0, i23, paint3);
                    if (i22 != 0) {
                        paint2.setStrokeWidth(f25);
                        paint2.setAlpha(i26);
                        canvas2.drawLine(f33, f28, f33, getMeasuredHeight() - this.s, paint2);
                        paint2.setAlpha(255);
                    }
                } else {
                    i11 = i10;
                    f12 = f18;
                    f13 = f19;
                    i12 = i15;
                    f14 = f20;
                    f11 = f21;
                }
                i10 = i11 + 1;
                canvas2 = canvas;
                i15 = i12;
                f20 = f14;
                f22 = f24;
                i13 = i21;
                f21 = f11;
                f18 = f12;
                f19 = f13;
                i20 = 2;
            }
        }
        f7 = f10;
        i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 < arrayList.size()) {
            }
            i10 = i11 + 1;
            canvas2 = canvas;
            i15 = i12;
            f20 = f14;
            f22 = f24;
            i13 = i21;
            f21 = f11;
            f18 = f12;
            f19 = f13;
            i20 = 2;
        }
    }

    @Override // jg.g
    public final void n(Canvas canvas) {
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        float f7;
        ArrayList arrayList2;
        float f10;
        int measuredHeight = getMeasuredHeight();
        int i13 = g.q1;
        int i14 = measuredHeight - i13;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i13;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.h0 != null) {
            int i15 = 0;
            while (i15 < size) {
                lg.a aVar = (lg.a) arrayList3.get(i15);
                boolean z10 = aVar.n;
                Paint paint = aVar.c;
                float[] fArr = aVar.k;
                if (z10 || aVar.o != 0.0f) {
                    aVar.e.reset();
                    float[] fArr2 = this.h0.b;
                    int length = fArr2.length;
                    float f11 = fArr2.length < 2 ? 1.0f : fArr2[1] * this.C0;
                    long[] jArr = aVar.a.a;
                    float f12 = aVar.o;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length) {
                        int i18 = i15;
                        long j10 = jArr[i16];
                        if (j10 < 0) {
                            i12 = i14;
                            arrayList2 = arrayList3;
                        } else {
                            kg.b bVar = this.h0;
                            i12 = i14;
                            float f13 = this.C0 * bVar.b[i16];
                            if (g.B1) {
                                f10 = this.j0;
                                f7 = f13;
                                arrayList2 = arrayList3;
                            } else {
                                f7 = f13;
                                arrayList2 = arrayList3;
                                f10 = bVar.e;
                            }
                            float x10 = kk.x(j10, f10, f12, 1.0f) * (i12 - measuredHeight2);
                            fArr[i17] = f7;
                            fArr[i17 + 1] = x10;
                            int i19 = i17 + 3;
                            fArr[i17 + 2] = f7;
                            i17 += 4;
                            fArr[i19] = getMeasuredHeight() - this.s;
                        }
                        i16++;
                        i15 = i18;
                        i14 = i12;
                        arrayList3 = arrayList2;
                    }
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                    paint.setStrokeWidth(f11 + 2.0f);
                    canvas.drawLines(fArr, 0, i17, paint);
                } else {
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                }
                i15 = i11 + 1;
                i14 = i10;
                arrayList3 = arrayList;
            }
        }
    }

    @Override // jg.g, android.view.View
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.n0 = i10;
            int i11 = this.n0;
            if (i11 >= this.m0) {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            } else {
                l(canvas, (lg.d) arrayList.get(i11));
                p(canvas, (lg.d) arrayList.get(this.n0));
                i10 = this.n0 + 1;
            }
        }
    }

    @Override // jg.g
    public final void o(Canvas canvas) {
    }
}
