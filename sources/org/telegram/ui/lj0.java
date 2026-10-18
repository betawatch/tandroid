package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class lj0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                oj0 oj0Var = (oj0) this.H;
                org.telegram.ui.Components.sd0 sd0Var = oj0Var.s;
                float f7 = (z10 || oj0Var.Q.isFocused()) ? 1.0f : 0.0f;
                sd0Var.b(f7, f7, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                oj0 oj0Var2 = (oj0) this.H;
                org.telegram.ui.Components.sd0 sd0Var2 = oj0Var2.s;
                float f10 = (z10 || oj0Var2.O.isFocused()) ? 1.0f : 0.0f;
                sd0Var2.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                dg0 dg0Var = (dg0) this.H;
                org.telegram.ui.Components.sd0 sd0Var3 = dg0Var.f;
                float f11 = (z10 || dg0Var.b.isFocused()) ? 1.0f : 0.0f;
                sd0Var3.b(f11, f11, true);
                if (z10) {
                    dg0Var.V.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                oj0 oj0Var = (oj0) this.H;
                if (i10 == 67 && oj0Var.Q.length() == 0) {
                    oj0Var.O.requestFocus();
                    lj0 lj0Var = oj0Var.O;
                    lj0Var.setSelection(lj0Var.length());
                    oj0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
