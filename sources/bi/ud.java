package bi;

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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ud {
    public final int a;
    public final ArrayList b;
    public final Bitmap d;
    public int e;
    public int j;
    public a4.k l;
    public final Paint m;
    public long n;
    public long o;
    public final RectF c = new RectF();
    public final Paint f = new Paint(3);
    public final Rect g = new Rect();
    public float h = 1.0f;
    public final float i = 1.0f;
    public boolean k = true;

    public ud(int i7, int i10) {
        this.a = i7;
        this.j = i10;
        this.b = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.b.add(new td(this));
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
        a4.k kVar = new a4.k(i10);
        this.l = kVar;
        float width = createBitmap.getWidth();
        float height = createBitmap.getHeight();
        for (int i13 = 0; i13 < kVar.b; i13++) {
            a4.k.d((float[]) kVar.d, i13, 0.0f, 0.0f, width, height);
        }
        this.m = g0.a.a(createBitmap);
    }

    public final void a(Canvas canvas, int i7) {
        b(canvas, i7, 1.0f);
    }

    public final void b(Canvas canvas, int i7, float f10) {
        if (org.telegram.messenger.rc.e(131072)) {
            int i10 = this.j;
            ArrayList arrayList = this.b;
            int min = Math.min(i10, arrayList.size());
            float f11 = 2.0f;
            if (this.l != null) {
                Bitmap bitmap = this.d;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                for (int i11 = 0; i11 < min; i11++) {
                    td tdVar = (td) arrayList.get(i11);
                    float f12 = tdVar.i * tdVar.e * f10;
                    float f13 = (width / 2.0f) * f12;
                    float f14 = (height / 2.0f) * f12;
                    a4.k kVar = this.l;
                    float f15 = tdVar.a;
                    float f16 = tdVar.b;
                    a4.k.d((float[]) kVar.c, i11, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                    this.l.t(i11, i0.a.o(i7, (int) (Utilities.l(tdVar.h * f10) * 255.0f)));
                }
                g0.a.b(canvas, this.l, min, this.m);
            } else {
                if (this.e != i7) {
                    this.e = i7;
                    this.f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
                int i12 = 0;
                while (i12 < min) {
                    td tdVar2 = (td) arrayList.get(i12);
                    float f17 = tdVar2.h * f10;
                    ud udVar = tdVar2.j;
                    Paint paint = udVar.f;
                    Rect rect = udVar.g;
                    Bitmap bitmap2 = udVar.d;
                    paint.setAlpha((int) (f17 * 255.0f));
                    float f18 = f11;
                    rect.set((int) org.telegram.ui.Cells.f1.x((bitmap2.getWidth() / f11) * tdVar2.i, tdVar2.e, f17, tdVar2.a), (int) org.telegram.ui.Cells.f1.x((bitmap2.getHeight() / f11) * tdVar2.i, tdVar2.e, f17, tdVar2.b), (int) com.google.android.recaptcha.internal.a.x((bitmap2.getWidth() / f11) * tdVar2.i, tdVar2.e, f17, tdVar2.a), (int) com.google.android.recaptcha.internal.a.x((bitmap2.getHeight() / f18) * tdVar2.i, tdVar2.e, f17, tdVar2.b));
                    canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                    i12++;
                    f11 = f18;
                }
            }
            this.k = false;
        }
    }

    public final void c(td tdVar, long j3, boolean z9) {
        tdVar.f = j3;
        g5.a aVar = Utilities.c;
        long W1 = (long) (org.telegram.messenger.g0.W1(aVar.nextFloat(), 500, 2500) * this.i);
        tdVar.g = W1;
        if (z9) {
            tdVar.f -= (long) (Utilities.l(aVar.nextFloat()) * W1);
        }
        RectF rectF = this.c;
        tdVar.a = org.telegram.messenger.g0.T1(rectF.left, rectF.right, aVar.nextFloat());
        tdVar.b = org.telegram.messenger.g0.T1(rectF.top, rectF.bottom, aVar.nextFloat());
        if (this.a == 0) {
            tdVar.c = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-7.0f, -18.0f, aVar.nextFloat()));
            tdVar.d = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-2.0f, 2.0f, aVar.nextFloat()));
        } else {
            tdVar.c = rectF.centerX() - tdVar.a;
            tdVar.d = rectF.centerY() - tdVar.b;
            float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(1.0f, 4.0f, aVar.nextFloat()));
            float f10 = tdVar.c;
            float f11 = tdVar.d;
            float sqrt = L / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            tdVar.c *= sqrt;
            tdVar.d *= sqrt;
        }
        tdVar.i = org.telegram.messenger.g0.T1(0.4f, 1.0f, aVar.nextFloat());
        tdVar.e = org.telegram.messenger.g0.T1(0.8f, 1.2f, aVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        if (org.telegram.messenger.rc.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (Math.min(this.o - currentTimeMillis, 16L) / 1000.0f) * this.h;
            int i7 = 0;
            while (true) {
                int i10 = this.j;
                ArrayList arrayList = this.b;
                if (i7 >= Math.min(i10, arrayList.size())) {
                    break;
                }
                td tdVar = (td) arrayList.get(i7);
                long j3 = tdVar.g;
                float f10 = j3 <= 0 ? 2.0f : (currentTimeMillis - tdVar.f) / j3;
                if (f10 > 1.0f) {
                    c(tdVar, currentTimeMillis, this.k);
                    f10 = 0.0f;
                }
                tdVar.a = (tdVar.c * min) + tdVar.a;
                tdVar.b = (tdVar.d * min) + tdVar.b;
                float f11 = 4.0f * f10;
                tdVar.h = f11 - (f10 * f11);
                i7++;
            }
            this.o = currentTimeMillis;
            long j10 = this.n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
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
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                return;
            }
            td tdVar = (td) arrayList.get(i7);
            if (!this.c.contains((int) tdVar.a, (int) tdVar.b)) {
                c(tdVar, currentTimeMillis, this.k);
            }
            i7++;
        }
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.c.set(i7, i10, i11, i12);
        e();
    }

    public final void g(RectF rectF) {
        this.c.set(rectF);
        e();
    }
}
