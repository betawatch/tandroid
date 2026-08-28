package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.g30;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ g30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g30 g30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = g30Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g30 g30Var = this.b;
        c9 c9Var = g30Var.F;
        TextView textView = g30Var.G;
        float f10 = g30Var.K;
        ShapeDrawable shapeDrawable = this.a;
        if (f10 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            c9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - gr.f.getInterpolation(f10);
            float left = (g30Var.L - getLeft()) * interpolation;
            float left2 = (g30Var.M - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((g30Var.N - getRight()) * interpolation)), getMeasuredHeight());
            c9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
