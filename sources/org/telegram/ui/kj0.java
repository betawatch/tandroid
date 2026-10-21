package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class kj0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                mj0 mj0Var = (mj0) this.H;
                org.telegram.ui.Components.sd0 sd0Var = mj0Var.s;
                float f7 = (z10 || mj0Var.Q.isFocused()) ? 1.0f : 0.0f;
                sd0Var.b(f7, f7, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                mj0 mj0Var2 = (mj0) this.H;
                org.telegram.ui.Components.sd0 sd0Var2 = mj0Var2.s;
                float f10 = (z10 || mj0Var2.O.isFocused()) ? 1.0f : 0.0f;
                sd0Var2.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                cg0 cg0Var = (cg0) this.H;
                org.telegram.ui.Components.sd0 sd0Var3 = cg0Var.f;
                float f11 = (z10 || cg0Var.b.isFocused()) ? 1.0f : 0.0f;
                sd0Var3.b(f11, f11, true);
                if (z10) {
                    cg0Var.V.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                mj0 mj0Var = (mj0) this.H;
                if (i10 == 67 && mj0Var.Q.length() == 0) {
                    mj0Var.O.requestFocus();
                    kj0 kj0Var = mj0Var.O;
                    kj0Var.setSelection(kj0Var.length());
                    mj0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
