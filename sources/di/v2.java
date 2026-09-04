package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class v2 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(y2 y2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = y2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b;
                y2Var.q.reset();
                y2Var.b(canvas, true);
                break;
            default:
                y2 y2Var2 = this.b;
                y2Var2.q.reset();
                y2Var2.q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                y2Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                y2Var2.b(canvas, false);
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
