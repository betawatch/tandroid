package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class w8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ View b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ y8 d;

    public w8(y8 y8Var, TextView textView, View view, TextView textView2) {
        this.d = y8Var;
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
        y8 y8Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(w7.x5.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(w7.x5.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            y8Var.requestLayout();
        }
        y8Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
