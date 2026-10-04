package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class bi extends mu {
    public final /* synthetic */ xi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(xi xiVar, Context context, ki kiVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, kiVar, null, 1, true, d6Var);
        this.V = xiVar;
    }

    @Override // org.telegram.ui.Components.mu
    public final void f() {
        super.f();
        nz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.mu
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.V.f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            org.telegram.ui.yn.k8(menu, ((org.telegram.ui.yn) n2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xi xiVar = this.V;
        bi biVar = xiVar.P0;
        if (!xiVar.u1) {
            if (motionEvent.getX() <= biVar.getEditText().getLeft() || motionEvent.getX() >= biVar.getEditText().getRight() || motionEvent.getY() <= biVar.getEditText().getTop() || motionEvent.getY() >= biVar.getEditText().getBottom()) {
                xiVar.q1(biVar.getEditText(), false);
            } else {
                xiVar.q1(biVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.Y1();
    }

    @Override // org.telegram.ui.Components.mu
    public final void q(int i10, int i11) {
        xi xiVar = this.V;
        xiVar.Y1();
        if (xiVar.c0) {
            xiVar.J1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
