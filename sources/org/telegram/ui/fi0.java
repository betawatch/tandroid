package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fi0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int V1;
    public final /* synthetic */ gi0 W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fi0(gi0 gi0Var, Context context, int i10) {
        super(context);
        this.V1 = i10;
        this.W1 = gi0Var;
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
                gi0 gi0Var = this.W1;
                org.telegram.ui.Components.ec0 ec0Var = gi0Var.p1;
                float f7 = (z10 || gi0Var.G1.isFocused()) ? 1.0f : 0.0f;
                ec0Var.b(f7, f7, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                gi0 gi0Var2 = this.W1;
                org.telegram.ui.Components.ec0 ec0Var2 = gi0Var2.p1;
                float f10 = (z10 || gi0Var2.E1.isFocused()) ? 1.0f : 0.0f;
                ec0Var2.b(f10, f10, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                if (i10 == 67) {
                    gi0 gi0Var = this.W1;
                    if (gi0Var.G1.length() == 0) {
                        gi0Var.E1.requestFocus();
                        fi0 fi0Var = gi0Var.E1;
                        fi0Var.setSelection(fi0Var.length());
                        gi0Var.E1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
