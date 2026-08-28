package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class th extends ut {
    public final /* synthetic */ ki R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(ki kiVar, Context context, ai aiVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, aiVar, null, 1, true, b6Var);
        this.R = kiVar;
    }

    @Override // org.telegram.ui.Components.ut
    public final void f() {
        super.f();
        wy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.s0 = false;
            emojiView.t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.ut
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.o2 o2Var = this.R.b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn.k8(menu, ((org.telegram.ui.qn) o2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ki kiVar = this.R;
        th thVar = kiVar.L0;
        if (!kiVar.q1) {
            if (motionEvent.getX() <= thVar.getEditText().getLeft() || motionEvent.getX() >= thVar.getEditText().getRight() || motionEvent.getY() <= thVar.getEditText().getTop() || motionEvent.getY() >= thVar.getEditText().getBottom()) {
                kiVar.t1(thVar.getEditText(), false);
            } else {
                kiVar.t1(thVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.R.b2();
    }

    @Override // org.telegram.ui.Components.ut
    public final void q(int i9, int i10) {
        ki kiVar = this.R;
        kiVar.b2();
        if (kiVar.Y) {
            kiVar.M1(i10 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
