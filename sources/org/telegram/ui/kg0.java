package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ ng0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg0(ng0 ng0Var, Context context) {
        super(context);
        this.D = ng0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i10, Rect rect) {
        super.onFocusChanged(z4, i10, rect);
        ng0 ng0Var = this.D;
        og0 og0Var = ng0Var.S;
        org.telegram.ui.Components.cd0 cd0Var = ng0Var.f;
        float f10 = (z4 || ng0Var.a.isFocused()) ? 1.0f : 0.0f;
        cd0Var.b(f10, f10, true);
        if (!z4) {
            if (ng0Var.x == 2) {
                ng0Var.setCountryButtonText(null);
            }
        } else {
            og0Var.c.setEditText(this);
            og0Var.c.setDispatchBackWhenEmpty(true);
            if (ng0Var.x == 2) {
                ng0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ng0 ng0Var = this.D;
        rj0 rj0Var = ng0Var.a;
        if (i10 == 67 && ng0Var.b.length() == 0) {
            rj0Var.requestFocus();
            rj0Var.setSelection(rj0Var.length());
            rj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !og0.T0(this.D.S, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
