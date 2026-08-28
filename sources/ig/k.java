package ig;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import g.x;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k implements jg.a {
    public final ViewGroup c;
    public final j d;
    public final ViewGroup e;
    public boolean h;
    public final RectF a = new RectF();
    public final PointF b = new PointF();
    public final RectF f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, j jVar) {
        this.c = viewGroup;
        this.d = jVar;
        this.e = viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jg.a
    public final void e(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (pg.i.b(viewGroup, viewGroup2, pointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(pointF.x, pointF.y);
            if (!(viewGroup instanceof jg.a) || this.h) {
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    RectF rectF2 = this.a;
                    if (pg.i.c(childAt, viewGroup2, rectF2) && rectF2.intersect(rectF)) {
                        this.d.a(canvas, childAt, uptimeMillis);
                    }
                }
            } else {
                RectF rectF3 = this.f;
                rectF3.set(rectF);
                rectF.offset(-pointF.x, -pointF.y);
                ((jg.a) viewGroup).e(canvas, rectF);
                rectF.set(rectF3);
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jg.a
    public final void g(x xVar, RectF rectF) {
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!pg.i.b(viewGroup, viewGroup2, pointF)) {
            xVar.b = true;
            return;
        }
        if (!(viewGroup instanceof jg.a) || this.h) {
            xVar.b = true;
            return;
        }
        xVar.c(pointF.x);
        xVar.c(pointF.y);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        ((jg.a) viewGroup).g(xVar, rectF);
        rectF.set(rectF2);
    }
}
