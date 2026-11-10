package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;

    public /* synthetic */ x2(int i7) {
        this.a = i7;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return a3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.g4.c(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
