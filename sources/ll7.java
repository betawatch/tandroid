// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ll7 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ byte c2;
    public final /* synthetic */ ml7 d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ll7(ml7 ml7Var, Context context, byte b) {
        super(context);
        this.c2 = b;
        this.d2 = ml7Var;
    }

    @Override // dg5, org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.c2) {
            case 1:
                this.M1.setColor(cmb.w0(null, cmb.G6, false));
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        byte b = this.c2;
        float f = 1.0f;
        ml7 ml7Var = this.d2;
        switch (b) {
            case 0:
                super.onFocusChanged(z, i, rect);
                gt7 gt7Var = ml7Var.s1;
                if (!z && !ml7Var.J1.isFocused()) {
                    f = 0.0f;
                }
                gt7Var.b(f, f, true);
                break;
            default:
                super.onFocusChanged(z, i, rect);
                gt7 gt7Var2 = ml7Var.s1;
                if (!z && !ml7Var.H1.isFocused()) {
                    f = 0.0f;
                }
                gt7Var2.b(f, f, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (this.c2) {
            case 1:
                if (i == 67) {
                    ml7 ml7Var = this.d2;
                    if (ml7Var.J1.length() == 0) {
                        ml7Var.H1.requestFocus();
                        ll7 ll7Var = ml7Var.H1;
                        ll7Var.setSelection(ll7Var.length());
                        ml7Var.H1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i, keyEvent);
            default:
                return super.onKeyDown(i, keyEvent);
        }
    }
}
