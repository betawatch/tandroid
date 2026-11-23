package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class zh extends yt {
    public final /* synthetic */ ui W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(ui uiVar, Context context, hi hiVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, hiVar, null, 1, true, h6Var);
        this.W = uiVar;
    }

    @Override // org.telegram.ui.Components.yt
    public final void f() {
        super.f();
        ty emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.n);
        }
    }

    @Override // org.telegram.ui.Components.yt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.g2 g2Var = this.W.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) g2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ui uiVar = this.W;
        zh zhVar = uiVar.N2;
        if (!uiVar.s3) {
            if (motionEvent.getX() <= zhVar.getEditText().getLeft() || motionEvent.getX() >= zhVar.getEditText().getRight() || motionEvent.getY() <= zhVar.getEditText().getTop() || motionEvent.getY() >= zhVar.getEditText().getBottom()) {
                uiVar.i1(zhVar.getEditText(), false);
            } else {
                uiVar.i1(zhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.W.R1();
    }

    @Override // org.telegram.ui.Components.yt
    public final void q(int i7, int i10) {
        ui uiVar = this.W;
        uiVar.R1();
        if (uiVar.X1) {
            uiVar.C1(i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
