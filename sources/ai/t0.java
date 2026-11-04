package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t0 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final /* synthetic */ z0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(z0 z0Var, Context context) {
        super(context);
        this.c = z0Var;
        this.a = new RectF();
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        z0 z0Var = this.c;
        u0 u0Var = z0Var.T1;
        FrameLayout frameLayout = u0Var.b;
        RectF rectF = this.a;
        if (kh.k.c(frameLayout, this, rectF)) {
            TextView textView = z0Var.U1;
            RectF rectF2 = this.b;
            if (kh.k.c(textView, this, rectF2)) {
                float L = rectF2.right - org.telegram.messenger.g0.L(32.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(L, centerY);
                canvas.scale(org.telegram.messenger.g0.L(32.0f) / rectF.width(), org.telegram.messenger.g0.L(32.0f) / rectF.height());
                u0Var.b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
