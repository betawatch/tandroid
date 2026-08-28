package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l0 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final /* synthetic */ r0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(r0 r0Var, Context context) {
        super(context);
        this.c = r0Var;
        this.a = new RectF();
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        r0 r0Var = this.c;
        m0 m0Var = r0Var.W;
        FrameLayout frameLayout = m0Var.b;
        RectF rectF = this.a;
        if (pg.i.c(frameLayout, this, rectF)) {
            TextView textView = r0Var.X;
            RectF rectF2 = this.b;
            if (pg.i.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(dp, centerY);
                canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                m0Var.b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
