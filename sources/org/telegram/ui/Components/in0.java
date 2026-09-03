package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class in0 extends EditTextBoldCursor {
    public final c5 b;
    public int c;
    public final j6 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = g6Var;
        this.b = new c5(this);
        j6 j6Var = new j6(false, true, true, false);
        this.d = j6Var;
        j6Var.k(0.2f, 160L, pr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.setCallback(this);
        j6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.b.a(org.telegram.ui.ActionBar.k6.v0(this.c < 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.P5, this.e), false);
        j6 j6Var = this.d;
        j6Var.r(a2);
        j6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        j6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.zt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        j6 j6Var = this.d;
        if (j6Var != null) {
            this.c = 12 - charSequence.length();
            j6Var.b();
            String str = "";
            if (this.c <= 4) {
                str = "" + this.c;
            }
            j6Var.q(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
