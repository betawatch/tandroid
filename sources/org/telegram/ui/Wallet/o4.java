package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o4 extends EditTextBoldCursor {
    public int b;
    public final org.telegram.ui.Components.j5 c;
    public final org.telegram.ui.Components.r6 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = u6Var;
        this.b = 960;
        this.c = new org.telegram.ui.Components.j5(this);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.d = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.b = 5;
        r6Var.setCallback(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.c.a(org.telegram.ui.ActionBar.y6.w0(this.b <= 0 ? org.telegram.ui.ActionBar.y6.p7 : org.telegram.ui.ActionBar.y6.P5, this.e), false);
        org.telegram.ui.Components.r6 r6Var = this.d;
        r6Var.u(a2);
        int dp = AndroidUtilities.dp(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
        int height = getHeight() + getScrollY();
        r6Var.setBounds(dp - AndroidUtilities.dp(48.0f), height - Math.min(AndroidUtilities.dp(44.0f), getHeight()), dp, height);
        r6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.lu, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.lu, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        org.telegram.ui.Components.r6 r6Var = this.d;
        if (r6Var == null) {
            return;
        }
        this.b = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        r6Var.a();
        int i13 = this.b;
        r6Var.t(i13 <= 100 ? Integer.toString(i13) : "", isAttachedToWindow(), true);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
