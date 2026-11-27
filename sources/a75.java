// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class a75 extends TextView {
    public final RectF a;
    public final /* synthetic */ j95 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a75(j95 j95Var, Context context) {
        super(context);
        this.b = j95Var;
        this.a = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), this.b.Z2);
        super.onDraw(canvas);
    }
}
