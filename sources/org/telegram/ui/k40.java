package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k40 extends org.telegram.ui.Components.ju {
    public final /* synthetic */ k60 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(k60 k60Var, LaunchActivity launchActivity, o50 o50Var, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(launchActivity, o50Var, o2Var, 5, true, f6Var);
        this.V = k60Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        k60 k60Var = this.V;
        k60Var.H.getEditText().setTranslationY(view.getMeasuredHeight() - k60Var.B3.e);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.ju
    public final void f() {
        ViewGroup viewGroup;
        super.f();
        org.telegram.ui.Components.kz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.V).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        le.e eVar = this.V.B3;
        if (eVar.e == 0.0f) {
            eVar.c(getMeasuredHeight());
        } else {
            eVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.ju
    public final void p() {
        ph.i iVar = this.V.C1;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.N ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            iVar.f(max);
        } else {
            iVar.h(false);
        }
    }

    @Override // org.telegram.ui.Components.ju
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.V).containerView;
        viewGroup.requestApplyInsets();
    }
}
