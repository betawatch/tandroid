// default package

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o55 extends rt3 {
    public final /* synthetic */ h75 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o55(h75 h75Var, LaunchActivity launchActivity, p65 p65Var, d dVar, wjb wjbVar) {
        super(launchActivity, p65Var, dVar, 5, true, wjbVar);
        this.W = h75Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        h75 h75Var = this.W;
        h75Var.A1.getEditText().setTranslationY(view.getMeasuredHeight() - h75Var.q5.f);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // rt3
    public final void f() {
        super.f();
        t14 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.W.b.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        y74 y74Var = this.W.q5;
        if (y74Var.f == 0.0f) {
            y74Var.c(getMeasuredHeight());
        } else {
            y74Var.a(getMeasuredHeight());
        }
    }

    @Override // rt3
    public final void p() {
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.O ? Math.max(0, getKeyboardHeight()) : 0;
        fyc fycVar = this.W.w3;
        if (max > 0) {
            fycVar.g(max);
        } else {
            fycVar.i(false);
        }
    }

    @Override // rt3
    public final void y() {
        this.W.b.requestApplyInsets();
    }
}
