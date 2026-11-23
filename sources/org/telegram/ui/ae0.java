package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ae0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int b2;
    public final /* synthetic */ ce0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae0(ce0 ce0Var, Context context, int i7) {
        super(context);
        this.b2 = i7;
        this.c2 = ce0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        int i10 = this.b2;
        float f10 = 1.0f;
        ce0 ce0Var = this.c2;
        switch (i10) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                org.telegram.ui.Components.yb0 yb0Var = ce0Var.f;
                if (!z10 && !ce0Var.b.isFocused()) {
                    f10 = 0.0f;
                }
                yb0Var.b(f10, f10, true);
                if (z10) {
                    ce0Var.h0.c.setEditText(this);
                    break;
                }
                break;
            default:
                super.onFocusChanged(z10, i7, rect);
                de0 de0Var = ce0Var.h0;
                org.telegram.ui.Components.yb0 yb0Var2 = ce0Var.f;
                if (!z10 && !ce0Var.a.isFocused()) {
                    f10 = 0.0f;
                }
                yb0Var2.b(f10, f10, true);
                if (!z10) {
                    if (ce0Var.F == 2) {
                        ce0Var.setCountryButtonText(null);
                        break;
                    }
                } else {
                    de0Var.c.setEditText(this);
                    de0Var.c.setDispatchBackWhenEmpty(true);
                    if (ce0Var.F == 2) {
                        ce0Var.setCountryButtonText(org.telegram.messenger.hd.N0(2131742593, null));
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
                ce0 ce0Var = this.c2;
                ae0 ae0Var = ce0Var.a;
                if (i7 == 67 && ce0Var.b.length() == 0) {
                    ae0Var.requestFocus();
                    ae0Var.setSelection(ae0Var.length());
                    ae0Var.dispatchKeyEvent(keyEvent);
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
                if (motionEvent.getAction() == 0 && !de0.b1(this.c2.h0, this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
