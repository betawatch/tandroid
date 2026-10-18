package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ag0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ dg0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(dg0 dg0Var, Context context) {
        super(context);
        this.G = dg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        dg0 dg0Var = this.G;
        eg0 eg0Var = dg0Var.V;
        org.telegram.ui.Components.sd0 sd0Var = dg0Var.f;
        float f7 = (z10 || dg0Var.a.isFocused()) ? 1.0f : 0.0f;
        sd0Var.b(f7, f7, true);
        if (!z10) {
            if (dg0Var.x == 2) {
                dg0Var.setCountryButtonText(null);
            }
        } else {
            eg0Var.c.setEditText(this);
            eg0Var.c.setDispatchBackWhenEmpty(true);
            if (dg0Var.x == 2) {
                dg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        dg0 dg0Var = this.G;
        lj0 lj0Var = dg0Var.a;
        if (i10 == 67 && dg0Var.b.length() == 0) {
            lj0Var.requestFocus();
            lj0Var.setSelection(lj0Var.length());
            lj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !eg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
