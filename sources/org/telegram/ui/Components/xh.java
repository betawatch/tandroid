package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class xh extends wt {
    public final /* synthetic */ si W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(si siVar, Context context, fi fiVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, fiVar, null, 1, true, i6Var);
        this.W = siVar;
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        ry emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.n);
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.h2 h2Var = this.W.a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) h2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        si siVar = this.W;
        xh xhVar = siVar.N2;
        if (!siVar.s3) {
            if (motionEvent.getX() <= xhVar.getEditText().getLeft() || motionEvent.getX() >= xhVar.getEditText().getRight() || motionEvent.getY() <= xhVar.getEditText().getTop() || motionEvent.getY() >= xhVar.getEditText().getBottom()) {
                siVar.i1(xhVar.getEditText(), false);
            } else {
                siVar.i1(xhVar.getEditText(), true);
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
        si siVar = this.W;
        siVar.R1();
        if (siVar.X1) {
            siVar.C1(i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
