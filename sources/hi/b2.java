package hi;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;

    public /* synthetic */ b2(Dialog dialog, int i7) {
        this.a = i7;
        this.b = dialog;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return a3.h((a3) this.b, view, windowInsets);
            default:
                return org.telegram.ui.ActionBar.v2.z((org.telegram.ui.ActionBar.v2) this.b, windowInsets);
        }
    }
}
