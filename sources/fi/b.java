package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import v7.i7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class b extends i7 {
    public final boolean a;
    public final Paint b = new Paint();
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public final /* synthetic */ g g;

    public b(g gVar, boolean z10) {
        this.g = gVar;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.e = -1;
        this.f = -1;
        this.a = z10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // v7.i7
    public final void b() {
        this.e = -1;
    }

    @Override // v7.i7
    public final void c(Canvas canvas) {
        Paint paint;
        boolean z10;
        boolean z11;
        g gVar;
        float f7;
        float f10;
        g gVar2 = this.g;
        Rect bounds = gVar2.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f11 = width;
        int ceil = (int) Math.ceil(f11 / 5.0f);
        float f12 = height;
        int ceil2 = (int) Math.ceil(f12 / 5.0f);
        boolean z12 = this.a;
        boolean z13 = z12 ? gVar2.w : gVar2.x;
        Paint paint2 = this.c;
        Paint paint3 = this.d;
        if (!z13 && this.e == width && this.f == height) {
            gVar = gVar2;
            paint = paint3;
            z10 = z12;
        } else {
            int i10 = gVar2.y;
            if (i10 != 1 && i10 != 4) {
                f12 = f11;
            }
            if (z12) {
                h hVar = gVar2.D;
                hVar.getClass();
                float f13 = 0;
                paint = paint3;
                z10 = z12;
                z11 = false;
                paint2.setShader(g.k(gVar2, hVar, f12, f13, -1, 5));
                h hVar2 = gVar2.E;
                hVar2.getClass();
                paint.setShader(g.k(gVar2, hVar2, f12, f13, gVar2.H, 5));
                gVar = gVar2;
            } else {
                paint = paint3;
                z10 = z12;
                z11 = false;
                h hVar3 = gVar2.F;
                hVar3.getClass();
                gVar = gVar2;
                paint.setShader(g.k(gVar2, hVar3, f12, 0, gVar2.J, 5));
            }
            this.e = width;
            this.f = height;
            if (z10) {
                gVar.w = z11;
            } else {
                gVar.x = z11;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f14 = ceil;
        float f15 = ceil2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f14, f15, this.b);
        if (z10) {
            canvas.drawColor((gVar.H & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f16 = bounds.left;
            float f17 = gVar.d;
            float f18 = f16 + f17;
            float f19 = bounds.top;
            float f20 = gVar.e;
            float f21 = f19 + f20;
            canvas.translate(-f18, -f21);
            gVar.f.e(canvas, f18, f21, bounds.right + f17, bounds.bottom + f20);
            canvas.restore();
            f7 = f14;
            f10 = f15;
            canvas.drawRect(0.0f, 0.0f, f7, f10, paint2);
        } else {
            f7 = f14;
            f10 = f15;
        }
        canvas.drawRect(0.0f, 0.0f, f7, f10, paint);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
    }

    @Override // v7.i7
    public final boolean d() {
        return false;
    }

    @Override // v7.i7
    public final void e(float f7) {
        this.b.setAlpha(Math.round(f7 * 255.0f));
    }

    @Override // v7.i7
    public final void a(Rect rect, RectF rectF) {
    }
}
