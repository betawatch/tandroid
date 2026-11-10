package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k20 extends org.telegram.ui.Components.kt {
    public final /* synthetic */ f40 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k20(f40 f40Var, LaunchActivity launchActivity, l30 l30Var, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(launchActivity, l30Var, f2Var, 5, true, h6Var);
        this.V = f40Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        f40 f40Var = this.V;
        f40Var.B1.getEditText().setTranslationY(view.getMeasuredHeight() - f40Var.v5.f);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.kt
    public final void f() {
        super.f();
        org.telegram.ui.Components.gy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.V.b.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        te.c cVar = this.V.v5;
        if (cVar.f == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.kt
    public final void p() {
        rh.h hVar = this.V.w3;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.N ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            hVar.g(max);
        } else {
            hVar.i(false);
        }
    }

    @Override // org.telegram.ui.Components.kt
    public final void y() {
        this.V.b.requestApplyInsets();
    }
}
