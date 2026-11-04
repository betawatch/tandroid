package ai;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b7 extends u4.n0 {
    public final PointF a = new PointF();
    public final /* synthetic */ d7 b;

    public b7(d7 d7Var) {
        this.b = d7Var;
    }

    @Override // u4.n0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        x2 x2Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        d7 d7Var = this.b;
        x6 x6Var = d7Var.m2;
        w6 w6Var = d7Var.a2;
        tj0 tj0Var = d7Var.l1;
        PointF pointF = this.a;
        float f11 = 0.0f;
        if (kh.k.b(w6Var, tj0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + w6Var.getMeasuredHeight());
            f10 = f12;
            width = w6Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (kh.k.b(x6Var, tj0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + x6Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height >= f11 || (x2Var = w6Var.M) == null) {
            return;
        }
        float height2 = (f11 - height) / x2Var.getHeight();
        canvas.save();
        canvas.clipRect(f10, height, width, f11);
        canvas.translate(f10, height);
        canvas.scale(height2, height2);
        w6Var.M.draw(canvas);
        canvas.restore();
    }
}
