package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h20 extends org.telegram.ui.Components.lt {
    public final /* synthetic */ c40 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h20(c40 c40Var, LaunchActivity launchActivity, i30 i30Var, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(launchActivity, i30Var, f2Var, 5, true, f6Var);
        this.V = c40Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        c40 c40Var = this.V;
        c40Var.y1.getEditText().setTranslationY(view.getMeasuredHeight() - c40Var.s5.f);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.lt
    public final void f() {
        super.f();
        org.telegram.ui.Components.hy emojiView = getEmojiView();
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
        te.c cVar = this.V.s5;
        if (cVar.f == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.lt
    public final void p() {
        rh.h hVar = this.V.t3;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.N ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            hVar.g(max);
        } else {
            hVar.i(false);
        }
    }

    @Override // org.telegram.ui.Components.lt
    public final void y() {
        this.V.b.requestApplyInsets();
    }
}
