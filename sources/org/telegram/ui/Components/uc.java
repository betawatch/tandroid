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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class uc {
    public float A;
    public float B;
    public float C;
    public float D;
    public final /* synthetic */ wc E;
    public final Paint a;
    public Bitmap b;
    public float c;
    public float d;
    public final z5 e;
    public final z5 f;
    public float g;
    public final z5 h;
    public float i;
    public final z5 j;
    public final j6 k;
    public float l;
    public final z5 m;
    public boolean n;
    public final z5 o;
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

    public uc(wc wcVar) {
        this.E = wcVar;
        Paint paint = new Paint(3);
        this.a = paint;
        paint.setColor(-1);
        pr prVar = pr.h;
        this.e = new z5(wcVar, 650L, prVar);
        this.f = new z5(wcVar, 650L, prVar);
        pr prVar2 = pr.g;
        this.h = new z5(wcVar, 0L, 150L, prVar2);
        this.i = 1.0f;
        this.j = new z5(wcVar, 0L, 150L, prVar2);
        j6 j6Var = new j6(false, true, true, false);
        this.k = j6Var;
        this.m = new z5(wcVar, 0L, 150L, prVar2);
        this.o = new z5(wcVar, 0L, 200L, prVar);
        j6Var.r(-1);
        j6Var.k(0.35f, 200L, prVar);
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(15.0f));
        j6Var.b = 17;
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
        if (f19 <= 0.0f || !LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        float sqrt = (float) Math.sqrt(2.0d);
        if (wc.V < 0) {
            wc.V = currentTimeMillis;
        }
        float f20 = (currentTimeMillis - wc.V) / 10000.0f;
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f21 = width;
            float dpf2 = AndroidUtilities.dpf2(15.0f) / f21;
            float f22 = 7.0f;
            int floor = (int) Math.floor((f14 % 360.0f) / 7.0f);
            int ceil = (int) Math.ceil((f15 % 360.0f) / 7.0f);
            while (floor <= ceil) {
                float f23 = floor * f22;
                float sin = (float) (((((Math.sin(2000.0f * f23) + 1.0d) * 0.25d) + 1.0d) * (100.0f + f20)) % 1.0d);
                float f24 = f21 * sqrt;
                float f25 = f20;
                double lerp = AndroidUtilities.lerp(f16 - f24, f17 + f24, sin);
                float a2 = (float) l.d.a(wc.a(f23), lerp, f10);
                int i10 = width;
                float sin2 = (float) ((Math.sin(wc.a(f23)) * lerp) + f11);
                float abs = (Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f;
                int max = (int) (Math.max(0.0f, Math.min(1.0f, AndroidUtilities.lerp(1.0f, Math.min(k7.o6.a(a2, sin2, f12, f13) / AndroidUtilities.dpf2(64.0f), 1.0f), f18) * e2.c.y((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, abs * 0.65f * f19))) * 255.0f);
                Paint paint = this.a;
                paint.setAlpha(max);
                float f26 = dpf2;
                float sin3 = f26 * ((float) ((((Math.sin(f23) + 1.0d) * 0.25d) + 0.800000011920929d) * e2.c.y((float) (Math.sin(r12) - 1.0d), 0.25f, 1.0f, 0.75f)));
                canvas.save();
                canvas.translate(a2, sin2);
                canvas.scale(sin3, sin3);
                float f27 = -(i10 >> 1);
                canvas.drawBitmap(this.b, f27, f27, paint);
                canvas.restore();
                floor++;
                sqrt = sqrt;
                width = i10;
                f21 = f21;
                dpf2 = f26;
                f20 = f25;
                f22 = 7.0f;
            }
        }
    }
}
