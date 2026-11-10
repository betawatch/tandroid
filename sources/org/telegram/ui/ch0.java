package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ch0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int V1;
    public final /* synthetic */ dh0 W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch0(dh0 dh0Var, Context context, int i7) {
        super(context);
        this.V1 = i7;
        this.W1 = dh0Var;
    }

    @Override // org.telegram.ui.Components.v20, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ct, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.V1) {
            case 1:
                this.G1.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.H6, false));
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z9, int i7, Rect rect) {
        switch (this.V1) {
            case 0:
                super.onFocusChanged(z9, i7, rect);
                dh0 dh0Var = this.W1;
                org.telegram.ui.Components.lb0 lb0Var = dh0Var.s1;
                float f10 = (z9 || dh0Var.J1.isFocused()) ? 1.0f : 0.0f;
                lb0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z9, i7, rect);
                dh0 dh0Var2 = this.W1;
                org.telegram.ui.Components.lb0 lb0Var2 = dh0Var2.s1;
                float f11 = (z9 || dh0Var2.H1.isFocused()) ? 1.0f : 0.0f;
                lb0Var2.b(f11, f11, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                if (i7 == 67) {
                    dh0 dh0Var = this.W1;
                    if (dh0Var.J1.length() == 0) {
                        dh0Var.H1.requestFocus();
                        ch0 ch0Var = dh0Var.H1;
                        ch0Var.setSelection(ch0Var.length());
                        dh0Var.H1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
