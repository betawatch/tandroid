package nh;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class v6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ View b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ x6 d;

    public v6(x6 x6Var, TextView textView, View view, TextView textView2) {
        this.d = x6Var;
        this.a = textView;
        this.b = view;
        this.c = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.b.getMeasuredHeight();
        x6 x6Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(k7.b6.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(k7.b6.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            x6Var.requestLayout();
        }
        x6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
