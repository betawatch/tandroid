// default package

import android.graphics.Canvas;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class e85 extends a {
    public final /* synthetic */ hh2 G1;
    public final /* synthetic */ j95 H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e85(j95 j95Var, LaunchActivity launchActivity, hh2 hh2Var) {
        super(launchActivity, null);
        this.H1 = j95Var;
        this.G1 = hh2Var;
    }

    @Override // org.telegram.ui.ActionBar.a, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - hl.L(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            hh2 hh2Var = this.G1;
            hh2Var.f = alpha;
            hh2Var.draw(canvas);
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
