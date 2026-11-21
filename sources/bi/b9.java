package bi;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class b9 extends v4.o0 {
    public final PointF a = new PointF();
    public final /* synthetic */ d9 b;

    public b9(d9 d9Var) {
        this.b = d9Var;
    }

    @Override // v4.o0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        m3 m3Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        d9 d9Var = this.b;
        x8 x8Var = d9Var.p2;
        w8 w8Var = d9Var.d2;
        ek0 ek0Var = d9Var.o1;
        PointF pointF = this.a;
        float f11 = 0.0f;
        if (jh.k.b(w8Var, ek0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + w8Var.getMeasuredHeight());
            f10 = f12;
            width = w8Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (jh.k.b(x8Var, ek0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + x8Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height >= f11 || (m3Var = w8Var.M) == null) {
            return;
        }
        float height2 = (f11 - height) / m3Var.getHeight();
        canvas.save();
        canvas.clipRect(f10, height, width, f11);
        canvas.translate(f10, height);
        canvas.scale(height2, height2);
        w8Var.M.draw(canvas);
        canvas.restore();
    }
}
