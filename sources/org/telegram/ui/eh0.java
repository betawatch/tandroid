package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class eh0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int b2;
    public final /* synthetic */ fh0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh0(fh0 fh0Var, Context context, int i7) {
        super(context);
        this.b2 = i7;
        this.c2 = fh0Var;
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
                fh0 fh0Var = this.c2;
                org.telegram.ui.Components.xb0 xb0Var = fh0Var.t1;
                float f10 = (z10 || fh0Var.K1.isFocused()) ? 1.0f : 0.0f;
                xb0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i7, rect);
                fh0 fh0Var2 = this.c2;
                org.telegram.ui.Components.xb0 xb0Var2 = fh0Var2.t1;
                float f11 = (z10 || fh0Var2.I1.isFocused()) ? 1.0f : 0.0f;
                xb0Var2.b(f11, f11, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.b2) {
            case 1:
                if (i7 == 67) {
                    fh0 fh0Var = this.c2;
                    if (fh0Var.K1.length() == 0) {
                        fh0Var.I1.requestFocus();
                        eh0 eh0Var = fh0Var.I1;
                        eh0Var.setSelection(eh0Var.length());
                        fh0Var.I1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }
}
