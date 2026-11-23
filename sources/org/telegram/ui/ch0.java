package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ch0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int b2;
    public final /* synthetic */ dh0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch0(dh0 dh0Var, Context context, int i7) {
        super(context);
        this.b2 = i7;
        this.c2 = dh0Var;
    }

    @Override // org.telegram.ui.Components.g30, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.b2) {
            case 1:
                this.M1.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.H6, false));
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        switch (this.b2) {
            case 0:
                super.onFocusChanged(z10, i7, rect);
                dh0 dh0Var = this.c2;
                org.telegram.ui.Components.vb0 vb0Var = dh0Var.t1;
                float f10 = (z10 || dh0Var.K1.isFocused()) ? 1.0f : 0.0f;
                vb0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i7, rect);
                dh0 dh0Var2 = this.c2;
                org.telegram.ui.Components.vb0 vb0Var2 = dh0Var2.t1;
                float f11 = (z10 || dh0Var2.I1.isFocused()) ? 1.0f : 0.0f;
                vb0Var2.b(f11, f11, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.b2) {
            case 1:
                if (i7 == 67) {
                    dh0 dh0Var = this.c2;
                    if (dh0Var.K1.length() == 0) {
                        dh0Var.I1.requestFocus();
                        ch0 ch0Var = dh0Var.I1;
                        ch0Var.setSelection(ch0Var.length());
                        dh0Var.I1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
