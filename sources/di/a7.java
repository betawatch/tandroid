package di;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import c8.ha;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class a7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ View b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ c7 d;

    public a7(c7 c7Var, TextView textView, View view, TextView textView2) {
        this.d = c7Var;
        this.a = textView;
        this.b = view;
        this.c = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.a;
        textView.getLocationOnScreen(iArr);
        int L = org.telegram.messenger.g0.L(24.0f) + iArr[1];
        int measuredHeight = this.b.getMeasuredHeight();
        c7 c7Var = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(ha.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(ha.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            c7Var.requestLayout();
        }
        c7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
