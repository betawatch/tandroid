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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class bd {
    public float A;
    public float B;
    public float C;
    public float D;
    public final /* synthetic */ dd E;
    public final Paint a;
    public Bitmap b;
    public float c;
    public float d;
    public final f6 e;
    public final f6 f;
    public float g;
    public final f6 h;
    public float i;
    public final f6 j;
    public final p6 k;
    public float l;
    public final f6 m;
    public boolean n;
    public final f6 o;
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

    public bd(dd ddVar) {
        this.E = ddVar;
        Paint paint = new Paint(3);
        this.a = paint;
        paint.setColor(-1);
        bs bsVar = bs.h;
        this.e = new f6(ddVar, 650L, bsVar);
        this.f = new f6(ddVar, 650L, bsVar);
        bs bsVar2 = bs.g;
        this.h = new f6(ddVar, 0L, 150L, bsVar2);
        this.i = 1.0f;
        this.j = new f6(ddVar, 0L, 150L, bsVar2);
        p6 p6Var = new p6(false, true, true);
        this.k = p6Var;
        this.m = new f6(ddVar, 0L, 150L, bsVar2);
        this.o = new f6(ddVar, 0L, 200L, bsVar);
        p6Var.u(-1);
        p6Var.n(0.35f, 200L, bsVar);
        p6Var.x(AndroidUtilities.bold());
        p6Var.w(AndroidUtilities.dp(15.0f));
        p6Var.b = 17;
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
        if (dd.b0 < 0) {
            dd.b0 = currentTimeMillis;
        }
        float f19 = (currentTimeMillis - dd.b0) / 10000.0f;
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
                float f25 = (float) i2.o1.f(dd.a(f22), lerp, f7);
                int i10 = width;
                float sin2 = (float) ((Math.sin(dd.a(f22)) * lerp) + f10);
                float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                int max = (int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(v7.f7.a(f25, sin2, f11, f12) / AndroidUtilities.dpf2(64.0f), 1.0f), f17) * com.google.android.gms.internal.play_billing.k3.A((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f18))) * 255.0f);
                Paint paint = this.a;
                paint.setAlpha(max);
                float f26 = dpf2;
                float sin3 = f26 * ((float) ((((Math.sin(f22) + 1.0d) * 0.25d) + 0.800000011920929d) * com.google.android.gms.internal.play_billing.k3.A((float) (Math.sin(r12) - 1.0d), 0.25f, 1.0f, 0.75f)));
                canvas.save();
                canvas.translate(f25, sin2);
                canvas.scale(sin3, sin3);
                float f27 = -(i10 >> 1);
                canvas.drawBitmap(this.b, f27, f27, paint);
                canvas.restore();
                floor++;
                sqrt = sqrt;
                width = i10;
                f20 = f20;
                dpf2 = f26;
                f19 = f24;
                f21 = 7.0f;
            }
        }
    }
}
