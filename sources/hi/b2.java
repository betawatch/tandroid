package hi;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
