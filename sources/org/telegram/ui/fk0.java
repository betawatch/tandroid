package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fk0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                hk0 hk0Var = (hk0) this.H;
                org.telegram.ui.Components.yd0 yd0Var = hk0Var.s;
                float f7 = (z10 || hk0Var.Q.isFocused()) ? 1.0f : 0.0f;
                yd0Var.b(f7, f7, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                hk0 hk0Var2 = (hk0) this.H;
                org.telegram.ui.Components.yd0 yd0Var2 = hk0Var2.s;
                float f10 = (z10 || hk0Var2.O.isFocused()) ? 1.0f : 0.0f;
                yd0Var2.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                zg0 zg0Var = (zg0) this.H;
                org.telegram.ui.Components.yd0 yd0Var3 = zg0Var.f;
                float f11 = (z10 || zg0Var.b.isFocused()) ? 1.0f : 0.0f;
                yd0Var3.b(f11, f11, true);
                if (z10) {
                    zg0Var.V.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                hk0 hk0Var = (hk0) this.H;
                if (i10 == 67 && hk0Var.Q.length() == 0) {
                    hk0Var.O.requestFocus();
                    fk0 fk0Var = hk0Var.O;
                    fk0Var.setSelection(fk0Var.length());
                    hk0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
