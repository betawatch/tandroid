package ei;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import b8.mf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
            textView.setLayoutParams(mf.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(mf.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            d7Var.requestLayout();
        }
        d7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
