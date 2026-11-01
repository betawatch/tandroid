package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class df0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int V1;
    public final /* synthetic */ ff0 W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df0(ff0 ff0Var, Context context, int i10) {
        super(context);
        this.V1 = i10;
        this.W1 = ff0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        int i11 = this.V1;
        float f7 = 1.0f;
        ff0 ff0Var = this.W1;
        switch (i11) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                org.telegram.ui.Components.ec0 ec0Var = ff0Var.f;
                if (!z10 && !ff0Var.b.isFocused()) {
                    f7 = 0.0f;
                }
                ec0Var.b(f7, f7, true);
                if (z10) {
                    ff0Var.a0.c.setEditText(this);
                    break;
                }
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                gf0 gf0Var = ff0Var.a0;
                org.telegram.ui.Components.ec0 ec0Var2 = ff0Var.f;
                if (!z10 && !ff0Var.a.isFocused()) {
                    f7 = 0.0f;
                }
                ec0Var2.b(f7, f7, true);
                if (!z10) {
                    if (ff0Var.E == 2) {
                        ff0Var.setCountryButtonText(null);
                        break;
                    }
                } else {
                    gf0Var.c.setEditText(this);
                    gf0Var.c.setDispatchBackWhenEmpty(true);
                    if (ff0Var.E == 2) {
                        ff0Var.setCountryButtonText(org.telegram.messenger.dd.L0(2131742884, null));
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
                ff0 ff0Var = this.W1;
                df0 df0Var = ff0Var.a;
                if (i10 == 67 && ff0Var.b.length() == 0) {
                    df0Var.requestFocus();
                    df0Var.setSelection(df0Var.length());
                    df0Var.dispatchKeyEvent(keyEvent);
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
                if (motionEvent.getAction() == 0 && !gf0.a1(this.W1.a0, this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
