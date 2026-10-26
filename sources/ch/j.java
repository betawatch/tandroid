package ch;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import jh.k;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i60;
import org.telegram.ui.ye1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class j implements dh.a {
    public final ViewGroup c;
    public final i60 d;
    public final ViewGroup e;
    public boolean h;
    public final RectF a = new RectF();
    public final PointF b = new PointF();
    public final RectF f = new RectF();

    public j(ViewGroup viewGroup, ViewGroup viewGroup2, i60 i60Var) {
        this.c = viewGroup;
        this.d = i60Var;
        this.e = viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dh.a
    public final void b(a aVar, RectF rectF) {
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!k.b(viewGroup, viewGroup2, pointF)) {
            aVar.a = true;
            return;
        }
        if (!(viewGroup instanceof dh.a) || this.h) {
            aVar.a = true;
            return;
        }
        aVar.c(pointF.x);
        aVar.c(pointF.y);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        ((dh.a) viewGroup).b(aVar, rectF);
        rectF.set(rectF2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dh.a
    public final void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (k.b(viewGroup, viewGroup2, pointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(pointF.x, pointF.y);
            if (!(viewGroup instanceof dh.a) || this.h) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    RectF rectF2 = this.a;
                    if (k.c(childAt, viewGroup2, rectF2) && rectF2.intersect(rectF)) {
                        i60 i60Var = this.d;
                        int i11 = i60Var.a;
                        Object obj = i60Var.b;
                        switch (i11) {
                            case 0:
                                ((mm0) obj).drawChild(canvas, childAt, uptimeMillis);
                                break;
                            case 1:
                                ProfileActivity profileActivity = (ProfileActivity) obj;
                                if (childAt == profileActivity.N) {
                                    break;
                                } else {
                                    profileActivity.a.drawChild(canvas, childAt, uptimeMillis);
                                    break;
                                }
                            default:
                                ((ye1) obj).drawChild(canvas, childAt, uptimeMillis);
                                break;
                        }
                    }
                }
            } else {
                RectF rectF3 = this.f;
                rectF3.set(rectF);
                rectF.offset(-pointF.x, -pointF.y);
                ((dh.a) viewGroup).f(canvas, rectF);
                rectF.set(rectF3);
            }
            canvas.restore();
        }
    }
}
