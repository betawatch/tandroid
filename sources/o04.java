// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class o04 extends FrameLayout {
    public final /* synthetic */ o24 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o04(o24 o24Var, Context context) {
        super(context);
        this.a = o24Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        o24 o24Var = this.a;
        t04 t04Var = o24Var.J;
        oz3 oz3Var = o24Var.W;
        b14 b14Var = o24Var.Q;
        if (view != b14Var && view != oz3Var) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        float y = t04Var.getY() + t04Var.getMeasuredHeight() + 1.0f;
        if (view == b14Var && oz3Var != null) {
            y = Math.max(y, oz3Var.getY() + oz3Var.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y - (hl.L(16.0f) * o24Var.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }
}
