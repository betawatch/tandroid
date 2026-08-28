package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d11 {
    public long a;
    public boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final int e;
    public boolean f;
    public float g;
    public float h;

    public d11() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        c11 c11Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c11 c11Var2 = (c11) arrayList.get(i10);
            paint.setAlpha((int) (c11Var2.f * 255.0f * f11));
            canvas.drawPoint(c11Var2.a, c11Var2.b, paint);
        }
        double d = (f10 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d9 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d9) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        int clamp = Utilities.clamp(arrayList2.size() / 12, 3, 1);
        int i11 = 0;
        while (i11 < clamp) {
            if (arrayList2.isEmpty()) {
                c11Var = new c11();
            } else {
                c11Var = (c11) arrayList2.get(i9);
                arrayList2.remove(i9);
            }
            if (this.b && this.f) {
                float f12 = (i11 + 1) / clamp;
                c11Var.a = AndroidUtilities.lerp(this.g, centerX, f12);
                c11Var.b = AndroidUtilities.lerp(this.h, centerY, f12);
            } else {
                c11Var.a = centerX;
                c11Var.b = centerY;
            }
            double d10 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            c11Var.c = (float) ((Math.cos(nextInt) * d10) - (Math.sin(nextInt) * d9));
            c11 c11Var3 = c11Var;
            c11Var3.d = (float) j3.r0.b(nextInt, d9, Math.sin(nextInt) * d10);
            c11Var3.f = 1.0f;
            c11Var3.h = 0.0f;
            if (this.b) {
                c11Var3.g = Utilities.random.nextInt(200) + 600;
                c11Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                c11Var3.g = Utilities.random.nextInt(100) + 400;
                c11Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(c11Var3);
            i11++;
            sin = d10;
            i9 = 0;
        }
        this.f = true;
        this.g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.a);
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            c11 c11Var4 = (c11) arrayList.get(i12);
            float f13 = c11Var4.h;
            float f14 = c11Var4.g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(c11Var4);
                }
                arrayList.remove(i12);
                i12--;
                size2--;
            } else {
                c11Var4.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f13 / f14);
                float f15 = c11Var4.a;
                float f16 = c11Var4.c;
                float f17 = c11Var4.e;
                float f18 = min;
                c11Var4.a = aa.d.d(f16 * f17, f18, 200.0f, f15);
                c11Var4.b = (((c11Var4.d * f17) * f18) / 200.0f) + c11Var4.b;
                c11Var4.h += f18;
            }
            i12++;
        }
        this.a = elapsedRealtime;
    }

    public d11(int i9) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = i9;
        for (int i10 = 0; i10 < i9; i10++) {
            this.d.add(new c11());
        }
    }
}
