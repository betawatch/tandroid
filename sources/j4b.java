// default package

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class j4b implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ cab b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ l4b d;

    public j4b(l4b l4bVar, TextView textView, cab cabVar, TextView textView2) {
        this.d = l4bVar;
        this.a = textView;
        this.b = cabVar;
        this.c = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.a;
        textView.getLocationOnScreen(iArr);
        int L = gm.L(24.0f) + iArr[1];
        int measuredHeight = this.b.getMeasuredHeight();
        l4b l4bVar = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(qoe.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(qoe.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            l4bVar.requestLayout();
        }
        l4bVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
