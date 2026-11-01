package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class di0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int V1;
    public final /* synthetic */ ei0 W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di0(ei0 ei0Var, Context context, int i10) {
        super(context);
        this.V1 = i10;
        this.W1 = ei0Var;
    }

    @Override // org.telegram.ui.Components.n30, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.V1) {
            case 1:
                this.G1.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.H6, false));
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.V1) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                ei0 ei0Var = this.W1;
                org.telegram.ui.Components.ec0 ec0Var = ei0Var.p1;
                float f7 = (z10 || ei0Var.G1.isFocused()) ? 1.0f : 0.0f;
                ec0Var.b(f7, f7, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                ei0 ei0Var2 = this.W1;
                org.telegram.ui.Components.ec0 ec0Var2 = ei0Var2.p1;
                float f10 = (z10 || ei0Var2.E1.isFocused()) ? 1.0f : 0.0f;
                ec0Var2.b(f10, f10, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                if (i10 == 67) {
                    ei0 ei0Var = this.W1;
                    if (ei0Var.G1.length() == 0) {
                        ei0Var.E1.requestFocus();
                        di0 di0Var = ei0Var.E1;
                        di0Var.setSelection(di0Var.length());
                        ei0Var.E1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
