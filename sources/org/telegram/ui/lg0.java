package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ og0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg0(og0 og0Var, Context context) {
        super(context);
        this.D = og0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i10, Rect rect) {
        super.onFocusChanged(z4, i10, rect);
        og0 og0Var = this.D;
        pg0 pg0Var = og0Var.S;
        org.telegram.ui.Components.bd0 bd0Var = og0Var.f;
        float f10 = (z4 || og0Var.a.isFocused()) ? 1.0f : 0.0f;
        bd0Var.b(f10, f10, true);
        if (!z4) {
            if (og0Var.x == 2) {
                og0Var.setCountryButtonText(null);
            }
        } else {
            pg0Var.c.setEditText(this);
            pg0Var.c.setDispatchBackWhenEmpty(true);
            if (og0Var.x == 2) {
                og0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        og0 og0Var = this.D;
        sj0 sj0Var = og0Var.a;
        if (i10 == 67 && og0Var.b.length() == 0) {
            sj0Var.requestFocus();
            sj0Var.setSelection(sj0Var.length());
            sj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !pg0.T0(this.D.S, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
