package gh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l6 extends f2.w0 {
    public final PointF a = new PointF();
    public final /* synthetic */ m6 b;

    public l6(m6 m6Var) {
        this.b = m6Var;
    }

    @Override // f2.w0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        ag.s0 s0Var;
        float height = recyclerView.getHeight();
        m6 m6Var = this.b;
        h6 h6Var = m6Var.o0;
        g6 g6Var = m6Var.d0;
        zk0 zk0Var = m6Var.d;
        PointF pointF = this.a;
        if (qg.j.b(g6Var, zk0Var, pointF)) {
            f10 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + g6Var.getMeasuredHeight());
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (qg.j.b(h6Var, zk0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + h6Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f11 || (s0Var = g6Var.H) == null) {
            return;
        }
        float height2 = (f11 - height) / s0Var.getHeight();
        canvas.save();
        canvas.clipRect(0.0f, height, recyclerView.getWidth(), f11);
        canvas.translate(f10, height);
        canvas.scale(height2, height2);
        g6Var.H.draw(canvas);
        canvas.restore();
    }
}
