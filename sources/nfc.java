// default package

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nfc implements vi5 {
    public final ViewGroup c;
    public final ec5 d;
    public final ViewGroup e;
    public boolean h;
    public final RectF a = new RectF();
    public final PointF b = new PointF();
    public final RectF f = new RectF();

    public nfc(ViewGroup viewGroup, ViewGroup viewGroup2, ec5 ec5Var) {
        this.c = viewGroup;
        this.d = ec5Var;
        this.e = viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vi5
    public final void a(ucb ucbVar, RectF rectF) {
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!zgc.b(viewGroup, viewGroup2, pointF)) {
            ucbVar.b = true;
            return;
        }
        if (!(viewGroup instanceof vi5) || this.h) {
            ucbVar.b = true;
            return;
        }
        ucbVar.c(pointF.x);
        ucbVar.c(pointF.y);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        ((vi5) viewGroup).a(ucbVar, rectF);
        rectF.set(rectF2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vi5
    public final void g(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (zgc.b(viewGroup, viewGroup2, pointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(pointF.x, pointF.y);
            if (!(viewGroup instanceof vi5) || this.h) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    RectF rectF2 = this.a;
                    if (zgc.c(childAt, viewGroup2, rectF2) && rectF2.intersect(rectF)) {
                        ec5 ec5Var = this.d;
                        byte b = ec5Var.a;
                        Object obj = ec5Var.b;
                        switch (b) {
                            case 0:
                                ((r59) obj).drawChild(canvas, childAt, uptimeMillis);
                                break;
                            case 1:
                                ProfileActivity profileActivity = (ProfileActivity) obj;
                                RectF rectF3 = ProfileActivity.e7;
                                if (childAt != profileActivity.O) {
                                    profileActivity.a.drawChild(canvas, childAt, uptimeMillis);
                                    break;
                                } else {
                                    break;
                                }
                            default:
                                ((dxb) obj).drawChild(canvas, childAt, uptimeMillis);
                                break;
                        }
                    }
                }
            } else {
                RectF rectF4 = this.f;
                rectF4.set(rectF);
                rectF.offset(-pointF.x, -pointF.y);
                ((vi5) viewGroup).g(canvas, rectF);
                rectF.set(rectF4);
            }
            canvas.restore();
        }
    }
}
