package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class r20 extends org.telegram.ui.ActionBar.z2 {
    public z4.g i1;
    public p20 j1;
    public LinearLayout k1;
    public TextView[] l1;
    public float m1;
    public int n1;

    public static void I0(org.telegram.ui.a40 a40Var) {
        TextView[] textViewArr = a40Var.l1;
        int i10 = a40Var.n1;
        TextView textView = textViewArr[i10];
        TextView textView2 = i10 < textViewArr.length + (-1) ? textViewArr[i10 + 1] : null;
        a40Var.b.getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (a40Var.b.getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * a40Var.m1;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = a40Var.n1;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = a40Var.m1;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = a40Var.m1;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        a40Var.k1.setTranslationX(measuredWidth2);
        a40Var.j1.invalidate();
    }
}
