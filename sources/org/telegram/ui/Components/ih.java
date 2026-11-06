package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ih extends kt {
    public final /* synthetic */ di V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(di diVar, Context context, qh qhVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, qhVar, null, 1, true, f6Var);
        this.V = diVar;
    }

    @Override // org.telegram.ui.Components.kt
    public final void f() {
        super.f();
        gy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(org.telegram.messenger.g0.n);
        }
    }

    @Override // org.telegram.ui.Components.kt
    public final void i(ActionMode actionMode, Menu menu) {
        org.telegram.ui.ActionBar.f2 f2Var = this.V.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            org.telegram.ui.an.A8(menu, ((org.telegram.ui.an) f2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        di diVar = this.V;
        ih ihVar = diVar.J2;
        if (!diVar.o3) {
            if (motionEvent.getX() <= ihVar.getEditText().getLeft() || motionEvent.getX() >= ihVar.getEditText().getRight() || motionEvent.getY() <= ihVar.getEditText().getTop() || motionEvent.getY() >= ihVar.getEditText().getBottom()) {
                diVar.h1(ihVar.getEditText(), false);
            } else {
                diVar.h1(ihVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.V.Q1();
    }

    @Override // org.telegram.ui.Components.kt
    public final void q(int i7, int i10) {
        di diVar = this.V;
        diVar.Q1();
        if (diVar.T1) {
            diVar.B1(i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
