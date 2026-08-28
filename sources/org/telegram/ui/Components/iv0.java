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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class iv0 {
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
    public final int f = org.telegram.ui.ActionBar.f6.A8;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public iv0(int i9) {
        this.h = i9;
        int i10 = i9 == 0 ? 100 : 300;
        this.i = i10;
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
            this.a = new e0.i0(i10);
            this.b = g0.a.a(a(true));
        } else {
            this.a = null;
            this.b = null;
        }
        c();
        for (int i11 = 0; i11 < 20; i11++) {
            this.m.add(new hv0(this));
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
        float f10 = (-AndroidUtilities.dpf2(0.57f)) * 2.0f;
        float dpf22 = AndroidUtilities.dpf2(1.55f) * 2.0f;
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = AndroidUtilities.dp(5.0f);
        float f11 = -1.5707964f;
        int i9 = 0;
        while (i9 < 6) {
            double d = f11;
            float f12 = f11;
            float cos = ((float) Math.cos(d)) * dpf2;
            Bitmap bitmap = createBitmap;
            float sin = ((float) Math.sin(d)) * dpf2;
            float f13 = cos * 0.66f;
            float f14 = 0.66f * sin;
            canvas.drawLine(dp, dp2, cos + dp, sin + dp2, paint);
            float f15 = dp;
            float f16 = dp2;
            double d9 = (float) (d - 1.5707963267948966d);
            double d10 = f10;
            double d11 = dpf22;
            float f17 = f15 + f13;
            float f18 = f16 + f14;
            canvas.drawLine(f17, f18, f15 + ((float) ((Math.cos(d9) * d10) - (Math.sin(d9) * d11))), ((float) j3.r0.b(d9, d11, Math.sin(d9) * d10)) + f16, paint);
            canvas.drawLine(f17, f18, f15 + ((float) (((-Math.cos(d9)) * d10) - (Math.sin(d9) * d11))), ((float) j3.r0.b(d9, d11, (-Math.sin(d9)) * d10)) + f16, paint);
            f11 = f12 + 1.0471976f;
            i9++;
            dp2 = f16;
            createBitmap = bitmap;
            dp = f15;
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
        int i9;
        hv0 hv0Var;
        if (view == null || canvas == null || !LiteMode.isEnabled(32)) {
            return;
        }
        int i10 = this.i;
        e0.i0 i0Var = this.a;
        int i11 = 0;
        ArrayList arrayList = this.l;
        if (i0Var != null) {
            int min = Math.min(i10, arrayList.size());
            int dp = AndroidUtilities.dp(10.0f);
            for (int i12 = 0; i12 < min; i12++) {
                hv0 hv0Var2 = (hv0) arrayList.get(i12);
                float f10 = hv0Var2.a;
                float f11 = hv0Var2.b;
                int i13 = hv0Var2.j;
                float f12 = dp / 2.0f;
                if (i13 != 0) {
                    f12 *= hv0Var2.i;
                }
                float f13 = i13 == 0 ? dp : 0.0f;
                i0Var.c(i12, i0.a.k(this.n, (int) (hv0Var2.f * 255.0f)));
                e0.i0.a((float[]) i0Var.b, i12, f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                float f14 = dp;
                e0.i0.a((float[]) i0Var.c, i12, f13, 0.0f, f13 + f14, f14);
            }
            g0.a.b(canvas, i0Var, min, this.b);
        } else {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                hv0 hv0Var3 = (hv0) arrayList.get(i14);
                iv0 iv0Var = hv0Var3.k;
                Paint paint = iv0Var.c;
                if (hv0Var3.j != 0) {
                    Bitmap bitmap = iv0Var.j;
                    Paint paint2 = iv0Var.e;
                    if (bitmap == null) {
                        iv0Var.j = a(false);
                    }
                    paint2.setAlpha((int) (hv0Var3.f * 255.0f));
                    canvas.save();
                    float f15 = hv0Var3.i;
                    canvas.scale(f15, f15, hv0Var3.a, hv0Var3.b);
                    canvas.drawBitmap(iv0Var.j, hv0Var3.a, hv0Var3.b, paint2);
                    canvas.restore();
                } else {
                    paint.setAlpha((int) (hv0Var3.f * 255.0f));
                    canvas.drawPoint(hv0Var3.a, hv0Var3.b, paint);
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
                if (arrayList.size() >= i10 || Utilities.random.nextFloat() <= 0.7f) {
                    i9 = i10;
                } else {
                    int i19 = AndroidUtilities.statusBarHeight;
                    float nextFloat = Utilities.random.nextFloat() * view.getMeasuredWidth();
                    float nextFloat2 = i15 == 0 ? (Utilities.random.nextFloat() * org.telegram.messenger.l0.B(20.0f, view.getMeasuredHeight(), i19)) + i19 : Utilities.random.nextFloat() * view.getMeasuredHeight();
                    double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                    i9 = i10;
                    float cos = (float) Math.cos(nextInt);
                    float sin = (float) Math.sin(nextInt);
                    if (arrayList2.isEmpty()) {
                        hv0Var = new hv0(this);
                    } else {
                        hv0Var = (hv0) arrayList2.get(0);
                        arrayList2.remove(0);
                    }
                    hv0Var.a = nextFloat;
                    hv0Var.b = nextFloat2;
                    hv0Var.c = cos;
                    hv0Var.d = sin;
                    hv0Var.f = 0.0f;
                    hv0Var.h = 0.0f;
                    hv0Var.i = Utilities.random.nextFloat() * 1.2f;
                    hv0Var.j = Utilities.random.nextInt(2);
                    if (i15 == 0) {
                        hv0Var.g = Utilities.random.nextInt(100) + 2000;
                    } else {
                        hv0Var.g = Utilities.random.nextInt(2000) + 3000;
                    }
                    hv0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                    arrayList.add(hv0Var);
                }
                i18++;
                i10 = i9;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long min2 = Math.min(17L, currentTimeMillis - this.k);
        int size3 = arrayList.size();
        while (i11 < size3) {
            hv0 hv0Var4 = (hv0) arrayList.get(i11);
            float f16 = hv0Var4.h;
            float f17 = hv0Var4.g;
            if (f16 >= f17) {
                if (arrayList2.size() < i17) {
                    arrayList2.add(hv0Var4);
                }
                arrayList.remove(i11);
                i11--;
                size3--;
            } else {
                if (i15 == 0) {
                    if (f16 < 200.0f) {
                        hv0Var4.f = AndroidUtilities.accelerateInterpolator.getInterpolation(f16 / 200.0f);
                    } else {
                        hv0Var4.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f16 - 200.0f) / (f17 - 200.0f));
                    }
                } else if (f16 < 200.0f) {
                    hv0Var4.f = AndroidUtilities.accelerateInterpolator.getInterpolation(f16 / 200.0f);
                } else {
                    float f18 = f17 - f16;
                    if (f18 < 2000.0f) {
                        hv0Var4.f = AndroidUtilities.decelerateInterpolator.getInterpolation(f18 / 2000.0f);
                    }
                }
                float f19 = hv0Var4.a;
                float f20 = hv0Var4.c;
                float f21 = hv0Var4.e;
                float f22 = min2;
                hv0Var4.a = aa.d.d(f20 * f21, f22, 500.0f, f19);
                hv0Var4.b = (((hv0Var4.d * f21) * f22) / 500.0f) + hv0Var4.b;
                hv0Var4.h += f22;
            }
            i11++;
            i17 = 40;
        }
        this.k = currentTimeMillis;
        view.invalidate();
    }

    public final void c() {
        int i9 = this.g;
        if (i9 == 0) {
            i9 = org.telegram.ui.ActionBar.f6.w0(null, this.f, false) & (-1644826);
        }
        if (this.n != i9) {
            this.n = i9;
            this.c.setColor(i9);
            this.d.setColor(i9);
        }
    }
}
