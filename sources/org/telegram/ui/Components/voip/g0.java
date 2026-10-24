package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.k9;
import org.telegram.ui.k30;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class g0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ k30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k30 k30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = k30Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        k30 k30Var = this.b;
        k9 k9Var = k30Var.J;
        TextView textView = k30Var.K;
        float f7 = k30Var.O;
        ShapeDrawable shapeDrawable = this.a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            k9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - bs.f.getInterpolation(f7);
            float left = (k30Var.P - getLeft()) * interpolation;
            float left2 = (k30Var.Q - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((k30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            k9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
