package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yh extends ru {
    public final /* synthetic */ ti V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(ti tiVar, Context context, gi giVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, giVar, null, 1, true, u6Var);
        this.V = tiVar;
    }

    @Override // org.telegram.ui.Components.ru
    public final void f() {
        super.f();
        sz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.ru
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.r2 r2Var = this.V.f0;
        if (r2Var instanceof org.telegram.ui.wn) {
            org.telegram.ui.wn.t8(menu, ((org.telegram.ui.wn) r2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.V;
        yh yhVar = tiVar.S0;
        if (!tiVar.x1) {
            if (motionEvent.getX() <= yhVar.getEditText().getLeft() || motionEvent.getX() >= yhVar.getEditText().getRight() || motionEvent.getY() <= yhVar.getEditText().getTop() || motionEvent.getY() >= yhVar.getEditText().getBottom()) {
                tiVar.z1(yhVar.getEditText(), false);
            } else {
                tiVar.z1(yhVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.j2();
    }

    @Override // org.telegram.ui.Components.ru
    public final void q(int i10, int i11) {
        ti tiVar = this.V;
        tiVar.j2();
        if (tiVar.c0) {
            tiVar.U1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
