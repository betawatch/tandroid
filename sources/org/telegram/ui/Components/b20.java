package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class b20 extends org.telegram.ui.ActionBar.w2 {
    public c5.k l1;
    public y10 m1;
    public LinearLayout n1;
    public TextView[] o1;
    public float p1;
    public int q1;

    public static void I0(org.telegram.ui.f30 f30Var) {
        TextView[] textViewArr = f30Var.o1;
        int i7 = f30Var.q1;
        TextView textView = textViewArr[i7];
        TextView textView2 = i7 < textViewArr.length + (-1) ? textViewArr[i7 + 1] : null;
        f30Var.b.getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (f30Var.b.getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * f30Var.p1;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = f30Var.q1;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = f30Var.p1;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = f30Var.p1;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        f30Var.n1.setTranslationX(measuredWidth2);
        f30Var.m1.invalidate();
    }
}
