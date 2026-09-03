package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class th extends fu {
    public final /* synthetic */ mi S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(mi miVar, Context context, ci ciVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, ciVar, null, 1, true, g6Var);
        this.S = miVar;
    }

    @Override // org.telegram.ui.Components.fu
    public final void f() {
        super.f();
        mz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.t0 = false;
            emojiView.u2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.fu
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.p2 p2Var = this.S.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) p2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mi miVar = this.S;
        th thVar = miVar.M0;
        if (!miVar.r1) {
            if (motionEvent.getX() <= thVar.getEditText().getLeft() || motionEvent.getX() >= thVar.getEditText().getRight() || motionEvent.getY() <= thVar.getEditText().getTop() || motionEvent.getY() >= thVar.getEditText().getBottom()) {
                miVar.t1(thVar.getEditText(), false);
            } else {
                miVar.t1(thVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.S.b2();
    }

    @Override // org.telegram.ui.Components.fu
    public final void q(int i10, int i11) {
        mi miVar = this.S;
        miVar.b2();
        if (miVar.Z) {
            miVar.M1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
