package bi;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y8 extends v4.o0 {
    public final PointF a = new PointF();
    public final /* synthetic */ a9 b;

    public y8(a9 a9Var) {
        this.b = a9Var;
    }

    @Override // v4.o0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        i3 i3Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        a9 a9Var = this.b;
        u8 u8Var = a9Var.p2;
        t8 t8Var = a9Var.d2;
        ck0 ck0Var = a9Var.o1;
        PointF pointF = this.a;
        float f11 = 0.0f;
        if (jh.k.b(t8Var, ck0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + t8Var.getMeasuredHeight());
            f10 = f12;
            width = t8Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (jh.k.b(u8Var, ck0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + u8Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height >= f11 || (i3Var = t8Var.M) == null) {
            return;
        }
        float height2 = (f11 - height) / i3Var.getHeight();
        canvas.save();
        canvas.clipRect(f10, height, width, f11);
        canvas.translate(f10, height);
        canvas.scale(height2, height2);
        t8Var.M.draw(canvas);
        canvas.restore();
    }
}
