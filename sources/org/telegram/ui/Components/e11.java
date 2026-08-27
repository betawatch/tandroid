package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e11 {
    public long a;
    public boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final int e;
    public boolean f;
    public float g;
    public float h;

    public e11() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        d11 d11Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            d11 d11Var2 = (d11) arrayList.get(i11);
            paint.setAlpha((int) (d11Var2.f * 255.0f * f11));
            canvas.drawPoint(d11Var2.a, d11Var2.b, paint);
        }
        double d = (f10 - 90.0f) * 0.017453292519943295d;
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
                d11Var = new d11();
            } else {
                d11Var = (d11) arrayList2.get(i10);
                arrayList2.remove(i10);
            }
            if (this.b && this.f) {
                float f12 = (i12 + 1) / clamp;
                d11Var.a = AndroidUtilities.lerp(this.g, centerX, f12);
                d11Var.b = AndroidUtilities.lerp(this.h, centerY, f12);
            } else {
                d11Var.a = centerX;
                d11Var.b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            d11Var.c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            d11 d11Var3 = d11Var;
            d11Var3.d = (float) i0.a.b(nextInt, d10, Math.sin(nextInt) * d11);
            d11Var3.f = 1.0f;
            d11Var3.h = 0.0f;
            if (this.b) {
                d11Var3.g = Utilities.random.nextInt(200) + 600;
                d11Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                d11Var3.g = Utilities.random.nextInt(100) + 400;
                d11Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(d11Var3);
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
            d11 d11Var4 = (d11) arrayList.get(i13);
            float f13 = d11Var4.h;
            float f14 = d11Var4.g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(d11Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                d11Var4.f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f13 / f14);
                float f15 = d11Var4.a;
                float f16 = d11Var4.c;
                float f17 = d11Var4.e;
                float f18 = min;
                d11Var4.a = a9.p.d(f16 * f17, f18, 200.0f, f15);
                d11Var4.b = (((d11Var4.d * f17) * f18) / 200.0f) + d11Var4.b;
                d11Var4.h += f18;
            }
            i13++;
        }
        this.a = elapsedRealtime;
    }

    public e11(int i10) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new d11());
        }
    }
}
