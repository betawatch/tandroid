package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ij0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij0(Object obj, Context context, int i10) {
        super(context);
        this.C = i10;
        this.D = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.C) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                kj0 kj0Var = (kj0) this.D;
                org.telegram.ui.Components.uc0 uc0Var = kj0Var.s;
                float f9 = (z10 || kj0Var.M.isFocused()) ? 1.0f : 0.0f;
                uc0Var.b(f9, f9, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                kj0 kj0Var2 = (kj0) this.D;
                org.telegram.ui.Components.uc0 uc0Var2 = kj0Var2.s;
                float f10 = (z10 || kj0Var2.K.isFocused()) ? 1.0f : 0.0f;
                uc0Var2.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                eg0 eg0Var = (eg0) this.D;
                org.telegram.ui.Components.uc0 uc0Var3 = eg0Var.f;
                float f11 = (z10 || eg0Var.b.isFocused()) ? 1.0f : 0.0f;
                uc0Var3.b(f11, f11, true);
                if (z10) {
                    eg0Var.R.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.C) {
            case 1:
                kj0 kj0Var = (kj0) this.D;
                if (i10 == 67 && kj0Var.M.length() == 0) {
                    kj0Var.K.requestFocus();
                    ij0 ij0Var = kj0Var.K;
                    ij0Var.setSelection(ij0Var.length());
                    kj0Var.K.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
