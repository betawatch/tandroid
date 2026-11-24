// default package

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m6b implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ n6b a;

    public m6b(n6b n6bVar) {
        this.a = n6bVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i;
        int i2;
        int i3;
        int i4;
        n6b n6bVar = this.a;
        ne6 ne6Var = n6bVar.b;
        Rect rect = n6bVar.h;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            Insets insets = windowInsets.getInsets(647);
            i = insets.left;
            i2 = insets.top;
            i3 = insets.right;
            i4 = insets.bottom;
            rect.set(i, i2, i3, i4);
        } else {
            rect.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        ne6Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        ne6Var.requestLayout();
        if (i5 < 30) {
            return windowInsets.consumeSystemWindowInsets();
        }
        windowInsets2 = WindowInsets.CONSUMED;
        return windowInsets2;
    }
}
