package ai;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.o9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s2 extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final TextPaint e;
    public final Drawable f;
    public final int h;
    public LinearGradient n;
    public LinearGradient r;
    public int s;
    public final o9 w;
    public final o9 x;
    public long y;

    public s2(Activity activity, e6 e6Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.b = paint3;
        Paint paint4 = new Paint(1);
        this.c = paint4;
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        this.w = new o9(12);
        this.x = new o9(11);
        int w02 = j6.w0(j6.Fi, e6Var);
        this.h = w02;
        j6.w0(j6.j5, e6Var);
        paint.setColor(w02);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
        paint3.setColor(w02);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(3.0f));
        textPaint.setTextSize(org.telegram.messenger.g0.L(17.0f));
        Drawable mutate = activity.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
        this.f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public static float a(float f10) {
        return org.telegram.ui.Cells.y0.f((((float) Math.sin((f10 * 0.113f) + 0.4f)) * 0.5f) + 0.5f, 0.2f, (((((float) Math.sin((0.053f * f10) + 1.7f)) * 0.5f) + 0.5f) * 0.35f) + (((((float) Math.sin(0.021f * f10)) * 0.5f) + 0.5f) * 0.45f), 0.82f, 0.18f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        int i7;
        float f13;
        float f14;
        float f15;
        float f16;
        char c10;
        float f17;
        long min;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float d;
        int i10;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0) {
            return;
        }
        float uptimeMillis = (SystemClock.uptimeMillis() % 1000000) / 1000.0f;
        float f34 = width;
        float f35 = f34 / 2.0f;
        float f36 = height;
        float f37 = f36 / 2.0f;
        float L = org.telegram.messenger.g0.L(36.0f);
        float L2 = uptimeMillis * org.telegram.messenger.g0.L(33.0f);
        float L3 = (f35 - L) - org.telegram.messenger.g0.L(6.0f);
        float L4 = f35 + L + org.telegram.messenger.g0.L(10.0f);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f34, f36, null);
        float L5 = org.telegram.messenger.g0.L(6.0f);
        float f38 = L3 - (L2 % L5);
        while (true) {
            f10 = f35;
            float f39 = 1.0f;
            if (f38 <= (-L5)) {
                break;
            }
            float f40 = 0.7f;
            float C = a8.p0.C(L3 - f38, org.telegram.messenger.g0.L(34.0f), 1.0f, 0.0f);
            float f41 = 0.8f * C;
            float B = com.google.android.gms.internal.vision.e2.B(f41, C, 0.2f, (a(f38 - L2) * org.telegram.messenger.g0.L(30.0f)) + org.telegram.messenger.g0.L(6.0f));
            Paint paint = this.b;
            paint.setAlpha((int) ((f41 + 0.2f) * 255.0f));
            float f42 = 1.0f - C;
            float L6 = f42 * f42 * org.telegram.messenger.g0.L(7.0f);
            if (C > 0.75f) {
                float f43 = f38 - L6;
                float f44 = B / 2.0f;
                float f45 = f37 - f44;
                float f46 = (L6 * 0.35f) + f38;
                float f47 = f37;
                f32 = L5;
                canvas.drawLine(f43, f45, f46, f47, paint);
                canvas.drawLine(f46, f47, f43, f47 + f44, paint);
                f33 = f47;
            } else {
                float f48 = f37;
                f32 = L5;
                float f49 = 1.0f - (C / 0.75f);
                float f50 = B / 3.0f;
                int i11 = 0;
                while (i11 < 3) {
                    float f51 = B / 2.0f;
                    float f52 = (i11 * f50) + (f48 - f51);
                    float f53 = ((f52 + f50) + f52) / 2.0f;
                    float f54 = f53 - f48;
                    float f55 = ((f39 - (f49 * f40)) * f50) / 2.0f;
                    float abs = f38 - ((Math.abs(f54) * L6) / Math.max(f39, f51));
                    float f56 = f53 + (f54 * 0.6f * f49);
                    canvas.drawLine(abs, f56 - f55, abs, f56 + f55, paint);
                    i11++;
                    f48 = f48;
                    f39 = f39;
                    f40 = 0.7f;
                }
                f33 = f48;
            }
            f38 -= f32;
            L5 = f32;
            f37 = f33;
            f35 = f10;
        }
        Canvas canvas2 = canvas;
        float f57 = 1.0f;
        float f58 = f37;
        LinearGradient linearGradient = this.r;
        Paint paint2 = this.e;
        int i12 = this.h;
        if (linearGradient == null || this.s != width) {
            LinearGradient linearGradient2 = new LinearGradient(L4, 0.0f, L4 + 1.0f, 0.0f, i0.a.f(0.22f, i12, -1), i0.a.f(0.22f, i12, -1), Shader.TileMode.CLAMP);
            f11 = L4;
            this.r = linearGradient2;
            paint2.setShader(linearGradient2);
        } else {
            f11 = L4;
        }
        canvas2.save();
        canvas2.clipRect(f11, 0.0f, f34, f36);
        float measureText = paint2.measureText("Hey! Running ten minutes late, see you at the café near the station · ");
        float descent = f58 - ((paint2.descent() + paint2.ascent()) / 2.0f);
        for (float L7 = (org.telegram.messenger.g0.L(4.0f) + f11) - (measureText - ((org.telegram.messenger.g0.L(55.0f) * uptimeMillis) % measureText)); L7 < f34; L7 += measureText) {
            canvas2.drawText("Hey! Running ten minutes late, see you at the café near the station · ", L7, descent, paint2);
        }
        canvas2.restore();
        if (this.n == null || this.s != width) {
            this.s = width;
            f12 = f11;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            z10 = false;
            i7 = saveLayer;
            f13 = f36;
            f14 = f58;
            f15 = L2;
            f16 = L;
            c10 = 65535;
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, f34, 0.0f, new int[]{0, -16777216, -16777216, 0}, new float[]{0.0f, 0.22f, 0.78f, 1.0f}, tileMode);
            this.n = linearGradient3;
            this.c.setShader(linearGradient3);
            LinearGradient linearGradient4 = new LinearGradient(f12, 0.0f, f12 + 1.0f, 0.0f, i0.a.f(0.22f, i12, -1), i0.a.f(0.22f, i12, -1), tileMode);
            this.r = linearGradient4;
            paint2.setShader(linearGradient4);
        } else {
            f12 = f11;
            f14 = f58;
            f15 = L2;
            i7 = saveLayer;
            f13 = f36;
            f16 = L;
            c10 = 65535;
            z10 = false;
        }
        int i13 = i12;
        float f59 = 3.0f;
        float f60 = descent;
        float f61 = f14;
        canvas2.drawRect(0.0f, 0.0f, f34, f13, this.c);
        canvas2.restoreToCount(i7);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        long j3 = this.y;
        if (j3 == 0) {
            min = 16;
            f17 = f10;
        } else {
            f17 = f10;
            min = Math.min(64L, uptimeMillis2 - j3);
        }
        this.y = uptimeMillis2;
        o9 o9Var = this.w;
        float f62 = o9Var.a;
        o9 o9Var2 = this.x;
        if (f62 == 0.0f) {
            o9Var2.a = org.telegram.messenger.g0.L(1.0f) + f16;
            f18 = 0.6f;
            o9Var2.b = (org.telegram.messenger.g0.L(12.0f) * 0.6f) + org.telegram.messenger.g0.L(1.0f) + f16;
            o9Var.a = org.telegram.messenger.g0.L(3.0f) + f16;
            o9Var.b = (org.telegram.messenger.g0.L(10.0f) * 0.6f) + org.telegram.messenger.g0.L(3.0f) + f16;
            o9Var2.b();
            o9Var.b();
            o9Var.d.setColor(i0.a.o(i13, 48));
            o9Var2.d.setColor(i0.a.o(i13, 72));
        } else {
            f18 = 0.6f;
        }
        float a10 = (a(-f15) * f18) + 0.25f;
        o9Var.d(true, a10);
        o9Var2.d(false, a10);
        o9Var.f(min);
        o9Var2.f(min);
        o9Var.e(o9Var.t, 1.01f);
        o9Var2.e(o9Var2.t, 1.02f);
        canvas2.save();
        float f63 = (o9Var.t * 0.5f) + 0.878f;
        float f64 = f17;
        canvas2.scale(f63, f63, f64, f61);
        o9Var.a(f64, f61, canvas2, o9Var.d);
        canvas2.restore();
        canvas2.save();
        float f65 = (o9Var2.t * 0.5f) + 0.926f;
        canvas2.scale(f65, f65, f64, f61);
        o9Var2.a(f64, f61, canvas2, o9Var2.d);
        canvas2.restore();
        int i14 = 0;
        while (i14 < 96) {
            double d2 = i14;
            int i15 = i13;
            float abs2 = (float) (Math.abs(Math.sin(78.233d * d2) * 43758.5453d) % 1.0d);
            float abs3 = (float) (Math.abs(Math.sin((d2 * 12.9898d) + 4.1d) * 43758.5453d) % 1.0d);
            float f66 = (((abs3 * 7.0f) + uptimeMillis) / ((1.6f * abs2) + 2.4f)) % f57;
            float f67 = abs3 > 0.5f ? f57 : -1.0f;
            if (f66 < 0.55f) {
                float f68 = f66 / 0.55f;
                float f69 = f59;
                float f70 = f68 * f68;
                f19 = f64;
                float f71 = org.telegram.ui.Cells.y0.f(abs2, 0.4f, f18, ((1.25f * f70) + 0.15f) * f67 * 3.1415927f, 3.1415927f);
                f21 = 0.4f;
                float z11 = com.google.android.gms.internal.vision.e2.z(f57, f70, (org.telegram.messenger.g0.L(18.0f) * abs2) + org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(4.0f) + f16);
                double d10 = f71;
                f20 = uptimeMillis;
                float cos = (((float) Math.cos(d10)) * z11) + f19;
                float sin = f61 - (((abs2 * 0.2f) + 0.62f) * (((float) Math.sin(d10)) * z11));
                float L8 = (L3 - org.telegram.messenger.g0.L(6.0f)) - (org.telegram.messenger.g0.L(26.0f) * abs2);
                float f72 = org.telegram.ui.Cells.y0.f(org.telegram.messenger.g0.L(13.0f), abs3, org.telegram.messenger.g0.L(f69), f67, f61);
                float min2 = Math.min(1.0f, f68 / 0.35f);
                f22 = f60;
                f57 = 1.0f;
                float C2 = com.google.android.gms.internal.vision.e2.C(min2, 2.0f, f69, min2 * min2);
                float z12 = com.google.android.gms.internal.vision.e2.z(cos, L8, C2, L8);
                f25 = com.google.android.gms.internal.vision.e2.z(sin, f72, C2, f72);
                f24 = z12;
                f23 = abs2;
            } else {
                f19 = f64;
                f20 = uptimeMillis;
                f21 = 0.4f;
                f22 = f60;
                float f73 = (f66 - 0.55f) / 0.45f;
                float f74 = f57 - f73;
                float f75 = f57 - (f74 * f74);
                float L9 = (org.telegram.messenger.g0.L(16.0f) * f75) + org.telegram.messenger.g0.L(3.0f) + f16;
                double d11 = (f57 - f75) * f67 * 0.55f * 3.1415927f;
                f23 = abs2;
                float cos2 = (((float) Math.cos(d11)) * L9) + f19;
                float x10 = org.telegram.ui.Cells.y0.x((float) Math.sin(d11), L9, 0.7f, f61);
                float f76 = f73 * f73;
                float L10 = cos2 + ((((org.telegram.messenger.g0.L(26.0f) * f23) + (f12 + org.telegram.messenger.g0.L(8.0f))) - cos2) * f76);
                float L11 = (((((abs3 - 0.5f) * org.telegram.messenger.g0.L(4.0f)) + (f22 - org.telegram.messenger.g0.L(6.0f))) - x10) * f76) + x10;
                f24 = L10;
                f25 = L11;
            }
            float sin2 = (float) Math.sin(f66 * 3.141592653589793d);
            i13 = i15;
            int f77 = i0.a.f((abs3 * 0.25f) + 0.12f, i13, -1);
            Paint paint3 = this.d;
            paint3.setColor(f77);
            boolean z13 = f23 > 0.87f;
            if (z13) {
                d = org.telegram.messenger.g0.N(1.1f);
                f26 = 0.6f;
            } else {
                f26 = 0.6f;
                d = org.telegram.ui.Cells.y0.d(0.6f, f23, org.telegram.messenger.g0.N(0.5f));
            }
            float f78 = d;
            if (z13) {
                float sin3 = (((float) Math.sin((f20 * 6.0f) + i14)) * f21) + f26;
                paint3.setAlpha((int) (70.0f * sin2 * sin3));
                canvas2.drawCircle(f24, f25, 3.2f * f78, paint3);
                paint3.setAlpha((int) (sin2 * 255.0f * sin3));
                f28 = 0.6f;
                paint3.setStrokeWidth(org.telegram.messenger.g0.N(0.6f));
                f30 = 3.0f;
                float f79 = f78 * 3.0f * sin3;
                i10 = i14;
                float f80 = f25;
                f29 = f19;
                canvas2.drawLine(f24 - f79, f80, f24 + f79, f25, paint3);
                float f81 = f24;
                f27 = f24;
                f31 = f80;
                canvas2 = canvas;
                canvas2.drawLine(f27, f80 - f79, f81, f80 + f79, paint3);
            } else {
                i10 = i14;
                f27 = f24;
                f28 = f26;
                f29 = f19;
                f30 = 3.0f;
                f31 = f25;
            }
            paint3.setAlpha((int) com.google.android.gms.internal.vision.e2.B(f23, 0.55f, 0.45f, sin2 * 255.0f));
            canvas2.drawCircle(f27, f31, f78, paint3);
            i14 = i10 + 1;
            f64 = f29;
            f60 = f22;
            f59 = f30;
            uptimeMillis = f20;
            f18 = f28;
        }
        float f82 = f64;
        canvas2.drawCircle(f82, f61, f16, this.a);
        float L12 = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        Drawable drawable = this.f;
        drawable.setBounds((int) (f82 - L12), (int) (f61 - L12), (int) (f82 + L12), (int) (f61 + L12));
        drawable.draw(canvas2);
        invalidate();
    }
}
