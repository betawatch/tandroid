// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class nk4 extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rk4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk4(rk4 rk4Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = rk4Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.a;
        rk4 rk4Var = this.b;
        switch (b) {
            case 0:
                rk4Var.q.reset();
                rk4Var.b(canvas, true);
                break;
            default:
                Matrix matrix = rk4Var.q;
                matrix.reset();
                matrix.postTranslate(-getX(), (-getY()) + hl.m);
                matrix.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                rk4Var.b(canvas, false);
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, i2);
                this.b.g();
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }
}
