package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kj0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj0(Object obj, Context context, int i9) {
        super(context);
        this.C = i9;
        this.D = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i9, Rect rect) {
        switch (this.C) {
            case 0:
                super.onFocusChanged(z10, i9, rect);
                nj0 nj0Var = (nj0) this.D;
                org.telegram.ui.Components.fc0 fc0Var = nj0Var.s;
                float f10 = (z10 || nj0Var.M.isFocused()) ? 1.0f : 0.0f;
                fc0Var.b(f10, f10, true);
                break;
            case 1:
                super.onFocusChanged(z10, i9, rect);
                nj0 nj0Var2 = (nj0) this.D;
                org.telegram.ui.Components.fc0 fc0Var2 = nj0Var2.s;
                float f11 = (z10 || nj0Var2.K.isFocused()) ? 1.0f : 0.0f;
                fc0Var2.b(f11, f11, true);
                break;
            default:
                super.onFocusChanged(z10, i9, rect);
                eg0 eg0Var = (eg0) this.D;
                org.telegram.ui.Components.fc0 fc0Var3 = eg0Var.f;
                float f12 = (z10 || eg0Var.b.isFocused()) ? 1.0f : 0.0f;
                fc0Var3.b(f12, f12, true);
                if (z10) {
                    eg0Var.R.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        switch (this.C) {
            case 1:
                nj0 nj0Var = (nj0) this.D;
                if (i9 == 67 && nj0Var.M.length() == 0) {
                    nj0Var.K.requestFocus();
                    kj0 kj0Var = nj0Var.K;
                    kj0Var.setSelection(kj0Var.length());
                    nj0Var.K.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i9, keyEvent);
            default:
                return super.onKeyDown(i9, keyEvent);
        }
    }
}
