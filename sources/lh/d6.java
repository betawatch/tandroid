package lh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d6 extends f2.v0 {
    public final PointF a = new PointF();
    public final /* synthetic */ e6 b;

    public d6(e6 e6Var) {
        this.b = e6Var;
    }

    @Override // f2.v0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        fg.h0 h0Var;
        float height = recyclerView.getHeight();
        e6 e6Var = this.b;
        z5 z5Var = e6Var.p0;
        y5 y5Var = e6Var.e0;
        sl0 sl0Var = e6Var.d;
        PointF pointF = this.a;
        if (vg.i.b(y5Var, sl0Var, pointF)) {
            f10 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + y5Var.getMeasuredHeight());
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (vg.i.b(z5Var, sl0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + z5Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= f11 || (h0Var = y5Var.I) == null) {
            return;
        }
        float height2 = (f11 - height) / h0Var.getHeight();
        canvas.save();
        canvas.clipRect(0.0f, height, recyclerView.getWidth(), f11);
        canvas.translate(f10, height);
        canvas.scale(height2, height2);
        y5Var.I.draw(canvas);
        canvas.restore();
    }
}
