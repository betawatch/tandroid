package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gi extends zu {
    public final /* synthetic */ yi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(yi yiVar, Context context, oi oiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, oiVar, null, 1, true, e6Var);
        this.V = yiVar;
    }

    @Override // org.telegram.ui.Components.zu
    public final void f() {
        super.f();
        a00 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.zu
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.V.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn.n8(menu, ((org.telegram.ui.zn) n2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        yi yiVar = this.V;
        gi giVar = yiVar.S0;
        if (!yiVar.x1) {
            if (motionEvent.getX() <= giVar.getEditText().getLeft() || motionEvent.getX() >= giVar.getEditText().getRight() || motionEvent.getY() <= giVar.getEditText().getTop() || motionEvent.getY() >= giVar.getEditText().getBottom()) {
                yiVar.w1(giVar.getEditText(), false);
            } else {
                yiVar.w1(giVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.f2();
    }

    @Override // org.telegram.ui.Components.zu
    public final void q(int i10, int i11) {
        yi yiVar = this.V;
        yiVar.f2();
        if (yiVar.c0) {
            yiVar.Q1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
