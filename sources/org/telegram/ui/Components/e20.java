package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class e20 extends org.telegram.ui.ActionBar.u2 {
    public c5.l m1;
    public b20 n1;
    public LinearLayout o1;
    public TextView[] p1;
    public float q1;
    public int r1;

    public static void I0(org.telegram.ui.d30 d30Var) {
        TextView[] textViewArr = d30Var.p1;
        int i7 = d30Var.r1;
        TextView textView = textViewArr[i7];
        TextView textView2 = i7 < textViewArr.length + (-1) ? textViewArr[i7 + 1] : null;
        d30Var.b.getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (d30Var.b.getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * d30Var.q1;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = d30Var.r1;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = d30Var.q1;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = d30Var.q1;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        d30Var.o1.setTranslationX(measuredWidth2);
        d30Var.n1.invalidate();
    }
}
