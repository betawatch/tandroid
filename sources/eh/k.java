package eh;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i40;
import org.telegram.ui.k91;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k implements fh.a {
    public final ViewGroup c;
    public final i40 d;
    public final ViewGroup e;
    public boolean h;
    public final RectF a = new RectF();
    public final PointF b = new PointF();
    public final RectF f = new RectF();

    public k(ViewGroup viewGroup, ViewGroup viewGroup2, i40 i40Var) {
        this.c = viewGroup;
        this.d = i40Var;
        this.e = viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fh.a
    public final void b(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!kh.k.b(viewGroup, viewGroup2, pointF)) {
            aVar.a = true;
            return;
        }
        if (!(viewGroup instanceof fh.a) || this.h) {
            aVar.a = true;
            return;
        }
        aVar.c(pointF.x);
        aVar.c(pointF.y);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        ((fh.a) viewGroup).b(aVar, rectF);
        rectF.set(rectF2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fh.a
    public final void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (kh.k.b(viewGroup, viewGroup2, pointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(pointF.x, pointF.y);
            if (!(viewGroup instanceof fh.a) || this.h) {
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    RectF rectF2 = this.a;
                    if (kh.k.c(childAt, viewGroup2, rectF2) && rectF2.intersect(rectF)) {
                        i40 i40Var = this.d;
                        int i10 = i40Var.a;
                        Object obj = i40Var.b;
                        switch (i10) {
                            case 0:
                                ((tj0) obj).drawChild(canvas, childAt, uptimeMillis);
                                break;
                            case 1:
                                ProfileActivity profileActivity = (ProfileActivity) obj;
                                if (childAt == profileActivity.O) {
                                    break;
                                } else {
                                    profileActivity.a.drawChild(canvas, childAt, uptimeMillis);
                                    break;
                                }
                            default:
                                ((k91) obj).drawChild(canvas, childAt, uptimeMillis);
                                break;
                        }
                    }
                }
            } else {
                RectF rectF3 = this.f;
                rectF3.set(rectF);
                rectF.offset(-pointF.x, -pointF.y);
                ((fh.a) viewGroup).d(canvas, rectF);
                rectF.set(rectF3);
            }
            canvas.restore();
        }
    }
}
