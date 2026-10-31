package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fh extends wt {
    public final /* synthetic */ bi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh(bi biVar, Context context, ph phVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, phVar, null, 1, true, p6Var);
        this.V = biVar;
    }

    @Override // org.telegram.ui.Components.wt
    public final void f() {
        super.f();
        vy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.i0.n);
        }
    }

    @Override // org.telegram.ui.Components.wt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.k2 k2Var = this.V.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            org.telegram.ui.un.t8(menu, ((org.telegram.ui.un) k2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.V;
        fh fhVar = biVar.J2;
        if (!biVar.o3) {
            if (motionEvent.getX() <= fhVar.getEditText().getLeft() || motionEvent.getX() >= fhVar.getEditText().getRight() || motionEvent.getY() <= fhVar.getEditText().getTop() || motionEvent.getY() >= fhVar.getEditText().getBottom()) {
                biVar.g1(fhVar.getEditText(), false);
            } else {
                biVar.g1(fhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.P1();
    }

    @Override // org.telegram.ui.Components.wt
    public final void q(int i10, int i11) {
        bi biVar = this.V;
        biVar.P1();
        if (biVar.T1) {
            biVar.A1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
