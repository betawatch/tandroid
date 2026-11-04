package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fh extends jt {
    public final /* synthetic */ bi W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh(bi biVar, Context context, oh ohVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, ohVar, null, 1, true, e6Var);
        this.W = biVar;
    }

    @Override // org.telegram.ui.Components.jt
    public final void f() {
        super.f();
        ey emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.n);
        }
    }

    @Override // org.telegram.ui.Components.jt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.d2 d2Var = this.W.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            org.telegram.ui.wm.A8(menu, ((org.telegram.ui.wm) d2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bi biVar = this.W;
        fh fhVar = biVar.K2;
        if (!biVar.p3) {
            if (motionEvent.getX() <= fhVar.getEditText().getLeft() || motionEvent.getX() >= fhVar.getEditText().getRight() || motionEvent.getY() <= fhVar.getEditText().getTop() || motionEvent.getY() >= fhVar.getEditText().getBottom()) {
                biVar.h1(fhVar.getEditText(), false);
            } else {
                biVar.h1(fhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.W.Q1();
    }

    @Override // org.telegram.ui.Components.jt
    public final void q(int i3, int i10) {
        bi biVar = this.W;
        biVar.Q1();
        if (biVar.U1) {
            biVar.B1(i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
