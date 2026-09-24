package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class u2 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(x2 x2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = x2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b;
                x2Var.q.reset();
                x2Var.b(canvas, true);
                break;
            default:
                x2 x2Var2 = this.b;
                x2Var2.q.reset();
                x2Var2.q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                x2Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                x2Var2.b(canvas, false);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, i11);
                this.b.g();
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
