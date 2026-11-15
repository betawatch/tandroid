package fh;

import a8.ca;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import c8.o0;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d extends ca {
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

    @Override // a8.ca
    public final void b(Canvas canvas, ui.a aVar) {
        ui.a v = g.v(aVar);
        g gVar = this.g;
        c(canvas, i0.a.k(gVar.y, (Color.alpha(gVar.y) == 255 || !(v instanceof ui.c)) ? 0 : ((ui.c) v).b));
    }

    public final void c(Canvas canvas, int i7) {
        g gVar = this.g;
        f fVar = gVar.R;
        if (Color.alpha(i7) == 0 && Color.alpha(gVar.x) == 0) {
            return;
        }
        if (fVar.e()) {
            float f10 = gVar.c / 255.0f;
            int r12 = j6.r1(f10, i7);
            Paint paint = this.b;
            paint.setColor(r12);
            int r13 = j6.r1(f10 * gVar.W, gVar.x);
            if (Color.alpha(r13) != 0) {
                paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r13);
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
        aVar.c(gVar.U);
        aVar.c(0.0f);
        aVar.c(gVar.V);
        long j3 = aVar.a ? -1L : aVar.b;
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.c;
        if (ninePatchDrawable == null || this.e != j3) {
            this.e = j3;
            NinePatchDrawable b10 = o0.b(this.f, i7, fVar.b, gVar.U, gVar.x, gVar.V, Color.alpha(i7) == 255 ? i7 : 1);
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
