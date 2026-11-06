package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class m2 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(p2 p2Var, Context context, int i7) {
        super(context);
        this.a = i7;
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
                p2Var2.q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.g0.m);
                p2Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                p2Var2.b(canvas, false);
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
