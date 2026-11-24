// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g00 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final /* synthetic */ m00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g00(m00 m00Var, Context context) {
        super(context);
        this.c = m00Var;
        this.a = new RectF();
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m00 m00Var = this.c;
        h00 h00Var = m00Var.V1;
        FrameLayout frameLayout = h00Var.b;
        RectF rectF = this.a;
        if (zgc.c(frameLayout, this, rectF)) {
            TextView textView = m00Var.W1;
            RectF rectF2 = this.b;
            if (zgc.c(textView, this, rectF2)) {
                float L = rectF2.right - gm.L(32.0f);
                float centerY = rectF2.centerY() - gm.L(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(L, centerY);
                canvas.scale(gm.L(32.0f) / rectF.width(), gm.L(32.0f) / rectF.height());
                h00Var.b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
