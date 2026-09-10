package hg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.pa1;
import org.telegram.ui.ul0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p extends g {
    public long[] D1;

    public p(Context context, f6 f6Var) {
        super(context, f6Var);
        this.w0 = true;
        this.x0 = true;
    }

    @Override // hg.g
    public final void C(int i10, int i11) {
        ig.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        int i12 = this.s0;
        float f7 = this.G0;
        float f10 = (this.g0.k * f7) - g.k1;
        ig.d dVar = (ig.d) bVar;
        float[] fArr = dVar.b;
        float f11 = (i10 + f10) / (f7 - (fArr.length < 2 ? 1.0f : fArr[1] * f7));
        if (f11 < 0.0f) {
            this.s0 = 0;
        } else if (f11 > 1.0f) {
            this.s0 = dVar.a.length - 1;
        } else {
            int b10 = dVar.b(f11, this.F, this.G);
            this.s0 = b10;
            int i13 = this.G;
            if (b10 > i13) {
                this.s0 = i13;
            }
            int i14 = this.s0;
            int i15 = this.F;
            if (i14 < i15) {
                this.s0 = i15;
            }
        }
        if (i12 != this.s0) {
            this.u0 = true;
            c(true);
            x(f10);
            e eVar = this.Q0;
            if (eVar != null) {
                getSelectedDate();
                pa1 pa1Var = (pa1) ((ul0) eVar).b;
                pa1Var.f();
                pa1Var.b.t0.d(false, false);
            }
            invalidate();
            B();
        }
    }

    @Override // hg.g
    public final void K() {
        if (g.B1) {
            int length = ((ig.d) this.h0).a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    jg.h hVar = (jg.h) arrayList.get(i11);
                    if (hVar.n) {
                        j10 += hVar.a.a[i10];
                    }
                }
                if (j10 > j3) {
                    j3 = j10;
                }
            }
            if (j3 > 0) {
                float f7 = j3;
                if (f7 != this.l0) {
                    this.l0 = f7;
                    Animator animator = this.d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.j0, this.l0, new ai.m(this, 4));
                    this.d0 = e;
                    e.start();
                }
            }
        }
    }

    @Override // hg.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // hg.g
    public final jg.f h(ig.a aVar) {
        return new jg.h(aVar, this.W0);
    }

    @Override // hg.g
    public final void k(Canvas canvas) {
        float f7;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        int i10;
        float f13;
        int i11;
        int i12;
        Canvas canvas2 = canvas;
        ig.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        float f14 = this.F0;
        j jVar = this.g0;
        float f15 = jVar.l;
        float f16 = jVar.k;
        float f17 = f14 / (f15 - f16);
        float f18 = g.k1;
        float f19 = (f16 * f17) - f18;
        float[] fArr = ((ig.d) bVar).b;
        if (fArr.length < 2) {
            f10 = 1.0f;
            f7 = 1.0f;
        } else {
            float f20 = fArr[1];
            float f21 = f20 * f17;
            f7 = (f17 - f21) * f20;
            f10 = f21;
        }
        int i13 = ((int) (f18 / f10)) + 1;
        int max = Math.max(0, (this.F - i13) - 2);
        int min = Math.min(((ig.d) this.h0).b.length - 1, this.G + i13 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((jg.f) arrayList.get(i14)).j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.y0;
        if (i15 == 2) {
            this.f0 = true;
            this.v0 = 0.0f;
            jg.j jVar2 = this.z0;
            float f22 = jVar2.f;
            f12 = 1.0f - f22;
            f11 = 2.0f;
            canvas2.scale((f22 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f11 = 2.0f;
            if (i15 == 1) {
                jg.j jVar3 = this.z0;
                float f23 = jVar3.f;
                canvas2.scale(f23, 1.0f, jVar3.d, jVar3.e);
                f12 = f23;
            } else {
                f12 = i15 == 3 ? this.z0.f : 1.0f;
            }
        }
        boolean z10 = this.s0 >= 0 && this.u0;
        while (true) {
            i10 = g.n1;
            if (max > min) {
                break;
            }
            if (this.s0 != max || !z10) {
                int i16 = 0;
                float f24 = 0.0f;
                while (i16 < arrayList.size()) {
                    jg.f fVar = (jg.f) arrayList.get(i16);
                    if (fVar.n || fVar.o != 0.0f) {
                        long[] jArr = fVar.a.a;
                        float f25 = (((f17 - f10) * ((ig.d) this.h0).b[max]) + (f10 / f11)) - f19;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (jArr[i12] / this.v) * ((getMeasuredHeight() - this.s) - i10) * fVar.o;
                        float measuredHeight2 = (getMeasuredHeight() - this.s) - measuredHeight;
                        float[] fArr2 = fVar.k;
                        int i17 = fVar.j;
                        int i18 = i17 + 1;
                        fVar.j = i18;
                        fArr2[i17] = f25;
                        int i19 = i17 + 2;
                        fVar.j = i19;
                        fArr2[i18] = measuredHeight2 - f24;
                        int i20 = i17 + 3;
                        fVar.j = i20;
                        fArr2[i19] = f25;
                        fVar.j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.s) - f24;
                        f24 += measuredHeight;
                    } else {
                        i11 = min;
                        i12 = max;
                    }
                    i16++;
                    min = i11;
                    max = i12;
                }
            }
            max++;
            min = min;
        }
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            jg.h hVar = (jg.h) arrayList.get(i21);
            Paint paint = (z10 || this.f0) ? hVar.q : hVar.c;
            if (z10) {
                f13 = 255.0f;
                hVar.q.setColor(i0.a.d(this.v0, hVar.m, hVar.r));
            } else {
                f13 = 255.0f;
            }
            if (this.f0) {
                hVar.q.setColor(i0.a.d(1.0f, hVar.m, hVar.r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f7);
            canvas2.drawLines(hVar.k, 0, hVar.j, paint);
        }
        if (z10) {
            int i22 = 0;
            float f26 = 0.0f;
            while (i22 < arrayList.size()) {
                jg.f fVar2 = (jg.f) arrayList.get(i22);
                boolean z11 = fVar2.n;
                Paint paint2 = fVar2.c;
                if (z11 || fVar2.o != 0.0f) {
                    long[] jArr2 = fVar2.a.a;
                    float f27 = (((f17 - f10) * ((ig.d) this.h0).b[this.s0]) + (f10 / f11)) - f19;
                    float measuredHeight3 = (jArr2[r15] / this.v) * ((getMeasuredHeight() - this.s) - i10) * fVar2.o;
                    paint2.setStrokeWidth(f7);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f27, ((getMeasuredHeight() - this.s) - measuredHeight3) - f26, f27, (getMeasuredHeight() - this.s) - f26, paint2);
                    f26 += measuredHeight3;
                }
                i22++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override // hg.g
    public final void n(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        ig.b bVar = this.h0;
        if (bVar != null) {
            int length = ((ig.d) bVar).b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((jg.f) arrayList.get(i12)).j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f10 = ((ig.d) this.h0).b[i13] * this.C0;
                int i14 = 0;
                while (true) {
                    f7 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    jg.f fVar = (jg.f) arrayList.get(i14);
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
                    int i15 = 0;
                    float f11 = 0.0f;
                    while (i15 < size) {
                        jg.f fVar2 = (jg.f) arrayList.get(i15);
                        if (fVar2.n || fVar2.o != f7) {
                            float f12 = g.B1 ? this.j0 : ((ig.d) this.h0).e;
                            long[] jArr3 = this.D1;
                            i10 = i13;
                            float f13 = (jArr3[i15] / f12) * fVar2.o;
                            int i16 = this.B0;
                            float f14 = f13 * i16;
                            float[] fArr = fVar2.k;
                            int i17 = fVar2.j;
                            int i18 = i17 + 1;
                            fVar2.j = i18;
                            fArr[i17] = f10;
                            int i19 = i17 + 2;
                            fVar2.j = i19;
                            i11 = length;
                            fArr[i18] = (i16 - f14) - f11;
                            int i20 = i17 + 3;
                            fVar2.j = i20;
                            fArr[i19] = f10;
                            fVar2.j = i17 + 4;
                            fArr[i20] = i16 - f11;
                            f11 += f14;
                            jArr3[i15] = 0;
                        } else {
                            i11 = length;
                            i10 = i13;
                        }
                        i15++;
                        i13 = i10;
                        length = i11;
                        f7 = 0.0f;
                    }
                }
                i13++;
                length = length;
            }
            ig.b bVar2 = this.h0;
            float f15 = ((ig.d) bVar2).b.length < 2 ? 1.0f : ((ig.d) bVar2).b[1] * this.C0;
            for (int i21 = 0; i21 < size; i21++) {
                jg.f fVar3 = (jg.f) arrayList.get(i21);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(max * f15);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
            }
        }
    }

    @Override // hg.g, android.view.View
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
                l(canvas, (jg.d) arrayList.get(i11));
                p(canvas, (jg.d) arrayList.get(this.n0));
                i10 = this.n0 + 1;
            }
        }
    }

    @Override // hg.g
    public final long r(int i10, int i11) {
        return ((ig.d) this.h0).m.rMaxQ(i10, i11);
    }

    @Override // hg.g
    public final void u() {
        super.u();
        this.j0 = 0.0f;
        int length = ((ig.d) this.h0).a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j3 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                jg.h hVar = (jg.h) arrayList.get(i11);
                if (hVar.n) {
                    j3 += hVar.a.a[i10];
                }
            }
            float f7 = j3;
            if (f7 > this.j0) {
                this.j0 = f7;
            }
        }
    }

    @Override // hg.g
    public final void z() {
        int length = ((ig.a) ((ig.d) this.h0).d.get(0)).a.length;
        int size = ((ig.d) this.h0).d.size();
        ((ig.d) this.h0).l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((ig.d) this.h0).l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((jg.h) this.d.get(i11)).n) {
                    ig.b bVar = this.h0;
                    long[] jArr = ((ig.d) bVar).l;
                    jArr[i10] = jArr[i10] + ((ig.a) ((ig.d) bVar).d.get(i11)).a[i10];
                }
            }
        }
        ig.b bVar2 = this.h0;
        ((ig.d) bVar2).m = new SegmentTree(((ig.d) bVar2).l);
        super.z();
    }

    @Override // hg.g
    public final void o(Canvas canvas) {
    }
}
