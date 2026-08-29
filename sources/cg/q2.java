package cg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import bg.y3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q2 {
    public long a;
    public final int b;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public int m;
    public float n;
    public float o;
    public float p;
    public final /* synthetic */ r2 r;
    public float c = 1.0f;
    public boolean q = true;

    public q2(r2 r2Var) {
        this.r = r2Var;
        int i10 = r2Var.S;
        r2Var.S = i10 + 1;
        this.b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, float f9) {
        float f10;
        float f11;
        r2 r2Var = this.r;
        boolean z10 = r2Var.G;
        RectF rectF = r2Var.c;
        float f12 = r2Var.A;
        if (z10) {
            int[] iArr = r2Var.E;
            int i10 = this.l;
            int i11 = iArr[i10];
            float[] fArr = r2Var.D[i10];
            int i12 = i11 * 2;
            this.h = fArr[i12];
            this.i = fArr[i12 + 1];
            iArr[i10] = i11 + 1;
        } else {
            this.h = this.d;
            this.i = this.e;
        }
        if (rectF.isEmpty() || !rectF.contains(this.h, this.i)) {
            canvas.save();
            canvas.translate(this.h, this.i);
            float f13 = this.n;
            if (f13 != 0.0f) {
                canvas.rotate(f13, r2Var.d[this.l].getWidth() / 2.0f, r2Var.d[this.l].getHeight() / 2.0f);
            }
            if (r2Var.I) {
                long j11 = this.a - j10;
                if (j11 < 200) {
                    f10 = Utilities.clamp(1.0f - (j11 / 150.0f), 1.0f, 0.0f);
                    f11 = this.o;
                    if (f11 >= 1.0f || y3.b != 1.0f) {
                        float interpolation = AndroidUtilities.overshootInterpolator.getInterpolation(f11) * y3.b;
                        canvas.scale(interpolation, interpolation, 0.0f, 0.0f);
                    }
                    if (r2Var.f[this.l]) {
                        float min = (Math.min(r2Var.o, 3.5f) * (f12 / 1000.0f)) + this.p;
                        this.p = min;
                        canvas.scale((float) Math.cos(min * 3.141592653589793d), 1.0f, 0.0f, 0.0f);
                    }
                    Utilities.CallbackReturn callbackReturn = r2Var.l;
                    Paint paint = callbackReturn == null ? (Paint) callbackReturn.run(Integer.valueOf(this.b)) : r2Var.i;
                    float f14 = 1.0f - f10;
                    paint.setAlpha((int) (this.m * f14 * f9));
                    Bitmap bitmap = r2Var.d[this.l];
                    if (r2Var.m) {
                        float f15 = this.c * f14 * f9 * this.o;
                        canvas.scale(f15, f15);
                    }
                    canvas.drawBitmap(bitmap, -(bitmap.getWidth() >> 1), -(bitmap.getHeight() >> 1), paint);
                    canvas.restore();
                }
            }
            f10 = 0.0f;
            f11 = this.o;
            if (f11 >= 1.0f) {
            }
            float interpolation2 = AndroidUtilities.overshootInterpolator.getInterpolation(f11) * y3.b;
            canvas.scale(interpolation2, interpolation2, 0.0f, 0.0f);
            if (r2Var.f[this.l]) {
            }
            Utilities.CallbackReturn callbackReturn2 = r2Var.l;
            if (callbackReturn2 == null) {
            }
            float f142 = 1.0f - f10;
            paint.setAlpha((int) (this.m * f142 * f9));
            Bitmap bitmap2 = r2Var.d[this.l];
            if (r2Var.m) {
            }
            canvas.drawBitmap(bitmap2, -(bitmap2.getWidth() >> 1), -(bitmap2.getHeight() >> 1), paint);
            canvas.restore();
        }
        if (r2Var.g) {
            return;
        }
        float dp = (f12 / 660.0f) * AndroidUtilities.dp(4.0f);
        float min2 = r2Var.f[this.l] ? Math.min(r2Var.o, 3.5f) * 4.0f * dp : dp * r2Var.o;
        this.d = (this.j * min2) + this.d;
        this.e = (this.k * min2) + this.e;
        float f16 = this.o;
        if (f16 != 1.0f) {
            float f17 = (f12 / 200.0f) + f16;
            this.o = f17;
            if (f17 > 1.0f) {
                this.o = 1.0f;
            }
        }
    }

    public final void b(long j10) {
        float f9;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        r2 r2Var = this.r;
        int i11 = r2Var.N;
        ArrayList arrayList = r2Var.n;
        RectF rectF = r2Var.a;
        int i12 = 0;
        if (i11 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.l = 0;
            } else {
                this.l = (int) Math.floor((r2 * (r2Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.l = Math.abs(Utilities.fastRandom.nextInt() % r2Var.d.length);
        }
        this.a = j10 + r2Var.x + Utilities.fastRandom.nextInt(r2Var.y * (r2Var.f[this.l] ? 3 : 1));
        this.n = 0.0f;
        if (r2Var.m) {
            this.c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (r2Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i13 = 0;
            float f14 = 0.0f;
            while (i13 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f15 = 2.14748365E9f;
                while (i12 < arrayList.size()) {
                    if (r2Var.h) {
                        f12 = ((q2) arrayList.get(i12)).f - abs3;
                        f13 = ((q2) arrayList.get(i12)).g;
                    } else {
                        f12 = ((q2) arrayList.get(i12)).d - abs3;
                        f13 = ((q2) arrayList.get(i12)).e;
                    }
                    float f16 = f13 - abs4;
                    float f17 = (f16 * f16) + (f12 * f12);
                    if (f17 < f15) {
                        f15 = f17;
                    }
                    i12++;
                }
                if (f15 > f14) {
                    abs2 = abs4;
                    f14 = f15;
                    abs = abs3;
                }
                i13++;
                i12 = 0;
            }
            f9 = 0.6f;
            f10 = 0.0f;
            this.d = abs;
            this.e = abs2;
        } else {
            f9 = 0.6f;
            f10 = 0.0f;
            if (r2Var.J) {
                float width = rectF.width();
                float f18 = r2Var.j;
                float z10 = com.google.android.recaptcha.internal.a.z(width, f18, th.f(Utilities.fastRandom, MediaDataController.MAX_STYLE_RUNS_COUNT) / 1000.0f, f18);
                float f19 = th.f(Utilities.fastRandom, 360);
                if (!r2Var.f[this.l] || this.q) {
                    f11 = 0.0f;
                } else {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                }
                double d = z10;
                double d10 = f19;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f11 + r2Var.k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (r2Var.f[this.l]) {
            this.p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        double radians = r2Var.f[this.l] ? Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f)) : r2Var.h ? Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d : Math.atan2(this.e - (rectF.centerY() + r2Var.k), this.d - (rectF.centerX() + f10));
        this.j = (float) Math.cos(radians);
        this.k = (float) Math.sin(radians);
        if (r2Var.e[this.l]) {
            this.m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i14 = r2Var.N;
        if ((i14 == 6 && ((i10 = this.l) == 1 || i10 == 2)) || i14 == 9 || i14 == 3 || i14 == 7 || i14 == 24 || i14 == 11 || i14 == 22 || i14 == 4) {
            this.n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (r2Var.N != 101) {
            this.o = 0.0f;
        }
        if (r2Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f9)) / 2.0f;
            float cos = (((float) Math.cos(radians)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f = cos;
            float sin = (((float) Math.sin(radians)) * min) + rectF.centerY() + r2Var.k;
            this.e = sin;
            this.g = sin;
        }
        this.q = false;
    }
}
