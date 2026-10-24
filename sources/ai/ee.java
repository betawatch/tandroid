package ai;

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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class ee {
    public final int a;
    public final ArrayList b;
    public final Bitmap d;
    public int e;
    public int j;
    public e0.f0 l;
    public final Paint m;
    public long n;
    public long o;
    public final RectF c = new RectF();
    public final Paint f = new Paint(3);
    public final Rect g = new Rect();
    public float h = 1.0f;
    public final float i = 1.0f;
    public boolean k = true;

    public ee(int i10, int i11) {
        this.a = i10;
        this.j = i11;
        this.b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.b.add(new de(this));
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
        paint.setColor(org.telegram.ui.ActionBar.k6.o1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT < 29) {
            this.l = null;
            this.m = null;
            return;
        }
        e0.f0 f0Var = new e0.f0(i11);
        this.l = f0Var;
        float width = createBitmap.getWidth();
        float height = createBitmap.getHeight();
        for (int i14 = 0; i14 < f0Var.b; i14++) {
            e0.f0.c((float[]) f0Var.d, i14, 0.0f, 0.0f, width, height);
        }
        this.m = g0.a.a(createBitmap);
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
                    de deVar = (de) arrayList.get(i12);
                    float f11 = deVar.i * deVar.e * f7;
                    float f12 = (width / 2.0f) * f11;
                    float f13 = (height / 2.0f) * f11;
                    e0.f0 f0Var = this.l;
                    float f14 = deVar.a;
                    float f15 = deVar.b;
                    e0.f0.c((float[]) f0Var.c, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                    this.l.e(i12, i0.a.o(i10, (int) (Utilities.clamp01(deVar.h * f7) * 255.0f)));
                }
                g0.a.b(canvas, this.l, min, this.m);
            } else {
                if (this.e != i10) {
                    this.e = i10;
                    this.f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
                int i13 = 0;
                while (i13 < min) {
                    de deVar2 = (de) arrayList.get(i13);
                    float f16 = deVar2.h * f7;
                    ee eeVar = deVar2.j;
                    Paint paint = eeVar.f;
                    Rect rect = eeVar.g;
                    Bitmap bitmap2 = eeVar.d;
                    paint.setAlpha((int) (f16 * 255.0f));
                    float f17 = f10;
                    rect.set((int) org.telegram.ui.Cells.b1.x((bitmap2.getWidth() / f10) * deVar2.i, deVar2.e, f16, deVar2.a), (int) org.telegram.ui.Cells.b1.x((bitmap2.getHeight() / f10) * deVar2.i, deVar2.e, f16, deVar2.b), (int) com.google.android.gms.internal.play_billing.k3.t((bitmap2.getWidth() / f10) * deVar2.i, deVar2.e, f16, deVar2.a), (int) com.google.android.gms.internal.play_billing.k3.t((bitmap2.getHeight() / f17) * deVar2.i, deVar2.e, f16, deVar2.b));
                    canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                    i13++;
                    f10 = f17;
                }
            }
            this.k = false;
        }
    }

    public final void c(de deVar, long j10, boolean z10) {
        deVar.f = j10;
        long lerp = (long) (AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.i);
        deVar.g = lerp;
        if (z10) {
            deVar.f -= (long) (Utilities.clamp01(Utilities.fastRandom.nextFloat()) * lerp);
        }
        RectF rectF = this.c;
        deVar.a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        deVar.b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.a == 0) {
            deVar.c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            deVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            deVar.c = rectF.centerX() - deVar.a;
            deVar.d = rectF.centerY() - deVar.b;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat()));
            float f7 = deVar.c;
            float f10 = deVar.d;
            float sqrt = dp / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            deVar.c *= sqrt;
            deVar.d *= sqrt;
        }
        deVar.i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        deVar.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
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
                de deVar = (de) arrayList.get(i10);
                long j10 = deVar.g;
                float f7 = j10 <= 0 ? 2.0f : (currentTimeMillis - deVar.f) / j10;
                if (f7 > 1.0f) {
                    c(deVar, currentTimeMillis, this.k);
                    f7 = 0.0f;
                }
                deVar.a = (deVar.c * min) + deVar.a;
                deVar.b = (deVar.d * min) + deVar.b;
                float f10 = 4.0f * f7;
                deVar.h = f10 - (f7 * f10);
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
            de deVar = (de) arrayList.get(i10);
            if (!this.c.contains((int) deVar.a, (int) deVar.b)) {
                c(deVar, currentTimeMillis, this.k);
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
