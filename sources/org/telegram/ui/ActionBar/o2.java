package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;

    public /* synthetic */ o2(Dialog dialog, int i10) {
        this.a = i10;
        this.b = dialog;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return z2.A((z2) this.b, windowInsets);
            default:
                return xh.m2.h((xh.m2) this.b, view, windowInsets);
        }
    }
}
