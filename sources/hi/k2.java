package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class k2 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(n2 n2Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = n2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                n2 n2Var = this.b;
                n2Var.q.reset();
                n2Var.b(canvas, true);
                break;
            default:
                n2 n2Var2 = this.b;
                n2Var2.q.reset();
                n2Var2.q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.g0.m);
                n2Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                n2Var2.b(canvas, false);
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
