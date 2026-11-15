package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class c5 extends EditTextBoldCursor {
    public int M1;
    public final org.telegram.ui.Components.x4 N1;
    public final org.telegram.ui.Components.g6 O1;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 P1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.P1 = e6Var;
        this.M1 = 960;
        this.N1 = new org.telegram.ui.Components.x4(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.O1 = g6Var;
        g6Var.n(0.2f, 160L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.b = 5;
        g6Var.setCallback(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a10 = this.N1.a(org.telegram.ui.ActionBar.j6.w0(this.M1 <= 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.P5, this.P1), false);
        org.telegram.ui.Components.g6 g6Var = this.O1;
        g6Var.u(a10);
        int L = org.telegram.messenger.g0.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
        int height = getHeight() + getScrollY();
        g6Var.setBounds(L - org.telegram.messenger.g0.L(48.0f), height - Math.min(org.telegram.messenger.g0.L(44.0f), getHeight()), L, height);
        g6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.kt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.kt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.g6 g6Var = this.O1;
        if (g6Var == null) {
            return;
        }
        this.M1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        g6Var.a();
        int i12 = this.M1;
        g6Var.t(i12 <= 100 ? Integer.toString(i12) : "", isAttachedToWindow(), true);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.O1 || super.verifyDrawable(drawable);
    }
}
