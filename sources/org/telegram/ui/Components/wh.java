package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wh extends au {
    public final /* synthetic */ ni R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(ni niVar, Context context, di diVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, diVar, null, 1, true, c6Var);
        this.R = niVar;
    }

    @Override // org.telegram.ui.Components.au
    public final void f() {
        super.f();
        fz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.s0 = false;
            emojiView.t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.au
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.R.b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            org.telegram.ui.tn.k8(menu, ((org.telegram.ui.tn) o2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ni niVar = this.R;
        wh whVar = niVar.L0;
        if (!niVar.q1) {
            if (motionEvent.getX() <= whVar.getEditText().getLeft() || motionEvent.getX() >= whVar.getEditText().getRight() || motionEvent.getY() <= whVar.getEditText().getTop() || motionEvent.getY() >= whVar.getEditText().getBottom()) {
                niVar.t1(whVar.getEditText(), false);
            } else {
                niVar.t1(whVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.R.b2();
    }

    @Override // org.telegram.ui.Components.au
    public final void q(int i10, int i11) {
        ni niVar = this.R;
        niVar.b2();
        if (niVar.Y) {
            niVar.M1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
