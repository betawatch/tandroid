package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f40 extends org.telegram.ui.Components.cu {
    public final /* synthetic */ e60 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(e60 e60Var, LaunchActivity launchActivity, j50 j50Var, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(launchActivity, j50Var, p2Var, 5, true, f6Var);
        this.S = e60Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        e60 e60Var = this.S;
        e60Var.E.getEditText().setTranslationY(view.getMeasuredHeight() - e60Var.y3.e);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.cu
    public final void f() {
        ViewGroup viewGroup;
        super.f();
        org.telegram.ui.Components.kz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.t0 = false;
            emojiView.u2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.S).containerView;
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

    @Override // org.telegram.ui.Components.cu
    public final void p() {
        ch.i iVar = this.S.z1;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.K ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            iVar.f(max);
        } else {
            iVar.h(false);
        }
    }

    @Override // org.telegram.ui.Components.cu
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.S).containerView;
        viewGroup.requestApplyInsets();
    }
}
