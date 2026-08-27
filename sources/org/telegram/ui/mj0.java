package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mj0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj0(Object obj, Context context, int i10) {
        super(context);
        this.C = i10;
        this.D = obj;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.C) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                oj0 oj0Var = (oj0) this.D;
                org.telegram.ui.Components.jc0 jc0Var = oj0Var.s;
                float f10 = (z10 || oj0Var.M.isFocused()) ? 1.0f : 0.0f;
                jc0Var.b(f10, f10, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                oj0 oj0Var2 = (oj0) this.D;
                org.telegram.ui.Components.jc0 jc0Var2 = oj0Var2.s;
                float f11 = (z10 || oj0Var2.K.isFocused()) ? 1.0f : 0.0f;
                jc0Var2.b(f11, f11, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                hg0 hg0Var = (hg0) this.D;
                org.telegram.ui.Components.jc0 jc0Var3 = hg0Var.f;
                float f12 = (z10 || hg0Var.b.isFocused()) ? 1.0f : 0.0f;
                jc0Var3.b(f12, f12, true);
                if (z10) {
                    hg0Var.R.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.C) {
            case 1:
                oj0 oj0Var = (oj0) this.D;
                if (i10 == 67 && oj0Var.M.length() == 0) {
                    oj0Var.K.requestFocus();
                    mj0 mj0Var = oj0Var.K;
                    mj0Var.setSelection(mj0Var.length());
                    oj0Var.K.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
