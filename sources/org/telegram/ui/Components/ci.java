package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ci extends qu {
    public final /* synthetic */ ti V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(ti tiVar, Context context, ji jiVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, jiVar, null, 1, true, d6Var);
        this.V = tiVar;
    }

    @Override // org.telegram.ui.Components.qu
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.qu
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.V.f0;
        if (n2Var instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn.n8(menu, ((org.telegram.ui.qn) n2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.V;
        ci ciVar = tiVar.S0;
        if (!tiVar.x1) {
            if (motionEvent.getX() <= ciVar.getEditText().getLeft() || motionEvent.getX() >= ciVar.getEditText().getRight() || motionEvent.getY() <= ciVar.getEditText().getTop() || motionEvent.getY() >= ciVar.getEditText().getBottom()) {
                tiVar.w1(ciVar.getEditText(), false);
            } else {
                tiVar.w1(ciVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.f2();
    }

    @Override // org.telegram.ui.Components.qu
    public final void q(int i10, int i11) {
        ti tiVar = this.V;
        tiVar.f2();
        if (tiVar.c0) {
            tiVar.Q1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
