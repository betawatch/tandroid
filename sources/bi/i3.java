package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class i3 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(m3 m3Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = m3Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                m3 m3Var = this.b;
                m3Var.q.reset();
                m3Var.b(canvas, true);
                break;
            default:
                m3 m3Var2 = this.b;
                m3Var2.q.reset();
                m3Var2.q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                m3Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                m3Var2.b(canvas, false);
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
