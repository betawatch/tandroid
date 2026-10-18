package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class q9 {
    public static final int[] f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList a = new ArrayList();
    public final Random b = new Random();
    public final Paint c = new Paint(1);
    public final Path d;
    public long e;

    public q9() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final p9 a(float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            this.e = SystemClock.uptimeMillis();
        }
        p9 p9Var = new p9();
        p9Var.l = 1.0f;
        p9Var.a = f7;
        p9Var.b = f10;
        double d = f11;
        p9Var.c = ((float) Math.cos(d)) * f12;
        p9Var.d = ((float) Math.sin(d)) * f12;
        p9Var.e = f13;
        p9Var.f = f14;
        p9Var.g = f15;
        p9Var.k = f[this.b.nextInt(6)];
        p9Var.h = e(0.0f, 90.0f);
        p9Var.i = e(-180.0f, 180.0f);
        arrayList.add(p9Var);
        return p9Var;
    }

    public final void b(float f7, float f10) {
        float f11 = AndroidUtilities.density;
        for (int i10 = 0; i10 < 28; i10++) {
            a(f7, f10, e(0.0f, 6.2831855f), e(60.0f, 300.0f) * f11, e(2.5f, 6.0f) * f11, e(0.5f, 0.9f), 3.0f);
        }
    }

    public final void c(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, (uptimeMillis - this.e) / 1000.0f);
        this.e = uptimeMillis;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p9 p9Var = (p9) arrayList.get(size);
            float f7 = p9Var.j + min;
            p9Var.j = f7;
            if (f7 >= 0.0f) {
                if (f7 >= p9Var.f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-p9Var.g) * min);
                    float f10 = p9Var.c * exp;
                    p9Var.c = f10;
                    float f11 = p9Var.d * exp;
                    p9Var.d = f11;
                    p9Var.a = (f10 * min) + p9Var.a;
                    p9Var.b = (f11 * min) + p9Var.b;
                    p9Var.h = (p9Var.i * min) + p9Var.h;
                    float f12 = p9Var.j / p9Var.f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f12 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f12) * p9Var.l;
                    float B = com.google.android.gms.internal.play_billing.k3.B(f12, 0.5f, 1.0f, p9Var.e);
                    int save = canvas.save();
                    canvas.translate(p9Var.a, p9Var.b);
                    canvas.rotate(p9Var.h);
                    canvas.scale(B, B);
                    int i10 = p9Var.k;
                    Paint paint = this.c;
                    paint.setColor(i10);
                    paint.setAlpha(Math.round(20.4f * min2));
                    canvas.drawCircle(0.0f, 0.0f, 1.4f, paint);
                    paint.setAlpha(Math.round(min2 * 255.0f));
                    canvas.drawPath(this.d, paint);
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    public final boolean d() {
        return !this.a.isEmpty();
    }

    public final float e(float f7, float f10) {
        return com.google.android.gms.internal.play_billing.k3.y(f10, f7, this.b.nextFloat(), f7);
    }

    public final void f() {
        this.a.clear();
        float f7 = AndroidUtilities.density;
        for (int i10 = 0; i10 < 48; i10++) {
            int i11 = -1;
            while (i11 <= 1) {
                p9 a2 = a(0.0f, (e(-3.0f, 3.0f) * f7) + 0.0f, e(-0.6f, 0.6f) + (i11 < 0 ? 3.1415927f : 0.0f), e(150.0f, 310.0f) * f7, e(1.3f, 3.2f) * f7, e(0.65f, 1.05f), 1.8f);
                a2.k = -6562049;
                a2.l = e(0.3f, 1.0f);
                a2.j = (-i10) * 0.006f;
                i11 += 2;
            }
        }
    }

    public final void g(float f7, float f10) {
        float f11 = AndroidUtilities.density;
        a(f7, f10, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f11, e(1.5f, 3.5f) * f11, e(0.35f, 0.6f), 2.0f);
    }
}
