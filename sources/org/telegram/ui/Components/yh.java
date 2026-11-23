package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yh extends wt {
    public final /* synthetic */ ti W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(ti tiVar, Context context, gi giVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, giVar, null, 1, true, i6Var);
        this.W = tiVar;
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        qy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.n);
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.g2 g2Var = this.W.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) g2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.W;
        yh yhVar = tiVar.N2;
        if (!tiVar.s3) {
            if (motionEvent.getX() <= yhVar.getEditText().getLeft() || motionEvent.getX() >= yhVar.getEditText().getRight() || motionEvent.getY() <= yhVar.getEditText().getTop() || motionEvent.getY() >= yhVar.getEditText().getBottom()) {
                tiVar.i1(yhVar.getEditText(), false);
            } else {
                tiVar.i1(yhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.W.R1();
    }

    @Override // org.telegram.ui.Components.wt
    public final void q(int i7, int i10) {
        ti tiVar = this.W;
        tiVar.R1();
        if (tiVar.X1) {
            tiVar.C1(i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
