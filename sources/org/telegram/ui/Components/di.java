package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class di extends hu {
    public final /* synthetic */ vi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(vi viVar, Context context, li liVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, liVar, null, 1, true, f6Var);
        this.V = viVar;
    }

    @Override // org.telegram.ui.Components.hu
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.hu
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.V.f0;
        if (n2Var instanceof org.telegram.ui.co) {
            org.telegram.ui.co.k8(menu, ((org.telegram.ui.co) n2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vi viVar = this.V;
        di diVar = viVar.P0;
        if (!viVar.u1) {
            if (motionEvent.getX() <= diVar.getEditText().getLeft() || motionEvent.getX() >= diVar.getEditText().getRight() || motionEvent.getY() <= diVar.getEditText().getTop() || motionEvent.getY() >= diVar.getEditText().getBottom()) {
                viVar.t1(diVar.getEditText(), false);
            } else {
                viVar.t1(diVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.b2();
    }

    @Override // org.telegram.ui.Components.hu
    public final void q(int i10, int i11) {
        vi viVar = this.V;
        viVar.b2();
        if (viVar.c0) {
            viVar.M1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
