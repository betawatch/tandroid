package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j0 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final /* synthetic */ p0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p0 p0Var, Context context) {
        super(context);
        this.c = p0Var;
        this.a = new RectF();
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        p0 p0Var = this.c;
        k0 k0Var = p0Var.W;
        FrameLayout frameLayout = k0Var.b;
        RectF rectF = this.a;
        if (qg.j.c(frameLayout, this, rectF)) {
            TextView textView = p0Var.X;
            RectF rectF2 = this.b;
            if (qg.j.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(dp, centerY);
                canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                k0Var.b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
