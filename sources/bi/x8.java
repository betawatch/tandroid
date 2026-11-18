package bi;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x8 extends v4.o0 {
    public final PointF a = new PointF();
    public final /* synthetic */ z8 b;

    public x8(z8 z8Var) {
        this.b = z8Var;
    }

    @Override // v4.o0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        i3 i3Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        z8 z8Var = this.b;
        t8 t8Var = z8Var.p2;
        s8 s8Var = z8Var.d2;
        ck0 ck0Var = z8Var.o1;
        PointF pointF = this.a;
        float f11 = 0.0f;
        if (jh.k.b(s8Var, ck0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + s8Var.getMeasuredHeight());
            f10 = f12;
            width = s8Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (jh.k.b(t8Var, ck0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + t8Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height >= f11 || (i3Var = s8Var.M) == null) {
            return;
        }
        float height2 = (f11 - height) / i3Var.getHeight();
        canvas.save();
        canvas.clipRect(f10, height, width, f11);
        canvas.translate(f10, height);
        canvas.scale(height2, height2);
        s8Var.M.draw(canvas);
        canvas.restore();
    }
}
