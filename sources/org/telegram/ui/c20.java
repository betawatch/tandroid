package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c20 extends org.telegram.ui.Components.jt {
    public final /* synthetic */ x30 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c20(x30 x30Var, LaunchActivity launchActivity, d30 d30Var, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(launchActivity, d30Var, d2Var, 5, true, e6Var);
        this.W = x30Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        x30 x30Var = this.W;
        x30Var.z1.getEditText().setTranslationY(view.getMeasuredHeight() - x30Var.t5.f);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.jt
    public final void f() {
        super.f();
        org.telegram.ui.Components.ey emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.W.b.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        qe.c cVar = this.W.t5;
        if (cVar.f == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.jt
    public final void p() {
        sh.h hVar = this.W.u3;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.O ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            hVar.g(max);
        } else {
            hVar.i(false);
        }
    }

    @Override // org.telegram.ui.Components.jt
    public final void y() {
        this.W.b.requestApplyInsets();
    }
}
