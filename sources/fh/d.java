package fh;

import a8.aa;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import c8.n0;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class d extends aa {
    public NinePatchDrawable d;
    public long e;
    public final /* synthetic */ g g;
    public final dh.a a = new dh.a();
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Bitmap[] f = new Bitmap[1];

    public d(g gVar) {
        this.g = gVar;
    }

    @Override // a8.aa
    public final void b(Canvas canvas, ri.a aVar) {
        ri.a v = g.v(aVar);
        g gVar = this.g;
        c(canvas, i0.a.k(gVar.y, (Color.alpha(gVar.y) == 255 || !(v instanceof ri.c)) ? 0 : ((ri.c) v).b));
    }

    public final void c(Canvas canvas, int i7) {
        g gVar = this.g;
        f fVar = gVar.Q;
        if (Color.alpha(i7) == 0 && Color.alpha(gVar.x) == 0) {
            return;
        }
        if (fVar.e()) {
            float f10 = gVar.c / 255.0f;
            int r12 = k6.r1(f10, i7);
            Paint paint = this.b;
            paint.setColor(r12);
            int r13 = k6.r1(f10 * gVar.V, gVar.x);
            if (Color.alpha(r13) != 0) {
                paint.setShadowLayer(gVar.T, 0.0f, gVar.U, r13);
            } else {
                paint.clearShadowLayer();
            }
            canvas.drawPath(fVar.k, paint);
            return;
        }
        dh.a aVar = this.a;
        aVar.b = 0L;
        aVar.a = false;
        aVar.a(i7);
        aVar.a(gVar.x);
        for (float f11 : fVar.b) {
            aVar.c(f11);
        }
        aVar.c(gVar.T);
        aVar.c(0.0f);
        aVar.c(gVar.U);
        long j3 = aVar.a ? -1L : aVar.b;
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.c;
        if (ninePatchDrawable == null || this.e != j3) {
            this.e = j3;
            NinePatchDrawable b10 = n0.b(this.f, i7, fVar.b, gVar.T, gVar.x, gVar.U, Color.alpha(i7) == 255 ? i7 : 1);
            this.d = b10;
            b10.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.d;
        Rect rect2 = fVar.m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(gVar.c);
        ninePatchDrawable2.draw(canvas);
    }
}
