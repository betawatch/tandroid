package ki;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;

    public /* synthetic */ x1(Dialog dialog, int i7) {
        this.a = i7;
        this.b = dialog;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return t2.h((t2) this.b, view, windowInsets);
            default:
                return org.telegram.ui.ActionBar.x2.z((org.telegram.ui.ActionBar.x2) this.b, windowInsets);
        }
    }
}
