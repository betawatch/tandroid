package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class w30 extends org.telegram.ui.ActionBar.k3 {
    public a5.m b;
    public t30 c;
    public LinearLayout d;
    public TextView[] e;
    public float f;
    public int h;

    public static void m(org.telegram.ui.w40 w40Var) {
        TextView[] textViewArr = w40Var.e;
        int i10 = w40Var.h;
        TextView textView = textViewArr[i10];
        TextView textView2 = i10 < textViewArr.length + (-1) ? textViewArr[i10 + 1] : null;
        w40Var.containerView.getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (w40Var.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * w40Var.f;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = w40Var.h;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = w40Var.f;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = w40Var.f;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        w40Var.d.setTranslationX(measuredWidth2);
        w40Var.c.invalidate();
    }
}
