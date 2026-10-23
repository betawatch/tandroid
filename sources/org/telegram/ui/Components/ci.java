package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ci extends qu {
    public final /* synthetic */ ti V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(ti tiVar, Context context, ji jiVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, jiVar, null, 1, true, g6Var);
        this.V = tiVar;
    }

    @Override // org.telegram.ui.Components.qu
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.qu
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.V.f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) o2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.V;
        ci ciVar = tiVar.S0;
        if (!tiVar.x1) {
            if (motionEvent.getX() <= ciVar.getEditText().getLeft() || motionEvent.getX() >= ciVar.getEditText().getRight() || motionEvent.getY() <= ciVar.getEditText().getTop() || motionEvent.getY() >= ciVar.getEditText().getBottom()) {
                tiVar.z1(ciVar.getEditText(), false);
            } else {
                tiVar.z1(ciVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.j2();
    }

    @Override // org.telegram.ui.Components.qu
    public final void q(int i10, int i11) {
        ti tiVar = this.V;
        tiVar.j2();
        if (tiVar.c0) {
            tiVar.U1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
