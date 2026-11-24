// default package

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class i2b implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ a8b b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ k2b d;

    public i2b(k2b k2bVar, TextView textView, a8b a8bVar, TextView textView2) {
        this.d = k2bVar;
        this.a = textView;
        this.b = a8bVar;
        this.c = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.a;
        textView.getLocationOnScreen(iArr);
        int L = gl.L(24.0f) + iArr[1];
        int measuredHeight = this.b.getMeasuredHeight();
        k2b k2bVar = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(nme.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.c.setLayoutParams(nme.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            k2bVar.requestLayout();
        }
        k2bVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
