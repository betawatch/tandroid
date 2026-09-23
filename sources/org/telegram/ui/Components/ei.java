package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ei extends ku {
    public final /* synthetic */ wi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(wi wiVar, Context context, mi miVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, miVar, null, 1, true, d6Var);
        this.V = wiVar;
    }

    @Override // org.telegram.ui.Components.ku
    public final void f() {
        super.f();
        lz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.w2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
        }
    }

    @Override // org.telegram.ui.Components.ku
    public final void i(Menu menu) {
        org.telegram.ui.ActionBar.n2 n2Var = this.V.f0;
        if (n2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) n2Var).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wi wiVar = this.V;
        ei eiVar = wiVar.P0;
        if (!wiVar.u1) {
            if (motionEvent.getX() <= eiVar.getEditText().getLeft() || motionEvent.getX() >= eiVar.getEditText().getRight() || motionEvent.getY() <= eiVar.getEditText().getTop() || motionEvent.getY() >= eiVar.getEditText().getBottom()) {
                wiVar.t1(eiVar.getEditText(), false);
            } else {
                wiVar.t1(eiVar.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.b2();
    }

    @Override // org.telegram.ui.Components.ku
    public final void q(int i10, int i11) {
        wi wiVar = this.V;
        wiVar.b2();
        if (wiVar.c0) {
            wiVar.M1(i11 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
