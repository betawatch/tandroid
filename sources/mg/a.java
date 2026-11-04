package mg;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a extends g {
    @Override // mg.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // mg.g
    public final og.f h(ng.a aVar) {
        return new og.a(aVar, this.X0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01af A[SYNTHETIC] */
    @Override // mg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        int i3;
        ArrayList arrayList;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        int i11;
        Canvas canvas2 = canvas;
        ng.b bVar = this.i0;
        if (bVar == null) {
            return;
        }
        float f16 = this.G0;
        j jVar = this.h0;
        float f17 = jVar.l;
        float f18 = jVar.k;
        float f19 = f16 / (f17 - f18);
        float f20 = (f18 * f19) - g.l1;
        int i12 = 1;
        int i13 = this.G - 1;
        int i14 = 0;
        int i15 = i13 < 0 ? 0 : i13;
        int i16 = this.H + 1;
        if (i16 > ((ng.a) bVar.d.get(0)).a.length - 1) {
            i16 = ((ng.a) this.i0.d.get(0)).a.length - 1;
        }
        int i17 = i16;
        canvas2.save();
        float f21 = 0.0f;
        canvas2.clipRect(this.E0, 0.0f, this.F0, getMeasuredHeight() - this.s);
        canvas2.save();
        int i18 = this.z0;
        float f22 = 2.0f;
        int i19 = 2;
        float f23 = 1.0f;
        if (i18 == 2) {
            this.g0 = true;
            this.w0 = 0.0f;
            og.j jVar2 = this.A0;
            float f24 = jVar2.f;
            f11 = 1.0f - f24;
            canvas2.scale((f24 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else if (i18 == 1) {
            og.j jVar3 = this.A0;
            f11 = jVar3.f;
            canvas2.scale(f11, 1.0f, jVar3.d, jVar3.e);
        } else {
            f10 = 1.0f;
            i3 = 0;
            while (true) {
                arrayList = this.d;
                if (i3 < arrayList.size()) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                og.a aVar = (og.a) arrayList.get(i3);
                boolean z10 = aVar.n;
                float[] fArr = aVar.k;
                float f25 = f23;
                Paint paint = aVar.r;
                int i20 = i12;
                Paint paint2 = aVar.c;
                if (z10 || aVar.o != f21) {
                    float[] fArr2 = this.i0.b;
                    f12 = f22;
                    float f26 = fArr2.length < i19 ? f25 : fArr2[i20] * f19;
                    long[] jArr = aVar.a.a;
                    float f27 = aVar.o;
                    i10 = i3;
                    int i21 = i14;
                    float f28 = f21;
                    float f29 = f28;
                    int i22 = i21;
                    int i23 = i15;
                    while (i23 <= i17) {
                        float f30 = f28;
                        float f31 = ((this.i0.b[i23] * f19) + (f26 / f12)) - f20;
                        float f32 = f19;
                        float f33 = f20;
                        float measuredHeight = (getMeasuredHeight() - this.s) - (((jArr[i23] / this.w) * f27) * ((getMeasuredHeight() - this.s) - g.o1));
                        if (i23 == this.t0 && this.v0) {
                            f29 = measuredHeight;
                            i21 = i20;
                            f28 = f31;
                        } else {
                            fArr[i22] = f31;
                            fArr[i22 + 1] = measuredHeight;
                            int i24 = i22 + 3;
                            fArr[i22 + 2] = f31;
                            i22 += 4;
                            fArr[i24] = getMeasuredHeight() - this.s;
                            f28 = f30;
                        }
                        i23++;
                        f19 = f32;
                        f20 = f33;
                    }
                    float f34 = f28;
                    f13 = f19;
                    f14 = f20;
                    Paint paint3 = (i21 != 0 || this.g0) ? paint : paint2;
                    paint3.setStrokeWidth(f26);
                    if (i21 != 0) {
                        paint.setColor(i0.a.f(f25 - this.w0, aVar.m, aVar.s));
                    }
                    if (this.g0) {
                        f15 = 0.0f;
                        paint.setColor(i0.a.f(0.0f, aVar.m, aVar.s));
                    } else {
                        f15 = 0.0f;
                    }
                    int i25 = (int) (255.0f * f10);
                    paint3.setAlpha(i25);
                    i11 = 0;
                    canvas2.drawLines(fArr, 0, i22, paint3);
                    if (i21 != 0) {
                        paint2.setStrokeWidth(f26);
                        paint2.setAlpha(i25);
                        canvas2.drawLine(f34, f29, f34, getMeasuredHeight() - this.s, paint2);
                        paint2.setAlpha(hs.e4);
                    }
                } else {
                    i10 = i3;
                    f13 = f19;
                    f14 = f20;
                    i11 = i14;
                    f15 = f21;
                    f12 = f22;
                }
                i3 = i10 + 1;
                canvas2 = canvas;
                i14 = i11;
                f21 = f15;
                f23 = f25;
                i12 = i20;
                f22 = f12;
                f19 = f13;
                f20 = f14;
                i19 = 2;
            }
        }
        f10 = f11;
        i3 = 0;
        while (true) {
            arrayList = this.d;
            if (i3 < arrayList.size()) {
            }
            i3 = i10 + 1;
            canvas2 = canvas;
            i14 = i11;
            f21 = f15;
            f23 = f25;
            i12 = i20;
            f22 = f12;
            f19 = f13;
            f20 = f14;
            i19 = 2;
        }
    }

    @Override // mg.g
    public final void n(Canvas canvas) {
        int i3;
        ArrayList arrayList;
        int i10;
        int i11;
        float f10;
        ArrayList arrayList2;
        float f11;
        int measuredHeight = getMeasuredHeight();
        int i12 = g.r1;
        int i13 = measuredHeight - i12;
        int measuredHeight2 = (getMeasuredHeight() - this.C0) - i12;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.i0 != null) {
            int i14 = 0;
            while (i14 < size) {
                og.a aVar = (og.a) arrayList3.get(i14);
                boolean z10 = aVar.n;
                Paint paint = aVar.c;
                float[] fArr = aVar.k;
                if (z10 || aVar.o != 0.0f) {
                    aVar.e.reset();
                    float[] fArr2 = this.i0.b;
                    int length = fArr2.length;
                    float f12 = fArr2.length < 2 ? 1.0f : fArr2[1] * this.D0;
                    long[] jArr = aVar.a.a;
                    float f13 = aVar.o;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < length) {
                        int i17 = i14;
                        long j10 = jArr[i15];
                        if (j10 < 0) {
                            i11 = i13;
                            arrayList2 = arrayList3;
                        } else {
                            ng.b bVar = this.i0;
                            i11 = i13;
                            float f14 = this.D0 * bVar.b[i15];
                            if (g.C1) {
                                f11 = this.k0;
                                f10 = f14;
                                arrayList2 = arrayList3;
                            } else {
                                f10 = f14;
                                arrayList2 = arrayList3;
                                f11 = bVar.e;
                            }
                            float v = org.telegram.messenger.camera.q.v(j10, f11, f13, 1.0f) * (i11 - measuredHeight2);
                            fArr[i16] = f10;
                            fArr[i16 + 1] = v;
                            int i18 = i16 + 3;
                            fArr[i16 + 2] = f10;
                            i16 += 4;
                            fArr[i18] = getMeasuredHeight() - this.s;
                        }
                        i15++;
                        i14 = i17;
                        i13 = i11;
                        arrayList3 = arrayList2;
                    }
                    i3 = i13;
                    arrayList = arrayList3;
                    i10 = i14;
                    paint.setStrokeWidth(f12 + 2.0f);
                    canvas.drawLines(fArr, 0, i16, paint);
                } else {
                    i3 = i13;
                    arrayList = arrayList3;
                    i10 = i14;
                }
                i14 = i10 + 1;
                i13 = i3;
                arrayList3 = arrayList;
            }
        }
    }

    @Override // mg.g, android.view.View
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.n0 = arrayList.size();
        int i3 = 0;
        while (true) {
            this.o0 = i3;
            int i10 = this.o0;
            if (i10 >= this.n0) {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            } else {
                l(canvas, (og.d) arrayList.get(i10));
                p(canvas, (og.d) arrayList.get(this.o0));
                i3 = this.o0 + 1;
            }
        }
    }

    @Override // mg.g
    public final void o(Canvas canvas) {
    }
}
