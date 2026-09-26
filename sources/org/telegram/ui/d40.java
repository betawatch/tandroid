package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class d40 extends org.telegram.ui.Components.ku {
    public final /* synthetic */ d60 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(d60 d60Var, LaunchActivity launchActivity, h50 h50Var, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(launchActivity, h50Var, m2Var, 5, true, d6Var);
        this.V = d60Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        d60 d60Var = this.V;
        d60Var.H.getEditText().setTranslationY(view.getMeasuredHeight() - d60Var.B3.e);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.ku
    public final void f() {
        ViewGroup viewGroup;
        super.f();
        org.telegram.ui.Components.lz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.V).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        le.f fVar = this.V.B3;
        if (fVar.e == 0.0f) {
            fVar.c(getMeasuredHeight());
        } else {
            fVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.ku
    public final void p() {
        ph.i iVar = this.V.C1;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.N ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            iVar.f(max);
        } else {
            iVar.h(false);
        }
    }

    @Override // org.telegram.ui.Components.ku
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.V).containerView;
        viewGroup.requestApplyInsets();
    }
}
