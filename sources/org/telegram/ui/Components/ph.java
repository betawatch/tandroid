package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ph extends rt {
    public final /* synthetic */ ki W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(ki kiVar, Context context, xh xhVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, xhVar, null, 1, true, e6Var);
        this.W = kiVar;
    }

    @Override // org.telegram.ui.Components.rt
    public final void f() {
        super.f();
        ly emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.y2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.n);
        }
    }

    @Override // org.telegram.ui.Components.rt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.e2 e2Var = this.W.a2;
        if (e2Var instanceof org.telegram.ui.an) {
            org.telegram.ui.an.C8(menu, ((org.telegram.ui.an) e2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ki kiVar = this.W;
        ph phVar = kiVar.N2;
        if (!kiVar.s3) {
            if (motionEvent.getX() <= phVar.getEditText().getLeft() || motionEvent.getX() >= phVar.getEditText().getRight() || motionEvent.getY() <= phVar.getEditText().getTop() || motionEvent.getY() >= phVar.getEditText().getBottom()) {
                kiVar.h1(phVar.getEditText(), false);
            } else {
                kiVar.h1(phVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.W.Q1();
    }

    @Override // org.telegram.ui.Components.rt
    public final void q(int i7, int i10) {
        ki kiVar = this.W;
        kiVar.Q1();
        if (kiVar.X1) {
            kiVar.B1(i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
