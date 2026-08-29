package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o11 {
    public long a;
    public boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final int e;
    public boolean f;
    public float g;
    public float h;

    public o11() {
        this(40);
    }

    public final void a(float f9, float f10, Canvas canvas, Paint paint, RectF rectF) {
        n11 n11Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            n11 n11Var2 = (n11) arrayList.get(i11);
            paint.setAlpha((int) (n11Var2.f * 255.0f * f10));
            canvas.drawPoint(n11Var2.a, n11Var2.b, paint);
        }
        double d = (f9 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d10 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d10) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        int clamp = Utilities.clamp(arrayList2.size() / 12, 3, 1);
        int i12 = 0;
        while (i12 < clamp) {
            if (arrayList2.isEmpty()) {
                n11Var = new n11();
            } else {
                n11Var = (n11) arrayList2.get(i10);
                arrayList2.remove(i10);
            }
            if (this.b && this.f) {
                float f11 = (i12 + 1) / clamp;
                n11Var.a = AndroidUtilities.lerp(this.g, centerX, f11);
                n11Var.b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                n11Var.a = centerX;
                n11Var.b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            n11Var.c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            n11 n11Var3 = n11Var;
            n11Var3.d = (float) j7.l1.b(nextInt, d10, Math.sin(nextInt) * d11);
            n11Var3.f = 1.0f;
            n11Var3.h = 0.0f;
            if (this.b) {
                n11Var3.g = Utilities.random.nextInt(200) + 600;
                n11Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                n11Var3.g = Utilities.random.nextInt(100) + 400;
                n11Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(n11Var3);
            i12++;
            sin = d11;
            i10 = 0;
        }
        this.f = true;
        this.g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            n11 n11Var4 = (n11) arrayList.get(i13);
            float f12 = n11Var4.h;
            float f13 = n11Var4.g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(n11Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                n11Var4.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = n11Var4.a;
                float f15 = n11Var4.c;
                float f16 = n11Var4.e;
                float f17 = min;
                n11Var4.a = a4.w.d(f15 * f16, f17, 200.0f, f14);
                n11Var4.b = (((n11Var4.d * f16) * f17) / 200.0f) + n11Var4.b;
                n11Var4.h += f17;
            }
            i13++;
        }
        this.a = elapsedRealtime;
    }

    public o11(int i10) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new n11());
        }
    }
}
