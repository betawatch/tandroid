package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.n9;
import org.telegram.ui.e40;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class g0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ e40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e40 e40Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = e40Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e40 e40Var = this.b;
        n9 n9Var = e40Var.J;
        TextView textView = e40Var.K;
        float f7 = e40Var.O;
        ShapeDrawable shapeDrawable = this.a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            n9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - es.f.getInterpolation(f7);
            float left = (e40Var.P - getLeft()) * interpolation;
            float left2 = (e40Var.Q - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((e40Var.R - getRight()) * interpolation)), getMeasuredHeight());
            n9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
