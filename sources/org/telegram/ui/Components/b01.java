package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b01 {
    public long a;
    public boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final int e;
    public boolean f;
    public float g;
    public float h;

    public b01() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        a01 a01Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            a01 a01Var2 = (a01) arrayList.get(i10);
            paint.setAlpha((int) (a01Var2.f * 255.0f * f11));
            canvas.drawPoint(a01Var2.a, a01Var2.b, paint);
        }
        double d = (f10 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d10 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d10) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        boolean z10 = true;
        int j10 = Utilities.j(arrayList2.size() / 12, 3, 1);
        int i11 = 0;
        while (i11 < j10) {
            if (arrayList2.isEmpty()) {
                a01Var = new a01();
            } else {
                a01Var = (a01) arrayList2.get(i3);
                arrayList2.remove(i3);
            }
            if (this.b && this.f) {
                float f12 = (i11 + 1) / j10;
                a01Var.a = org.telegram.messenger.g0.T1(this.g, centerX, f12);
                a01Var.b = org.telegram.messenger.g0.T1(this.h, centerY, f12);
            } else {
                a01Var.a = centerX;
                a01Var.b = centerY;
            }
            SecureRandom secureRandom = Utilities.b;
            double d11 = sin;
            double nextInt = (secureRandom.nextInt(org.telegram.messenger.hs.W1) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            a01Var.c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            double sin2 = Math.sin(nextInt) * d11;
            double d12 = nextInt;
            a01 a01Var3 = a01Var;
            a01Var3.d = (float) k2.p1.c(d12, d10, sin2);
            a01Var3.f = 1.0f;
            a01Var3.h = 0.0f;
            if (this.b) {
                a01Var3.g = secureRandom.nextInt(org.telegram.messenger.hs.e3) + 600;
                a01Var3.e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                a01Var3.g = secureRandom.nextInt(100) + 400;
                a01Var3.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(a01Var3);
            i11++;
            sin = d11;
            i3 = 0;
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
            a01 a01Var4 = (a01) arrayList.get(i12);
            float f13 = a01Var4.h;
            float f14 = a01Var4.g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(a01Var4);
                }
                arrayList.remove(i12);
                i12--;
                size2--;
            } else {
                a01Var4.f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f13 / f14);
                float f15 = a01Var4.a;
                float f16 = a01Var4.c;
                float f17 = a01Var4.e;
                float f18 = min;
                a01Var4.a = a1.g.e(f16 * f17, f18, 200.0f, f15);
                a01Var4.b = (((a01Var4.d * f17) * f18) / 200.0f) + a01Var4.b;
                a01Var4.h += f18;
            }
            i12++;
        }
        this.a = elapsedRealtime;
    }

    public b01(int i3) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = i3;
        for (int i10 = 0; i10 < i3; i10++) {
            this.d.add(new a01());
        }
    }
}
