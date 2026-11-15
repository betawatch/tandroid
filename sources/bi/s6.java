package bi;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s6 extends v4.n0 {
    public final PointF a = new PointF();
    public final /* synthetic */ u6 b;

    public s6(u6 u6Var) {
        this.b = u6Var;
    }

    @Override // v4.n0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        o2 o2Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        u6 u6Var = this.b;
        o6 o6Var = u6Var.p2;
        n6 n6Var = u6Var.d2;
        uj0 uj0Var = u6Var.o1;
        PointF pointF = this.a;
        float f11 = 0.0f;
        if (jh.k.b(n6Var, uj0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + n6Var.getMeasuredHeight());
            f10 = f12;
            width = n6Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (jh.k.b(o6Var, uj0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + o6Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height >= f11 || (o2Var = n6Var.M) == null) {
            return;
        }
        float height2 = (f11 - height) / o2Var.getHeight();
        canvas.save();
        canvas.clipRect(f10, height, width, f11);
        canvas.translate(f10, height);
        canvas.scale(height2, height2);
        n6Var.M.draw(canvas);
        canvas.restore();
    }
}
