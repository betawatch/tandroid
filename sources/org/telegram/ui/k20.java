package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class k20 extends org.telegram.ui.Components.wt {
    public final /* synthetic */ f40 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k20(f40 f40Var, LaunchActivity launchActivity, l30 l30Var, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(launchActivity, l30Var, h2Var, 5, true, i6Var);
        this.W = f40Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        f40 f40Var = this.W;
        f40Var.C1.getEditText().setTranslationY(view.getMeasuredHeight() - f40Var.A5.f);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        org.telegram.ui.Components.ry emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.W.b.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        te.c cVar = this.W.A5;
        if (cVar.f == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void p() {
        rh.h hVar = this.W.B3;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.O ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            hVar.g(max);
        } else {
            hVar.i(false);
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void y() {
        this.W.b.requestApplyInsets();
    }
}
