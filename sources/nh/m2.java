package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class m2 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(p2 p2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = p2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                p2Var.q.reset();
                p2Var.b(canvas, true);
                break;
            default:
                p2 p2Var2 = this.b;
                p2Var2.q.reset();
                p2Var2.q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                p2Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                p2Var2.b(canvas, false);
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
