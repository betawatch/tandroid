package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class f40 extends org.telegram.ui.Components.ku {
    public final /* synthetic */ f60 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(f60 f60Var, LaunchActivity launchActivity, j50 j50Var, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(launchActivity, j50Var, n2Var, 5, true, d6Var);
        this.V = f60Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        f60 f60Var = this.V;
        f60Var.H.getEditText().setTranslationY(view.getMeasuredHeight() - f60Var.B3.e);
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
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.V).containerView;
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
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.V).containerView;
        viewGroup.requestApplyInsets();
    }
}
