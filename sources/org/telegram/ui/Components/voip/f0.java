package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.mr;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ x30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(x30 x30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = x30Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x30 x30Var = this.b;
        d9 d9Var = x30Var.G;
        TextView textView = x30Var.H;
        float f10 = x30Var.L;
        ShapeDrawable shapeDrawable = this.a;
        if (f10 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            d9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - mr.f.getInterpolation(f10);
            float left = (x30Var.M - getLeft()) * interpolation;
            float left2 = (x30Var.N - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((x30Var.O - getRight()) * interpolation)), getMeasuredHeight());
            d9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
