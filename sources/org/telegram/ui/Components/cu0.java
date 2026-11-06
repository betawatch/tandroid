package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class cu0 {
    public final a4.k a;
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
    public final int f = org.telegram.ui.ActionBar.k6.A8;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public cu0(int i7) {
        this.h = i7;
        int i10 = i7 == 0 ? 100 : org.telegram.messenger.qs.X4;
        this.i = i10;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(0.5f));
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new a4.k(i10);
            this.b = g0.a.a(a(true));
        } else {
            this.a = null;
            this.b = null;
        }
        c();
        for (int i11 = 0; i11 < 20; i11++) {
            this.m.add(new bu0(this));
        }
    }

    public static Bitmap a(boolean z9) {
        Paint paint = new Paint(1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        Bitmap createBitmap = Bitmap.createBitmap(z9 ? org.telegram.messenger.g0.L(20.0f) : org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float N = org.telegram.messenger.g0.N(2.0f) * 2.0f;
        float f10 = (-org.telegram.messenger.g0.N(0.57f)) * 2.0f;
        float N2 = org.telegram.messenger.g0.N(1.55f) * 2.0f;
        float f11 = 5.0f;
        float L = org.telegram.messenger.g0.L(5.0f);
        float L2 = org.telegram.messenger.g0.L(5.0f);
        float f12 = -1.5707964f;
        int i7 = 0;
        while (i7 < 6) {
            double d = f12;
            float f13 = f11;
            float f14 = f12;
            float cos = ((float) Math.cos(d)) * N;
            Bitmap bitmap = createBitmap;
            float sin = ((float) Math.sin(d)) * N;
            float f15 = cos * 0.66f;
            float f16 = 0.66f * sin;
            canvas.drawLine(L, L2, cos + L, sin + L2, paint);
            float f17 = L;
            float f18 = L2;
            double d2 = (float) (d - 1.5707963267948966d);
            double d10 = f10;
            double d11 = N2;
            float f19 = f17 + f15;
            float f20 = f18 + f16;
            canvas.drawLine(f19, f20, f17 + ((float) ((Math.cos(d2) * d10) - (Math.sin(d2) * d11))), ((float) jg.g.d(d2, d11, Math.sin(d2) * d10)) + f18, paint);
            canvas.drawLine(f19, f20, f17 + ((float) (((-Math.cos(d2)) * d10) - (Math.sin(d2) * d11))), ((float) jg.g.d(d2, d11, (-Math.sin(d2)) * d10)) + f18, paint);
            f12 = f14 + 1.0471976f;
            i7++;
            L2 = f18;
            f11 = f13;
            createBitmap = bitmap;
            L = f17;
        }
        Bitmap bitmap2 = createBitmap;
        float f21 = f11;
        if (z9) {
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            canvas.drawPoint(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(f21), paint2);
        }
        return bitmap2;
    }

    public final void b(Canvas canvas, View view) {
        int i7;
        bu0 bu0Var;
        if (view == null || canvas == null || !org.telegram.messenger.rc.e(32)) {
            return;
        }
        c();
        int i10 = this.i;
        a4.k kVar = this.a;
        int i11 = 0;
        ArrayList arrayList = this.l;
        if (kVar != null) {
            int min = Math.min(i10, arrayList.size());
            int L = org.telegram.messenger.g0.L(10.0f);
            for (int i12 = 0; i12 < min; i12++) {
                bu0 bu0Var2 = (bu0) arrayList.get(i12);
                float f10 = bu0Var2.a;
                float f11 = bu0Var2.b;
                int i13 = bu0Var2.j;
                float f12 = L / 2.0f;
                if (i13 != 0) {
                    f12 *= bu0Var2.i;
                }
                float f13 = i13 == 0 ? L : 0.0f;
                kVar.t(i12, i0.a.o(this.n, (int) (bu0Var2.f * 255.0f)));
                a4.k.d((float[]) kVar.c, i12, f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                float f14 = L;
                a4.k.d((float[]) kVar.d, i12, f13, 0.0f, f13 + f14, f14);
            }
            g0.a.b(canvas, kVar, min, this.b);
        } else {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                bu0 bu0Var3 = (bu0) arrayList.get(i14);
                cu0 cu0Var = bu0Var3.k;
                if (bu0Var3.j != 0) {
                    Bitmap bitmap = cu0Var.j;
                    Paint paint = cu0Var.e;
                    if (bitmap == null) {
                        cu0Var.j = a(false);
                    }
                    paint.setAlpha((int) (bu0Var3.f * 255.0f));
                    canvas.save();
                    float f15 = bu0Var3.i;
                    canvas.scale(f15, f15, bu0Var3.a, bu0Var3.b);
                    canvas.drawBitmap(cu0Var.j, bu0Var3.a, bu0Var3.b, paint);
                    canvas.restore();
                } else {
                    cu0Var.c.setAlpha((int) (bu0Var3.f * 255.0f));
                    canvas.drawPoint(bu0Var3.a, bu0Var3.b, cu0Var.c);
                }
            }
        }
        int i15 = this.h;
        int i16 = i15 == 0 ? 1 : 10;
        int size2 = arrayList.size();
        int i17 = 40;
        ArrayList arrayList2 = this.m;
        if (size2 < i10) {
            int i18 = 0;
            while (i18 < i16) {
                if (arrayList.size() < i10) {
                    SecureRandom secureRandom = Utilities.b;
                    if (secureRandom.nextFloat() > 0.7f) {
                        int i19 = org.telegram.messenger.g0.m;
                        float nextFloat = secureRandom.nextFloat() * view.getMeasuredWidth();
                        float nextFloat2 = i15 == 0 ? (secureRandom.nextFloat() * org.telegram.messenger.k5.z(20.0f, view.getMeasuredHeight(), i19)) + i19 : secureRandom.nextFloat() * view.getMeasuredHeight();
                        double nextInt = (secureRandom.nextInt(40) + 70) * 0.017453292519943295d;
                        i7 = i10;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (arrayList2.isEmpty()) {
                            bu0Var = new bu0(this);
                        } else {
                            bu0Var = (bu0) arrayList2.get(0);
                            arrayList2.remove(0);
                        }
                        bu0Var.a = nextFloat;
                        bu0Var.b = nextFloat2;
                        bu0Var.c = cos;
                        bu0Var.d = sin;
                        bu0Var.f = 0.0f;
                        bu0Var.h = 0.0f;
                        bu0Var.i = secureRandom.nextFloat() * 1.2f;
                        bu0Var.j = secureRandom.nextInt(2);
                        if (i15 == 0) {
                            bu0Var.g = secureRandom.nextInt(100) + 2000;
                        } else {
                            bu0Var.g = secureRandom.nextInt(2000) + 3000;
                        }
                        bu0Var.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(bu0Var);
                        i18++;
                        i10 = i7;
                    }
                }
                i7 = i10;
                i18++;
                i10 = i7;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long min2 = Math.min(17L, currentTimeMillis - this.k);
        int size3 = arrayList.size();
        while (i11 < size3) {
            bu0 bu0Var4 = (bu0) arrayList.get(i11);
            float f16 = bu0Var4.h;
            float f17 = bu0Var4.g;
            if (f16 >= f17) {
                if (arrayList2.size() < i17) {
                    arrayList2.add(bu0Var4);
                }
                arrayList.remove(i11);
                i11--;
                size3--;
            } else {
                if (i15 == 0) {
                    if (f16 < 200.0f) {
                        bu0Var4.f = org.telegram.messenger.g0.G.getInterpolation(f16 / 200.0f);
                    } else {
                        bu0Var4.f = 1.0f - org.telegram.messenger.g0.F.getInterpolation((f16 - 200.0f) / (f17 - 200.0f));
                    }
                } else if (f16 < 200.0f) {
                    bu0Var4.f = org.telegram.messenger.g0.G.getInterpolation(f16 / 200.0f);
                } else {
                    float f18 = f17 - f16;
                    if (f18 < 2000.0f) {
                        bu0Var4.f = org.telegram.messenger.g0.F.getInterpolation(f18 / 2000.0f);
                    }
                }
                float f19 = bu0Var4.a;
                float f20 = bu0Var4.c;
                float f21 = bu0Var4.e;
                float f22 = min2;
                bu0Var4.a = a8.p0.f(f20 * f21, f22, 500.0f, f19);
                bu0Var4.b = (((bu0Var4.d * f21) * f22) / 500.0f) + bu0Var4.b;
                bu0Var4.h += f22;
            }
            i11++;
            i17 = 40;
        }
        this.k = currentTimeMillis;
        view.invalidate();
    }

    public final void c() {
        int i7 = this.g;
        if (i7 == 0) {
            i7 = org.telegram.ui.ActionBar.k6.x0(null, this.f, false) & (-1644826);
        }
        if (this.n != i7) {
            this.n = i7;
            this.c.setColor(i7);
            this.d.setColor(i7);
        }
    }
}
