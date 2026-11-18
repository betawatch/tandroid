package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class be0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int b2;
    public final /* synthetic */ de0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be0(de0 de0Var, Context context, int i7) {
        super(context);
        this.b2 = i7;
        this.c2 = de0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        int i10 = this.b2;
        float f10 = 1.0f;
        de0 de0Var = this.c2;
        switch (i10) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                org.telegram.ui.Components.xb0 xb0Var = de0Var.f;
                if (!z10 && !de0Var.b.isFocused()) {
                    f10 = 0.0f;
                }
                xb0Var.b(f10, f10, true);
                if (z10) {
                    de0Var.h0.c.setEditText(this);
                    break;
                }
                break;
            default:
                super.onFocusChanged(z10, i7, rect);
                ee0 ee0Var = de0Var.h0;
                org.telegram.ui.Components.xb0 xb0Var2 = de0Var.f;
                if (!z10 && !de0Var.a.isFocused()) {
                    f10 = 0.0f;
                }
                xb0Var2.b(f10, f10, true);
                if (!z10) {
                    if (de0Var.F == 2) {
                        de0Var.setCountryButtonText(null);
                        break;
                    }
                } else {
                    ee0Var.c.setEditText(this);
                    ee0Var.c.setDispatchBackWhenEmpty(true);
                    if (de0Var.F == 2) {
                        de0Var.setCountryButtonText(org.telegram.messenger.gd.M0(2131742601, null));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.b2) {
            case 1:
                de0 de0Var = this.c2;
                be0 be0Var = de0Var.a;
                if (i7 == 67 && de0Var.b.length() == 0) {
                    be0Var.requestFocus();
                    be0Var.setSelection(be0Var.length());
                    be0Var.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.b2) {
            case 1:
                if (motionEvent.getAction() == 0 && !ee0.b1(this.c2.h0, this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
