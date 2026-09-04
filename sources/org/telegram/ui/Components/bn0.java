package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class bn0 extends EditTextBoldCursor {
    public final h5 b;
    public int c;
    public final p6 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = f6Var;
        this.b = new h5(this);
        p6 p6Var = new p6(false, true, true, false);
        this.d = p6Var;
        p6Var.k(0.2f, 160L, pr.h);
        p6Var.t(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.b.a(org.telegram.ui.ActionBar.j6.v0(this.c < 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.P5, this.e), false);
        p6 p6Var = this.d;
        p6Var.r(a2);
        p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        p6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bu, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p6 p6Var = this.d;
        if (p6Var != null) {
            this.c = 12 - charSequence.length();
            p6Var.b();
            String str = "";
            if (this.c <= 4) {
                str = "" + this.c;
            }
            p6Var.q(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
