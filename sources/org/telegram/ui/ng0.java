package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ng0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ qg0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng0(qg0 qg0Var, Context context) {
        super(context);
        this.G = qg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        qg0 qg0Var = this.G;
        rg0 rg0Var = qg0Var.V;
        org.telegram.ui.Components.yc0 yc0Var = qg0Var.f;
        float f7 = (z10 || qg0Var.a.isFocused()) ? 1.0f : 0.0f;
        yc0Var.b(f7, f7, true);
        if (!z10) {
            if (qg0Var.x == 2) {
                qg0Var.setCountryButtonText(null);
            }
        } else {
            rg0Var.c.setEditText(this);
            rg0Var.c.setDispatchBackWhenEmpty(true);
            if (qg0Var.x == 2) {
                qg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        qg0 qg0Var = this.G;
        uj0 uj0Var = qg0Var.a;
        if (i10 == 67 && qg0Var.b.length() == 0) {
            uj0Var.requestFocus();
            uj0Var.setSelection(uj0Var.length());
            uj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !rg0.T0(this.G.V, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
