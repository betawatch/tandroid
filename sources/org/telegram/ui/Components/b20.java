package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class b20 extends org.telegram.ui.ActionBar.v2 {
    public c5.k i1;
    public y10 j1;
    public LinearLayout k1;
    public TextView[] l1;
    public float m1;
    public int n1;

    public static void I0(org.telegram.ui.c30 c30Var) {
        TextView[] textViewArr = c30Var.l1;
        int i7 = c30Var.n1;
        TextView textView = textViewArr[i7];
        TextView textView2 = i7 < textViewArr.length + (-1) ? textViewArr[i7 + 1] : null;
        c30Var.b.getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (c30Var.b.getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * c30Var.m1;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = c30Var.n1;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = c30Var.m1;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = c30Var.m1;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        c30Var.k1.setTranslationX(measuredWidth2);
        c30Var.j1.invalidate();
    }
}
