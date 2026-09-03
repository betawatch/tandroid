package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g0 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final /* synthetic */ m0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(m0 m0Var, Context context) {
        super(context);
        this.c = m0Var;
        this.a = new RectF();
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m0 m0Var = this.c;
        h0 h0Var = m0Var.X;
        FrameLayout frameLayout = h0Var.b;
        RectF rectF = this.a;
        if (vg.i.c(frameLayout, this, rectF)) {
            TextView textView = m0Var.Y;
            RectF rectF2 = this.b;
            if (vg.i.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(dp, centerY);
                canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                h0Var.b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
