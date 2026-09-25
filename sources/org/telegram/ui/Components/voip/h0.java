package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.rr;
import org.telegram.ui.v30;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class h0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ v30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(v30 v30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = v30Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        v30 v30Var = this.b;
        k9 k9Var = v30Var.J;
        TextView textView = v30Var.K;
        float f7 = v30Var.O;
        ShapeDrawable shapeDrawable = this.a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            k9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - rr.f.getInterpolation(f7);
            float left = (v30Var.P - getLeft()) * interpolation;
            float left2 = (v30Var.Q - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((v30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            k9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
