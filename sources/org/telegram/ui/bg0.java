package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ eg0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(eg0 eg0Var, Context context) {
        super(context);
        this.C = eg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i9, Rect rect) {
        super.onFocusChanged(z10, i9, rect);
        eg0 eg0Var = this.C;
        fg0 fg0Var = eg0Var.R;
        org.telegram.ui.Components.fc0 fc0Var = eg0Var.f;
        float f10 = (z10 || eg0Var.a.isFocused()) ? 1.0f : 0.0f;
        fc0Var.b(f10, f10, true);
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
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        eg0 eg0Var = this.C;
        kj0 kj0Var = eg0Var.a;
        if (i9 == 67 && eg0Var.b.length() == 0) {
            kj0Var.requestFocus();
            kj0Var.setSelection(kj0Var.length());
            kj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i9, keyEvent);
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
