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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kv0 {
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
    public final int f = org.telegram.ui.ActionBar.g6.A8;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public kv0(int i10) {
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
            this.m.add(new jv0(this));
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
        int i10 = 0;
        while (i10 < 6) {
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
            double d10 = (float) (d - 1.5707963267948966d);
            double d11 = f10;
            double d12 = dpf22;
            float f17 = f15 + f13;
            float f18 = f16 + f14;
            canvas.drawLine(f17, f18, f15 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) i0.a.b(d10, d12, Math.sin(d10) * d11)) + f16, paint);
            canvas.drawLine(f17, f18, f15 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) i0.a.b(d10, d12, (-Math.sin(d10)) * d11)) + f16, paint);
            f11 = f12 + 1.0471976f;
            i10++;
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
        int i10;
        jv0 jv0Var;
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
                jv0 jv0Var2 = (jv0) arrayList.get(i13);
                float f10 = jv0Var2.a;
                float f11 = jv0Var2.b;
                int i14 = jv0Var2.j;
                float f12 = dp / 2.0f;
                if (i14 != 0) {
                    f12 *= jv0Var2.i;
                }
                float f13 = i14 == 0 ? dp : 0.0f;
                i0Var.e(i13, i0.b.k(this.n, (int) (jv0Var2.f * 255.0f)));
                e0.i0.c((float[]) i0Var.b, i13, f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                float f14 = dp;
                e0.i0.c((float[]) i0Var.c, i13, f13, 0.0f, f13 + f14, f14);
            }
            g0.a.b(canvas, i0Var, min, this.b);
        } else {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                jv0 jv0Var3 = (jv0) arrayList.get(i15);
                kv0 kv0Var = jv0Var3.k;
                Paint paint = kv0Var.c;
                if (jv0Var3.j != 0) {
                    Bitmap bitmap = kv0Var.j;
                    Paint paint2 = kv0Var.e;
                    if (bitmap == null) {
                        kv0Var.j = a(false);
                    }
                    paint2.setAlpha((int) (jv0Var3.f * 255.0f));
                    canvas.save();
                    float f15 = jv0Var3.i;
                    canvas.scale(f15, f15, jv0Var3.a, jv0Var3.b);
                    canvas.drawBitmap(kv0Var.j, jv0Var3.a, jv0Var3.b, paint2);
                    canvas.restore();
                } else {
                    paint.setAlpha((int) (jv0Var3.f * 255.0f));
                    canvas.drawPoint(jv0Var3.a, jv0Var3.b, paint);
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
                    float nextFloat2 = i16 == 0 ? (Utilities.random.nextFloat() * org.telegram.messenger.y1.B(20.0f, view.getMeasuredHeight(), i20)) + i20 : Utilities.random.nextFloat() * view.getMeasuredHeight();
                    double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                    i10 = i11;
                    float cos = (float) Math.cos(nextInt);
                    float sin = (float) Math.sin(nextInt);
                    if (arrayList2.isEmpty()) {
                        jv0Var = new jv0(this);
                    } else {
                        jv0Var = (jv0) arrayList2.get(0);
                        arrayList2.remove(0);
                    }
                    jv0Var.a = nextFloat;
                    jv0Var.b = nextFloat2;
                    jv0Var.c = cos;
                    jv0Var.d = sin;
                    jv0Var.f = 0.0f;
                    jv0Var.h = 0.0f;
                    jv0Var.i = Utilities.random.nextFloat() * 1.2f;
                    jv0Var.j = Utilities.random.nextInt(2);
                    if (i16 == 0) {
                        jv0Var.g = Utilities.random.nextInt(100) + 2000;
                    } else {
                        jv0Var.g = Utilities.random.nextInt(2000) + 3000;
                    }
                    jv0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                    arrayList.add(jv0Var);
                }
                i19++;
                i11 = i10;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long min2 = Math.min(17L, currentTimeMillis - this.k);
        int size3 = arrayList.size();
        while (i12 < size3) {
            jv0 jv0Var4 = (jv0) arrayList.get(i12);
            float f16 = jv0Var4.h;
            float f17 = jv0Var4.g;
            if (f16 >= f17) {
                if (arrayList2.size() < i18) {
                    arrayList2.add(jv0Var4);
                }
                arrayList.remove(i12);
                i12--;
                size3--;
            } else {
                if (i16 == 0) {
                    if (f16 < 200.0f) {
                        jv0Var4.f = AndroidUtilities.accelerateInterpolator.getInterpolation(f16 / 200.0f);
                    } else {
                        jv0Var4.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f16 - 200.0f) / (f17 - 200.0f));
                    }
                } else if (f16 < 200.0f) {
                    jv0Var4.f = AndroidUtilities.accelerateInterpolator.getInterpolation(f16 / 200.0f);
                } else {
                    float f18 = f17 - f16;
                    if (f18 < 2000.0f) {
                        jv0Var4.f = AndroidUtilities.decelerateInterpolator.getInterpolation(f18 / 2000.0f);
                    }
                }
                float f19 = jv0Var4.a;
                float f20 = jv0Var4.c;
                float f21 = jv0Var4.e;
                float f22 = min2;
                jv0Var4.a = a9.p.d(f20 * f21, f22, 500.0f, f19);
                jv0Var4.b = (((jv0Var4.d * f21) * f22) / 500.0f) + jv0Var4.b;
                jv0Var4.h += f22;
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
            i10 = org.telegram.ui.ActionBar.g6.w0(null, this.f, false) & (-1644826);
        }
        if (this.n != i10) {
            this.n = i10;
            this.c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
