package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f30 extends org.telegram.ui.Components.wt {
    public final /* synthetic */ a50 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f30(a50 a50Var, LaunchActivity launchActivity, f40 f40Var, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(launchActivity, f40Var, k2Var, 5, true, p6Var);
        this.V = a50Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        a50 a50Var = this.V;
        a50Var.y1.getEditText().setTranslationY(view.getMeasuredHeight() - a50Var.s5.f);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        org.telegram.ui.Components.vy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.V.b.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        fe.f fVar = this.V.s5;
        if (fVar.f == 0.0f) {
            fVar.c(getMeasuredHeight());
        } else {
            fVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void p() {
        hh.i iVar = this.V.t3;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.N ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            iVar.g(max);
        } else {
            iVar.i(false);
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void y() {
        this.V.b.requestApplyInsets();
    }
}
