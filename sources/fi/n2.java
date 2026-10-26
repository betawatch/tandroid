package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class n2 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(q2 q2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = q2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.q.reset();
                q2Var.b(canvas, true);
                break;
            default:
                q2 q2Var2 = this.b;
                q2Var2.q.reset();
                q2Var2.q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                q2Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                q2Var2.b(canvas, false);
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
