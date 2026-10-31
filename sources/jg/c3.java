package jg;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c3 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ d3 a;

    public c3(d3 d3Var) {
        this.a = d3Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i10;
        int i11;
        int i12;
        int i13;
        d3 d3Var = this.a;
        l0 l0Var = d3Var.b;
        Rect rect = d3Var.h;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            Insets insets = windowInsets.getInsets(647);
            i10 = insets.left;
            i11 = insets.top;
            i12 = insets.right;
            i13 = insets.bottom;
            rect.set(i10, i11, i12, i13);
        } else {
            rect.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        l0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        l0Var.requestLayout();
        if (i14 < 30) {
            return windowInsets.consumeSystemWindowInsets();
        }
        windowInsets2 = WindowInsets.CONSUMED;
        return windowInsets2;
    }
}
