package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class l2 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(o2 o2Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = o2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                o2 o2Var = this.b;
                o2Var.q.reset();
                o2Var.b(canvas, true);
                break;
            default:
                o2 o2Var2 = this.b;
                o2Var2.q.reset();
                o2Var2.q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.g0.m);
                o2Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                o2Var2.b(canvas, false);
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
