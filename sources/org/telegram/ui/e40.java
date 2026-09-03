package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e40 extends org.telegram.ui.Components.fu {
    public final /* synthetic */ d60 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e40(d60 d60Var, LaunchActivity launchActivity, i50 i50Var, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(launchActivity, i50Var, p2Var, 5, true, g6Var);
        this.S = d60Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        d60 d60Var = this.S;
        d60Var.E.getEditText().setTranslationY(view.getMeasuredHeight() - d60Var.y3.e);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.fu
    public final void f() {
        ViewGroup viewGroup;
        super.f();
        org.telegram.ui.Components.mz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.t0 = false;
            emojiView.u2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.S).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        xd.c cVar = this.S.y3;
        if (cVar.e == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.fu
    public final void p() {
        dh.i iVar = this.S.z1;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.K ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            iVar.f(max);
        } else {
            iVar.h(false);
        }
    }

    @Override // org.telegram.ui.Components.fu
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.S).containerView;
        viewGroup.requestApplyInsets();
    }
}
