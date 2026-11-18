package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final /* synthetic */ t0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t0 t0Var, Context context) {
        super(context);
        this.c = t0Var;
        this.a = new RectF();
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        t0 t0Var = this.c;
        o0 o0Var = t0Var.W1;
        FrameLayout frameLayout = o0Var.b;
        RectF rectF = this.a;
        if (jh.k.c(frameLayout, this, rectF)) {
            TextView textView = t0Var.X1;
            RectF rectF2 = this.b;
            if (jh.k.c(textView, this, rectF2)) {
                float L = rectF2.right - org.telegram.messenger.g0.L(32.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(L, centerY);
                canvas.scale(org.telegram.messenger.g0.L(32.0f) / rectF.width(), org.telegram.messenger.g0.L(32.0f) / rectF.height());
                o0Var.b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
