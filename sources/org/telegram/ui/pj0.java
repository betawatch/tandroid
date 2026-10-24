package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class pj0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.o40, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ku, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.G) {
            case 1:
                this.b.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                rj0 rj0Var = (rj0) this.H;
                org.telegram.ui.Components.vd0 vd0Var = rj0Var.r;
                float f7 = (z10 || rj0Var.P.isFocused()) ? 1.0f : 0.0f;
                vd0Var.b(f7, f7, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                rj0 rj0Var2 = (rj0) this.H;
                org.telegram.ui.Components.vd0 vd0Var2 = rj0Var2.r;
                float f10 = (z10 || rj0Var2.N.isFocused()) ? 1.0f : 0.0f;
                vd0Var2.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                hg0 hg0Var = (hg0) this.H;
                org.telegram.ui.Components.vd0 vd0Var3 = hg0Var.f;
                float f11 = (z10 || hg0Var.b.isFocused()) ? 1.0f : 0.0f;
                vd0Var3.b(f11, f11, true);
                if (z10) {
                    hg0Var.a0.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                rj0 rj0Var = (rj0) this.H;
                if (i10 == 67 && rj0Var.P.length() == 0) {
                    rj0Var.N.requestFocus();
                    pj0 pj0Var = rj0Var.N;
                    pj0Var.setSelection(pj0Var.length());
                    rj0Var.N.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
