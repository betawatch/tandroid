package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ mg0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg0(mg0 mg0Var, Context context) {
        super(context);
        this.D = mg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i10, Rect rect) {
        super.onFocusChanged(z4, i10, rect);
        mg0 mg0Var = this.D;
        ng0 ng0Var = mg0Var.S;
        org.telegram.ui.Components.ad0 ad0Var = mg0Var.f;
        float f10 = (z4 || mg0Var.a.isFocused()) ? 1.0f : 0.0f;
        ad0Var.b(f10, f10, true);
        if (!z4) {
            if (mg0Var.x == 2) {
                mg0Var.setCountryButtonText(null);
            }
        } else {
            ng0Var.c.setEditText(this);
            ng0Var.c.setDispatchBackWhenEmpty(true);
            if (mg0Var.x == 2) {
                mg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        mg0 mg0Var = this.D;
        qj0 qj0Var = mg0Var.a;
        if (i10 == 67 && mg0Var.b.length() == 0) {
            qj0Var.requestFocus();
            qj0Var.setSelection(qj0Var.length());
            qj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !ng0.T0(this.D.S, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
