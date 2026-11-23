package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class pc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final /* synthetic */ rc E;
    public final Paint a;
    public Bitmap b;
    public float c;
    public float d;
    public final d6 e;
    public final d6 f;
    public float g;
    public final d6 h;
    public float i;
    public final d6 j;
    public final n6 k;
    public float l;
    public final d6 m;
    public boolean n;
    public final d6 o;
    public final Path p;
    public final Paint q;
    public final RectF r;
    public final Paint s;
    public final Paint t;
    public final RectF u;
    public RadialGradient v;
    public Matrix w;
    public float x;
    public float y;
    public float z;

    public pc(rc rcVar) {
        this.E = rcVar;
        Paint paint = new Paint(3);
        this.a = paint;
        paint.setColor(-1);
        nr nrVar = nr.h;
        this.e = new d6(rcVar, 650L, nrVar);
        this.f = new d6(rcVar, 650L, nrVar);
        nr nrVar2 = nr.g;
        this.h = new d6(rcVar, 0L, 150L, nrVar2);
        this.i = 1.0f;
        this.j = new d6(rcVar, 0L, 150L, nrVar2);
        n6 n6Var = new n6(false, true, true);
        this.k = n6Var;
        this.m = new d6(rcVar, 0L, 150L, nrVar2);
        this.o = new d6(rcVar, 0L, 200L, nrVar);
        n6Var.u(-1);
        n6Var.n(0.35f, 200L, nrVar);
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.w(org.telegram.messenger.g0.L(15.0f));
        n6Var.b = 17;
        this.p = new Path();
        Paint paint2 = new Paint(1);
        this.q = paint2;
        this.r = new RectF();
        this.s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.u = new RectF();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        if (f19 <= 0.0f || !org.telegram.messenger.qc.e(360928)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        float sqrt = (float) Math.sqrt(2.0d);
        if (rc.c0 < 0) {
            rc.c0 = currentTimeMillis;
        }
        float f20 = (currentTimeMillis - rc.c0) / 10000.0f;
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f21 = width;
            float N = org.telegram.messenger.g0.N(15.0f) / f21;
            float f22 = 7.0f;
            int floor = (int) Math.floor((f14 % 360.0f) / 7.0f);
            int ceil = (int) Math.ceil((f15 % 360.0f) / 7.0f);
            while (floor <= ceil) {
                float f23 = floor * f22;
                float sin = (float) (((((Math.sin(2000.0f * f23) + 1.0d) * 0.25d) + 1.0d) * (100.0f + f20)) % 1.0d);
                float f24 = f21 * sqrt;
                float f25 = f20;
                double T1 = org.telegram.messenger.g0.T1(f16 - f24, f17 + f24, sin);
                float c10 = (float) i5.c.c(rc.a(f23), T1, f10);
                int i7 = width;
                float sin2 = (float) ((Math.sin(rc.a(f23)) * T1) + f11);
                float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                int max = (int) (Math.max(0.0f, Math.min(1.0f, org.telegram.messenger.g0.T1(1.0f, Math.min(a8.w9.a(c10, sin2, f12, f13) / org.telegram.messenger.g0.N(64.0f), 1.0f), f18) * com.google.android.gms.internal.vision.e2.B((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f19))) * 255.0f);
                Paint paint = this.a;
                paint.setAlpha(max);
                float f26 = N;
                float sin3 = f26 * ((float) ((((Math.sin(f23) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.vision.e2.B((float) (Math.sin(r12) - 1.0d), 0.25f, 1.0f, 0.75f)));
                canvas.save();
                canvas.translate(c10, sin2);
                canvas.scale(sin3, sin3);
                float f27 = -(i7 >> 1);
                canvas.drawBitmap(this.b, f27, f27, paint);
                canvas.restore();
                floor++;
                sqrt = sqrt;
                width = i7;
                f21 = f21;
                N = f26;
                f20 = f25;
                f22 = 7.0f;
            }
        }
    }
}
