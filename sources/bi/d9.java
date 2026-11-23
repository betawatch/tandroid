package bi;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d9 extends v4.o0 {
    public final PointF a = new PointF();
    public final /* synthetic */ f9 b;

    public d9(f9 f9Var) {
        this.b = f9Var;
    }

    @Override // v4.o0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        o3 o3Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        f9 f9Var = this.b;
        z8 z8Var = f9Var.p2;
        y8 y8Var = f9Var.d2;
        ek0 ek0Var = f9Var.o1;
        PointF pointF = this.a;
        float f11 = 0.0f;
        if (jh.k.b(y8Var, ek0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + y8Var.getMeasuredHeight());
            f10 = f12;
            width = y8Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (jh.k.b(z8Var, ek0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + z8Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height >= f11 || (o3Var = y8Var.M) == null) {
            return;
        }
        float height2 = (f11 - height) / o3Var.getHeight();
        canvas.save();
        canvas.clipRect(f10, height, width, f11);
        canvas.translate(f10, height);
        canvas.scale(height2, height2);
        y8Var.M.draw(canvas);
        canvas.restore();
    }
}
