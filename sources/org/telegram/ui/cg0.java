package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cg0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ fg0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg0(fg0 fg0Var, Context context) {
        super(context);
        this.G = fg0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        fg0 fg0Var = this.G;
        gg0 gg0Var = fg0Var.a0;
        org.telegram.ui.Components.rd0 rd0Var = fg0Var.f;
        float f7 = (z10 || fg0Var.a.isFocused()) ? 1.0f : 0.0f;
        rd0Var.b(f7, f7, true);
        if (!z10) {
            if (fg0Var.E == 2) {
                fg0Var.setCountryButtonText(null);
            }
        } else {
            gg0Var.c.setEditText(this);
            gg0Var.c.setDispatchBackWhenEmpty(true);
            if (fg0Var.E == 2) {
                fg0Var.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        fg0 fg0Var = this.G;
        mj0 mj0Var = fg0Var.a;
        if (i10 == 67 && fg0Var.b.length() == 0) {
            mj0Var.requestFocus();
            mj0Var.setSelection(mj0Var.length());
            mj0Var.dispatchKeyEvent(keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !gg0.W0(this.G.a0, this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
