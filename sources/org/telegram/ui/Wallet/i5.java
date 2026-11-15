package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.vr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class i5 extends vr {
    public final ShapeDrawable H;
    public final /* synthetic */ y5 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(y5 y5Var, Context context) {
        super(context);
        this.I = y5Var;
        this.H = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), y5Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
    }

    @Override // org.telegram.ui.Components.vr, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
