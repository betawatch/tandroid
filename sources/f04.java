// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f04 extends FrameLayout {
    public final /* synthetic */ e34 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f04(e34 e34Var, Context context) {
        super(context);
        this.a = e34Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        e34 e34Var = this.a;
        i04 i04Var = e34Var.p0;
        if (view != e34Var.i0) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0.0f, i04Var.getY() + i04Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }
}
