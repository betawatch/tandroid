package jg;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.vl;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b3 A[SYNTHETIC] */
    @Override // jg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        ArrayList arrayList;
        int i11;
        float f11;
        float f12;
        Canvas canvas2 = canvas;
        kg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        float f13 = this.F0;
        j jVar = this.g0;
        float f14 = jVar.l;
        float f15 = jVar.k;
        float f16 = f13 / (f14 - f15);
        float f17 = (f15 * f16) - g.k1;
        int i12 = this.F - 1;
        int i13 = i12 < 0 ? 0 : i12;
        int i14 = this.G + 1;
        if (i14 > ((kg.a) bVar.d.get(0)).a.length - 1) {
            i14 = ((kg.a) this.h0.d.get(0)).a.length - 1;
        }
        int i15 = i14;
        canvas2.save();
        float f18 = 0.0f;
        canvas2.clipRect(this.D0, 0.0f, this.E0, getMeasuredHeight() - this.s);
        canvas2.save();
        int i16 = this.y0;
        int i17 = 2;
        if (i16 == 2) {
            this.f0 = true;
            this.v0 = 0.0f;
            lg.j jVar2 = this.z0;
            float f19 = jVar2.f;
            f10 = 1.0f - f19;
            canvas2.scale((f19 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else if (i16 == 1) {
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
                Paint paint = aVar.r;
                Paint paint2 = aVar.c;
                if (z10 || aVar.o != f18) {
                    float[] fArr2 = this.h0.b;
                    float f20 = fArr2.length < i17 ? 1.0f : fArr2[1] * f16;
                    long[] jArr = aVar.a.a;
                    float f21 = aVar.o;
                    i11 = i10;
                    int i18 = i13;
                    float f22 = 0.0f;
                    int i19 = 0;
                    boolean z11 = false;
                    float f23 = 0.0f;
                    while (i18 <= i15) {
                        float f24 = f22;
                        float f25 = ((this.h0.b[i18] * f16) + (f20 / 2.0f)) - f17;
                        float f26 = f16;
                        float f27 = f17;
                        float measuredHeight = (getMeasuredHeight() - this.s) - (((jArr[i18] / this.v) * f21) * ((getMeasuredHeight() - this.s) - g.n1));
                        if (i18 == this.s0 && this.u0) {
                            f23 = measuredHeight;
                            f22 = f25;
                            z11 = true;
                        } else {
                            fArr[i19] = f25;
                            fArr[i19 + 1] = measuredHeight;
                            int i20 = i19 + 3;
                            fArr[i19 + 2] = f25;
                            i19 += 4;
                            fArr[i20] = getMeasuredHeight() - this.s;
                            f22 = f24;
                        }
                        i18++;
                        f16 = f26;
                        f17 = f27;
                    }
                    float f28 = f22;
                    f11 = f16;
                    f12 = f17;
                    Paint paint3 = (z11 || this.f0) ? paint : paint2;
                    paint3.setStrokeWidth(f20);
                    if (z11) {
                        paint.setColor(i0.a.d(1.0f - this.v0, aVar.m, aVar.s));
                    }
                    if (this.f0) {
                        paint.setColor(i0.a.d(0.0f, aVar.m, aVar.s));
                    }
                    int i21 = (int) (255.0f * f7);
                    paint3.setAlpha(i21);
                    canvas2.drawLines(fArr, 0, i19, paint3);
                    if (z11) {
                        paint2.setStrokeWidth(f20);
                        paint2.setAlpha(i21);
                        canvas2.drawLine(f28, f23, f28, getMeasuredHeight() - this.s, paint2);
                        paint2.setAlpha(255);
                    }
                } else {
                    i11 = i10;
                    f11 = f16;
                    f12 = f17;
                }
                i10 = i11 + 1;
                canvas2 = canvas;
                f16 = f11;
                f17 = f12;
                f18 = 0.0f;
                i17 = 2;
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
            f16 = f11;
            f17 = f12;
            f18 = 0.0f;
            i17 = 2;
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
                        long j3 = jArr[i16];
                        if (j3 < 0) {
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
                            float c10 = vl.c(j3, f10, f12, 1.0f) * (i12 - measuredHeight2);
                            fArr[i17] = f7;
                            fArr[i17 + 1] = c10;
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
