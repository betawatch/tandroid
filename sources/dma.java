// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dma {
    public final e0c a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public int g;
    public final boolean h;
    public final short i;
    public Bitmap j;
    public long k;
    public int n;
    public final Paint e = new Paint();
    public final int f = cmb.z8;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public dma(int i) {
        this.h = i;
        short s = i == 0 ? (short) 100 : (short) 300;
        this.i = s;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(gm.L(1.5f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStrokeWidth(gm.L(0.5f));
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new e0c(s);
            this.b = s4.a(a(true));
        } else {
            this.a = null;
            this.b = null;
        }
        c();
        for (int i2 = 0; i2 < 20; i2++) {
            this.m.add(new cma(this));
        }
    }

    public static Bitmap a(boolean z) {
        Paint paint = new Paint(1);
        paint.setStrokeWidth(gm.L(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        Bitmap createBitmap = Bitmap.createBitmap(z ? gm.L(20.0f) : gm.L(10.0f), gm.L(10.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float N = gm.N(2.0f) * 2.0f;
        float f = (-gm.N(0.57f)) * 2.0f;
        float N2 = gm.N(1.55f) * 2.0f;
        float f2 = 5.0f;
        float L = gm.L(5.0f);
        float L2 = gm.L(5.0f);
        float f3 = -1.5707964f;
        int i = 0;
        while (i < 6) {
            double d = f3;
            float f4 = f2;
            float f5 = f3;
            float cos = ((float) Math.cos(d)) * N;
            Bitmap bitmap = createBitmap;
            float sin = ((float) Math.sin(d)) * N;
            float f6 = cos * 0.66f;
            float f7 = 0.66f * sin;
            canvas.drawLine(L, L2, cos + L, sin + L2, paint);
            float f8 = L;
            float f9 = L2;
            double d2 = (float) (d - 1.5707963267948966d);
            double d3 = f;
            double d4 = N2;
            float f10 = f8 + f6;
            float f11 = f9 + f7;
            canvas.drawLine(f10, f11, f8 + ((float) ((Math.cos(d2) * d3) - (Math.sin(d2) * d4))), ((float) wi8.d(d2, d4, Math.sin(d2) * d3)) + f9, paint);
            canvas.drawLine(f10, f11, f8 + ((float) (((-Math.cos(d2)) * d3) - (Math.sin(d2) * d4))), ((float) wi8.d(d2, d4, (-Math.sin(d2)) * d3)) + f9, paint);
            f3 = f5 + 1.0471976f;
            i++;
            L2 = f9;
            f2 = f4;
            createBitmap = bitmap;
            L = f8;
        }
        Bitmap bitmap2 = createBitmap;
        float f12 = f2;
        if (z) {
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(gm.L(1.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            canvas.drawPoint(gm.L(15.0f), gm.L(f12), paint2);
        }
        return bitmap2;
    }

    public final void b(Canvas canvas, View view) {
        short s;
        cma cmaVar;
        float f;
        float f2;
        if (view == null || canvas == null || !e86.e(32)) {
            return;
        }
        c();
        short s2 = this.i;
        e0c e0cVar = this.a;
        int i = 0;
        ArrayList arrayList = this.l;
        if (e0cVar != null) {
            int min = Math.min((int) s2, arrayList.size());
            int L = gm.L(10.0f);
            for (int i2 = 0; i2 < min; i2++) {
                cma cmaVar2 = (cma) arrayList.get(i2);
                float f3 = cmaVar2.a;
                float f4 = cmaVar2.b;
                if (cmaVar2.j == 0) {
                    f = L / 2.0f;
                    f2 = L;
                } else {
                    f = (L / 2.0f) * cmaVar2.i;
                    f2 = 0.0f;
                }
                e0cVar.s(i2, on2.p(this.n, (int) (cmaVar2.f * 255.0f)));
                e0c.d((float[]) e0cVar.c, i2, f3 - f, f4 - f, f3 + f, f4 + f);
                float f5 = L;
                e0c.d((float[]) e0cVar.d, i2, f2, 0.0f, f2 + f5, f5);
            }
            s4.b(canvas, e0cVar, min, this.b);
        } else {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                cma cmaVar3 = (cma) arrayList.get(i3);
                int i4 = cmaVar3.j;
                dma dmaVar = cmaVar3.k;
                if (i4 != 0) {
                    Bitmap bitmap = dmaVar.j;
                    Paint paint = dmaVar.e;
                    if (bitmap == null) {
                        dmaVar.j = a(false);
                    }
                    paint.setAlpha((int) (cmaVar3.f * 255.0f));
                    canvas.save();
                    float f6 = cmaVar3.i;
                    canvas.scale(f6, f6, cmaVar3.a, cmaVar3.b);
                    canvas.drawBitmap(dmaVar.j, cmaVar3.a, cmaVar3.b, paint);
                    canvas.restore();
                } else {
                    dmaVar.c.setAlpha((int) (cmaVar3.f * 255.0f));
                    canvas.drawPoint(cmaVar3.a, cmaVar3.b, dmaVar.c);
                }
            }
        }
        boolean z = this.h;
        int i5 = !z ? 1 : 10;
        int size2 = arrayList.size();
        int i6 = 40;
        ArrayList arrayList2 = this.m;
        if (size2 < s2) {
            int i7 = 0;
            while (i7 < i5) {
                if (arrayList.size() < s2) {
                    SecureRandom secureRandom = Utilities.b;
                    if (secureRandom.nextFloat() > 0.7f) {
                        int i8 = gm.m;
                        float nextFloat = secureRandom.nextFloat() * view.getMeasuredWidth();
                        float nextFloat2 = !z ? (secureRandom.nextFloat() * kt6.y(20.0f, view.getMeasuredHeight(), i8)) + i8 : secureRandom.nextFloat() * view.getMeasuredHeight();
                        double nextInt = (secureRandom.nextInt(40) + 70) * 0.017453292519943295d;
                        s = s2;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (arrayList2.isEmpty()) {
                            cmaVar = new cma(this);
                        } else {
                            cmaVar = (cma) arrayList2.get(0);
                            arrayList2.remove(0);
                        }
                        cmaVar.a = nextFloat;
                        cmaVar.b = nextFloat2;
                        cmaVar.c = cos;
                        cmaVar.d = sin;
                        cmaVar.f = 0.0f;
                        cmaVar.h = 0.0f;
                        cmaVar.i = secureRandom.nextFloat() * 1.2f;
                        cmaVar.j = secureRandom.nextInt(2);
                        if (z) {
                            cmaVar.g = secureRandom.nextInt(2000) + 3000;
                        } else {
                            cmaVar.g = secureRandom.nextInt(100) + 2000;
                        }
                        cmaVar.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(cmaVar);
                        i7++;
                        s2 = s;
                    }
                }
                s = s2;
                i7++;
                s2 = s;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long min2 = Math.min(17L, currentTimeMillis - this.k);
        int size3 = arrayList.size();
        while (i < size3) {
            cma cmaVar4 = (cma) arrayList.get(i);
            float f7 = cmaVar4.h;
            float f8 = cmaVar4.g;
            if (f7 >= f8) {
                if (arrayList2.size() < i6) {
                    arrayList2.add(cmaVar4);
                }
                arrayList.remove(i);
                i--;
                size3--;
            } else {
                if (z) {
                    if (f7 < 200.0f) {
                        cmaVar4.f = gm.G.getInterpolation(f7 / 200.0f);
                    } else {
                        float f9 = f8 - f7;
                        if (f9 < 2000.0f) {
                            cmaVar4.f = gm.F.getInterpolation(f9 / 2000.0f);
                        }
                    }
                } else if (f7 < 200.0f) {
                    cmaVar4.f = gm.G.getInterpolation(f7 / 200.0f);
                } else {
                    cmaVar4.f = 1.0f - gm.F.getInterpolation((f7 - 200.0f) / (f8 - 200.0f));
                }
                float f10 = cmaVar4.a;
                float f11 = cmaVar4.c;
                float f12 = cmaVar4.e;
                float f13 = min2;
                cmaVar4.a = kt6.d(f11 * f12, f13, 500.0f, f10);
                cmaVar4.b = (((cmaVar4.d * f12) * f13) / 500.0f) + cmaVar4.b;
                cmaVar4.h += f13;
            }
            i++;
            i6 = 40;
        }
        this.k = currentTimeMillis;
        view.invalidate();
    }

    public final void c() {
        int i = this.g;
        if (i == 0) {
            i = cmb.w0(null, this.f, false) & (-1644826);
        }
        if (this.n != i) {
            this.n = i;
            this.c.setColor(i);
            this.d.setColor(i);
        }
    }
}
