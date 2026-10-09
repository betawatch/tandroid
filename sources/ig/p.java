package ig;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.hq0;
import org.telegram.ui.la1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p extends g {
    public long[] D1;

    public p(Context context, e6 e6Var) {
        super(context, e6Var);
        this.w0 = true;
        this.x0 = true;
    }

    @Override // ig.g
    public final void C(int i10, int i11) {
        jg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        int i12 = this.s0;
        float f7 = this.G0;
        float f10 = (this.g0.k * f7) - g.k1;
        jg.d dVar = (jg.d) bVar;
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
                la1 la1Var = (la1) ((hq0) eVar).b;
                la1Var.f();
                la1Var.b.t0.d(false, false);
            }
            invalidate();
            B();
        }
    }

    @Override // ig.g
    public final void K() {
        if (g.B1) {
            int length = ((jg.d) this.h0).a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    kg.h hVar = (kg.h) arrayList.get(i11);
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
                    ValueAnimator e7 = g.e(this.j0, this.l0, new l6(this, 5));
                    this.d0 = e7;
                    e7.start();
                }
            }
        }
    }

    @Override // ig.g
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // ig.g
    public final kg.f h(jg.a aVar) {
        return new kg.h(aVar, this.W0);
    }

    @Override // ig.g
    public final void k(Canvas canvas) {
        float f7;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        int i11;
        int i12;
        Canvas canvas2 = canvas;
        jg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        float f15 = this.F0;
        j jVar = this.g0;
        float f16 = jVar.l;
        float f17 = jVar.k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.k1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((jg.d) bVar).b;
        if (fArr.length < 2) {
            f10 = 1.0f;
            f7 = 1.0f;
        } else {
            float f21 = fArr[1];
            float f22 = f21 * f18;
            f7 = (f18 - f22) * f21;
            f10 = f22;
        }
        int i13 = ((int) (f19 / f10)) + 1;
        int i14 = 0;
        int max = Math.max(0, (this.F - i13) - 2);
        int min = Math.min(((jg.d) this.h0).b.length - 1, this.G + i13 + 2);
        int i15 = 0;
        while (true) {
            arrayList = this.d;
            if (i15 >= arrayList.size()) {
                break;
            }
            ((kg.f) arrayList.get(i15)).j = 0;
            i15++;
        }
        canvas2.save();
        int i16 = this.y0;
        float f23 = 0.0f;
        if (i16 == 2) {
            this.f0 = true;
            this.v0 = 0.0f;
            kg.j jVar2 = this.z0;
            float f24 = jVar2.f;
            f12 = 1.0f - f24;
            f11 = 2.0f;
            canvas2.scale((f24 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f11 = 2.0f;
            if (i16 == 1) {
                kg.j jVar3 = this.z0;
                float f25 = jVar3.f;
                canvas2.scale(f25, 1.0f, jVar3.d, jVar3.e);
                f12 = f25;
            } else {
                f12 = i16 == 3 ? this.z0.f : 1.0f;
            }
        }
        boolean z10 = this.s0 >= 0 && this.u0;
        while (true) {
            i10 = g.n1;
            if (max > min) {
                break;
            }
            if (this.s0 == max && z10) {
                f14 = f23;
            } else {
                int i17 = i14;
                float f26 = f23;
                f14 = f26;
                while (i17 < arrayList.size()) {
                    kg.f fVar = (kg.f) arrayList.get(i17);
                    if (fVar.n || fVar.o != f14) {
                        long[] jArr = fVar.a.a;
                        float f27 = (((f18 - f10) * ((jg.d) this.h0).b[max]) + (f10 / f11)) - f20;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (jArr[i12] / this.v) * ((getMeasuredHeight() - this.s) - i10) * fVar.o;
                        float measuredHeight2 = (getMeasuredHeight() - this.s) - measuredHeight;
                        float[] fArr2 = fVar.k;
                        int i18 = fVar.j;
                        int i19 = i18 + 1;
                        fVar.j = i19;
                        fArr2[i18] = f27;
                        int i20 = i18 + 2;
                        fVar.j = i20;
                        fArr2[i19] = measuredHeight2 - f26;
                        int i21 = i18 + 3;
                        fVar.j = i21;
                        fArr2[i20] = f27;
                        fVar.j = i18 + 4;
                        fArr2[i21] = (getMeasuredHeight() - this.s) - f26;
                        f26 += measuredHeight;
                    } else {
                        i11 = min;
                        i12 = max;
                    }
                    i17++;
                    min = i11;
                    max = i12;
                }
            }
            max++;
            min = min;
            f23 = f14;
            i14 = 0;
        }
        float f28 = f23;
        for (int i22 = 0; i22 < arrayList.size(); i22++) {
            kg.h hVar = (kg.h) arrayList.get(i22);
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
            int i23 = 0;
            float f29 = f28;
            while (i23 < arrayList.size()) {
                kg.f fVar2 = (kg.f) arrayList.get(i23);
                boolean z11 = fVar2.n;
                Paint paint2 = fVar2.c;
                if (z11 || fVar2.o != f28) {
                    long[] jArr2 = fVar2.a.a;
                    float f30 = (((f18 - f10) * ((jg.d) this.h0).b[this.s0]) + (f10 / f11)) - f20;
                    float measuredHeight3 = (jArr2[r15] / this.v) * ((getMeasuredHeight() - this.s) - i10) * fVar2.o;
                    paint2.setStrokeWidth(f7);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f30, ((getMeasuredHeight() - this.s) - measuredHeight3) - f29, f30, (getMeasuredHeight() - this.s) - f29, paint2);
                    f29 += measuredHeight3;
                }
                i23++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override // ig.g
    public final void n(Canvas canvas) {
        float f7;
        int i10;
        boolean z10;
        int i11;
        jg.b bVar = this.h0;
        if (bVar != null) {
            int length = ((jg.d) bVar).b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((kg.f) arrayList.get(i13)).j = 0;
            }
            boolean z11 = true;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i14 = 0;
            while (i14 < length) {
                float f10 = ((jg.d) this.h0).b[i14] * this.C0;
                int i15 = i12;
                while (true) {
                    f7 = 0.0f;
                    if (i15 >= size) {
                        break;
                    }
                    kg.f fVar = (kg.f) arrayList.get(i15);
                    if (fVar.n || fVar.o != 0.0f) {
                        long j3 = fVar.a.a[i14];
                        long[] jArr2 = this.D1;
                        if (j3 > jArr2[i15]) {
                            jArr2[i15] = j3;
                        }
                    }
                    i15++;
                }
                if (i14 % max == 0) {
                    int i16 = i12;
                    float f11 = 0.0f;
                    while (i16 < size) {
                        kg.f fVar2 = (kg.f) arrayList.get(i16);
                        if (fVar2.n || fVar2.o != f7) {
                            float f12 = g.B1 ? this.j0 : ((jg.d) this.h0).e;
                            long[] jArr3 = this.D1;
                            boolean z12 = z11;
                            i10 = i14;
                            float f13 = (jArr3[i16] / f12) * fVar2.o;
                            int i17 = this.B0;
                            float f14 = f13 * i17;
                            float[] fArr = fVar2.k;
                            int i18 = fVar2.j;
                            z10 = z12;
                            int i19 = i18 + 1;
                            fVar2.j = i19;
                            fArr[i18] = f10;
                            int i20 = i18 + 2;
                            fVar2.j = i20;
                            i11 = length;
                            fArr[i19] = (i17 - f14) - f11;
                            int i21 = i18 + 3;
                            fVar2.j = i21;
                            fArr[i20] = f10;
                            fVar2.j = i18 + 4;
                            fArr[i21] = i17 - f11;
                            f11 += f14;
                            jArr3[i16] = 0;
                        } else {
                            i11 = length;
                            z10 = z11;
                            i10 = i14;
                        }
                        i16++;
                        i14 = i10;
                        z11 = z10;
                        length = i11;
                        f7 = 0.0f;
                    }
                }
                i14++;
                z11 = z11;
                length = length;
                i12 = 0;
            }
            boolean z13 = z11;
            jg.b bVar2 = this.h0;
            float f15 = ((jg.d) bVar2).b.length < 2 ? 1.0f : ((jg.d) bVar2).b[z13 ? 1 : 0] * this.C0;
            for (int i22 = 0; i22 < size; i22++) {
                kg.f fVar3 = (kg.f) arrayList.get(i22);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(max * f15);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
            }
        }
    }

    @Override // ig.g, android.view.View
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
                l(canvas, (kg.d) arrayList.get(i11));
                p(canvas, (kg.d) arrayList.get(this.n0));
                i10 = this.n0 + 1;
            }
        }
    }

    @Override // ig.g
    public final long r(int i10, int i11) {
        return ((jg.d) this.h0).m.rMaxQ(i10, i11);
    }

    @Override // ig.g
    public final void u() {
        super.u();
        this.j0 = 0.0f;
        int length = ((jg.d) this.h0).a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j3 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                kg.h hVar = (kg.h) arrayList.get(i11);
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

    @Override // ig.g
    public final void z() {
        int length = ((jg.a) ((jg.d) this.h0).d.get(0)).a.length;
        int size = ((jg.d) this.h0).d.size();
        ((jg.d) this.h0).l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((jg.d) this.h0).l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((kg.h) this.d.get(i11)).n) {
                    jg.b bVar = this.h0;
                    long[] jArr = ((jg.d) bVar).l;
                    jArr[i10] = jArr[i10] + ((jg.a) ((jg.d) bVar).d.get(i11)).a[i10];
                }
            }
        }
        jg.b bVar2 = this.h0;
        ((jg.d) bVar2).m = new SegmentTree(((jg.d) bVar2).l);
        super.z();
    }

    @Override // ig.g
    public final void o(Canvas canvas) {
    }
}
