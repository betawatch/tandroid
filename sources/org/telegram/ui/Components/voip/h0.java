package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.qr;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class h0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ c40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(c40 c40Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = c40Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c40 c40Var = this.b;
        i9 i9Var = c40Var.J;
        TextView textView = c40Var.K;
        float f7 = c40Var.O;
        ShapeDrawable shapeDrawable = this.a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            i9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - qr.f.getInterpolation(f7);
            float left = (c40Var.P - getLeft()) * interpolation;
            float left2 = (c40Var.Q - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((c40Var.R - getRight()) * interpolation)), getMeasuredHeight());
            i9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
