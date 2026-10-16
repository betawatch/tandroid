package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class di extends vu {
    public final /* synthetic */ vi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(vi viVar, Context context, li liVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, liVar, null, 1, true, c6Var);
        this.V = viVar;
    }

    @Override // org.telegram.ui.Components.vu
    public final void f() {
        super.f();
        wz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.vu
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.m2 m2Var = this.V.f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            org.telegram.ui.fo.n8(menu, ((org.telegram.ui.fo) m2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vi viVar = this.V;
        di diVar = viVar.S0;
        if (!viVar.x1) {
            if (motionEvent.getX() <= diVar.getEditText().getLeft() || motionEvent.getX() >= diVar.getEditText().getRight() || motionEvent.getY() <= diVar.getEditText().getTop() || motionEvent.getY() >= diVar.getEditText().getBottom()) {
                viVar.w1(diVar.getEditText(), false);
            } else {
                viVar.w1(diVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.f2();
    }

    @Override // org.telegram.ui.Components.vu
    public final void q(int i10, int i11) {
        vi viVar = this.V;
        viVar.f2();
        if (viVar.c0) {
            viVar.Q1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
