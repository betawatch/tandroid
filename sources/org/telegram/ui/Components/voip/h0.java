package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.rr;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class h0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ x30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(x30 x30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = x30Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x30 x30Var = this.b;
        k9 k9Var = x30Var.J;
        TextView textView = x30Var.K;
        float f7 = x30Var.O;
        ShapeDrawable shapeDrawable = this.a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            k9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - rr.f.getInterpolation(f7);
            float left = (x30Var.P - getLeft()) * interpolation;
            float left2 = (x30Var.Q - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((x30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            k9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
