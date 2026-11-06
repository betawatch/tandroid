package lg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import di.m4;
import java.util.ArrayList;
import m4.d0;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.l41;
import org.telegram.ui.li0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class p extends g {
    public long[] D1;

    public p(Context context, f6 f6Var) {
        super(context, f6Var);
        this.w0 = true;
        this.x0 = true;
    }

    @Override // lg.g
    public final void C(int i7, int i10) {
        mg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        int i11 = this.s0;
        float f10 = this.G0;
        float f11 = (this.g0.k * f10) - g.k1;
        mg.d dVar = (mg.d) bVar;
        float[] fArr = dVar.b;
        float f12 = (i7 + f11) / (f10 - (fArr.length < 2 ? 1.0f : fArr[1] * f10));
        if (f12 < 0.0f) {
            this.s0 = 0;
        } else if (f12 > 1.0f) {
            this.s0 = dVar.a.length - 1;
        } else {
            int b10 = dVar.b(f12, this.F, this.G);
            this.s0 = b10;
            int i12 = this.G;
            if (b10 > i12) {
                this.s0 = i12;
            }
            int i13 = this.s0;
            int i14 = this.F;
            if (i13 < i14) {
                this.s0 = i14;
            }
        }
        if (i11 != this.s0) {
            this.u0 = true;
            c(true);
            x(f11);
            e eVar = this.Q0;
            if (eVar != null) {
                getSelectedDate();
                l41 l41Var = (l41) ((li0) eVar).b;
                l41Var.f();
                l41Var.b.t0.d(false, false);
            }
            invalidate();
            B();
        }
    }

    @Override // lg.g
    public final void K() {
        if (g.B1) {
            int length = ((mg.d) this.h0).a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    ng.h hVar = (ng.h) arrayList.get(i10);
                    if (hVar.n) {
                        j10 += hVar.a.a[i7];
                    }
                }
                if (j10 > j3) {
                    j3 = j10;
                }
            }
            if (j3 > 0) {
                float f10 = j3;
                if (f10 != this.l0) {
                    this.l0 = f10;
                    Animator animator = this.d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.j0, this.l0, new m4(this, 5));
                    this.d0 = e10;
                    e10.start();
                }
            }
        }
    }

    @Override // lg.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // lg.g
    public final ng.f h(mg.a aVar) {
        return new ng.h(aVar, this.W0);
    }

    @Override // lg.g
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        int i7;
        float f14;
        float f15;
        int i10;
        int i11;
        Canvas canvas2 = canvas;
        mg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        float f16 = this.F0;
        j jVar = this.g0;
        float f17 = jVar.l;
        float f18 = jVar.k;
        float f19 = f16 / (f17 - f18);
        float f20 = g.k1;
        float f21 = (f18 * f19) - f20;
        float[] fArr = ((mg.d) bVar).b;
        if (fArr.length < 2) {
            f11 = 1.0f;
            f10 = 1.0f;
        } else {
            float f22 = fArr[1];
            float f23 = f22 * f19;
            f10 = (f19 - f23) * f22;
            f11 = f23;
        }
        int i12 = ((int) (f20 / f11)) + 1;
        int i13 = 0;
        int max = Math.max(0, (this.F - i12) - 2);
        int min = Math.min(((mg.d) this.h0).b.length - 1, this.G + i12 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((ng.f) arrayList.get(i14)).j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.y0;
        float f24 = 0.0f;
        if (i15 == 2) {
            this.f0 = true;
            this.v0 = 0.0f;
            ng.j jVar2 = this.z0;
            float f25 = jVar2.f;
            f13 = 1.0f - f25;
            f12 = 2.0f;
            canvas2.scale((f25 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f12 = 2.0f;
            if (i15 == 1) {
                ng.j jVar3 = this.z0;
                float f26 = jVar3.f;
                canvas2.scale(f26, 1.0f, jVar3.d, jVar3.e);
                f13 = f26;
            } else {
                f13 = i15 == 3 ? this.z0.f : 1.0f;
            }
        }
        boolean z9 = this.s0 >= 0 && this.u0;
        while (true) {
            i7 = g.n1;
            if (max > min) {
                break;
            }
            if (this.s0 == max && z9) {
                f15 = f24;
            } else {
                int i16 = i13;
                float f27 = f24;
                f15 = f27;
                while (i16 < arrayList.size()) {
                    ng.f fVar = (ng.f) arrayList.get(i16);
                    if (fVar.n || fVar.o != f15) {
                        long[] jArr = fVar.a.a;
                        float f28 = (((f19 - f11) * ((mg.d) this.h0).b[max]) + (f11 / f12)) - f21;
                        i10 = min;
                        i11 = max;
                        float measuredHeight = (jArr[i11] / this.w) * ((getMeasuredHeight() - this.s) - i7) * fVar.o;
                        float measuredHeight2 = (getMeasuredHeight() - this.s) - measuredHeight;
                        float[] fArr2 = fVar.k;
                        int i17 = fVar.j;
                        int i18 = i17 + 1;
                        fVar.j = i18;
                        fArr2[i17] = f28;
                        int i19 = i17 + 2;
                        fVar.j = i19;
                        fArr2[i18] = measuredHeight2 - f27;
                        int i20 = i17 + 3;
                        fVar.j = i20;
                        fArr2[i19] = f28;
                        fVar.j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.s) - f27;
                        f27 += measuredHeight;
                    } else {
                        i10 = min;
                        i11 = max;
                    }
                    i16++;
                    min = i10;
                    max = i11;
                }
            }
            max++;
            min = min;
            f24 = f15;
            i13 = 0;
        }
        float f29 = f24;
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            ng.h hVar = (ng.h) arrayList.get(i21);
            Paint paint = (z9 || this.f0) ? hVar.q : hVar.c;
            if (z9) {
                f14 = 255.0f;
                hVar.q.setColor(i0.a.f(this.v0, hVar.m, hVar.r));
            } else {
                f14 = 255.0f;
            }
            if (this.f0) {
                hVar.q.setColor(i0.a.f(1.0f, hVar.m, hVar.r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.k, 0, hVar.j, paint);
        }
        if (z9) {
            int i22 = 0;
            float f30 = f29;
            while (i22 < arrayList.size()) {
                ng.f fVar2 = (ng.f) arrayList.get(i22);
                boolean z10 = fVar2.n;
                Paint paint2 = fVar2.c;
                if (z10 || fVar2.o != f29) {
                    long[] jArr2 = fVar2.a.a;
                    float f31 = (((f19 - f11) * ((mg.d) this.h0).b[this.s0]) + (f11 / f12)) - f21;
                    float measuredHeight3 = (jArr2[r15] / this.w) * ((getMeasuredHeight() - this.s) - i7) * fVar2.o;
                    paint2.setStrokeWidth(f10);
                    paint2.setAlpha((int) (f13 * 255.0f));
                    canvas2.drawLine(f31, ((getMeasuredHeight() - this.s) - measuredHeight3) - f30, f31, (getMeasuredHeight() - this.s) - f30, paint2);
                    f30 += measuredHeight3;
                }
                i22++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override // lg.g
    public final void n(Canvas canvas) {
        float f10;
        int i7;
        boolean z9;
        int i10;
        mg.b bVar = this.h0;
        if (bVar != null) {
            int length = ((mg.d) bVar).b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((ng.f) arrayList.get(i12)).j = 0;
            }
            boolean z10 = true;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f11 = ((mg.d) this.h0).b[i13] * this.C0;
                int i14 = i11;
                while (true) {
                    f10 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    ng.f fVar = (ng.f) arrayList.get(i14);
                    if (fVar.n || fVar.o != 0.0f) {
                        long j3 = fVar.a.a[i13];
                        long[] jArr2 = this.D1;
                        if (j3 > jArr2[i14]) {
                            jArr2[i14] = j3;
                        }
                    }
                    i14++;
                }
                if (i13 % max == 0) {
                    int i15 = i11;
                    float f12 = 0.0f;
                    while (i15 < size) {
                        ng.f fVar2 = (ng.f) arrayList.get(i15);
                        if (fVar2.n || fVar2.o != f10) {
                            float f13 = g.B1 ? this.j0 : ((mg.d) this.h0).e;
                            long[] jArr3 = this.D1;
                            boolean z11 = z10;
                            i7 = i13;
                            float f14 = (jArr3[i15] / f13) * fVar2.o;
                            int i16 = this.B0;
                            float f15 = f14 * i16;
                            float[] fArr = fVar2.k;
                            int i17 = fVar2.j;
                            z9 = z11;
                            int i18 = i17 + 1;
                            fVar2.j = i18;
                            fArr[i17] = f11;
                            int i19 = i17 + 2;
                            fVar2.j = i19;
                            i10 = length;
                            fArr[i18] = (i16 - f15) - f12;
                            int i20 = i17 + 3;
                            fVar2.j = i20;
                            fArr[i19] = f11;
                            fVar2.j = i17 + 4;
                            fArr[i20] = i16 - f12;
                            f12 += f15;
                            jArr3[i15] = 0;
                        } else {
                            i10 = length;
                            z9 = z10;
                            i7 = i13;
                        }
                        i15++;
                        i13 = i7;
                        z10 = z9;
                        length = i10;
                        f10 = 0.0f;
                    }
                }
                i13++;
                z10 = z10;
                length = length;
                i11 = 0;
            }
            boolean z12 = z10;
            mg.b bVar2 = this.h0;
            float f16 = ((mg.d) bVar2).b.length < 2 ? 1.0f : ((mg.d) bVar2).b[z12 ? 1 : 0] * this.C0;
            for (int i21 = 0; i21 < size; i21++) {
                ng.f fVar3 = (ng.f) arrayList.get(i21);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(max * f16);
                paint2.setAlpha(qs.e4);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
            }
        }
    }

    @Override // lg.g, android.view.View
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.m0 = arrayList.size();
        int i7 = 0;
        while (true) {
            this.n0 = i7;
            int i10 = this.n0;
            if (i10 >= this.m0) {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            } else {
                l(canvas, (ng.d) arrayList.get(i10));
                p(canvas, (ng.d) arrayList.get(this.n0));
                i7 = this.n0 + 1;
            }
        }
    }

    @Override // lg.g
    public final long r(int i7, int i10) {
        return ((mg.d) this.h0).m.w0(i7, i10);
    }

    @Override // lg.g
    public final void u() {
        super.u();
        this.j0 = 0.0f;
        int length = ((mg.d) this.h0).a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < length; i7++) {
            long j3 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                ng.h hVar = (ng.h) arrayList.get(i10);
                if (hVar.n) {
                    j3 += hVar.a.a[i7];
                }
            }
            float f10 = j3;
            if (f10 > this.j0) {
                this.j0 = f10;
            }
        }
    }

    @Override // lg.g
    public final void z() {
        int length = ((mg.a) ((mg.d) this.h0).d.get(0)).a.length;
        int size = ((mg.d) this.h0).d.size();
        ((mg.d) this.h0).l = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            ((mg.d) this.h0).l[i7] = 0;
            for (int i10 = 0; i10 < size; i10++) {
                if (((ng.h) this.d.get(i10)).n) {
                    mg.b bVar = this.h0;
                    long[] jArr = ((mg.d) bVar).l;
                    jArr[i7] = jArr[i7] + ((mg.a) ((mg.d) bVar).d.get(i10)).a[i7];
                }
            }
        }
        mg.b bVar2 = this.h0;
        ((mg.d) bVar2).m = new d0(((mg.d) bVar2).l);
        super.z();
    }

    @Override // lg.g
    public final void o(Canvas canvas) {
    }
}
