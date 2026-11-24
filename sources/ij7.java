// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ij7 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ byte c2;
    public final /* synthetic */ jj7 d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij7(jj7 jj7Var, Context context, byte b) {
        super(context);
        this.c2 = b;
        this.d2 = jj7Var;
    }

    @Override // fe5, org.telegram.ui.Components.EditTextBoldCursor, lt3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.c2) {
            case 1:
                this.M1.setColor(bkb.w0(null, bkb.G6, false));
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
        jj7 jj7Var = this.d2;
        switch (b) {
            case 0:
                super.onFocusChanged(z, i, rect);
                er7 er7Var = jj7Var.s1;
                if (!z && !jj7Var.J1.isFocused()) {
                    f = 0.0f;
                }
                er7Var.b(f, f, true);
                break;
            default:
                super.onFocusChanged(z, i, rect);
                er7 er7Var2 = jj7Var.s1;
                if (!z && !jj7Var.H1.isFocused()) {
                    f = 0.0f;
                }
                er7Var2.b(f, f, true);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (this.c2) {
            case 1:
                if (i == 67) {
                    jj7 jj7Var = this.d2;
                    if (jj7Var.J1.length() == 0) {
                        jj7Var.H1.requestFocus();
                        ij7 ij7Var = jj7Var.H1;
                        ij7Var.setSelection(ij7Var.length());
                        jj7Var.H1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i, keyEvent);
            default:
                return super.onKeyDown(i, keyEvent);
        }
    }
}
