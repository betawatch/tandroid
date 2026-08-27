package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class eg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ hg0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg0(hg0 hg0Var, Context context) {
        super(context);
        this.C = hg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        hg0 hg0Var = this.C;
        ig0 ig0Var = hg0Var.R;
        org.telegram.ui.Components.jc0 jc0Var = hg0Var.f;
        float f10 = (z10 || hg0Var.a.isFocused()) ? 1.0f : 0.0f;
        jc0Var.b(f10, f10, true);
        if (!z10) {
            if (hg0Var.x == 2) {
                hg0Var.setCountryButtonText(null);
            }
        } else {
            ig0Var.c.setEditText(this);
            ig0Var.c.setDispatchBackWhenEmpty(true);
            if (hg0Var.x == 2) {
                hg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        hg0 hg0Var = this.C;
        mj0 mj0Var = hg0Var.a;
        if (i10 == 67 && hg0Var.b.length() == 0) {
            mj0Var.requestFocus();
            mj0Var.setSelection(mj0Var.length());
            mj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !ig0.T0(this.C.R, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
