package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class o01 {
    public long a;
    public boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final int e;
    public boolean f;
    public float g;
    public float h;

    public o01() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        n01 n01Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            n01 n01Var2 = (n01) arrayList.get(i10);
            paint.setAlpha((int) (n01Var2.f * 255.0f * f11));
            canvas.drawPoint(n01Var2.a, n01Var2.b, paint);
        }
        double d = (f10 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d2 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d2) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        boolean z10 = true;
        int j3 = Utilities.j(arrayList2.size() / 12, 3, 1);
        int i11 = 0;
        while (i11 < j3) {
            if (arrayList2.isEmpty()) {
                n01Var = new n01();
            } else {
                n01Var = (n01) arrayList2.get(i7);
                arrayList2.remove(i7);
            }
            if (this.b && this.f) {
                float f12 = (i11 + 1) / j3;
                n01Var.a = org.telegram.messenger.g0.T1(this.g, centerX, f12);
                n01Var.b = org.telegram.messenger.g0.T1(this.h, centerY, f12);
            } else {
                n01Var.a = centerX;
                n01Var.b = centerY;
            }
            SecureRandom secureRandom = Utilities.b;
            double d10 = sin;
            double nextInt = (secureRandom.nextInt(org.telegram.messenger.ks.W1) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            n01Var.c = (float) ((Math.cos(nextInt) * d10) - (Math.sin(nextInt) * d2));
            double sin2 = Math.sin(nextInt) * d10;
            double d11 = nextInt;
            n01 n01Var3 = n01Var;
            n01Var3.d = (float) i5.c.c(d11, d2, sin2);
            n01Var3.f = 1.0f;
            n01Var3.h = 0.0f;
            if (this.b) {
                n01Var3.g = secureRandom.nextInt(org.telegram.messenger.ks.e3) + 600;
                n01Var3.e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                n01Var3.g = secureRandom.nextInt(100) + 400;
                n01Var3.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(n01Var3);
            i11++;
            sin = d10;
            i7 = 0;
            z10 = true;
        }
        this.f = z10;
        this.g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.a);
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            n01 n01Var4 = (n01) arrayList.get(i12);
            float f13 = n01Var4.h;
            float f14 = n01Var4.g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(n01Var4);
                }
                arrayList.remove(i12);
                i12--;
                size2--;
            } else {
                n01Var4.f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f13 / f14);
                float f15 = n01Var4.a;
                float f16 = n01Var4.c;
                float f17 = n01Var4.e;
                float f18 = min;
                n01Var4.a = a8.p0.f(f16 * f17, f18, 200.0f, f15);
                n01Var4.b = (((n01Var4.d * f17) * f18) / 200.0f) + n01Var4.b;
                n01Var4.h += f18;
            }
            i12++;
        }
        this.a = elapsedRealtime;
    }

    public o01(int i7) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = i7;
        for (int i10 = 0; i10 < i7; i10++) {
            this.d.add(new n01());
        }
    }
}
