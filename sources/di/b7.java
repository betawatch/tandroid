package di;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import c8.ha;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ View b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ d7 d;

    public b7(d7 d7Var, TextView textView, View view, TextView textView2) {
        this.d = d7Var;
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
        d7 d7Var = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(ha.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(ha.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            d7Var.requestLayout();
        }
        d7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
