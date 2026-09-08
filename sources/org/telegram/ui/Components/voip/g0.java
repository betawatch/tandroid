package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.a40;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class g0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ a40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(a40 a40Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = a40Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a40 a40Var = this.b;
        l9 l9Var = a40Var.J;
        TextView textView = a40Var.K;
        float f7 = a40Var.O;
        ShapeDrawable shapeDrawable = this.a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            l9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - pr.f.getInterpolation(f7);
            float left = (a40Var.P - getLeft()) * interpolation;
            float left2 = (a40Var.Q - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((a40Var.R - getRight()) * interpolation)), getMeasuredHeight());
            l9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
