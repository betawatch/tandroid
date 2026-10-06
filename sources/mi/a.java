package mi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import w7.z;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class a extends z {
    public final boolean a;
    public final Paint b = new Paint();
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public final /* synthetic */ f g;

    public a(f fVar, boolean z10) {
        this.g = fVar;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.e = -1;
        this.f = -1;
        this.a = z10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // w7.z
    public final void b() {
        this.e = -1;
    }

    @Override // w7.z
    public final void c(Canvas canvas) {
        Paint paint;
        boolean z10;
        boolean z11;
        f fVar;
        float f7;
        float f10;
        f fVar2 = this.g;
        Rect bounds = fVar2.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f11 = width;
        int ceil = (int) Math.ceil(f11 / 5.0f);
        float f12 = height;
        int ceil2 = (int) Math.ceil(f12 / 5.0f);
        boolean z12 = this.a;
        boolean z13 = z12 ? fVar2.j : fVar2.k;
        Paint paint2 = this.c;
        Paint paint3 = this.d;
        if (!z13 && this.e == width && this.f == height) {
            fVar = fVar2;
            paint = paint3;
            z10 = z12;
        } else {
            int i10 = fVar2.l;
            if (i10 != 1 && i10 != 4) {
                f12 = f11;
            }
            if (z12) {
                g gVar = fVar2.m;
                gVar.getClass();
                float f13 = 0;
                paint = paint3;
                z10 = z12;
                z11 = false;
                paint2.setShader(f.m(fVar2, gVar, f12, f13, -1, 5));
                g gVar2 = fVar2.n;
                gVar2.getClass();
                paint.setShader(f.m(fVar2, gVar2, f12, f13, fVar2.q, 5));
                fVar = fVar2;
            } else {
                paint = paint3;
                z10 = z12;
                z11 = false;
                g gVar3 = fVar2.o;
                gVar3.getClass();
                fVar = fVar2;
                paint.setShader(f.m(fVar2, gVar3, f12, 0, fVar2.s, 5));
            }
            this.e = width;
            this.f = height;
            if (z10) {
                fVar.j = z11;
            } else {
                fVar.k = z11;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f14 = ceil;
        float f15 = ceil2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f14, f15, this.b);
        if (z10) {
            canvas.drawColor((fVar.q & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f16 = bounds.left;
            float f17 = fVar.c;
            float f18 = f16 + f17;
            float f19 = bounds.top;
            float f20 = fVar.d;
            float f21 = f19 + f20;
            canvas.translate(-f18, -f21);
            fVar.e.v(canvas, f18, f21, bounds.right + f17, bounds.bottom + f20);
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

    @Override // w7.z
    public final boolean d() {
        return false;
    }

    @Override // w7.z
    public final void e(float f7) {
        this.b.setAlpha(Math.round(f7 * 255.0f));
    }

    @Override // w7.z
    public final void a(Rect rect, RectF rectF) {
    }
}
