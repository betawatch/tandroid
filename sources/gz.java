// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gz extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final /* synthetic */ mz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(mz mzVar, Context context) {
        super(context);
        this.c = mzVar;
        this.a = new RectF();
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mz mzVar = this.c;
        hz hzVar = mzVar.V1;
        FrameLayout frameLayout = hzVar.b;
        RectF rectF = this.a;
        if (yic.c(frameLayout, this, rectF)) {
            TextView textView = mzVar.W1;
            RectF rectF2 = this.b;
            if (yic.c(textView, this, rectF2)) {
                float L = rectF2.right - hl.L(32.0f);
                float centerY = rectF2.centerY() - hl.L(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(L, centerY);
                canvas.scale(hl.L(32.0f) / rectF.width(), hl.L(32.0f) / rectF.height());
                hzVar.b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
