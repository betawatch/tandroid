package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class n9 {
    public static final int[] f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList a = new ArrayList();
    public final Random b = new Random();
    public final Paint c = new Paint(1);
    public final Path d;
    public long e;

    public n9() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final m9 a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            this.e = SystemClock.uptimeMillis();
        }
        m9 m9Var = new m9();
        m9Var.l = 1.0f;
        m9Var.a = f10;
        m9Var.b = f11;
        double d = f12;
        m9Var.c = ((float) Math.cos(d)) * f13;
        m9Var.d = ((float) Math.sin(d)) * f13;
        m9Var.e = f14;
        m9Var.f = f15;
        m9Var.g = f16;
        m9Var.k = f[this.b.nextInt(6)];
        m9Var.h = e(0.0f, 90.0f);
        m9Var.i = e(-180.0f, 180.0f);
        arrayList.add(m9Var);
        return m9Var;
    }

    public final void b(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.p;
        for (int i7 = 0; i7 < 28; i7++) {
            a(f10, f11, e(0.0f, 6.2831855f), e(60.0f, 300.0f) * f12, e(2.5f, 6.0f) * f12, e(0.5f, 0.9f), 3.0f);
        }
    }

    public final void c(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, (uptimeMillis - this.e) / 1000.0f);
        this.e = uptimeMillis;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m9 m9Var = (m9) arrayList.get(size);
            float f10 = m9Var.j + min;
            m9Var.j = f10;
            if (f10 >= 0.0f) {
                if (f10 >= m9Var.f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-m9Var.g) * min);
                    float f11 = m9Var.c * exp;
                    m9Var.c = f11;
                    float f12 = m9Var.d * exp;
                    m9Var.d = f12;
                    m9Var.a = (f11 * min) + m9Var.a;
                    m9Var.b = (f12 * min) + m9Var.b;
                    m9Var.h = (m9Var.i * min) + m9Var.h;
                    float f13 = m9Var.j / m9Var.f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f13 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f13) * m9Var.l;
                    float C = com.google.android.recaptcha.internal.a.C(f13, 0.5f, 1.0f, m9Var.e);
                    int save = canvas.save();
                    canvas.translate(m9Var.a, m9Var.b);
                    canvas.rotate(m9Var.h);
                    canvas.scale(C, C);
                    int i7 = m9Var.k;
                    Paint paint = this.c;
                    paint.setColor(i7);
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

    public final float e(float f10, float f11) {
        return com.google.android.recaptcha.internal.a.z(f11, f10, this.b.nextFloat(), f10);
    }

    public final void f() {
        this.a.clear();
        float f10 = org.telegram.messenger.g0.p;
        for (int i7 = 0; i7 < 48; i7++) {
            int i10 = -1;
            while (i10 <= 1) {
                m9 a10 = a(0.0f, (e(-3.0f, 3.0f) * f10) + 0.0f, e(-0.6f, 0.6f) + (i10 < 0 ? 3.1415927f : 0.0f), e(150.0f, 310.0f) * f10, e(1.3f, 3.2f) * f10, e(0.65f, 1.05f), 1.8f);
                a10.k = -6562049;
                a10.l = e(0.3f, 1.0f);
                a10.j = (-i7) * 0.006f;
                i10 += 2;
            }
        }
    }

    public final void g(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.p;
        a(f10, f11, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f12, e(1.5f, 3.5f) * f12, e(0.35f, 0.6f), 2.0f);
    }
}
