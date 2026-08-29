package ih;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jl0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d6 extends f2.v0 {
    public final PointF a = new PointF();
    public final /* synthetic */ e6 b;

    public d6(e6 e6Var) {
        this.b = e6Var;
    }

    @Override // f2.v0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f9;
        float f10;
        cg.h0 h0Var;
        float height = recyclerView.getHeight();
        e6 e6Var = this.b;
        z5 z5Var = e6Var.o0;
        y5 y5Var = e6Var.d0;
        jl0 jl0Var = e6Var.d;
        PointF pointF = this.a;
        if (sg.i.b(y5Var, jl0Var, pointF)) {
            f9 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + y5Var.getMeasuredHeight());
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        if (sg.i.b(z5Var, jl0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + z5Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f10 || (h0Var = y5Var.H) == null) {
            return;
        }
        float height2 = (f10 - height) / h0Var.getHeight();
        canvas.save();
        canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
        canvas.translate(f9, height);
        canvas.scale(height2, height2);
        y5Var.H.draw(canvas);
        canvas.restore();
    }
}
