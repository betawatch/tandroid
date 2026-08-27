package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class o2 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(r2 r2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = r2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                r2Var.q.reset();
                r2Var.b(canvas, true);
                break;
            default:
                r2 r2Var2 = this.b;
                r2Var2.q.reset();
                r2Var2.q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                r2Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                r2Var2.b(canvas, false);
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
