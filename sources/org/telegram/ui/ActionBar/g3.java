package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;

    public /* synthetic */ g3(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return i3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.l4.e(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
