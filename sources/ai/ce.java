package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class ce {
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

    public ce(int i10, int i11) {
        this.a = i10;
        this.j = i11;
        this.b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.b.add(new be(this));
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
        paint.setColor(org.telegram.ui.ActionBar.h6.m1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (!g0.a.g()) {
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
                    be beVar = (be) arrayList.get(i12);
                    float f11 = beVar.i * beVar.e * f7;
                    float f12 = (width / 2.0f) * f11;
                    float f13 = (height / 2.0f) * f11;
                    e0.f0 f0Var = this.l;
                    float f14 = beVar.a;
                    float f15 = beVar.b;
                    e0.f0.c((float[]) f0Var.c, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                    this.l.e(i12, i0.b.o(i10, (int) (Utilities.clamp01(beVar.h * f7) * 255.0f)));
                }
                g0.a.b(canvas, this.l, min, this.m);
            } else {
                if (this.e != i10) {
                    this.e = i10;
                    this.f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
                int i13 = 0;
                while (i13 < min) {
                    be beVar2 = (be) arrayList.get(i13);
                    float f16 = beVar2.h * f7;
                    ce ceVar = beVar2.j;
                    Paint paint = ceVar.f;
                    Rect rect = ceVar.g;
                    Bitmap bitmap2 = ceVar.d;
                    paint.setAlpha((int) (f16 * 255.0f));
                    float f17 = f10;
                    rect.set((int) org.telegram.ui.Cells.t0.z((bitmap2.getWidth() / f10) * beVar2.i, beVar2.e, f16, beVar2.a), (int) org.telegram.ui.Cells.t0.z((bitmap2.getHeight() / f10) * beVar2.i, beVar2.e, f16, beVar2.b), (int) com.google.android.gms.internal.cast.a6.t((bitmap2.getWidth() / f10) * beVar2.i, beVar2.e, f16, beVar2.a), (int) com.google.android.gms.internal.cast.a6.t((bitmap2.getHeight() / f17) * beVar2.i, beVar2.e, f16, beVar2.b));
                    canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                    i13++;
                    f10 = f17;
                }
            }
            this.k = false;
        }
    }

    public final void c(be beVar, long j10, boolean z10) {
        beVar.f = j10;
        long lerp = (long) (AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.i);
        beVar.g = lerp;
        if (z10) {
            beVar.f -= (long) (Utilities.clamp01(Utilities.fastRandom.nextFloat()) * lerp);
        }
        RectF rectF = this.c;
        beVar.a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        beVar.b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.a == 0) {
            beVar.c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            beVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            beVar.c = rectF.centerX() - beVar.a;
            beVar.d = rectF.centerY() - beVar.b;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat()));
            float f7 = beVar.c;
            float f10 = beVar.d;
            float sqrt = dp / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            beVar.c *= sqrt;
            beVar.d *= sqrt;
        }
        beVar.i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        beVar.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
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
                be beVar = (be) arrayList.get(i10);
                long j10 = beVar.g;
                float f7 = j10 <= 0 ? 2.0f : (currentTimeMillis - beVar.f) / j10;
                if (f7 > 1.0f) {
                    c(beVar, currentTimeMillis, this.k);
                    f7 = 0.0f;
                }
                beVar.a = (beVar.c * min) + beVar.a;
                beVar.b = (beVar.d * min) + beVar.b;
                float f10 = 4.0f * f7;
                beVar.h = f10 - (f7 * f10);
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
            be beVar = (be) arrayList.get(i10);
            if (!this.c.contains((int) beVar.a, (int) beVar.b)) {
                c(beVar, currentTimeMillis, this.k);
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
