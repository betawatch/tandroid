package ih;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class x6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ View b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ z6 d;

    public x6(z6 z6Var, TextView textView, View view, TextView textView2) {
        this.d = z6Var;
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
        z6 z6Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(g7.e6.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(g7.e6.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            z6Var.requestLayout();
        }
        z6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
