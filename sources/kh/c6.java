package kh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c6 extends f2.u0 {
    public final PointF a = new PointF();
    public final /* synthetic */ d6 b;

    public c6(d6 d6Var) {
        this.b = d6Var;
    }

    @Override // f2.u0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        eg.h0 h0Var;
        float height = recyclerView.getHeight();
        d6 d6Var = this.b;
        y5 y5Var = d6Var.p0;
        x5 x5Var = d6Var.e0;
        rl0 rl0Var = d6Var.d;
        PointF pointF = this.a;
        if (ug.i.b(x5Var, rl0Var, pointF)) {
            f10 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + x5Var.getMeasuredHeight());
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (ug.i.b(y5Var, rl0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + y5Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f11 || (h0Var = x5Var.I) == null) {
            return;
        }
        float height2 = (f11 - height) / h0Var.getHeight();
        canvas.save();
        canvas.clipRect(0.0f, height, recyclerView.getWidth(), f11);
        canvas.translate(f10, height);
        canvas.scale(height2, height2);
        x5Var.I.draw(canvas);
        canvas.restore();
    }
}
