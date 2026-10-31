package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ef0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int V1;
    public final /* synthetic */ gf0 W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef0(gf0 gf0Var, Context context, int i10) {
        super(context);
        this.V1 = i10;
        this.W1 = gf0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        int i11 = this.V1;
        float f7 = 1.0f;
        gf0 gf0Var = this.W1;
        switch (i11) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                org.telegram.ui.Components.ec0 ec0Var = gf0Var.f;
                if (!z10 && !gf0Var.b.isFocused()) {
                    f7 = 0.0f;
                }
                ec0Var.b(f7, f7, true);
                if (z10) {
                    gf0Var.a0.c.setEditText(this);
                    break;
                }
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                hf0 hf0Var = gf0Var.a0;
                org.telegram.ui.Components.ec0 ec0Var2 = gf0Var.f;
                if (!z10 && !gf0Var.a.isFocused()) {
                    f7 = 0.0f;
                }
                ec0Var2.b(f7, f7, true);
                if (!z10) {
                    if (gf0Var.E == 2) {
                        gf0Var.setCountryButtonText(null);
                        break;
                    }
                } else {
                    hf0Var.c.setEditText(this);
                    hf0Var.c.setDispatchBackWhenEmpty(true);
                    if (gf0Var.E == 2) {
                        gf0Var.setCountryButtonText(org.telegram.messenger.cd.L0(2131742884, null));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                gf0 gf0Var = this.W1;
                ef0 ef0Var = gf0Var.a;
                if (i10 == 67 && gf0Var.b.length() == 0) {
                    ef0Var.requestFocus();
                    ef0Var.setSelection(ef0Var.length());
                    ef0Var.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V1) {
            case 1:
                if (motionEvent.getAction() == 0 && !hf0.Z0(this.W1.a0, this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
