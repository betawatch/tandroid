package lh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class wa {
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

    public wa(int i10, int i11) {
        this.a = i10;
        this.j = i11;
        this.b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.b.add(new va(this));
        }
        int dp = AndroidUtilities.dp(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f10 = dp >> 1;
        int i13 = (int) (0.85f * f10);
        path.moveTo(0.0f, f10);
        float f11 = i13;
        path.lineTo(f11, f11);
        path.lineTo(f10, 0.0f);
        float f12 = dp - i13;
        path.lineTo(f12, f11);
        float f13 = dp;
        path.lineTo(f13, f10);
        path.lineTo(f12, f12);
        path.lineTo(f10, f13);
        path.lineTo(f11, f12);
        path.lineTo(0.0f, f10);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT < 29) {
            this.l = null;
            this.m = null;
            return;
        }
        a4.k kVar = new a4.k(i11);
        this.l = kVar;
        float width = createBitmap.getWidth();
        float height = createBitmap.getHeight();
        for (int i14 = 0; i14 < kVar.a; i14++) {
            a4.k.b((float[]) kVar.c, i14, 0.0f, 0.0f, width, height);
        }
        this.m = g0.a.a(createBitmap);
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f10) {
        if (LiteMode.isEnabled(131072)) {
            int i11 = this.j;
            ArrayList arrayList = this.b;
            int min = Math.min(i11, arrayList.size());
            float f11 = 2.0f;
            if (this.l != null) {
                Bitmap bitmap = this.d;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                for (int i12 = 0; i12 < min; i12++) {
                    va vaVar = (va) arrayList.get(i12);
                    float f12 = vaVar.i * vaVar.e * f10;
                    float f13 = (width / 2.0f) * f12;
                    float f14 = (height / 2.0f) * f12;
                    a4.k kVar = this.l;
                    float f15 = vaVar.a;
                    float f16 = vaVar.b;
                    a4.k.b((float[]) kVar.b, i12, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                    this.l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(vaVar.h * f10) * 255.0f)));
                }
                g0.a.b(canvas, this.l, min, this.m);
            } else {
                if (this.e != i10) {
                    this.e = i10;
                    this.f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
                int i13 = 0;
                while (i13 < min) {
                    va vaVar2 = (va) arrayList.get(i13);
                    float f17 = vaVar2.h * f10;
                    wa waVar = vaVar2.j;
                    Paint paint = waVar.f;
                    Rect rect = waVar.g;
                    Bitmap bitmap2 = waVar.d;
                    paint.setAlpha((int) (f17 * 255.0f));
                    rect.set((int) (vaVar2.a - ((((bitmap2.getWidth() / f11) * vaVar2.i) * vaVar2.e) * f17)), (int) (vaVar2.b - ((((bitmap2.getHeight() / f11) * vaVar2.i) * vaVar2.e) * f17)), (int) e2.c.u((bitmap2.getWidth() / f11) * vaVar2.i, vaVar2.e, f17, vaVar2.a), (int) e2.c.u((bitmap2.getHeight() / 2.0f) * vaVar2.i, vaVar2.e, f17, vaVar2.b));
                    canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                    i13++;
                    f11 = 2.0f;
                }
            }
            this.k = false;
        }
    }

    public final void c(va vaVar, long j10, boolean z4) {
        vaVar.f = j10;
        long lerp = (long) (AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.i);
        vaVar.g = lerp;
        if (z4) {
            vaVar.f -= (long) (Utilities.clamp01(Utilities.fastRandom.nextFloat()) * lerp);
        }
        RectF rectF = this.c;
        vaVar.a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        vaVar.b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.a == 0) {
            vaVar.c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            vaVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            vaVar.c = rectF.centerX() - vaVar.a;
            vaVar.d = rectF.centerY() - vaVar.b;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat()));
            float f10 = vaVar.c;
            float f11 = vaVar.d;
            float sqrt = dp / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            vaVar.c *= sqrt;
            vaVar.d *= sqrt;
        }
        vaVar.i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        vaVar.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (Math.min(this.o - currentTimeMillis, 16L) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.j;
                ArrayList arrayList = this.b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                va vaVar = (va) arrayList.get(i10);
                long j10 = vaVar.g;
                float f10 = j10 <= 0 ? 2.0f : (currentTimeMillis - vaVar.f) / j10;
                if (f10 > 1.0f) {
                    c(vaVar, currentTimeMillis, this.k);
                    f10 = 0.0f;
                }
                vaVar.a = (vaVar.c * min) + vaVar.a;
                vaVar.b = (vaVar.d * min) + vaVar.b;
                float f11 = 4.0f * f10;
                vaVar.h = f11 - (f10 * f11);
                i10++;
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            va vaVar = (va) arrayList.get(i10);
            if (!this.c.contains((int) vaVar.a, (int) vaVar.b)) {
                c(vaVar, currentTimeMillis, this.k);
            }
            i10++;
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.c.set(rectF);
        e();
    }
}
