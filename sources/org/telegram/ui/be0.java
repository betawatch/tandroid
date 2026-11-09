package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class be0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int V1;
    public final /* synthetic */ de0 W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be0(de0 de0Var, Context context, int i7) {
        super(context);
        this.V1 = i7;
        this.W1 = de0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z9, int i7, Rect rect) {
        int i10 = this.V1;
        float f10 = 1.0f;
        de0 de0Var = this.W1;
        switch (i10) {
            case 0:
                super.onFocusChanged(z9, i7, rect);
                org.telegram.ui.Components.mb0 mb0Var = de0Var.f;
                if (!z9 && !de0Var.b.isFocused()) {
                    f10 = 0.0f;
                }
                mb0Var.b(f10, f10, true);
                if (z9) {
                    de0Var.g0.c.setEditText(this);
                    break;
                }
                break;
            default:
                super.onFocusChanged(z9, i7, rect);
                ee0 ee0Var = de0Var.g0;
                org.telegram.ui.Components.mb0 mb0Var2 = de0Var.f;
                if (!z9 && !de0Var.a.isFocused()) {
                    f10 = 0.0f;
                }
                mb0Var2.b(f10, f10, true);
                if (!z9) {
                    if (de0Var.E == 2) {
                        de0Var.setCountryButtonText(null);
                        break;
                    }
                } else {
                    ee0Var.c.setEditText(this);
                    ee0Var.c.setDispatchBackWhenEmpty(true);
                    if (de0Var.E == 2) {
                        de0Var.setCountryButtonText(org.telegram.messenger.id.M0(2131742859, null));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                de0 de0Var = this.W1;
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
        switch (this.V1) {
            case 1:
                if (motionEvent.getAction() == 0 && !ee0.b1(this.W1.g0, this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
