package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h0 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final /* synthetic */ n0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n0 n0Var, Context context) {
        super(context);
        this.c = n0Var;
        this.a = new RectF();
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        n0 n0Var = this.c;
        i0 i0Var = n0Var.W;
        FrameLayout frameLayout = i0Var.b;
        RectF rectF = this.a;
        if (sg.i.c(frameLayout, this, rectF)) {
            TextView textView = n0Var.X;
            RectF rectF2 = this.b;
            if (sg.i.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(dp, centerY);
                canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                i0Var.b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
