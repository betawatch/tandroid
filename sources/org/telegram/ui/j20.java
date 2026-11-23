package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j20 extends org.telegram.ui.Components.wt {
    public final /* synthetic */ e40 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j20(e40 e40Var, LaunchActivity launchActivity, k30 k30Var, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(launchActivity, k30Var, g2Var, 5, true, i6Var);
        this.W = e40Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        e40 e40Var = this.W;
        e40Var.C1.getEditText().setTranslationY(view.getMeasuredHeight() - e40Var.A5.f);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        org.telegram.ui.Components.qy emojiView = getEmojiView();
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
