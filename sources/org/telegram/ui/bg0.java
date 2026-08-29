package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ eg0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(eg0 eg0Var, Context context) {
        super(context);
        this.C = eg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        eg0 eg0Var = this.C;
        fg0 fg0Var = eg0Var.R;
        org.telegram.ui.Components.uc0 uc0Var = eg0Var.f;
        float f9 = (z10 || eg0Var.a.isFocused()) ? 1.0f : 0.0f;
        uc0Var.b(f9, f9, true);
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
        eg0 eg0Var = this.C;
        ij0 ij0Var = eg0Var.a;
        if (i10 == 67 && eg0Var.b.length() == 0) {
            ij0Var.requestFocus();
            ij0Var.setSelection(ij0Var.length());
            ij0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !fg0.T0(this.C.R, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
