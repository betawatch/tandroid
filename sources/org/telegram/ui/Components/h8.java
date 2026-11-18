package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class h8 {
    public float f;
    public boolean g;
    public final Paint h;
    public org.telegram.ui.Cells.q1 i;
    public int p;
    public int q;
    public float r;
    public final int[] b = new int[3];
    public final float[] c = new float[8];
    public final float[] d = new float[8];
    public final float[] e = new float[8];
    public final Random j = new Random();
    public final float k = org.telegram.messenger.g0.L(6.0f) * 0.33f;
    public final float l = org.telegram.messenger.g0.L(12.0f) * 0.36f;
    public final float m = 120.0f;
    public final int n = 61;
    public final float[] o = new float[6];
    public final rp[] a = new rp[2];

    public h8() {
        for (int i7 = 0; i7 < 2; i7++) {
            rp[] rpVarArr = this.a;
            rp rpVar = new rp();
            rpVarArr[i7] = rpVar;
            rpVar.g = org.telegram.messenger.g0.L(24.0f);
            rpVar.k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f10, float f11, float f12, int i7, Canvas canvas) {
        if (org.telegram.messenger.pc.e(32)) {
            Paint paint = this.h;
            paint.setColor(i7);
            paint.setAlpha((int) (this.n * f12));
            b(canvas, f10, f11);
        }
    }

    public final void b(Canvas canvas, float f10, float f11) {
        float[] fArr;
        float f12;
        int[] iArr;
        if (org.telegram.messenger.pc.e(32)) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                fArr = this.d;
                if (i10 >= 8) {
                    break;
                }
                float[] fArr2 = this.c;
                float f13 = fArr2[i10];
                float f14 = fArr[i10];
                if (f13 != f14) {
                    float[] fArr3 = this.e;
                    float f15 = (fArr3[i10] * 16.0f) + f14;
                    fArr[i10] = f15;
                    float f16 = fArr3[i10];
                    if ((f16 > 0.0f && f15 > fArr2[i10]) || (f16 < 0.0f && f15 < fArr2[i10])) {
                        fArr[i10] = fArr2[i10];
                    }
                    this.i.invalidate();
                }
                i10++;
            }
            boolean z10 = true;
            if (this.g) {
                float f17 = this.f + 0.02f;
                this.f = f17;
                if (f17 > 1.0f) {
                    this.g = false;
                    this.f = 1.0f;
                }
            } else {
                float f18 = this.f - 0.02f;
                this.f = f18;
                if (f18 < 0.0f) {
                    this.g = true;
                    this.f = 0.0f;
                }
            }
            float f19 = fArr[7];
            float f20 = fArr[6] * fArr[0];
            if (f19 == 0.0f && f20 == 0.0f) {
                return;
            }
            int i11 = 0;
            while (true) {
                f12 = this.l;
                iArr = this.b;
                if (i11 >= 3) {
                    break;
                }
                iArr[i11] = (int) (fArr[i11] * f12);
                i11++;
            }
            rp[] rpVarArr = this.a;
            rp rpVar = rpVarArr[0];
            while (i7 < rpVar.f) {
                float[] fArr4 = rpVar.j;
                fArr4[i7] = iArr[i7 / 2];
                fArr4[i7 + 1] = 0.0f;
                i7 += 2;
                z10 = z10;
            }
            boolean z11 = z10;
            for (int i12 = 0; i12 < 3; i12++) {
                iArr[i12] = (int) (fArr[i12 + 3] * f12);
            }
            rp rpVar2 = rpVarArr[z11 ? 1 : 0];
            for (int i13 = 0; i13 < rpVar2.f; i13 += 2) {
                float[] fArr5 = rpVar2.j;
                fArr5[i13] = iArr[i13 / 2];
                fArr5[i13 + 1] = 0.0f;
            }
            float L = (this.k * f19) + (org.telegram.messenger.g0.L(4.0f) * f20) + org.telegram.messenger.g0.L(22.0f);
            if (L > org.telegram.messenger.g0.L(26.0f)) {
                L = org.telegram.messenger.g0.L(26.0f);
            }
            rp rpVar3 = rpVarArr[0];
            rpVarArr[z11 ? 1 : 0].g = L;
            rpVar3.g = L;
            canvas.save();
            float f21 = (float) (this.r + 0.6d);
            this.r = f21;
            canvas.rotate(f21, f10, f11);
            canvas.save();
            float f22 = (this.f * 0.04f) + 1.0f;
            canvas.scale(f22, f22, f10, f11);
            rp rpVar4 = rpVarArr[0];
            Paint paint = this.h;
            rpVar4.a(f10, f11, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f10, f11);
            float z12 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f, 0.04f, 1.0f);
            canvas.scale(z12, z12, f10, f11);
            rpVarArr[z11 ? 1 : 0].a(f10, f11, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f10, float f11, boolean z10, float f12, org.telegram.ui.ActionBar.i6 i6Var) {
        if (org.telegram.messenger.pc.e(32)) {
            int i7 = this.n;
            Paint paint = this.h;
            if (z10) {
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ec, i6Var));
                paint.setAlpha((int) (i7 * f12));
            } else {
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ze, i6Var));
                paint.setAlpha((int) (i7 * f12));
            }
            b(canvas, f10, f11);
        }
    }

    public final void d(org.telegram.ui.Cells.q1 q1Var) {
        this.i = q1Var;
    }

    public final void e(boolean z10, float[] fArr) {
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        if (org.telegram.messenger.pc.e(32)) {
            int i7 = 0;
            boolean z11 = fArr != null && fArr[6] == 0.0f;
            float f10 = fArr == null ? 0.0f : fArr[6];
            float[] fArr5 = this.o;
            if (fArr == null || f10 <= 0.4d) {
                this.p = 0;
            } else {
                int i10 = this.q;
                fArr5[i10] = f10;
                int i11 = i10 + 1;
                this.q = i11;
                if (i11 > 5) {
                    this.q = 0;
                }
                this.p++;
            }
            if (z11) {
                for (int i12 = 0; i12 < 6; i12++) {
                    fArr[i12] = (this.j.nextInt() % 500) / 1000.0f;
                }
            }
            float f11 = this.m;
            float f12 = z11 ? 2.0f * f11 : f11;
            if (this.p > 6) {
                float f13 = 0.0f;
                for (int i13 = 0; i13 < 6; i13++) {
                    f13 += fArr5[i13];
                }
                float f14 = f13 / 6.0f;
                if (f14 > 0.52f) {
                    f12 = com.google.android.gms.internal.vision.e2.t(f14, 0.4f, f11, f12);
                }
            }
            while (true) {
                fArr2 = this.e;
                fArr3 = this.d;
                fArr4 = this.c;
                if (i7 >= 7) {
                    break;
                }
                if (fArr == null) {
                    fArr4[i7] = 0.0f;
                } else {
                    fArr4[i7] = fArr[i7];
                }
                if (this.i == null) {
                    fArr3[i7] = fArr4[i7];
                } else if (i7 == 6) {
                    fArr2[i7] = (fArr4[i7] - fArr3[i7]) / (80.0f + f11);
                } else {
                    fArr2[i7] = (fArr4[i7] - fArr3[i7]) / f12;
                }
                i7++;
            }
            float f15 = z10 ? 1.0f : 0.0f;
            fArr4[7] = f15;
            fArr2[7] = (f15 - fArr3[7]) / 120.0f;
        }
    }
}
