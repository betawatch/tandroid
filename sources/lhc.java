// default package

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class lhc implements yi5 {
    public final ViewGroup c;
    public final hc5 d;
    public final ViewGroup e;
    public boolean h;
    public final RectF a = new RectF();
    public final PointF b = new PointF();
    public final RectF f = new RectF();

    public lhc(ViewGroup viewGroup, ViewGroup viewGroup2, hc5 hc5Var) {
        this.c = viewGroup;
        this.d = hc5Var;
        this.e = viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yi5
    public final void a(qeb qebVar, RectF rectF) {
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!yic.b(viewGroup, viewGroup2, pointF)) {
            qebVar.b = true;
            return;
        }
        if (!(viewGroup instanceof yi5) || this.h) {
            qebVar.b = true;
            return;
        }
        qebVar.c(pointF.x);
        qebVar.c(pointF.y);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        ((yi5) viewGroup).a(qebVar, rectF);
        rectF.set(rectF2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yi5
    public final void g(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (yic.b(viewGroup, viewGroup2, pointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(pointF.x, pointF.y);
            if (!(viewGroup instanceof yi5) || this.h) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    RectF rectF2 = this.a;
                    if (yic.c(childAt, viewGroup2, rectF2) && rectF2.intersect(rectF)) {
                        hc5 hc5Var = this.d;
                        byte b = hc5Var.a;
                        Object obj = hc5Var.b;
                        switch (b) {
                            case 0:
                                ((d79) obj).drawChild(canvas, childAt, uptimeMillis);
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
                                ((ezb) obj).drawChild(canvas, childAt, uptimeMillis);
                                break;
                        }
                    }
                }
            } else {
                RectF rectF4 = this.f;
                rectF4.set(rectF);
                rectF.offset(-pointF.x, -pointF.y);
                ((yi5) viewGroup).g(canvas, rectF);
                rectF.set(rectF4);
            }
            canvas.restore();
        }
    }
}
