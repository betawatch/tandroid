package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ck0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                ek0 ek0Var = (ek0) this.H;
                org.telegram.ui.Components.zc0 zc0Var = ek0Var.s;
                float f7 = (z10 || ek0Var.Q.isFocused()) ? 1.0f : 0.0f;
                zc0Var.b(f7, f7, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                ek0 ek0Var2 = (ek0) this.H;
                org.telegram.ui.Components.zc0 zc0Var2 = ek0Var2.s;
                float f10 = (z10 || ek0Var2.O.isFocused()) ? 1.0f : 0.0f;
                zc0Var2.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                vg0 vg0Var = (vg0) this.H;
                org.telegram.ui.Components.zc0 zc0Var3 = vg0Var.f;
                float f11 = (z10 || vg0Var.b.isFocused()) ? 1.0f : 0.0f;
                zc0Var3.b(f11, f11, true);
                if (z10) {
                    vg0Var.V.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                ek0 ek0Var = (ek0) this.H;
                if (i10 == 67 && ek0Var.Q.length() == 0) {
                    ek0Var.O.requestFocus();
                    ck0 ck0Var = ek0Var.O;
                    ck0Var.setSelection(ck0Var.length());
                    ek0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
