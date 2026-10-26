package di;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class j7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ View b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ l7 d;

    public j7(l7 l7Var, TextView textView, View view, TextView textView2) {
        this.d = l7Var;
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
        l7 l7Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(gb1.o(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(gb1.o(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            l7Var.requestLayout();
        }
        l7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
