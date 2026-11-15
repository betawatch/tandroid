package ki;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                return x2.h((x2) this.b, view, windowInsets);
            default:
                return org.telegram.ui.ActionBar.u2.z((org.telegram.ui.ActionBar.u2) this.b, windowInsets);
        }
    }
}
