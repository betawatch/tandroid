package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.m9;
import org.telegram.ui.o30;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ o30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(o30 o30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = o30Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o30 o30Var = this.b;
        m9 m9Var = o30Var.J;
        TextView textView = o30Var.K;
        float f7 = o30Var.O;
        ShapeDrawable shapeDrawable = this.a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            m9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - ds.f.getInterpolation(f7);
            float left = (o30Var.P - getLeft()) * interpolation;
            float left2 = (o30Var.Q - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((o30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            m9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
