package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.w30;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ w30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(w30 w30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = w30Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        w30 w30Var = this.b;
        d9 d9Var = w30Var.G;
        TextView textView = w30Var.H;
        float f10 = w30Var.L;
        ShapeDrawable shapeDrawable = this.a;
        if (f10 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            d9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - pr.f.getInterpolation(f10);
            float left = (w30Var.M - getLeft()) * interpolation;
            float left2 = (w30Var.N - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((w30Var.O - getRight()) * interpolation)), getMeasuredHeight());
            d9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
