package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ak0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                ck0 ck0Var = (ck0) this.H;
                org.telegram.ui.Components.yc0 yc0Var = ck0Var.s;
                float f7 = (z10 || ck0Var.Q.isFocused()) ? 1.0f : 0.0f;
                yc0Var.b(f7, f7, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                ck0 ck0Var2 = (ck0) this.H;
                org.telegram.ui.Components.yc0 yc0Var2 = ck0Var2.s;
                float f10 = (z10 || ck0Var2.O.isFocused()) ? 1.0f : 0.0f;
                yc0Var2.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                vg0 vg0Var = (vg0) this.H;
                org.telegram.ui.Components.yc0 yc0Var3 = vg0Var.f;
                float f11 = (z10 || vg0Var.b.isFocused()) ? 1.0f : 0.0f;
                yc0Var3.b(f11, f11, true);
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
                ck0 ck0Var = (ck0) this.H;
                if (i10 == 67 && ck0Var.Q.length() == 0) {
                    ck0Var.O.requestFocus();
                    ak0 ak0Var = ck0Var.O;
                    ak0Var.setSelection(ak0Var.length());
                    ck0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
