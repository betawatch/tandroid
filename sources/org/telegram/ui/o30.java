package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o30 extends org.telegram.ui.Components.ut {
    public final /* synthetic */ o50 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o30(o50 o50Var, LaunchActivity launchActivity, s40 s40Var, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(launchActivity, s40Var, o2Var, 5, true, b6Var);
        this.R = o50Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        o50 o50Var = this.R;
        o50Var.D.getEditText().setTranslationY(view.getMeasuredHeight() - o50Var.x3.e);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.ut
    public final void f() {
        ViewGroup viewGroup;
        super.f();
        org.telegram.ui.Components.wy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.s0 = false;
            emojiView.t2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.R).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        td.c cVar = this.R.x3;
        if (cVar.e == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.ut
    public final void p() {
        xg.i iVar = this.R.y1;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.J ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            iVar.f(max);
        } else {
            iVar.h(false);
        }
    }

    @Override // org.telegram.ui.Components.ut
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.R).containerView;
        viewGroup.requestApplyInsets();
    }
}
