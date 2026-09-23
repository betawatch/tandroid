package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                return org.telegram.ui.i4.e(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
