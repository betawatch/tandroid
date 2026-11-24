// default package

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mdc implements wg5 {
    public final ViewGroup c;
    public final ga5 d;
    public final ViewGroup e;
    public boolean h;
    public final RectF a = new RectF();
    public final PointF b = new PointF();
    public final RectF f = new RectF();

    public mdc(ViewGroup viewGroup, ViewGroup viewGroup2, ga5 ga5Var) {
        this.c = viewGroup;
        this.d = ga5Var;
        this.e = viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wg5
    public final void a(tab tabVar, RectF rectF) {
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!zec.b(viewGroup, viewGroup2, pointF)) {
            tabVar.b = true;
            return;
        }
        if (!(viewGroup instanceof wg5) || this.h) {
            tabVar.b = true;
            return;
        }
        tabVar.c(pointF.x);
        tabVar.c(pointF.y);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        ((wg5) viewGroup).a(tabVar, rectF);
        rectF.set(rectF2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wg5
    public final void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (zec.b(viewGroup, viewGroup2, pointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(pointF.x, pointF.y);
            if (!(viewGroup instanceof wg5) || this.h) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    RectF rectF2 = this.a;
                    if (zec.c(childAt, viewGroup2, rectF2) && rectF2.intersect(rectF)) {
                        ga5 ga5Var = this.d;
                        byte b = ga5Var.a;
                        Object obj = ga5Var.b;
                        switch (b) {
                            case 0:
                                ((o39) obj).drawChild(canvas, childAt, uptimeMillis);
                                break;
                            case 1:
                                ProfileActivity profileActivity = (ProfileActivity) obj;
                                RectF rectF3 = ProfileActivity.Z6;
                                if (childAt != profileActivity.O) {
                                    profileActivity.a.drawChild(canvas, childAt, uptimeMillis);
                                    break;
                                } else {
                                    break;
                                }
                            default:
                                ((cvb) obj).drawChild(canvas, childAt, uptimeMillis);
                                break;
                        }
                    }
                }
            } else {
                RectF rectF4 = this.f;
                rectF4.set(rectF);
                rectF.offset(-pointF.x, -pointF.y);
                ((wg5) viewGroup).d(canvas, rectF);
                rectF.set(rectF4);
            }
            canvas.restore();
        }
    }
}
