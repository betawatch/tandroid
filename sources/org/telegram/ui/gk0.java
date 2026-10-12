package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gk0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                ik0 ik0Var = (ik0) this.H;
                org.telegram.ui.Components.yd0 yd0Var = ik0Var.s;
                float f7 = (z10 || ik0Var.Q.isFocused()) ? 1.0f : 0.0f;
                yd0Var.b(f7, f7, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                ik0 ik0Var2 = (ik0) this.H;
                org.telegram.ui.Components.yd0 yd0Var2 = ik0Var2.s;
                float f10 = (z10 || ik0Var2.O.isFocused()) ? 1.0f : 0.0f;
                yd0Var2.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                ah0 ah0Var = (ah0) this.H;
                org.telegram.ui.Components.yd0 yd0Var3 = ah0Var.f;
                float f11 = (z10 || ah0Var.b.isFocused()) ? 1.0f : 0.0f;
                yd0Var3.b(f11, f11, true);
                if (z10) {
                    ah0Var.V.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                ik0 ik0Var = (ik0) this.H;
                if (i10 == 67 && ik0Var.Q.length() == 0) {
                    ik0Var.O.requestFocus();
                    gk0 gk0Var = ik0Var.O;
                    gk0Var.setSelection(gk0Var.length());
                    ik0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
