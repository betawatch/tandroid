// default package

import android.graphics.Canvas;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c65 extends a {
    public final /* synthetic */ pg2 G1;
    public final /* synthetic */ h75 H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c65(h75 h75Var, LaunchActivity launchActivity, pg2 pg2Var) {
        super(launchActivity, null);
        this.H1 = h75Var;
        this.G1 = pg2Var;
    }

    @Override // org.telegram.ui.ActionBar.a, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - gl.L(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            pg2 pg2Var = this.G1;
            pg2Var.f = alpha;
            pg2Var.draw(canvas);
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
