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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dd {
    public float A;
    public float B;
    public float C;
    public float D;
    public final /* synthetic */ fd E;
    public final Paint a;
    public Bitmap b;
    public float c;
    public float d;
    public final g6 e;
    public final g6 f;
    public float g;
    public final g6 h;
    public float i;
    public final g6 j;
    public final r6 k;
    public float l;
    public final g6 m;
    public boolean n;
    public final g6 o;
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

    public dd(fd fdVar) {
        this.E = fdVar;
        Paint paint = new Paint(3);
        this.a = paint;
        paint.setColor(-1);
        es esVar = es.h;
        this.e = new g6(fdVar, 650L, esVar);
        this.f = new g6(fdVar, 650L, esVar);
        es esVar2 = es.g;
        this.h = new g6(fdVar, 0L, 150L, esVar2);
        this.i = 1.0f;
        this.j = new g6(fdVar, 0L, 150L, esVar2);
        r6 r6Var = new r6(false, true, true);
        this.k = r6Var;
        this.m = new g6(fdVar, 0L, 150L, esVar2);
        this.o = new g6(fdVar, 0L, 200L, esVar);
        r6Var.u(-1);
        r6Var.n(0.35f, 200L, esVar);
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(15.0f));
        r6Var.b = 17;
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

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (f18 <= 0.0f || !LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        float sqrt = (float) Math.sqrt(2.0d);
        if (fd.b0 < 0) {
            fd.b0 = currentTimeMillis;
        }
        float f19 = (currentTimeMillis - fd.b0) / 10000.0f;
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f20 = width;
            float dpf2 = AndroidUtilities.dpf2(15.0f) / f20;
            float f21 = 7.0f;
            int floor = (int) Math.floor((f13 % 360.0f) / 7.0f);
            int ceil = (int) Math.ceil((f14 % 360.0f) / 7.0f);
            while (floor <= ceil) {
                float f22 = floor * f21;
                float sin = (float) (((((Math.sin(2000.0f * f22) + 1.0d) * 0.25d) + 1.0d) * (100.0f + f19)) % 1.0d);
                float f23 = f20 * sqrt;
                float f24 = f19;
                double lerp = AndroidUtilities.lerp(f15 - f23, f16 + f23, sin);
                float a2 = (float) org.telegram.messenger.q.a(fd.a(f22), lerp, f7);
                int i10 = width;
                float sin2 = (float) ((Math.sin(fd.a(f22)) * lerp) + f10);
                float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                int max = (int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.f7.a(a2, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * com.google.android.gms.internal.play_billing.k3.A((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18))) * 255.0f);
                Paint paint = this.a;
                paint.setAlpha(max);
                float f25 = dpf2;
                float sin3 = f25 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.play_billing.k3.A((float) (Math.sin(r12) - 1.0d), 0.25f, 1.0f, 0.75f)));
                canvas.save();
                canvas.translate(a2, sin2);
                canvas.scale(sin3, sin3);
                float f26 = -(i10 >> 1);
                canvas.drawBitmap(this.b, f26, f26, paint);
                canvas.restore();
                floor++;
                sqrt = sqrt;
                width = i10;
                f20 = f20;
                dpf2 = f25;
                f19 = f24;
                f21 = 7.0f;
            }
        }
    }
}
