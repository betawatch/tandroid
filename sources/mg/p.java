package mg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import ei.n4;
import java.util.ArrayList;
import m2.t;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.b41;
import org.telegram.ui.ci0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p extends g {
    public long[] E1;

    public p(Context context, e6 e6Var) {
        super(context, e6Var);
        this.x0 = true;
        this.y0 = true;
    }

    @Override // mg.g
    public final void C(int i3, int i10) {
        ng.b bVar = this.i0;
        if (bVar == null) {
            return;
        }
        int i11 = this.t0;
        float f10 = this.H0;
        float f11 = (this.h0.k * f10) - g.l1;
        ng.d dVar = (ng.d) bVar;
        float[] fArr = dVar.b;
        float f12 = (i3 + f11) / (f10 - (fArr.length < 2 ? 1.0f : fArr[1] * f10));
        if (f12 < 0.0f) {
            this.t0 = 0;
        } else if (f12 > 1.0f) {
            this.t0 = dVar.a.length - 1;
        } else {
            int b10 = dVar.b(f12, this.G, this.H);
            this.t0 = b10;
            int i12 = this.H;
            if (b10 > i12) {
                this.t0 = i12;
            }
            int i13 = this.t0;
            int i14 = this.G;
            if (i13 < i14) {
                this.t0 = i14;
            }
        }
        if (i11 != this.t0) {
            this.v0 = true;
            c(true);
            x(f11);
            e eVar = this.R0;
            if (eVar != null) {
                getSelectedDate();
                b41 b41Var = (b41) ((ci0) eVar).b;
                b41Var.f();
                b41Var.b.u0.d(false, false);
            }
            invalidate();
            B();
        }
    }

    @Override // mg.g
    public final void K() {
        if (g.C1) {
            int length = ((ng.d) this.i0).a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                long j11 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    og.h hVar = (og.h) arrayList.get(i10);
                    if (hVar.n) {
                        j11 += hVar.a.a[i3];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f10 = j10;
                if (f10 != this.m0) {
                    this.m0 = f10;
                    Animator animator = this.e0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.k0, this.m0, new n4(this, 5));
                    this.e0 = e10;
                    e10.start();
                }
            }
        }
    }

    @Override // mg.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // mg.g
    public final og.f h(ng.a aVar) {
        return new og.h(aVar, this.X0);
    }

    @Override // mg.g
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        int i3;
        float f14;
        float f15;
        int i10;
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
        float f20 = g.l1;
        float f21 = (f18 * f19) - f20;
        float[] fArr = ((ng.d) bVar).b;
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
        int max = Math.max(0, (this.G - i12) - 2);
        int min = Math.min(((ng.d) this.i0).b.length - 1, this.H + i12 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((og.f) arrayList.get(i14)).j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.z0;
        float f24 = 0.0f;
        if (i15 == 2) {
            this.g0 = true;
            this.w0 = 0.0f;
            og.j jVar2 = this.A0;
            float f25 = jVar2.f;
            f13 = 1.0f - f25;
            f12 = 2.0f;
            canvas2.scale((f25 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f12 = 2.0f;
            if (i15 == 1) {
                og.j jVar3 = this.A0;
                float f26 = jVar3.f;
                canvas2.scale(f26, 1.0f, jVar3.d, jVar3.e);
                f13 = f26;
            } else {
                f13 = i15 == 3 ? this.A0.f : 1.0f;
            }
        }
        boolean z10 = this.t0 >= 0 && this.v0;
        while (true) {
            i3 = g.o1;
            if (max > min) {
                break;
            }
            if (this.t0 == max && z10) {
                f15 = f24;
            } else {
                int i16 = i13;
                float f27 = f24;
                f15 = f27;
                while (i16 < arrayList.size()) {
                    og.f fVar = (og.f) arrayList.get(i16);
                    if (fVar.n || fVar.o != f15) {
                        long[] jArr = fVar.a.a;
                        float f28 = (((f19 - f11) * ((ng.d) this.i0).b[max]) + (f11 / f12)) - f21;
                        i10 = min;
                        i11 = max;
                        float measuredHeight = (jArr[i11] / this.w) * ((getMeasuredHeight() - this.s) - i3) * fVar.o;
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
            og.h hVar = (og.h) arrayList.get(i21);
            Paint paint = (z10 || this.g0) ? hVar.q : hVar.c;
            if (z10) {
                f14 = 255.0f;
                hVar.q.setColor(i0.a.f(this.w0, hVar.m, hVar.r));
            } else {
                f14 = 255.0f;
            }
            if (this.g0) {
                hVar.q.setColor(i0.a.f(1.0f, hVar.m, hVar.r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.k, 0, hVar.j, paint);
        }
        if (z10) {
            int i22 = 0;
            float f30 = f29;
            while (i22 < arrayList.size()) {
                og.f fVar2 = (og.f) arrayList.get(i22);
                boolean z11 = fVar2.n;
                Paint paint2 = fVar2.c;
                if (z11 || fVar2.o != f29) {
                    long[] jArr2 = fVar2.a.a;
                    float f31 = (((f19 - f11) * ((ng.d) this.i0).b[this.t0]) + (f11 / f12)) - f21;
                    float measuredHeight3 = (jArr2[r15] / this.w) * ((getMeasuredHeight() - this.s) - i3) * fVar2.o;
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

    @Override // mg.g
    public final void n(Canvas canvas) {
        float f10;
        int i3;
        boolean z10;
        int i10;
        ng.b bVar = this.i0;
        if (bVar != null) {
            int length = ((ng.d) bVar).b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((og.f) arrayList.get(i12)).j = 0;
            }
            boolean z11 = true;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.E1;
            if (jArr == null || jArr.length < size) {
                this.E1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f11 = ((ng.d) this.i0).b[i13] * this.D0;
                int i14 = i11;
                while (true) {
                    f10 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    og.f fVar = (og.f) arrayList.get(i14);
                    if (fVar.n || fVar.o != 0.0f) {
                        long j10 = fVar.a.a[i13];
                        long[] jArr2 = this.E1;
                        if (j10 > jArr2[i14]) {
                            jArr2[i14] = j10;
                        }
                    }
                    i14++;
                }
                if (i13 % max == 0) {
                    int i15 = i11;
                    float f12 = 0.0f;
                    while (i15 < size) {
                        og.f fVar2 = (og.f) arrayList.get(i15);
                        if (fVar2.n || fVar2.o != f10) {
                            float f13 = g.C1 ? this.k0 : ((ng.d) this.i0).e;
                            long[] jArr3 = this.E1;
                            boolean z12 = z11;
                            i3 = i13;
                            float f14 = (jArr3[i15] / f13) * fVar2.o;
                            int i16 = this.C0;
                            float f15 = f14 * i16;
                            float[] fArr = fVar2.k;
                            int i17 = fVar2.j;
                            z10 = z12;
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
                            z10 = z11;
                            i3 = i13;
                        }
                        i15++;
                        i13 = i3;
                        z11 = z10;
                        length = i10;
                        f10 = 0.0f;
                    }
                }
                i13++;
                z11 = z11;
                length = length;
                i11 = 0;
            }
            boolean z13 = z11;
            ng.b bVar2 = this.i0;
            float f16 = ((ng.d) bVar2).b.length < 2 ? 1.0f : ((ng.d) bVar2).b[z13 ? 1 : 0] * this.D0;
            for (int i21 = 0; i21 < size; i21++) {
                og.f fVar3 = (og.f) arrayList.get(i21);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(max * f16);
                paint2.setAlpha(hs.e4);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
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
    public final long r(int i3, int i10) {
        return ((ng.d) this.i0).m.I0(i3, i10);
    }

    @Override // mg.g
    public final void u() {
        super.u();
        this.k0 = 0.0f;
        int length = ((ng.d) this.i0).a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < length; i3++) {
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                og.h hVar = (og.h) arrayList.get(i10);
                if (hVar.n) {
                    j10 += hVar.a.a[i3];
                }
            }
            float f10 = j10;
            if (f10 > this.k0) {
                this.k0 = f10;
            }
        }
    }

    @Override // mg.g
    public final void z() {
        int length = ((ng.a) ((ng.d) this.i0).d.get(0)).a.length;
        int size = ((ng.d) this.i0).d.size();
        ((ng.d) this.i0).l = new long[length];
        for (int i3 = 0; i3 < length; i3++) {
            ((ng.d) this.i0).l[i3] = 0;
            for (int i10 = 0; i10 < size; i10++) {
                if (((og.h) this.d.get(i10)).n) {
                    ng.b bVar = this.i0;
                    long[] jArr = ((ng.d) bVar).l;
                    jArr[i3] = jArr[i3] + ((ng.a) ((ng.d) bVar).d.get(i10)).a[i3];
                }
            }
        }
        ng.b bVar2 = this.i0;
        ((ng.d) bVar2).m = new t(((ng.d) bVar2).l);
        super.z();
    }

    @Override // mg.g
    public final void o(Canvas canvas) {
    }
}
