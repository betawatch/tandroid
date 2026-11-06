package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ez0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ez0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.b, windowInsets);
            default:
                return m11.b((g01) this.b, view, windowInsets);
        }
    }
}
