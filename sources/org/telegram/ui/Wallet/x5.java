package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.cs;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class x5 extends cs {
    public final ShapeDrawable H;
    public final /* synthetic */ n6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(n6 n6Var, Context context) {
        super(context);
        this.I = n6Var;
        this.H = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), n6Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
    }

    @Override // org.telegram.ui.Components.cs, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
