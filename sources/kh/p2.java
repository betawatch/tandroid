package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p2 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(s2 s2Var, Context context, int i9) {
        super(context);
        this.a = i9;
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
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i9, i10);
                this.b.g();
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }
}
