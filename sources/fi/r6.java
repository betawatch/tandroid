package fi;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import c8.ma;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class r6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ View b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ t6 d;

    public r6(t6 t6Var, TextView textView, View view, TextView textView2) {
        this.d = t6Var;
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
        t6 t6Var = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(ma.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(ma.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            t6Var.requestLayout();
        }
        t6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
