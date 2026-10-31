package bg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.e61;
import org.telegram.ui.tj0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u extends i {
    public long[] D1;

    public u(Context context, p6 p6Var) {
        super(context, p6Var);
        this.w0 = true;
        this.x0 = true;
    }

    @Override // bg.i
    public final void C(int i10, int i11) {
        cg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        int i12 = this.s0;
        float f7 = this.G0;
        float f10 = (this.g0.k * f7) - i.k1;
        cg.d dVar = (cg.d) bVar;
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
            g gVar = this.Q0;
            if (gVar != null) {
                getSelectedDate();
                e61 e61Var = (e61) ((tj0) gVar).b;
                e61Var.f();
                e61Var.b.t0.d(false, false);
            }
            invalidate();
            B();
        }
    }

    @Override // bg.i
    public final void K() {
        if (i.B1) {
            int length = ((cg.d) this.h0).a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    dg.i iVar = (dg.i) arrayList.get(i11);
                    if (iVar.n) {
                        j11 += iVar.a.a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f7 = j10;
                if (f7 != this.l0) {
                    this.l0 = f7;
                    Animator animator = this.d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = i.e(this.j0, this.l0, new o(this, 1));
                    this.d0 = e;
                    e.start();
                }
            }
        }
    }

    @Override // bg.i
    public float getMinDistance() {
        return 0.1f;
    }

    @Override // bg.i
    public final dg.g h(cg.a aVar) {
        return new dg.i(aVar, this.W0);
    }

    @Override // bg.i
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
        cg.b bVar = this.h0;
        if (bVar == null) {
            return;
        }
        float f15 = this.F0;
        n nVar = this.g0;
        float f16 = nVar.l;
        float f17 = nVar.k;
        float f18 = f15 / (f16 - f17);
        float f19 = i.k1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((cg.d) bVar).b;
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
        int min = Math.min(((cg.d) this.h0).b.length - 1, this.G + i13 + 2);
        int i15 = 0;
        while (true) {
            arrayList = this.d;
            if (i15 >= arrayList.size()) {
                break;
            }
            ((dg.g) arrayList.get(i15)).j = 0;
            i15++;
        }
        canvas2.save();
        int i16 = this.y0;
        float f23 = 0.0f;
        if (i16 == 2) {
            this.f0 = true;
            this.v0 = 0.0f;
            dg.k kVar = this.z0;
            float f24 = kVar.f;
            f12 = 1.0f - f24;
            f11 = 2.0f;
            canvas2.scale((f24 * 2.0f) + 1.0f, 1.0f, kVar.d, kVar.e);
        } else {
            f11 = 2.0f;
            if (i16 == 1) {
                dg.k kVar2 = this.z0;
                float f25 = kVar2.f;
                canvas2.scale(f25, 1.0f, kVar2.d, kVar2.e);
                f12 = f25;
            } else {
                f12 = i16 == 3 ? this.z0.f : 1.0f;
            }
        }
        boolean z10 = this.s0 >= 0 && this.u0;
        while (true) {
            i10 = i.n1;
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
                    dg.g gVar = (dg.g) arrayList.get(i17);
                    if (gVar.n || gVar.o != f14) {
                        long[] jArr = gVar.a.a;
                        float f27 = (((f18 - f10) * ((cg.d) this.h0).b[max]) + (f10 / f11)) - f20;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (jArr[i12] / this.w) * ((getMeasuredHeight() - this.s) - i10) * gVar.o;
                        float measuredHeight2 = (getMeasuredHeight() - this.s) - measuredHeight;
                        float[] fArr2 = gVar.k;
                        int i18 = gVar.j;
                        int i19 = i18 + 1;
                        gVar.j = i19;
                        fArr2[i18] = f27;
                        int i20 = i18 + 2;
                        gVar.j = i20;
                        fArr2[i19] = measuredHeight2 - f26;
                        int i21 = i18 + 3;
                        gVar.j = i21;
                        fArr2[i20] = f27;
                        gVar.j = i18 + 4;
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
            dg.i iVar = (dg.i) arrayList.get(i22);
            Paint paint = (z10 || this.f0) ? iVar.q : iVar.c;
            if (z10) {
                f13 = 255.0f;
                iVar.q.setColor(i0.b.f(this.v0, iVar.m, iVar.r));
            } else {
                f13 = 255.0f;
            }
            if (this.f0) {
                iVar.q.setColor(i0.b.f(1.0f, iVar.m, iVar.r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f7);
            canvas2.drawLines(iVar.k, 0, iVar.j, paint);
        }
        if (z10) {
            int i23 = 0;
            float f29 = f28;
            while (i23 < arrayList.size()) {
                dg.g gVar2 = (dg.g) arrayList.get(i23);
                boolean z11 = gVar2.n;
                Paint paint2 = gVar2.c;
                if (z11 || gVar2.o != f28) {
                    long[] jArr2 = gVar2.a.a;
                    float f30 = (((f18 - f10) * ((cg.d) this.h0).b[this.s0]) + (f10 / f11)) - f20;
                    float measuredHeight3 = (jArr2[r15] / this.w) * ((getMeasuredHeight() - this.s) - i10) * gVar2.o;
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

    @Override // bg.i
    public final void n(Canvas canvas) {
        float f7;
        int i10;
        boolean z10;
        int i11;
        cg.b bVar = this.h0;
        if (bVar != null) {
            int length = ((cg.d) bVar).b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((dg.g) arrayList.get(i13)).j = 0;
            }
            boolean z11 = true;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i14 = 0;
            while (i14 < length) {
                float f10 = ((cg.d) this.h0).b[i14] * this.C0;
                int i15 = i12;
                while (true) {
                    f7 = 0.0f;
                    if (i15 >= size) {
                        break;
                    }
                    dg.g gVar = (dg.g) arrayList.get(i15);
                    if (gVar.n || gVar.o != 0.0f) {
                        long j10 = gVar.a.a[i14];
                        long[] jArr2 = this.D1;
                        if (j10 > jArr2[i15]) {
                            jArr2[i15] = j10;
                        }
                    }
                    i15++;
                }
                if (i14 % max == 0) {
                    int i16 = i12;
                    float f11 = 0.0f;
                    while (i16 < size) {
                        dg.g gVar2 = (dg.g) arrayList.get(i16);
                        if (gVar2.n || gVar2.o != f7) {
                            float f12 = i.B1 ? this.j0 : ((cg.d) this.h0).e;
                            long[] jArr3 = this.D1;
                            boolean z12 = z11;
                            i10 = i14;
                            float f13 = (jArr3[i16] / f12) * gVar2.o;
                            int i17 = this.B0;
                            float f14 = f13 * i17;
                            float[] fArr = gVar2.k;
                            int i18 = gVar2.j;
                            z10 = z12;
                            int i19 = i18 + 1;
                            gVar2.j = i19;
                            fArr[i18] = f10;
                            int i20 = i18 + 2;
                            gVar2.j = i20;
                            i11 = length;
                            fArr[i19] = (i17 - f14) - f11;
                            int i21 = i18 + 3;
                            gVar2.j = i21;
                            fArr[i20] = f10;
                            gVar2.j = i18 + 4;
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
            cg.b bVar2 = this.h0;
            float f15 = ((cg.d) bVar2).b.length < 2 ? 1.0f : ((cg.d) bVar2).b[z13 ? 1 : 0] * this.C0;
            for (int i22 = 0; i22 < size; i22++) {
                dg.g gVar3 = (dg.g) arrayList.get(i22);
                Paint paint = gVar3.c;
                Paint paint2 = gVar3.c;
                paint.setStrokeWidth(max * f15);
                paint2.setAlpha(zs.e4);
                canvas.drawLines(gVar3.k, 0, gVar3.j, paint2);
            }
        }
    }

    @Override // bg.i, android.view.View
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
                l(canvas, (dg.e) arrayList.get(i11));
                p(canvas, (dg.e) arrayList.get(this.n0));
                i10 = this.n0 + 1;
            }
        }
    }

    @Override // bg.i
    public final long r(int i10, int i11) {
        return ((cg.d) this.h0).m.j0(i10, i11);
    }

    @Override // bg.i
    public final void u() {
        super.u();
        this.j0 = 0.0f;
        int length = ((cg.d) this.h0).a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                dg.i iVar = (dg.i) arrayList.get(i11);
                if (iVar.n) {
                    j10 += iVar.a.a[i10];
                }
            }
            float f7 = j10;
            if (f7 > this.j0) {
                this.j0 = f7;
            }
        }
    }

    @Override // bg.i
    public final void z() {
        int length = ((cg.a) ((cg.d) this.h0).d.get(0)).a.length;
        int size = ((cg.d) this.h0).d.size();
        ((cg.d) this.h0).l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((cg.d) this.h0).l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((dg.i) this.d.get(i11)).n) {
                    cg.b bVar = this.h0;
                    long[] jArr = ((cg.d) bVar).l;
                    jArr[i10] = jArr[i10] + ((cg.a) ((cg.d) bVar).d.get(i11)).a[i10];
                }
            }
        }
        cg.b bVar2 = this.h0;
        ((cg.d) bVar2).m = new m4.c(((cg.d) bVar2).l);
        super.z();
    }

    @Override // bg.i
    public final void o(Canvas canvas) {
    }
}
