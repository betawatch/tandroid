package gh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import b8.ld;
import b8.mc;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d extends mc {
    public NinePatchDrawable d;
    public long e;
    public final /* synthetic */ g g;
    public final eh.a a = new eh.a();
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Bitmap[] f = new Bitmap[1];

    public d(g gVar) {
        this.g = gVar;
    }

    @Override // b8.mc
    public final void b(Canvas canvas, si.a aVar) {
        si.a v = g.v(aVar);
        g gVar = this.g;
        c(canvas, i0.a.k(gVar.y, (Color.alpha(gVar.y) == 255 || !(v instanceof si.c)) ? 0 : ((si.c) v).b));
    }

    public final void c(Canvas canvas, int i3) {
        g gVar = this.g;
        f fVar = gVar.R;
        if (Color.alpha(i3) == 0 && Color.alpha(gVar.x) == 0) {
            return;
        }
        if (fVar.e()) {
            float f10 = gVar.c / 255.0f;
            int r12 = k6.r1(f10, i3);
            Paint paint = this.b;
            paint.setColor(r12);
            int r13 = k6.r1(f10 * gVar.W, gVar.x);
            if (Color.alpha(r13) != 0) {
                paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r13);
            } else {
                paint.clearShadowLayer();
            }
            canvas.drawPath(fVar.k, paint);
            return;
        }
        eh.a aVar = this.a;
        aVar.b = 0L;
        aVar.a = false;
        aVar.a(i3);
        aVar.a(gVar.x);
        for (float f11 : fVar.b) {
            aVar.c(f11);
        }
        aVar.c(gVar.U);
        aVar.c(0.0f);
        aVar.c(gVar.V);
        long j10 = aVar.a ? -1L : aVar.b;
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.c;
        if (ninePatchDrawable == null || this.e != j10) {
            this.e = j10;
            NinePatchDrawable b10 = ld.b(this.f, i3, fVar.b, gVar.U, gVar.x, gVar.V, Color.alpha(i3) == 255 ? i3 : 1);
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
