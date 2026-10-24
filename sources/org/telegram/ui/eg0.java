package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class eg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ hg0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg0(hg0 hg0Var, Context context) {
        super(context);
        this.G = hg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        hg0 hg0Var = this.G;
        ig0 ig0Var = hg0Var.a0;
        org.telegram.ui.Components.vd0 vd0Var = hg0Var.f;
        float f7 = (z10 || hg0Var.a.isFocused()) ? 1.0f : 0.0f;
        vd0Var.b(f7, f7, true);
        if (!z10) {
            if (hg0Var.E == 2) {
                hg0Var.setCountryButtonText(null);
            }
        } else {
            ig0Var.c.setEditText(this);
            ig0Var.c.setDispatchBackWhenEmpty(true);
            if (hg0Var.E == 2) {
                hg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        hg0 hg0Var = this.G;
        pj0 pj0Var = hg0Var.a;
        if (i10 == 67 && hg0Var.b.length() == 0) {
            pj0Var.requestFocus();
            pj0Var.setSelection(pj0Var.length());
            pj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !ig0.V0(this.G.a0, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
