package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ei extends ku {
    public final /* synthetic */ wi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(wi wiVar, Context context, mi miVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, miVar, null, 1, true, d6Var);
        this.V = wiVar;
    }

    @Override // org.telegram.ui.Components.ku
    public final void f() {
        super.f();
        lz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.ku
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.m2 m2Var = this.V.f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            org.telegram.ui.wn.k8(menu, ((org.telegram.ui.wn) m2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wi wiVar = this.V;
        ei eiVar = wiVar.P0;
        if (!wiVar.u1) {
            if (motionEvent.getX() <= eiVar.getEditText().getLeft() || motionEvent.getX() >= eiVar.getEditText().getRight() || motionEvent.getY() <= eiVar.getEditText().getTop() || motionEvent.getY() >= eiVar.getEditText().getBottom()) {
                wiVar.t1(eiVar.getEditText(), false);
            } else {
                wiVar.t1(eiVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.b2();
    }

    @Override // org.telegram.ui.Components.ku
    public final void q(int i10, int i11) {
        wi wiVar = this.V;
        wiVar.b2();
        if (wiVar.c0) {
            wiVar.M1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
