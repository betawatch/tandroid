package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class k21 {
    public long a;
    public boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final int e;
    public boolean f;
    public float g;
    public float h;

    public k21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        j21 j21Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j21 j21Var2 = (j21) arrayList.get(i11);
            paint.setAlpha((int) (j21Var2.f * 255.0f * f10));
            canvas.drawPoint(j21Var2.a, j21Var2.b, paint);
        }
        double d = (f7 - 90.0f) * 0.017453292519943295d;
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
                j21Var = new j21();
            } else {
                j21Var = (j21) arrayList2.get(i10);
                arrayList2.remove(i10);
            }
            if (this.b && this.f) {
                float f11 = (i12 + 1) / clamp;
                j21Var.a = AndroidUtilities.lerp(this.g, centerX, f11);
                j21Var.b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                j21Var.a = centerX;
                j21Var.b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            j21Var.c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            j21 j21Var3 = j21Var;
            j21Var3.d = (float) hg.c.e(nextInt, d10, Math.sin(nextInt) * d11);
            j21Var3.f = 1.0f;
            j21Var3.h = 0.0f;
            if (this.b) {
                j21Var3.g = Utilities.random.nextInt(200) + 600;
                j21Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                j21Var3.g = Utilities.random.nextInt(100) + 400;
                j21Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(j21Var3);
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
            j21 j21Var4 = (j21) arrayList.get(i13);
            float f12 = j21Var4.h;
            float f13 = j21Var4.g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(j21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                j21Var4.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = j21Var4.a;
                float f15 = j21Var4.c;
                float f16 = j21Var4.e;
                float f17 = min;
                j21Var4.a = a4.a.B(f15 * f16, f17, 200.0f, f14);
                j21Var4.b = (((j21Var4.d * f16) * f17) / 200.0f) + j21Var4.b;
                j21Var4.h += f17;
            }
            i13++;
        }
        this.a = elapsedRealtime;
    }

    public k21(int i10) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new j21());
        }
    }
}
