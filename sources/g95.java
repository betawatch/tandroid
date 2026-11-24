// default package

import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class g95 extends fx0 {
    public gec l1;
    public e95 m1;
    public LinearLayout n1;
    public TextView[] o1;
    public float p1;
    public int q1;

    public final void D0() {
        TextView[] textViewArr = this.o1;
        int i = this.q1;
        TextView textView = textViewArr[i];
        TextView textView2 = i < textViewArr.length + (-1) ? textViewArr[i + 1] : null;
        this.b.getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (this.b.getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * this.p1;
        }
        for (int i2 = 0; i2 < textViewArr.length; i2++) {
            int i3 = this.q1;
            float f = 0.9f;
            float f2 = 0.7f;
            if (i2 >= i3 && i2 <= i3 + 1) {
                float f3 = this.p1;
                float f4 = 0.3f * f3;
                if (i2 == i3) {
                    f2 = 1.0f - f4;
                    f = 1.0f - (f3 * 0.1f);
                } else {
                    f2 = 0.7f + f4;
                    f = 0.9f + (f3 * 0.1f);
                }
            }
            textViewArr[i2].setAlpha(f2);
            textViewArr[i2].setScaleX(f);
            textViewArr[i2].setScaleY(f);
        }
        this.n1.setTranslationX(measuredWidth2);
        this.m1.invalidate();
    }
}
