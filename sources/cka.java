// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cka {
    public final cyb a;
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
    public final int f = bkb.z8;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public cka(int i) {
        this.h = i;
        short s = i == 0 ? (short) 100 : (short) 300;
        this.i = s;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(gl.L(1.5f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStrokeWidth(gl.L(0.5f));
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new cyb(s);
            this.b = s4.a(a(true));
        } else {
            this.a = null;
            this.b = null;
        }
        c();
        for (int i2 = 0; i2 < 20; i2++) {
            this.m.add(new bka(this));
        }
    }

    public static Bitmap a(boolean z) {
        Paint paint = new Paint(1);
        paint.setStrokeWidth(gl.L(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        Bitmap createBitmap = Bitmap.createBitmap(z ? gl.L(20.0f) : gl.L(10.0f), gl.L(10.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float N = gl.N(2.0f) * 2.0f;
        float f = (-gl.N(0.57f)) * 2.0f;
        float N2 = gl.N(1.55f) * 2.0f;
        float f2 = 5.0f;
        float L = gl.L(5.0f);
        float L2 = gl.L(5.0f);
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
            canvas.drawLine(f10, f11, f8 + ((float) ((Math.cos(d2) * d3) - (Math.sin(d2) * d4))), ((float) ug8.d(d2, d4, Math.sin(d2) * d3)) + f9, paint);
            canvas.drawLine(f10, f11, f8 + ((float) (((-Math.cos(d2)) * d3) - (Math.sin(d2) * d4))), ((float) ug8.d(d2, d4, (-Math.sin(d2)) * d3)) + f9, paint);
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
            paint2.setStrokeWidth(gl.L(1.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            canvas.drawPoint(gl.L(15.0f), gl.L(f12), paint2);
        }
        return bitmap2;
    }

    public final void b(Canvas canvas, View view) {
        short s;
        bka bkaVar;
        float f;
        float f2;
        if (view == null || canvas == null || !e66.e(32)) {
            return;
        }
        c();
        short s2 = this.i;
        cyb cybVar = this.a;
        int i = 0;
        ArrayList arrayList = this.l;
        if (cybVar != null) {
            int min = Math.min((int) s2, arrayList.size());
            int L = gl.L(10.0f);
            for (int i2 = 0; i2 < min; i2++) {
                bka bkaVar2 = (bka) arrayList.get(i2);
                float f3 = bkaVar2.a;
                float f4 = bkaVar2.b;
                if (bkaVar2.j == 0) {
                    f = L / 2.0f;
                    f2 = L;
                } else {
                    f = (L / 2.0f) * bkaVar2.i;
                    f2 = 0.0f;
                }
                cybVar.s(i2, bm2.o(this.n, (int) (bkaVar2.f * 255.0f)));
                cyb.d((float[]) cybVar.c, i2, f3 - f, f4 - f, f3 + f, f4 + f);
                float f5 = L;
                cyb.d((float[]) cybVar.d, i2, f2, 0.0f, f2 + f5, f5);
            }
            s4.b(canvas, cybVar, min, this.b);
        } else {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                bka bkaVar3 = (bka) arrayList.get(i3);
                int i4 = bkaVar3.j;
                cka ckaVar = bkaVar3.k;
                if (i4 != 0) {
                    Bitmap bitmap = ckaVar.j;
                    Paint paint = ckaVar.e;
                    if (bitmap == null) {
                        ckaVar.j = a(false);
                    }
                    paint.setAlpha((int) (bkaVar3.f * 255.0f));
                    canvas.save();
                    float f6 = bkaVar3.i;
                    canvas.scale(f6, f6, bkaVar3.a, bkaVar3.b);
                    canvas.drawBitmap(ckaVar.j, bkaVar3.a, bkaVar3.b, paint);
                    canvas.restore();
                } else {
                    ckaVar.c.setAlpha((int) (bkaVar3.f * 255.0f));
                    canvas.drawPoint(bkaVar3.a, bkaVar3.b, ckaVar.c);
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
                        int i8 = gl.m;
                        float nextFloat = secureRandom.nextFloat() * view.getMeasuredWidth();
                        float nextFloat2 = !z ? (secureRandom.nextFloat() * ls6.x(20.0f, view.getMeasuredHeight(), i8)) + i8 : secureRandom.nextFloat() * view.getMeasuredHeight();
                        double nextInt = (secureRandom.nextInt(40) + 70) * 0.017453292519943295d;
                        s = s2;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (arrayList2.isEmpty()) {
                            bkaVar = new bka(this);
                        } else {
                            bkaVar = (bka) arrayList2.get(0);
                            arrayList2.remove(0);
                        }
                        bkaVar.a = nextFloat;
                        bkaVar.b = nextFloat2;
                        bkaVar.c = cos;
                        bkaVar.d = sin;
                        bkaVar.f = 0.0f;
                        bkaVar.h = 0.0f;
                        bkaVar.i = secureRandom.nextFloat() * 1.2f;
                        bkaVar.j = secureRandom.nextInt(2);
                        if (z) {
                            bkaVar.g = secureRandom.nextInt(2000) + 3000;
                        } else {
                            bkaVar.g = secureRandom.nextInt(100) + 2000;
                        }
                        bkaVar.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(bkaVar);
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
            bka bkaVar4 = (bka) arrayList.get(i);
            float f7 = bkaVar4.h;
            float f8 = bkaVar4.g;
            if (f7 >= f8) {
                if (arrayList2.size() < i6) {
                    arrayList2.add(bkaVar4);
                }
                arrayList.remove(i);
                i--;
                size3--;
            } else {
                if (z) {
                    if (f7 < 200.0f) {
                        bkaVar4.f = gl.G.getInterpolation(f7 / 200.0f);
                    } else {
                        float f9 = f8 - f7;
                        if (f9 < 2000.0f) {
                            bkaVar4.f = gl.F.getInterpolation(f9 / 2000.0f);
                        }
                    }
                } else if (f7 < 200.0f) {
                    bkaVar4.f = gl.G.getInterpolation(f7 / 200.0f);
                } else {
                    bkaVar4.f = 1.0f - gl.F.getInterpolation((f7 - 200.0f) / (f8 - 200.0f));
                }
                float f10 = bkaVar4.a;
                float f11 = bkaVar4.c;
                float f12 = bkaVar4.e;
                float f13 = min2;
                bkaVar4.a = ls6.d(f11 * f12, f13, 500.0f, f10);
                bkaVar4.b = (((bkaVar4.d * f12) * f13) / 500.0f) + bkaVar4.b;
                bkaVar4.h += f13;
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
            i = bkb.w0(null, this.f, false) & (-1644826);
        }
        if (this.n != i) {
            this.n = i;
            this.c.setColor(i);
            this.d.setColor(i);
        }
    }
}
