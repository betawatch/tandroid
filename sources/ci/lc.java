package ci;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lc {
    public final int a;
    public final ArrayList b;
    public final Bitmap d;
    public int e;
    public int j;
    public e0.e0 l;
    public final Paint m;
    public long n;
    public long o;
    public final RectF c = new RectF();
    public final Paint f = new Paint(3);
    public final Rect g = new Rect();
    public float h = 1.0f;
    public final float i = 1.0f;
    public boolean k = true;

    public lc(int i3, int i10) {
        this.a = i3;
        this.j = i10;
        this.b = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.b.add(new kc(this));
        }
        int L = org.telegram.messenger.g0.L(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f10 = L >> 1;
        int i12 = (int) (0.85f * f10);
        path.moveTo(0.0f, f10);
        float f11 = i12;
        path.lineTo(f11, f11);
        path.lineTo(f10, 0.0f);
        float f12 = L - i12;
        path.lineTo(f12, f11);
        float f13 = L;
        path.lineTo(f13, f10);
        path.lineTo(f12, f12);
        path.lineTo(f10, f13);
        path.lineTo(f11, f12);
        path.lineTo(0.0f, f10);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT < 29) {
            this.l = null;
            this.m = null;
            return;
        }
        e0.e0 e0Var = new e0.e0(i10);
        this.l = e0Var;
        float width = createBitmap.getWidth();
        float height = createBitmap.getHeight();
        for (int i13 = 0; i13 < e0Var.b; i13++) {
            e0.e0.d((float[]) e0Var.d, i13, 0.0f, 0.0f, width, height);
        }
        this.m = g0.a.a(createBitmap);
    }

    public final void a(Canvas canvas, int i3) {
        b(canvas, i3, 1.0f);
    }

    public final void b(Canvas canvas, int i3, float f10) {
        if (org.telegram.messenger.lc.e(131072)) {
            int i10 = this.j;
            ArrayList arrayList = this.b;
            int min = Math.min(i10, arrayList.size());
            float f11 = 2.0f;
            if (this.l != null) {
                Bitmap bitmap = this.d;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                for (int i11 = 0; i11 < min; i11++) {
                    kc kcVar = (kc) arrayList.get(i11);
                    float f12 = kcVar.i * kcVar.e * f10;
                    float f13 = (width / 2.0f) * f12;
                    float f14 = (height / 2.0f) * f12;
                    e0.e0 e0Var = this.l;
                    float f15 = kcVar.a;
                    float f16 = kcVar.b;
                    e0.e0.d((float[]) e0Var.c, i11, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                    this.l.t(i11, i0.a.o(i3, (int) (Utilities.l(kcVar.h * f10) * 255.0f)));
                }
                g0.a.b(canvas, this.l, min, this.m);
            } else {
                if (this.e != i3) {
                    this.e = i3;
                    this.f.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
                }
                int i12 = 0;
                while (i12 < min) {
                    kc kcVar2 = (kc) arrayList.get(i12);
                    float f17 = kcVar2.h * f10;
                    lc lcVar = kcVar2.j;
                    Paint paint = lcVar.f;
                    Rect rect = lcVar.g;
                    Bitmap bitmap2 = lcVar.d;
                    paint.setAlpha((int) (f17 * 255.0f));
                    float f18 = f11;
                    rect.set((int) org.telegram.ui.Cells.f1.A((bitmap2.getWidth() / f11) * kcVar2.i, kcVar2.e, f17, kcVar2.a), (int) org.telegram.ui.Cells.f1.A((bitmap2.getHeight() / f11) * kcVar2.i, kcVar2.e, f17, kcVar2.b), (int) com.google.android.recaptcha.internal.a.v((bitmap2.getWidth() / f11) * kcVar2.i, kcVar2.e, f17, kcVar2.a), (int) com.google.android.recaptcha.internal.a.v((bitmap2.getHeight() / f18) * kcVar2.i, kcVar2.e, f17, kcVar2.b));
                    canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                    i12++;
                    f11 = f18;
                }
            }
            this.k = false;
        }
    }

    public final void c(kc kcVar, long j10, boolean z10) {
        kcVar.f = j10;
        f5.a aVar = Utilities.c;
        long W1 = (long) (org.telegram.messenger.g0.W1(aVar.nextFloat(), 500, 2500) * this.i);
        kcVar.g = W1;
        if (z10) {
            kcVar.f -= (long) (Utilities.l(aVar.nextFloat()) * W1);
        }
        RectF rectF = this.c;
        kcVar.a = org.telegram.messenger.g0.T1(rectF.left, rectF.right, aVar.nextFloat());
        kcVar.b = org.telegram.messenger.g0.T1(rectF.top, rectF.bottom, aVar.nextFloat());
        if (this.a == 0) {
            kcVar.c = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-7.0f, -18.0f, aVar.nextFloat()));
            kcVar.d = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-2.0f, 2.0f, aVar.nextFloat()));
        } else {
            kcVar.c = rectF.centerX() - kcVar.a;
            kcVar.d = rectF.centerY() - kcVar.b;
            float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(1.0f, 4.0f, aVar.nextFloat()));
            float f10 = kcVar.c;
            float f11 = kcVar.d;
            float sqrt = L / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            kcVar.c *= sqrt;
            kcVar.d *= sqrt;
        }
        kcVar.i = org.telegram.messenger.g0.T1(0.4f, 1.0f, aVar.nextFloat());
        kcVar.e = org.telegram.messenger.g0.T1(0.8f, 1.2f, aVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        if (org.telegram.messenger.lc.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (Math.min(this.o - currentTimeMillis, 16L) / 1000.0f) * this.h;
            int i3 = 0;
            while (true) {
                int i10 = this.j;
                ArrayList arrayList = this.b;
                if (i3 >= Math.min(i10, arrayList.size())) {
                    break;
                }
                kc kcVar = (kc) arrayList.get(i3);
                long j10 = kcVar.g;
                float f10 = j10 <= 0 ? 2.0f : (currentTimeMillis - kcVar.f) / j10;
                if (f10 > 1.0f) {
                    c(kcVar, currentTimeMillis, this.k);
                    f10 = 0.0f;
                }
                kcVar.a = (kcVar.c * min) + kcVar.a;
                kcVar.b = (kcVar.d * min) + kcVar.b;
                float f11 = 4.0f * f10;
                kcVar.h = f11 - (f10 * f11);
                i3++;
            }
            this.o = currentTimeMillis;
            long j11 = this.n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
                this.n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.a != 2) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i3 >= arrayList.size()) {
                return;
            }
            kc kcVar = (kc) arrayList.get(i3);
            if (!this.c.contains((int) kcVar.a, (int) kcVar.b)) {
                c(kcVar, currentTimeMillis, this.k);
            }
            i3++;
        }
    }

    public final void f(int i3, int i10, int i11, int i12) {
        this.c.set(i3, i10, i11, i12);
        e();
    }

    public final void g(RectF rectF) {
        this.c.set(rectF);
        e();
    }
}
