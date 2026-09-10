package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lw0 {
    public final e0.i0 a;
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
    public final int f = org.telegram.ui.ActionBar.j6.A8;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public lw0(int i10) {
        this.h = i10;
        int i11 = i10 == 0 ? 100 : 300;
        this.i = i11;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(0.5f));
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new e0.i0(i11);
            this.b = g0.a.a(a(true));
        } else {
            this.a = null;
            this.b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.m.add(new kw0(this));
        }
    }

    public static Bitmap a(boolean z10) {
        Paint paint = new Paint(1);
        paint.setStrokeWidth(AndroidUtilities.dp(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        Bitmap createBitmap = Bitmap.createBitmap(z10 ? AndroidUtilities.dp(20.0f) : AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float dpf2 = AndroidUtilities.dpf2(2.0f) * 2.0f;
        float f7 = (-AndroidUtilities.dpf2(0.57f)) * 2.0f;
        float dpf22 = AndroidUtilities.dpf2(1.55f) * 2.0f;
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = AndroidUtilities.dp(5.0f);
        float f10 = -1.5707964f;
        int i10 = 0;
        while (i10 < 6) {
            double d = f10;
            float f11 = f10;
            float cos = ((float) Math.cos(d)) * dpf2;
            Bitmap bitmap = createBitmap;
            float sin = ((float) Math.sin(d)) * dpf2;
            float f12 = cos * 0.66f;
            float f13 = 0.66f * sin;
            canvas.drawLine(dp, dp2, cos + dp, sin + dp2, paint);
            float f14 = dp;
            float f15 = dp2;
            double d10 = (float) (d - 1.5707963267948966d);
            double d11 = f7;
            double d12 = dpf22;
            float f16 = f14 + f12;
            float f17 = f15 + f13;
            canvas.drawLine(f16, f17, f14 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) hc.b.f(d10, d12, Math.sin(d10) * d11)) + f15, paint);
            canvas.drawLine(f16, f17, f14 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) hc.b.f(d10, d12, (-Math.sin(d10)) * d11)) + f15, paint);
            f10 = f11 + 1.0471976f;
            i10++;
            dp2 = f15;
            createBitmap = bitmap;
            dp = f14;
        }
        Bitmap bitmap2 = createBitmap;
        if (z10) {
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(AndroidUtilities.dp(1.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            canvas.drawPoint(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(5.0f), paint2);
        }
        return bitmap2;
    }

    public final void b(Canvas canvas, View view) {
        int i10;
        kw0 kw0Var;
        if (view == null || canvas == null || !LiteMode.isEnabled(32)) {
            return;
        }
        int i11 = this.i;
        e0.i0 i0Var = this.a;
        int i12 = 0;
        ArrayList arrayList = this.l;
        if (i0Var != null) {
            int min = Math.min(i11, arrayList.size());
            int dp = AndroidUtilities.dp(10.0f);
            for (int i13 = 0; i13 < min; i13++) {
                kw0 kw0Var2 = (kw0) arrayList.get(i13);
                float f7 = kw0Var2.a;
                float f10 = kw0Var2.b;
                int i14 = kw0Var2.j;
                float f11 = dp / 2.0f;
                if (i14 != 0) {
                    f11 *= kw0Var2.i;
                }
                float f12 = i14 == 0 ? dp : 0.0f;
                i0Var.e(i13, i0.a.k(this.n, (int) (kw0Var2.f * 255.0f)));
                e0.i0.b((float[]) i0Var.b, i13, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                float f13 = dp;
                e0.i0.b((float[]) i0Var.c, i13, f12, 0.0f, f12 + f13, f13);
            }
            g0.a.b(canvas, i0Var, min, this.b);
        } else {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                kw0 kw0Var3 = (kw0) arrayList.get(i15);
                lw0 lw0Var = kw0Var3.k;
                Paint paint = lw0Var.c;
                if (kw0Var3.j != 0) {
                    Bitmap bitmap = lw0Var.j;
                    Paint paint2 = lw0Var.e;
                    if (bitmap == null) {
                        lw0Var.j = a(false);
                    }
                    paint2.setAlpha((int) (kw0Var3.f * 255.0f));
                    canvas.save();
                    float f14 = kw0Var3.i;
                    canvas.scale(f14, f14, kw0Var3.a, kw0Var3.b);
                    canvas.drawBitmap(lw0Var.j, kw0Var3.a, kw0Var3.b, paint2);
                    canvas.restore();
                } else {
                    paint.setAlpha((int) (kw0Var3.f * 255.0f));
                    canvas.drawPoint(kw0Var3.a, kw0Var3.b, paint);
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
                if (arrayList.size() >= i11 || Utilities.random.nextFloat() <= 0.7f) {
                    i10 = i11;
                } else {
                    int i20 = AndroidUtilities.statusBarHeight;
                    float nextFloat = Utilities.random.nextFloat() * view.getMeasuredWidth();
                    float nextFloat2 = i16 == 0 ? (Utilities.random.nextFloat() * org.telegram.messenger.a2.B(20.0f, view.getMeasuredHeight(), i20)) + i20 : Utilities.random.nextFloat() * view.getMeasuredHeight();
                    double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                    i10 = i11;
                    float cos = (float) Math.cos(nextInt);
                    float sin = (float) Math.sin(nextInt);
                    if (arrayList2.isEmpty()) {
                        kw0Var = new kw0(this);
                    } else {
                        kw0Var = (kw0) arrayList2.get(0);
                        arrayList2.remove(0);
                    }
                    kw0Var.a = nextFloat;
                    kw0Var.b = nextFloat2;
                    kw0Var.c = cos;
                    kw0Var.d = sin;
                    kw0Var.f = 0.0f;
                    kw0Var.h = 0.0f;
                    kw0Var.i = Utilities.random.nextFloat() * 1.2f;
                    kw0Var.j = Utilities.random.nextInt(2);
                    if (i16 == 0) {
                        kw0Var.g = Utilities.random.nextInt(100) + 2000;
                    } else {
                        kw0Var.g = Utilities.random.nextInt(2000) + 3000;
                    }
                    kw0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                    arrayList.add(kw0Var);
                }
                i19++;
                i11 = i10;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long min2 = Math.min(17L, currentTimeMillis - this.k);
        int size3 = arrayList.size();
        while (i12 < size3) {
            kw0 kw0Var4 = (kw0) arrayList.get(i12);
            float f15 = kw0Var4.h;
            float f16 = kw0Var4.g;
            if (f15 >= f16) {
                if (arrayList2.size() < i18) {
                    arrayList2.add(kw0Var4);
                }
                arrayList.remove(i12);
                i12--;
                size3--;
            } else {
                if (i16 == 0) {
                    if (f15 < 200.0f) {
                        kw0Var4.f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                    } else {
                        kw0Var4.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                    }
                } else if (f15 < 200.0f) {
                    kw0Var4.f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                } else {
                    float f17 = f16 - f15;
                    if (f17 < 2000.0f) {
                        kw0Var4.f = AndroidUtilities.decelerateInterpolator.getInterpolation(f17 / 2000.0f);
                    }
                }
                float f18 = kw0Var4.a;
                float f19 = kw0Var4.c;
                float f20 = kw0Var4.e;
                float f21 = min2;
                kw0Var4.a = a4.a.A(f19 * f20, f21, 500.0f, f18);
                kw0Var4.b = (((kw0Var4.d * f20) * f21) / 500.0f) + kw0Var4.b;
                kw0Var4.h += f21;
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
            i10 = org.telegram.ui.ActionBar.j6.w0(null, this.f, false) & (-1644826);
        }
        if (this.n != i10) {
            this.n = i10;
            this.c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
