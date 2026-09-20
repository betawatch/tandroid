package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.qr;
import org.telegram.ui.a40;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class h0 extends FrameLayout {
    public final /* synthetic */ ShapeDrawable a;
    public final /* synthetic */ a40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(a40 a40Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.b = a40Var;
        this.a = shapeDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a40 a40Var = this.b;
        j9 j9Var = a40Var.J;
        TextView textView = a40Var.K;
        float f7 = a40Var.O;
        ShapeDrawable shapeDrawable = this.a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            j9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - qr.f.getInterpolation(f7);
            float left = (a40Var.P - getLeft()) * interpolation;
            float left2 = (a40Var.Q - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((a40Var.R - getRight()) * interpolation)), getMeasuredHeight());
            j9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
