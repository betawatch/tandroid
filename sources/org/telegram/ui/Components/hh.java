package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hh extends kt {
    public final /* synthetic */ ci V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh(ci ciVar, Context context, ph phVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, phVar, null, 1, true, h6Var);
        this.V = ciVar;
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
        org.telegram.ui.ActionBar.f2 f2Var = this.V.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            org.telegram.ui.cn.B8(menu, ((org.telegram.ui.cn) f2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ci ciVar = this.V;
        hh hhVar = ciVar.M2;
        if (!ciVar.r3) {
            if (motionEvent.getX() <= hhVar.getEditText().getLeft() || motionEvent.getX() >= hhVar.getEditText().getRight() || motionEvent.getY() <= hhVar.getEditText().getTop() || motionEvent.getY() >= hhVar.getEditText().getBottom()) {
                ciVar.h1(hhVar.getEditText(), false);
            } else {
                ciVar.h1(hhVar.getEditText(), true);
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
        ci ciVar = this.V;
        ciVar.Q1();
        if (ciVar.W1) {
            ciVar.B1(i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
