// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ii4 extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mi4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii4(mi4 mi4Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = mi4Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.a;
        mi4 mi4Var = this.b;
        switch (b) {
            case 0:
                mi4Var.q.reset();
                mi4Var.b(canvas, true);
                break;
            default:
                Matrix matrix = mi4Var.q;
                matrix.reset();
                matrix.postTranslate(-getX(), (-getY()) + gl.m);
                matrix.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                mi4Var.b(canvas, false);
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, i2);
                this.b.g();
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }
}
