package fh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t6 extends f2.y0 {
    public final PointF a = new PointF();
    public final /* synthetic */ u6 b;

    public t6(u6 u6Var) {
        this.b = u6Var;
    }

    @Override // f2.y0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        l2 l2Var;
        float height = recyclerView.getHeight();
        u6 u6Var = this.b;
        p6 p6Var = u6Var.o0;
        o6 o6Var = u6Var.d0;
        wk0 wk0Var = u6Var.d;
        PointF pointF = this.a;
        if (pg.i.b(o6Var, wk0Var, pointF)) {
            f10 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + o6Var.getMeasuredHeight());
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (pg.i.b(p6Var, wk0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + p6Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f11 || (l2Var = o6Var.H) == null) {
            return;
        }
        float height2 = (f11 - height) / l2Var.getHeight();
        canvas.save();
        canvas.clipRect(0.0f, height, recyclerView.getWidth(), f11);
        canvas.translate(f10, height);
        canvas.scale(height2, height2);
        o6Var.H.draw(canvas);
        canvas.restore();
    }
}
