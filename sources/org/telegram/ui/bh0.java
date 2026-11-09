package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class bh0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int V1;
    public final /* synthetic */ ch0 W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh0(ch0 ch0Var, Context context, int i7) {
        super(context);
        this.V1 = i7;
        this.W1 = ch0Var;
    }

    @Override // org.telegram.ui.Components.w20, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.dt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.V1) {
            case 1:
                this.G1.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.H6, false));
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
                ch0 ch0Var = this.W1;
                org.telegram.ui.Components.mb0 mb0Var = ch0Var.p1;
                float f10 = (z9 || ch0Var.G1.isFocused()) ? 1.0f : 0.0f;
                mb0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z9, i7, rect);
                ch0 ch0Var2 = this.W1;
                org.telegram.ui.Components.mb0 mb0Var2 = ch0Var2.p1;
                float f11 = (z9 || ch0Var2.E1.isFocused()) ? 1.0f : 0.0f;
                mb0Var2.b(f11, f11, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                if (i7 == 67) {
                    ch0 ch0Var = this.W1;
                    if (ch0Var.G1.length() == 0) {
                        ch0Var.E1.requestFocus();
                        bh0 bh0Var = ch0Var.E1;
                        bh0Var.setSelection(bh0Var.length());
                        ch0Var.E1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
