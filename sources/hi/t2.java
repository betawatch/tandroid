package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class t2 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(w2 w2Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = w2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                w2Var.q.reset();
                w2Var.b(canvas, true);
                break;
            default:
                w2 w2Var2 = this.b;
                w2Var2.q.reset();
                w2Var2.q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.g0.m);
                w2Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                w2Var2.b(canvas, false);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, i10);
                this.b.g();
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }
}
