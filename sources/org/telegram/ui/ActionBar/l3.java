package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l3 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;

    public /* synthetic */ l3(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return o3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.j4.e(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
