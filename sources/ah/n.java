package ah;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class n implements bh.a {
    public final ViewGroup c;
    public final m d;
    public final ViewGroup e;
    public boolean h;
    public final RectF a = new RectF();
    public final PointF b = new PointF();
    public final RectF f = new RectF();

    public n(ViewGroup viewGroup, ViewGroup viewGroup2, m mVar) {
        this.c = viewGroup;
        this.d = mVar;
        this.e = viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.a
    public final void b(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!hh.k.b(viewGroup, viewGroup2, pointF)) {
            aVar.a = true;
            return;
        }
        if (!(viewGroup instanceof bh.a) || this.h) {
            aVar.a = true;
            return;
        }
        aVar.c(pointF.x);
        aVar.c(pointF.y);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        ((bh.a) viewGroup).b(aVar, rectF);
        rectF.set(rectF2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (hh.k.b(viewGroup, viewGroup2, pointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(pointF.x, pointF.y);
            if (!(viewGroup instanceof bh.a) || this.h) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    RectF rectF2 = this.a;
                    if (hh.k.c(childAt, viewGroup2, rectF2) && rectF2.intersect(rectF)) {
                        this.d.a(canvas, childAt, uptimeMillis);
                    }
                }
            } else {
                RectF rectF3 = this.f;
                rectF3.set(rectF);
                rectF.offset(-pointF.x, -pointF.y);
                ((bh.a) viewGroup).f(canvas, rectF);
                rectF.set(rectF3);
            }
            canvas.restore();
        }
    }
}
