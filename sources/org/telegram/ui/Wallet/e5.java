package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e5 extends EditTextBoldCursor {
    public int G1;
    public final org.telegram.ui.Components.w4 H1;
    public final org.telegram.ui.Components.e6 I1;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.J1 = p6Var;
        this.G1 = 960;
        this.H1 = new org.telegram.ui.Components.w4(this);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.I1 = e6Var;
        e6Var.n(0.2f, 160L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(15.33f));
        e6Var.b = 5;
        e6Var.setCallback(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.H1.a(org.telegram.ui.ActionBar.t6.w0(this.G1 <= 0 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.P5, this.J1), false);
        org.telegram.ui.Components.e6 e6Var = this.I1;
        e6Var.u(a2);
        int L = org.telegram.messenger.i0.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
        int height = getHeight() + getScrollY();
        e6Var.setBounds(L - org.telegram.messenger.i0.L(48.0f), height - Math.min(org.telegram.messenger.i0.L(44.0f), getHeight()), L, height);
        e6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        org.telegram.ui.Components.e6 e6Var = this.I1;
        if (e6Var == null) {
            return;
        }
        this.G1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        e6Var.a();
        int i13 = this.G1;
        e6Var.t(i13 <= 100 ? Integer.toString(i13) : "", isAttachedToWindow(), true);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.I1 || super.verifyDrawable(drawable);
    }
}
