package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class bk0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                dk0 dk0Var = (dk0) this.H;
                org.telegram.ui.Components.zd0 zd0Var = dk0Var.s;
                float f7 = (z10 || dk0Var.Q.isFocused()) ? 1.0f : 0.0f;
                zd0Var.b(f7, f7, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                dk0 dk0Var2 = (dk0) this.H;
                org.telegram.ui.Components.zd0 zd0Var2 = dk0Var2.s;
                float f10 = (z10 || dk0Var2.O.isFocused()) ? 1.0f : 0.0f;
                zd0Var2.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                vg0 vg0Var = (vg0) this.H;
                org.telegram.ui.Components.zd0 zd0Var3 = vg0Var.f;
                float f11 = (z10 || vg0Var.b.isFocused()) ? 1.0f : 0.0f;
                zd0Var3.b(f11, f11, true);
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
                dk0 dk0Var = (dk0) this.H;
                if (i10 == 67 && dk0Var.Q.length() == 0) {
                    dk0Var.O.requestFocus();
                    bk0 bk0Var = dk0Var.O;
                    bk0Var.setSelection(bk0Var.length());
                    dk0Var.O.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
