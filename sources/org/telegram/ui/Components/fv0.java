package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fv0 {
    public final cc.f a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public int g;
    public final int h;
    public final int i;
    public Bitmap j;
    public long k;
    public int n;
    public final Paint e = new Paint();
    public final int f = org.telegram.ui.ActionBar.t6.A8;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public fv0(int i10) {
        this.h = i10;
        int i11 = i10 == 0 ? 100 : org.telegram.messenger.zs.X4;
        this.i = i11;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(0.5f));
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new cc.f(i11);
            this.b = g0.a.a(a(true));
        } else {
            this.a = null;
            this.b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.m.add(new ev0(this));
        }
    }

    public static Bitmap a(boolean z10) {
        Paint paint = new Paint(1);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        Bitmap createBitmap = Bitmap.createBitmap(z10 ? org.telegram.messenger.i0.L(20.0f) : org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float N = org.telegram.messenger.i0.N(2.0f) * 2.0f;
        float f7 = (-org.telegram.messenger.i0.N(0.57f)) * 2.0f;
        float N2 = org.telegram.messenger.i0.N(1.55f) * 2.0f;
        float f10 = 5.0f;
        float L = org.telegram.messenger.i0.L(5.0f);
        float L2 = org.telegram.messenger.i0.L(5.0f);
        float f11 = -1.5707964f;
        int i10 = 0;
        while (i10 < 6) {
            double d = f11;
            float f12 = f10;
            float f13 = f11;
            float cos = ((float) Math.cos(d)) * N;
            Bitmap bitmap = createBitmap;
            float sin = ((float) Math.sin(d)) * N;
            float f14 = cos * 0.66f;
            float f15 = 0.66f * sin;
            canvas.drawLine(L, L2, cos + L, sin + L2, paint);
            float f16 = L;
            float f17 = L2;
            double d10 = (float) (d - 1.5707963267948966d);
            double d11 = f7;
            double d12 = N2;
            float f18 = f16 + f14;
            float f19 = f17 + f15;
            canvas.drawLine(f18, f19, f16 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) i0.a.c(d10, d12, Math.sin(d10) * d11)) + f17, paint);
            canvas.drawLine(f18, f19, f16 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) i0.a.c(d10, d12, (-Math.sin(d10)) * d11)) + f17, paint);
            f11 = f13 + 1.0471976f;
            i10++;
            L2 = f17;
            f10 = f12;
            createBitmap = bitmap;
            L = f16;
        }
        Bitmap bitmap2 = createBitmap;
        float f20 = f10;
        if (z10) {
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            canvas.drawPoint(org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(f20), paint2);
        }
        return bitmap2;
    }

    public final void b(Canvas canvas, View view) {
        int i10;
        ev0 ev0Var;
        if (view == null || canvas == null || !org.telegram.messenger.sc.e(32)) {
            return;
        }
        c();
        int i11 = this.i;
        cc.f fVar = this.a;
        int i12 = 0;
        ArrayList arrayList = this.l;
        if (fVar != null) {
            int min = Math.min(i11, arrayList.size());
            int L = org.telegram.messenger.i0.L(10.0f);
            for (int i13 = 0; i13 < min; i13++) {
                ev0 ev0Var2 = (ev0) arrayList.get(i13);
                float f7 = ev0Var2.a;
                float f10 = ev0Var2.b;
                int i14 = ev0Var2.j;
                float f11 = L / 2.0f;
                if (i14 != 0) {
                    f11 *= ev0Var2.i;
                }
                float f12 = i14 == 0 ? L : 0.0f;
                fVar.f(i13, i0.b.o(this.n, (int) (ev0Var2.f * 255.0f)));
                cc.f.a((float[]) fVar.c, i13, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                float f13 = L;
                cc.f.a((float[]) fVar.d, i13, f12, 0.0f, f12 + f13, f13);
            }
            g0.a.b(canvas, fVar, min, this.b);
        } else {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                ev0 ev0Var3 = (ev0) arrayList.get(i15);
                fv0 fv0Var = ev0Var3.k;
                if (ev0Var3.j != 0) {
                    Bitmap bitmap = fv0Var.j;
                    Paint paint = fv0Var.e;
                    if (bitmap == null) {
                        fv0Var.j = a(false);
                    }
                    paint.setAlpha((int) (ev0Var3.f * 255.0f));
                    canvas.save();
                    float f14 = ev0Var3.i;
                    canvas.scale(f14, f14, ev0Var3.a, ev0Var3.b);
                    canvas.drawBitmap(fv0Var.j, ev0Var3.a, ev0Var3.b, paint);
                    canvas.restore();
                } else {
                    fv0Var.c.setAlpha((int) (ev0Var3.f * 255.0f));
                    canvas.drawPoint(ev0Var3.a, ev0Var3.b, fv0Var.c);
                }
            }
        }
        int i16 = this.h;
        int i17 = i16 == 0 ? 1 : 10;
        int size2 = arrayList.size();
        int i18 = 40;
        ArrayList arrayList2 = this.m;
        if (size2 < i11) {
            int i19 = 0;
            while (i19 < i17) {
                if (arrayList.size() < i11) {
                    SecureRandom secureRandom = Utilities.b;
                    if (secureRandom.nextFloat() > 0.7f) {
                        int i20 = org.telegram.messenger.i0.m;
                        float nextFloat = secureRandom.nextFloat() * view.getMeasuredWidth();
                        float nextFloat2 = i16 == 0 ? (secureRandom.nextFloat() * org.telegram.messenger.m5.z(20.0f, view.getMeasuredHeight(), i20)) + i20 : secureRandom.nextFloat() * view.getMeasuredHeight();
                        double nextInt = (secureRandom.nextInt(40) + 70) * 0.017453292519943295d;
                        i10 = i11;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (arrayList2.isEmpty()) {
                            ev0Var = new ev0(this);
                        } else {
                            ev0Var = (ev0) arrayList2.get(0);
                            arrayList2.remove(0);
                        }
                        ev0Var.a = nextFloat;
                        ev0Var.b = nextFloat2;
                        ev0Var.c = cos;
                        ev0Var.d = sin;
                        ev0Var.f = 0.0f;
                        ev0Var.h = 0.0f;
                        ev0Var.i = secureRandom.nextFloat() * 1.2f;
                        ev0Var.j = secureRandom.nextInt(2);
                        if (i16 == 0) {
                            ev0Var.g = secureRandom.nextInt(100) + 2000;
                        } else {
                            ev0Var.g = secureRandom.nextInt(2000) + 3000;
                        }
                        ev0Var.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(ev0Var);
                        i19++;
                        i11 = i10;
                    }
                }
                i10 = i11;
                i19++;
                i11 = i10;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long min2 = Math.min(17L, currentTimeMillis - this.k);
        int size3 = arrayList.size();
        while (i12 < size3) {
            ev0 ev0Var4 = (ev0) arrayList.get(i12);
            float f15 = ev0Var4.h;
            float f16 = ev0Var4.g;
            if (f15 >= f16) {
                if (arrayList2.size() < i18) {
                    arrayList2.add(ev0Var4);
                }
                arrayList.remove(i12);
                i12--;
                size3--;
            } else {
                if (i16 == 0) {
                    if (f15 < 200.0f) {
                        ev0Var4.f = org.telegram.messenger.i0.G.getInterpolation(f15 / 200.0f);
                    } else {
                        ev0Var4.f = 1.0f - org.telegram.messenger.i0.F.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                    }
                } else if (f15 < 200.0f) {
                    ev0Var4.f = org.telegram.messenger.i0.G.getInterpolation(f15 / 200.0f);
                } else {
                    float f17 = f16 - f15;
                    if (f17 < 2000.0f) {
                        ev0Var4.f = org.telegram.messenger.i0.F.getInterpolation(f17 / 2000.0f);
                    }
                }
                float f18 = ev0Var4.a;
                float f19 = ev0Var4.c;
                float f20 = ev0Var4.e;
                float f21 = min2;
                ev0Var4.a = a1.g.A(f19 * f20, f21, 500.0f, f18);
                ev0Var4.b = (((ev0Var4.d * f20) * f21) / 500.0f) + ev0Var4.b;
                ev0Var4.h += f21;
            }
            i12++;
            i18 = 40;
        }
        this.k = currentTimeMillis;
        view.invalidate();
    }

    public final void c() {
        int i10 = this.g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.t6.x0(null, this.f, false) & (-1644826);
        }
        if (this.n != i10) {
            this.n = i10;
            this.c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
