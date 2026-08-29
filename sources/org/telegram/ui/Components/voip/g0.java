package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.j30;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ j30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j30 j30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = j30Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j30 j30Var = this.b;
        h9 h9Var = j30Var.F;
        TextView textView = j30Var.G;
        float f9 = j30Var.K;
        ShapeDrawable shapeDrawable = this.a;
        if (f9 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            h9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - jr.f.getInterpolation(f9);
            float left = (j30Var.L - getLeft()) * interpolation;
            float left2 = (j30Var.M - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((j30Var.N - getRight()) * interpolation)), getMeasuredHeight());
            h9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
