package lg;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import g.x;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k implements mg.a {
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
    @Override // mg.a
    public final void e(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (sg.i.b(viewGroup, viewGroup2, pointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(pointF.x, pointF.y);
            if (!(viewGroup instanceof mg.a) || this.h) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    RectF rectF2 = this.a;
                    if (sg.i.c(childAt, viewGroup2, rectF2) && rectF2.intersect(rectF)) {
                        this.d.a(canvas, childAt, uptimeMillis);
                    }
                }
            } else {
                RectF rectF3 = this.f;
                rectF3.set(rectF);
                rectF.offset(-pointF.x, -pointF.y);
                ((mg.a) viewGroup).e(canvas, rectF);
                rectF.set(rectF3);
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mg.a
    public final void g(x xVar, RectF rectF) {
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!sg.i.b(viewGroup, viewGroup2, pointF)) {
            xVar.b = true;
            return;
        }
        if (!(viewGroup instanceof mg.a) || this.h) {
            xVar.b = true;
            return;
        }
        xVar.c(pointF.x);
        xVar.c(pointF.y);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        ((mg.a) viewGroup).g(xVar, rectF);
        rectF.set(rectF2);
    }
}
