package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class th extends du {
    public final /* synthetic */ li S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(li liVar, Context context, bi biVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, biVar, null, 1, true, f6Var);
        this.S = liVar;
    }

    @Override // org.telegram.ui.Components.du
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.t0 = false;
            emojiView.u2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.du
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.p2 p2Var = this.S.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) p2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        li liVar = this.S;
        th thVar = liVar.M0;
        if (!liVar.r1) {
            if (motionEvent.getX() <= thVar.getEditText().getLeft() || motionEvent.getX() >= thVar.getEditText().getRight() || motionEvent.getY() <= thVar.getEditText().getTop() || motionEvent.getY() >= thVar.getEditText().getBottom()) {
                liVar.t1(thVar.getEditText(), false);
            } else {
                liVar.t1(thVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.S.b2();
    }

    @Override // org.telegram.ui.Components.du
    public final void q(int i10, int i11) {
        li liVar = this.S;
        liVar.b2();
        if (liVar.Z) {
            liVar.M1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
