package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class bg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ eg0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(eg0 eg0Var, Context context) {
        super(context);
        this.G = eg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        eg0 eg0Var = this.G;
        fg0 fg0Var = eg0Var.V;
        org.telegram.ui.Components.sd0 sd0Var = eg0Var.f;
        float f7 = (z10 || eg0Var.a.isFocused()) ? 1.0f : 0.0f;
        sd0Var.b(f7, f7, true);
        if (!z10) {
            if (eg0Var.x == 2) {
                eg0Var.setCountryButtonText(null);
            }
        } else {
            fg0Var.c.setEditText(this);
            fg0Var.c.setDispatchBackWhenEmpty(true);
            if (eg0Var.x == 2) {
                eg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        eg0 eg0Var = this.G;
        mj0 mj0Var = eg0Var.a;
        if (i10 == 67 && eg0Var.b.length() == 0) {
            mj0Var.requestFocus();
            mj0Var.setSelection(mj0Var.length());
            mj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !fg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
