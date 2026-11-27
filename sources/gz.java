// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
