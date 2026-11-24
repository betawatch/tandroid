// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jf0 extends ng0 {
    @Override // ng0
    public float getMinDistance() {
        return 0.1f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ae A[SYNTHETIC] */
    @Override // ng0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        float f;
        float f2;
        int i;
        ArrayList arrayList;
        float f3;
        int i2;
        float f4;
        float f5;
        float f6;
        int i3;
        Canvas canvas2 = canvas;
        nl1 nl1Var = this.i0;
        if (nl1Var == null) {
            return;
        }
        float f7 = this.G0;
        tl1 tl1Var = this.h0;
        float f8 = tl1Var.l;
        float f9 = tl1Var.k;
        float f10 = f7 / (f8 - f9);
        float f11 = (f9 * f10) - ng0.l1;
        int i4 = 1;
        int i5 = this.G - 1;
        int i6 = 0;
        int i7 = i5 < 0 ? 0 : i5;
        int i8 = this.H + 1;
        if (i8 > ((ml1) nl1Var.d.get(0)).a.length - 1) {
            i8 = ((ml1) this.i0.d.get(0)).a.length - 1;
        }
        int i9 = i8;
        canvas2.save();
        float f12 = 0.0f;
        canvas2.clipRect(this.E0, 0.0f, this.F0, getMeasuredHeight() - this.s);
        canvas2.save();
        byte b = this.z0;
        float f13 = 2.0f;
        int i10 = 2;
        float f14 = 1.0f;
        if (b == 2) {
            this.g0 = true;
            this.w0 = 0.0f;
            a1c a1cVar = this.A0;
            float f15 = a1cVar.f;
            f2 = 1.0f - f15;
            canvas2.scale((f15 * 2.0f) + 1.0f, 1.0f, a1cVar.d, a1cVar.e);
        } else if (b == 1) {
            a1c a1cVar2 = this.A0;
            f2 = a1cVar2.f;
            canvas2.scale(f2, 1.0f, a1cVar2.d, a1cVar2.e);
        } else {
            f = 1.0f;
            i = 0;
            while (true) {
                arrayList = this.d;
                if (i < arrayList.size()) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                kf0 kf0Var = (kf0) arrayList.get(i);
                boolean z = kf0Var.n;
                float[] fArr = kf0Var.k;
                float f16 = f14;
                Paint paint = kf0Var.r;
                int i11 = i4;
                Paint paint2 = kf0Var.c;
                if (z || kf0Var.o != f12) {
                    float[] fArr2 = this.i0.b;
                    f3 = f13;
                    float f17 = fArr2.length < i10 ? f16 : fArr2[i11] * f10;
                    long[] jArr = kf0Var.a.a;
                    float f18 = kf0Var.o;
                    i2 = i;
                    int i12 = i6;
                    float f19 = f12;
                    float f20 = f19;
                    int i13 = i12;
                    int i14 = i7;
                    while (i14 <= i9) {
                        float f21 = f19;
                        float f22 = ((this.i0.b[i14] * f10) + (f17 / f3)) - f11;
                        float f23 = f10;
                        float f24 = f11;
                        float measuredHeight = (getMeasuredHeight() - this.s) - (((jArr[i14] / this.w) * f18) * ((getMeasuredHeight() - this.s) - ng0.o1));
                        if (i14 == this.t0 && this.v0) {
                            f20 = measuredHeight;
                            i12 = i11;
                            f19 = f22;
                        } else {
                            fArr[i13] = f22;
                            fArr[i13 + 1] = measuredHeight;
                            int i15 = i13 + 3;
                            fArr[i13 + 2] = f22;
                            i13 += 4;
                            fArr[i15] = getMeasuredHeight() - this.s;
                            f19 = f21;
                        }
                        i14++;
                        f10 = f23;
                        f11 = f24;
                    }
                    float f25 = f19;
                    f4 = f10;
                    f5 = f11;
                    Paint paint3 = (i12 != 0 || this.g0) ? paint : paint2;
                    paint3.setStrokeWidth(f17);
                    if (i12 != 0) {
                        paint.setColor(on2.f(f16 - this.w0, kf0Var.m, kf0Var.s));
                    }
                    if (this.g0) {
                        f6 = 0.0f;
                        paint.setColor(on2.f(0.0f, kf0Var.m, kf0Var.s));
                    } else {
                        f6 = 0.0f;
                    }
                    int i16 = (int) (255.0f * f);
                    paint3.setAlpha(i16);
                    i3 = 0;
                    canvas2.drawLines(fArr, 0, i13, paint3);
                    if (i12 != 0) {
                        paint2.setStrokeWidth(f17);
                        paint2.setAlpha(i16);
                        canvas2.drawLine(f25, f20, f25, getMeasuredHeight() - this.s, paint2);
                        paint2.setAlpha(nm7.d4);
                    }
                } else {
                    i2 = i;
                    f4 = f10;
                    f5 = f11;
                    i3 = i6;
                    f6 = f12;
                    f3 = f13;
                }
                i = i2 + 1;
                canvas2 = canvas;
                i6 = i3;
                f12 = f6;
                f14 = f16;
                i4 = i11;
                f13 = f3;
                f10 = f4;
                f11 = f5;
                i10 = 2;
            }
        }
        f = f2;
        i = 0;
        while (true) {
            arrayList = this.d;
            if (i < arrayList.size()) {
            }
            i = i2 + 1;
            canvas2 = canvas;
            i6 = i3;
            f12 = f6;
            f14 = f16;
            i4 = i11;
            f13 = f3;
            f10 = f4;
            f11 = f5;
            i10 = 2;
        }
    }

    @Override // ng0, android.view.View
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.n0 = arrayList.size();
        int i = 0;
        while (true) {
            this.o0 = i;
            int i2 = this.o0;
            if (i2 >= this.n0) {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            } else {
                l(canvas, (ql1) arrayList.get(i2));
                p(canvas, (ql1) arrayList.get(this.o0));
                i = this.o0 + 1;
            }
        }
    }

    @Override // ng0
    public final void o(Canvas canvas) {
    }
}
