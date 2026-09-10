package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gi extends nu {
    public final /* synthetic */ yi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(yi yiVar, Context context, oi oiVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, oiVar, null, 1, true, f6Var);
        this.V = yiVar;
    }

    @Override // org.telegram.ui.Components.nu
    public final void f() {
        super.f();
        rz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.nu
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.p2 p2Var = this.V.f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            org.telegram.ui.eo.k8(menu, ((org.telegram.ui.eo) p2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        yi yiVar = this.V;
        gi giVar = yiVar.P0;
        if (!yiVar.u1) {
            if (motionEvent.getX() <= giVar.getEditText().getLeft() || motionEvent.getX() >= giVar.getEditText().getRight() || motionEvent.getY() <= giVar.getEditText().getTop() || motionEvent.getY() >= giVar.getEditText().getBottom()) {
                yiVar.t1(giVar.getEditText(), false);
            } else {
                yiVar.t1(giVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.b2();
    }

    @Override // org.telegram.ui.Components.nu
    public final void q(int i10, int i11) {
        yi yiVar = this.V;
        yiVar.b2();
        if (yiVar.c0) {
            yiVar.M1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
