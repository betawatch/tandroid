package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class p2 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(s2 s2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = s2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                s2 s2Var = this.b;
                s2Var.q.reset();
                s2Var.b(canvas, true);
                break;
            default:
                s2 s2Var2 = this.b;
                s2Var2.q.reset();
                s2Var2.q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                s2Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                s2Var2.b(canvas, false);
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
