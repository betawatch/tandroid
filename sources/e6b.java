// default package

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class e6b implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ ybb b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ g6b d;

    public e6b(g6b g6bVar, TextView textView, ybb ybbVar, TextView textView2) {
        this.d = g6bVar;
        this.a = textView;
        this.b = ybbVar;
        this.c = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.a;
        textView.getLocationOnScreen(iArr);
        int L = hl.L(24.0f) + iArr[1];
        int measuredHeight = this.b.getMeasuredHeight();
        g6b g6bVar = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(tre.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(tre.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            g6bVar.requestLayout();
        }
        g6bVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
