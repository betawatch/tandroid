package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class mg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ pg0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg0(pg0 pg0Var, Context context) {
        super(context);
        this.G = pg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        pg0 pg0Var = this.G;
        qg0 qg0Var = pg0Var.V;
        org.telegram.ui.Components.jd0 jd0Var = pg0Var.f;
        float f7 = (z10 || pg0Var.a.isFocused()) ? 1.0f : 0.0f;
        jd0Var.b(f7, f7, true);
        if (!z10) {
            if (pg0Var.x == 2) {
                pg0Var.setCountryButtonText(null);
            }
        } else {
            qg0Var.c.setEditText(this);
            qg0Var.c.setDispatchBackWhenEmpty(true);
            if (pg0Var.x == 2) {
                pg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        pg0 pg0Var = this.G;
        uj0 uj0Var = pg0Var.a;
        if (i10 == 67 && pg0Var.b.length() == 0) {
            uj0Var.requestFocus();
            uj0Var.setSelection(uj0Var.length());
            uj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !qg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
