package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.b40;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ b40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(b40 b40Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = b40Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b40 b40Var = this.b;
        j9 j9Var = b40Var.J;
        TextView textView = b40Var.K;
        float f7 = b40Var.O;
        ShapeDrawable shapeDrawable = this.a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            j9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - wr.f.getInterpolation(f7);
            float left = (b40Var.P - getLeft()) * interpolation;
            float left2 = (b40Var.Q - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((b40Var.R - getRight()) * interpolation)), getMeasuredHeight());
            j9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
