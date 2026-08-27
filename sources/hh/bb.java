package hh;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class bb {
    public final int a;
    public final ArrayList b;
    public final Bitmap d;
    public int e;
    public int j;
    public e0.i0 l;
    public final Paint m;
    public long n;
    public long o;
    public final RectF c = new RectF();
    public final Paint f = new Paint(3);
    public final Rect g = new Rect();
    public float h = 1.0f;
    public final float i = 1.0f;
    public boolean k = true;

    public bb(int i10, int i11) {
        this.a = i10;
        this.j = i11;
        this.b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.b.add(new ab(this));
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
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT < 29) {
            this.l = null;
            this.m = null;
            return;
        }
        e0.i0 i0Var = new e0.i0(i11);
        this.l = i0Var;
        float width = createBitmap.getWidth();
        float height = createBitmap.getHeight();
        for (int i14 = 0; i14 < i0Var.a; i14++) {
            e0.i0.c((float[]) i0Var.c, i14, 0.0f, 0.0f, width, height);
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
                    ab abVar = (ab) arrayList.get(i12);
                    float f12 = abVar.i * abVar.e * f10;
                    float f13 = (width / 2.0f) * f12;
                    float f14 = (height / 2.0f) * f12;
                    e0.i0 i0Var = this.l;
                    float f15 = abVar.a;
                    float f16 = abVar.b;
                    e0.i0.c((float[]) i0Var.b, i12, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                    this.l.e(i12, i0.b.k(i10, (int) (Utilities.clamp01(abVar.h * f10) * 255.0f)));
                }
                g0.a.b(canvas, this.l, min, this.m);
            } else {
                if (this.e != i10) {
                    this.e = i10;
                    this.f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
                int i13 = 0;
                while (i13 < min) {
                    ab abVar2 = (ab) arrayList.get(i13);
                    float f17 = abVar2.h * f10;
                    bb bbVar = abVar2.j;
                    Paint paint = bbVar.f;
                    Rect rect = bbVar.g;
                    Bitmap bitmap2 = bbVar.d;
                    paint.setAlpha((int) (f17 * 255.0f));
                    rect.set((int) (abVar2.a - ((((bitmap2.getWidth() / f11) * abVar2.i) * abVar2.e) * f17)), (int) (abVar2.b - ((((bitmap2.getHeight() / f11) * abVar2.i) * abVar2.e) * f17)), (int) com.google.android.recaptcha.internal.a.x((bitmap2.getWidth() / f11) * abVar2.i, abVar2.e, f17, abVar2.a), (int) com.google.android.recaptcha.internal.a.x((bitmap2.getHeight() / 2.0f) * abVar2.i, abVar2.e, f17, abVar2.b));
                    canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                    i13++;
                    f11 = 2.0f;
                }
            }
            this.k = false;
        }
    }

    public final void c(ab abVar, long j10, boolean z10) {
        abVar.f = j10;
        long lerp = (long) (AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.i);
        abVar.g = lerp;
        if (z10) {
            abVar.f -= (long) (Utilities.clamp01(Utilities.fastRandom.nextFloat()) * lerp);
        }
        RectF rectF = this.c;
        abVar.a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        abVar.b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.a == 0) {
            abVar.c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            abVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            abVar.c = rectF.centerX() - abVar.a;
            abVar.d = rectF.centerY() - abVar.b;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat()));
            float f10 = abVar.c;
            float f11 = abVar.d;
            float sqrt = dp / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            abVar.c *= sqrt;
            abVar.d *= sqrt;
        }
        abVar.i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        abVar.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
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
                ab abVar = (ab) arrayList.get(i10);
                long j10 = abVar.g;
                float f10 = j10 <= 0 ? 2.0f : (currentTimeMillis - abVar.f) / j10;
                if (f10 > 1.0f) {
                    c(abVar, currentTimeMillis, this.k);
                    f10 = 0.0f;
                }
                abVar.a = (abVar.c * min) + abVar.a;
                abVar.b = (abVar.d * min) + abVar.b;
                float f11 = 4.0f * f10;
                abVar.h = f11 - (f10 * f11);
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
            ab abVar = (ab) arrayList.get(i10);
            if (!this.c.contains((int) abVar.a, (int) abVar.b)) {
                c(abVar, currentTimeMillis, this.k);
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
