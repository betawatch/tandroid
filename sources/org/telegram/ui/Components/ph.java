package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ph extends tt {
    public final /* synthetic */ gi R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(gi giVar, Context context, wh whVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, whVar, null, 1, true, c6Var);
        this.R = giVar;
    }

    @Override // org.telegram.ui.Components.tt
    public final void f() {
        super.f();
        yy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.s0 = false;
            emojiView.t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.tt
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.R.b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn.k8(menu, ((org.telegram.ui.rn) n2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gi giVar = this.R;
        ph phVar = giVar.L0;
        if (!giVar.q1) {
            if (motionEvent.getX() <= phVar.getEditText().getLeft() || motionEvent.getX() >= phVar.getEditText().getRight() || motionEvent.getY() <= phVar.getEditText().getTop() || motionEvent.getY() >= phVar.getEditText().getBottom()) {
                giVar.t1(phVar.getEditText(), false);
            } else {
                giVar.t1(phVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.R.b2();
    }

    @Override // org.telegram.ui.Components.tt
    public final void q(int i10, int i11) {
        gi giVar = this.R;
        giVar.b2();
        if (giVar.Y) {
            giVar.M1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
