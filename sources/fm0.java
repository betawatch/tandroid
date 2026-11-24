// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fm0 extends pqd {
    public NinePatchDrawable d;
    public long e;
    public final /* synthetic */ im0 g;
    public final ucb a = new ucb();
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Bitmap[] f = new Bitmap[1];

    public fm0(im0 im0Var) {
        this.g = im0Var;
    }

    @Override // pqd
    public final void b(Canvas canvas, iz4 iz4Var) {
        iz4 v = im0.v(iz4Var);
        im0 im0Var = this.g;
        c(canvas, on2.l(im0Var.y, (Color.alpha(im0Var.y) == 255 || !(v instanceof kz4)) ? 0 : ((kz4) v).b));
    }

    public final void c(Canvas canvas, int i) {
        im0 im0Var = this.g;
        hm0 hm0Var = im0Var.S;
        if (Color.alpha(i) == 0 && Color.alpha(im0Var.x) == 0) {
            return;
        }
        if (hm0Var.e()) {
            float f = im0Var.c / 255.0f;
            int p1 = cmb.p1(f, i);
            Paint paint = this.b;
            paint.setColor(p1);
            int p12 = cmb.p1(f * im0Var.X, im0Var.x);
            if (Color.alpha(p12) != 0) {
                paint.setShadowLayer(im0Var.V, 0.0f, im0Var.W, p12);
            } else {
                paint.clearShadowLayer();
            }
            canvas.drawPath(hm0Var.k, paint);
            return;
        }
        ucb ucbVar = this.a;
        ucbVar.a = 0L;
        ucbVar.b = false;
        ucbVar.a(i);
        ucbVar.a(im0Var.x);
        for (float f2 : hm0Var.b) {
            ucbVar.c(f2);
        }
        ucbVar.c(im0Var.V);
        ucbVar.c(0.0f);
        ucbVar.c(im0Var.W);
        long j = ucbVar.b ? -1L : ucbVar.a;
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.c;
        if (ninePatchDrawable == null || this.e != j) {
            this.e = j;
            NinePatchDrawable b = ure.b(this.f, i, hm0Var.b, im0Var.V, im0Var.x, im0Var.W, Color.alpha(i) == 255 ? i : 1);
            this.d = b;
            b.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.d;
        Rect rect2 = hm0Var.m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(im0Var.c);
        ninePatchDrawable2.draw(canvas);
    }
}
