// default package

import android.graphics.Canvas;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a85 extends a {
    public final /* synthetic */ di2 G1;
    public final /* synthetic */ g95 H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a85(g95 g95Var, LaunchActivity launchActivity, di2 di2Var) {
        super(launchActivity, null);
        this.H1 = g95Var;
        this.G1 = di2Var;
    }

    @Override // org.telegram.ui.ActionBar.a, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - gm.L(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            di2 di2Var = this.G1;
            di2Var.f = alpha;
            di2Var.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        if (getAlpha() != f) {
            super.setAlpha(f);
            this.H1.b.invalidate();
        }
    }
}
