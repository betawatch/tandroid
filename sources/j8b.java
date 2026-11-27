// default package

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class j8b implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ k8b a;

    public j8b(k8b k8bVar) {
        this.a = k8bVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i;
        int i2;
        int i3;
        int i4;
        k8b k8bVar = this.a;
        h8b h8bVar = k8bVar.b;
        Rect rect = k8bVar.h;
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
        h8bVar.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        h8bVar.requestLayout();
        if (i5 < 30) {
            return windowInsets.consumeSystemWindowInsets();
        }
        windowInsets2 = WindowInsets.CONSUMED;
        return windowInsets2;
    }
}
