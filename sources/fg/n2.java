package fg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import eg.s3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n2 {
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
    public final /* synthetic */ o2 r;
    public float c = 1.0f;
    public boolean q = true;

    public n2(o2 o2Var) {
        this.r = o2Var;
        int i10 = o2Var.S;
        o2Var.S = i10 + 1;
        this.b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, float f10) {
        float f11;
        float f12;
        o2 o2Var = this.r;
        boolean z4 = o2Var.G;
        RectF rectF = o2Var.c;
        float f13 = o2Var.A;
        if (z4) {
            int[] iArr = o2Var.E;
            int i10 = this.l;
            int i11 = iArr[i10];
            float[] fArr = o2Var.D[i10];
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
            float f14 = this.n;
            if (f14 != 0.0f) {
                canvas.rotate(f14, o2Var.d[this.l].getWidth() / 2.0f, o2Var.d[this.l].getHeight() / 2.0f);
            }
            if (o2Var.I) {
                long j11 = this.a - j10;
                if (j11 < 200) {
                    f11 = Utilities.clamp(1.0f - (j11 / 150.0f), 1.0f, 0.0f);
                    f12 = this.o;
                    if (f12 >= 1.0f || s3.b != 1.0f) {
                        float interpolation = AndroidUtilities.overshootInterpolator.getInterpolation(f12) * s3.b;
                        canvas.scale(interpolation, interpolation, 0.0f, 0.0f);
                    }
                    if (o2Var.f[this.l]) {
                        float min = (Math.min(o2Var.o, 3.5f) * (f13 / 1000.0f)) + this.p;
                        this.p = min;
                        canvas.scale((float) Math.cos(min * 3.141592653589793d), 1.0f, 0.0f, 0.0f);
                    }
                    Utilities.CallbackReturn callbackReturn = o2Var.l;
                    Paint paint = callbackReturn == null ? (Paint) callbackReturn.run(Integer.valueOf(this.b)) : o2Var.i;
                    float f15 = 1.0f - f11;
                    paint.setAlpha((int) (this.m * f15 * f10));
                    Bitmap bitmap = o2Var.d[this.l];
                    if (o2Var.m) {
                        float f16 = this.c * f15 * f10 * this.o;
                        canvas.scale(f16, f16);
                    }
                    canvas.drawBitmap(bitmap, -(bitmap.getWidth() >> 1), -(bitmap.getHeight() >> 1), paint);
                    canvas.restore();
                }
            }
            f11 = 0.0f;
            f12 = this.o;
            if (f12 >= 1.0f) {
            }
            float interpolation2 = AndroidUtilities.overshootInterpolator.getInterpolation(f12) * s3.b;
            canvas.scale(interpolation2, interpolation2, 0.0f, 0.0f);
            if (o2Var.f[this.l]) {
            }
            Utilities.CallbackReturn callbackReturn2 = o2Var.l;
            if (callbackReturn2 == null) {
            }
            float f152 = 1.0f - f11;
            paint.setAlpha((int) (this.m * f152 * f10));
            Bitmap bitmap2 = o2Var.d[this.l];
            if (o2Var.m) {
            }
            canvas.drawBitmap(bitmap2, -(bitmap2.getWidth() >> 1), -(bitmap2.getHeight() >> 1), paint);
            canvas.restore();
        }
        if (o2Var.g) {
            return;
        }
        float dp = (f13 / 660.0f) * AndroidUtilities.dp(4.0f);
        float min2 = o2Var.f[this.l] ? Math.min(o2Var.o, 3.5f) * 4.0f * dp : dp * o2Var.o;
        this.d = (this.j * min2) + this.d;
        this.e = (this.k * min2) + this.e;
        float f17 = this.o;
        if (f17 != 1.0f) {
            float f18 = (f13 / 200.0f) + f17;
            this.o = f18;
            if (f18 > 1.0f) {
                this.o = 1.0f;
            }
        }
    }

    public final void b(long j10) {
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        o2 o2Var = this.r;
        int i11 = o2Var.N;
        ArrayList arrayList = o2Var.n;
        RectF rectF = o2Var.a;
        int i12 = 0;
        if (i11 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.l = 0;
            } else {
                this.l = (int) Math.floor((r2 * (o2Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.l = Math.abs(Utilities.fastRandom.nextInt() % o2Var.d.length);
        }
        this.a = j10 + o2Var.x + Utilities.fastRandom.nextInt(o2Var.y * (o2Var.f[this.l] ? 3 : 1));
        this.n = 0.0f;
        if (o2Var.m) {
            this.c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (o2Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i13 = 0;
            float f15 = 0.0f;
            while (i13 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f16 = 2.14748365E9f;
                while (i12 < arrayList.size()) {
                    if (o2Var.h) {
                        f13 = ((n2) arrayList.get(i12)).f - abs3;
                        f14 = ((n2) arrayList.get(i12)).g;
                    } else {
                        f13 = ((n2) arrayList.get(i12)).d - abs3;
                        f14 = ((n2) arrayList.get(i12)).e;
                    }
                    float f17 = f14 - abs4;
                    float f18 = (f17 * f17) + (f13 * f13);
                    if (f18 < f16) {
                        f16 = f18;
                    }
                    i12++;
                }
                if (f16 > f15) {
                    abs2 = abs4;
                    f15 = f16;
                    abs = abs3;
                }
                i13++;
                i12 = 0;
            }
            f10 = 0.6f;
            f11 = 0.0f;
            this.d = abs;
            this.e = abs2;
        } else {
            f10 = 0.6f;
            f11 = 0.0f;
            if (o2Var.J) {
                float width = rectF.width();
                float f19 = o2Var.j;
                float w10 = e2.c.w(width, f19, yh.f(Utilities.fastRandom, MediaDataController.MAX_STYLE_RUNS_COUNT) / 1000.0f, f19);
                float f20 = yh.f(Utilities.fastRandom, 360);
                if (!o2Var.f[this.l] || this.q) {
                    f12 = 0.0f;
                } else {
                    w10 = Math.min(w10, AndroidUtilities.dp(10.0f));
                    f12 = AndroidUtilities.dp(30.0f) + 0.0f;
                }
                double d = w10;
                double d10 = f20;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f12 + o2Var.k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (o2Var.f[this.l]) {
            this.p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        double radians = o2Var.f[this.l] ? Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f)) : o2Var.h ? Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d : Math.atan2(this.e - (rectF.centerY() + o2Var.k), this.d - (rectF.centerX() + f11));
        this.j = (float) Math.cos(radians);
        this.k = (float) Math.sin(radians);
        if (o2Var.e[this.l]) {
            this.m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i14 = o2Var.N;
        if ((i14 == 6 && ((i10 = this.l) == 1 || i10 == 2)) || i14 == 9 || i14 == 3 || i14 == 7 || i14 == 24 || i14 == 11 || i14 == 22 || i14 == 4) {
            this.n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (o2Var.N != 101) {
            this.o = 0.0f;
        }
        if (o2Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f10)) / 2.0f;
            float cos = (((float) Math.cos(radians)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f = cos;
            float sin = (((float) Math.sin(radians)) * min) + rectF.centerY() + o2Var.k;
            this.e = sin;
            this.g = sin;
        }
        this.q = false;
    }
}
