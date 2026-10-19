package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class p30 extends org.telegram.ui.Components.qu {
    public final /* synthetic */ q50 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(q50 q50Var, LaunchActivity launchActivity, u40 u40Var, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(launchActivity, u40Var, n2Var, 5, true, d6Var);
        this.V = q50Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        q50 q50Var = this.V;
        q50Var.H.getEditText().setTranslationY(view.getMeasuredHeight() - q50Var.B3.e);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.qu
    public final void f() {
        ViewGroup viewGroup;
        super.f();
        org.telegram.ui.Components.tz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.V).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ne.e eVar = this.V.B3;
        if (eVar.e == 0.0f) {
            eVar.c(getMeasuredHeight());
        } else {
            eVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.qu
    public final void p() {
        qh.i iVar = this.V.C1;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.N ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            iVar.g(max);
        } else {
            iVar.i(false);
        }
    }

    @Override // org.telegram.ui.Components.qu
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.V).containerView;
        viewGroup.requestApplyInsets();
    }
}
