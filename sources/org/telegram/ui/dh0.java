package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dh0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int b2;
    public final /* synthetic */ eh0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh0(eh0 eh0Var, Context context, int i7) {
        super(context);
        this.b2 = i7;
        this.c2 = eh0Var;
    }

    @Override // org.telegram.ui.Components.g30, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.b2) {
            case 1:
                this.M1.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.H6, false));
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        switch (this.b2) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                eh0 eh0Var = this.c2;
                org.telegram.ui.Components.xb0 xb0Var = eh0Var.t1;
                float f10 = (z10 || eh0Var.K1.isFocused()) ? 1.0f : 0.0f;
                xb0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i7, rect);
                eh0 eh0Var2 = this.c2;
                org.telegram.ui.Components.xb0 xb0Var2 = eh0Var2.t1;
                float f11 = (z10 || eh0Var2.I1.isFocused()) ? 1.0f : 0.0f;
                xb0Var2.b(f11, f11, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.b2) {
            case 1:
                if (i7 == 67) {
                    eh0 eh0Var = this.c2;
                    if (eh0Var.K1.length() == 0) {
                        eh0Var.I1.requestFocus();
                        dh0 dh0Var = eh0Var.I1;
                        dh0Var.setSelection(dh0Var.length());
                        eh0Var.I1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
