// default package

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m75 extends cv3 {
    public final /* synthetic */ g95 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m75(g95 g95Var, LaunchActivity launchActivity, n85 n85Var, d dVar, ylb ylbVar) {
        super(launchActivity, n85Var, dVar, 5, true, ylbVar);
        this.W = g95Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        g95 g95Var = this.W;
        g95Var.A1.getEditText().setTranslationY(view.getMeasuredHeight() - g95Var.q5.f);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // cv3
    public final void f() {
        super.f();
        e34 emojiView = getEmojiView();
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
        h94 h94Var = this.W.q5;
        if (h94Var.f == 0.0f) {
            h94Var.c(getMeasuredHeight());
        } else {
            h94Var.a(getMeasuredHeight());
        }
    }

    @Override // cv3
    public final void p() {
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.O ? Math.max(0, getKeyboardHeight()) : 0;
        g0d g0dVar = this.W.w3;
        if (max > 0) {
            g0dVar.g(max);
        } else {
            g0dVar.i(false);
        }
    }

    @Override // cv3
    public final void y() {
        this.W.b.requestApplyInsets();
    }
}
