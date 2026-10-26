package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g31 {
    public long a;
    public boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final int e;
    public boolean f;
    public float g;
    public float h;

    public g31() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        f31 f31Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            f31 f31Var2 = (f31) arrayList.get(i11);
            paint.setAlpha((int) (f31Var2.f * 255.0f * f10));
            canvas.drawPoint(f31Var2.a, f31Var2.b, paint);
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
                f31Var = new f31();
            } else {
                f31Var = (f31) arrayList2.get(i10);
                arrayList2.remove(i10);
            }
            if (this.b && this.f) {
                float f11 = (i12 + 1) / clamp;
                f31Var.a = AndroidUtilities.lerp(this.g, centerX, f11);
                f31Var.b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                f31Var.a = centerX;
                f31Var.b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            f31Var.c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            f31 f31Var3 = f31Var;
            f31Var3.d = (float) org.telegram.messenger.t.a(nextInt, d10, Math.sin(nextInt) * d11);
            f31Var3.f = 1.0f;
            f31Var3.h = 0.0f;
            if (this.b) {
                f31Var3.g = Utilities.random.nextInt(200) + 600;
                f31Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                f31Var3.g = Utilities.random.nextInt(100) + 400;
                f31Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(f31Var3);
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
            f31 f31Var4 = (f31) arrayList.get(i13);
            float f12 = f31Var4.h;
            float f13 = f31Var4.g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(f31Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                f31Var4.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = f31Var4.a;
                float f15 = f31Var4.c;
                float f16 = f31Var4.e;
                float f17 = min;
                f31Var4.a = a1.g.C(f15 * f16, f17, 200.0f, f14);
                f31Var4.b = (((f31Var4.d * f16) * f17) / 200.0f) + f31Var4.b;
                f31Var4.h += f17;
            }
            i13++;
        }
        this.a = elapsedRealtime;
    }

    public g31(int i10) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new f31());
        }
    }
}
