// default package

import android.content.DialogInterface;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b45 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h75 b;

    public /* synthetic */ b45(h75 h75Var, byte b) {
        this.a = b;
        this.b = h75Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        h75 h75Var = this.b;
        switch (b) {
            case 0:
                d S = LaunchActivity.S();
                if (h75Var.r2 && (S instanceof mu1)) {
                    ((mu1) S).W9(true, true);
                    break;
                }
                break;
            case 1:
                h75Var.dismiss();
                break;
            case 2:
                h75Var.y3 = null;
                break;
            default:
                h75Var.k2 = null;
                break;
        }
    }
}
