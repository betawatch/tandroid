package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ce0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int V1;
    public final /* synthetic */ ee0 W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce0(ee0 ee0Var, Context context, int i7) {
        super(context);
        this.V1 = i7;
        this.W1 = ee0Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z9, int i7, Rect rect) {
        int i10 = this.V1;
        float f10 = 1.0f;
        ee0 ee0Var = this.W1;
        switch (i10) {
            case 0:
                super.onFocusChanged(z9, i7, rect);
                org.telegram.ui.Components.lb0 lb0Var = ee0Var.f;
                if (!z9 && !ee0Var.b.isFocused()) {
                    f10 = 0.0f;
                }
                lb0Var.b(f10, f10, true);
                if (z9) {
                    ee0Var.g0.c.setEditText(this);
                    break;
                }
                break;
            default:
                super.onFocusChanged(z9, i7, rect);
                fe0 fe0Var = ee0Var.g0;
                org.telegram.ui.Components.lb0 lb0Var2 = ee0Var.f;
                if (!z9 && !ee0Var.a.isFocused()) {
                    f10 = 0.0f;
                }
                lb0Var2.b(f10, f10, true);
                if (!z9) {
                    if (ee0Var.E == 2) {
                        ee0Var.setCountryButtonText(null);
                        break;
                    }
                } else {
                    fe0Var.c.setEditText(this);
                    fe0Var.c.setDispatchBackWhenEmpty(true);
                    if (ee0Var.E == 2) {
                        ee0Var.setCountryButtonText(org.telegram.messenger.id.M0(2131742859, null));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        switch (this.V1) {
            case 1:
                ee0 ee0Var = this.W1;
                ce0 ce0Var = ee0Var.a;
                if (i7 == 67 && ee0Var.b.length() == 0) {
                    ce0Var.requestFocus();
                    ce0Var.setSelection(ce0Var.length());
                    ce0Var.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i7, keyEvent);
            default:
                return super.onKeyDown(i7, keyEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V1) {
            case 1:
                if (motionEvent.getAction() == 0 && !fe0.b1(this.W1.g0, this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
