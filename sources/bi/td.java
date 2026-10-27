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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class td {
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

    public td(int i10, int i11) {
        this.a = i10;
        this.j = i11;
        this.b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.b.add(new sd(this));
        }
        int dp = AndroidUtilities.dp(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f7 = dp >> 1;
        int i13 = (int) (0.85f * f7);
        path.moveTo(0.0f, f7);
        float f10 = i13;
        path.lineTo(f10, f10);
        path.lineTo(f7, 0.0f);
        float f11 = dp - i13;
        path.lineTo(f11, f10);
        float f12 = dp;
        path.lineTo(f12, f7);
        path.lineTo(f11, f11);
        path.lineTo(f7, f12);
        path.lineTo(f10, f11);
        path.lineTo(0.0f, f7);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT < 29) {
            this.l = null;
            this.m = null;
            return;
        }
        e0.e0 e0Var = new e0.e0(i11);
        this.l = e0Var;
        float width = createBitmap.getWidth();
        float height = createBitmap.getHeight();
        for (int i14 = 0; i14 < e0Var.b; i14++) {
            e0.e0.c((float[]) e0Var.d, i14, 0.0f, 0.0f, width, height);
        }
        this.m = org.telegram.ui.Components.aa.a(createBitmap);
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (LiteMode.isEnabled(131072)) {
            int i11 = this.j;
            ArrayList arrayList = this.b;
            int min = Math.min(i11, arrayList.size());
            float f10 = 2.0f;
            if (this.l != null) {
                Bitmap bitmap = this.d;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                for (int i12 = 0; i12 < min; i12++) {
                    sd sdVar = (sd) arrayList.get(i12);
                    float f11 = sdVar.i * sdVar.e * f7;
                    float f12 = (width / 2.0f) * f11;
                    float f13 = (height / 2.0f) * f11;
                    e0.e0 e0Var = this.l;
                    float f14 = sdVar.a;
                    float f15 = sdVar.b;
                    e0.e0.c((float[]) e0Var.c, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                    this.l.f(i12, i0.a.o(i10, (int) (Utilities.clamp01(sdVar.h * f7) * 255.0f)));
                }
                org.telegram.ui.Components.aa.b(canvas, this.l, min, this.m);
            } else {
                if (this.e != i10) {
                    this.e = i10;
                    this.f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
                int i13 = 0;
                while (i13 < min) {
                    sd sdVar2 = (sd) arrayList.get(i13);
                    float f16 = sdVar2.h * f7;
                    td tdVar = sdVar2.j;
                    Paint paint = tdVar.f;
                    Rect rect = tdVar.g;
                    Bitmap bitmap2 = tdVar.d;
                    paint.setAlpha((int) (f16 * 255.0f));
                    float f17 = f10;
                    rect.set((int) org.telegram.ui.d3.A((bitmap2.getWidth() / f10) * sdVar2.i, sdVar2.e, f16, sdVar2.a), (int) org.telegram.ui.d3.A((bitmap2.getHeight() / f10) * sdVar2.i, sdVar2.e, f16, sdVar2.b), (int) c3.h0.u((bitmap2.getWidth() / f10) * sdVar2.i, sdVar2.e, f16, sdVar2.a), (int) c3.h0.u((bitmap2.getHeight() / f17) * sdVar2.i, sdVar2.e, f16, sdVar2.b));
                    canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                    i13++;
                    f10 = f17;
                }
            }
            this.k = false;
        }
    }

    public final void c(sd sdVar, long j10, boolean z10) {
        sdVar.f = j10;
        long lerp = (long) (AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.i);
        sdVar.g = lerp;
        if (z10) {
            sdVar.f -= (long) (Utilities.clamp01(Utilities.fastRandom.nextFloat()) * lerp);
        }
        RectF rectF = this.c;
        sdVar.a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        sdVar.b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.a == 0) {
            sdVar.c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            sdVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            sdVar.c = rectF.centerX() - sdVar.a;
            sdVar.d = rectF.centerY() - sdVar.b;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat()));
            float f7 = sdVar.c;
            float f10 = sdVar.d;
            float sqrt = dp / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            sdVar.c *= sqrt;
            sdVar.d *= sqrt;
        }
        sdVar.i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        sdVar.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
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
                sd sdVar = (sd) arrayList.get(i10);
                long j10 = sdVar.g;
                float f7 = j10 <= 0 ? 2.0f : (currentTimeMillis - sdVar.f) / j10;
                if (f7 > 1.0f) {
                    c(sdVar, currentTimeMillis, this.k);
                    f7 = 0.0f;
                }
                sdVar.a = (sdVar.c * min) + sdVar.a;
                sdVar.b = (sdVar.d * min) + sdVar.b;
                float f10 = 4.0f * f7;
                sdVar.h = f10 - (f7 * f10);
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
            sd sdVar = (sd) arrayList.get(i10);
            if (!this.c.contains((int) sdVar.a, (int) sdVar.b)) {
                c(sdVar, currentTimeMillis, this.k);
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
