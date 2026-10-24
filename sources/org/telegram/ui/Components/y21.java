package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class y21 {
    public long a;
    public boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final int e;
    public boolean f;
    public float g;
    public float h;

    public y21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        x21 x21Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            x21 x21Var2 = (x21) arrayList.get(i11);
            paint.setAlpha((int) (x21Var2.f * 255.0f * f10));
            canvas.drawPoint(x21Var2.a, x21Var2.b, paint);
        }
        double d = (f7 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d10 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d10) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        boolean z10 = true;
        int clamp = Utilities.clamp(arrayList2.size() / 12, 3, 1);
        int i12 = 0;
        while (i12 < clamp) {
            if (arrayList2.isEmpty()) {
                x21Var = new x21();
            } else {
                x21Var = (x21) arrayList2.get(i10);
                arrayList2.remove(i10);
            }
            if (this.b && this.f) {
                float f11 = (i12 + 1) / clamp;
                x21Var.a = AndroidUtilities.lerp(this.g, centerX, f11);
                x21Var.b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                x21Var.a = centerX;
                x21Var.b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            x21Var.c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            x21 x21Var3 = x21Var;
            x21Var3.d = (float) i2.o1.f(nextInt, d10, Math.sin(nextInt) * d11);
            x21Var3.f = 1.0f;
            x21Var3.h = 0.0f;
            if (this.b) {
                x21Var3.g = Utilities.random.nextInt(200) + 600;
                x21Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                x21Var3.g = Utilities.random.nextInt(100) + 400;
                x21Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(x21Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f = z10;
        this.g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            x21 x21Var4 = (x21) arrayList.get(i13);
            float f12 = x21Var4.h;
            float f13 = x21Var4.g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(x21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                x21Var4.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = x21Var4.a;
                float f15 = x21Var4.c;
                float f16 = x21Var4.e;
                float f17 = min;
                x21Var4.a = a1.g.B(f15 * f16, f17, 200.0f, f14);
                x21Var4.b = (((x21Var4.d * f16) * f17) / 200.0f) + x21Var4.b;
                x21Var4.h += f17;
            }
            i13++;
        }
        this.a = elapsedRealtime;
    }

    public y21(int i10) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new x21());
        }
    }
}
