// default package

import android.content.DialogInterface;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e65 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j95 b;

    public /* synthetic */ e65(j95 j95Var, byte b) {
        this.a = b;
        this.b = j95Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        j95 j95Var = this.b;
        switch (b) {
            case 0:
                e S = LaunchActivity.S();
                if (j95Var.r2 && (S instanceof zu1)) {
                    ((zu1) S).ja(true, true);
                    break;
                }
                break;
            case 1:
                j95Var.dismiss();
                break;
            case 2:
                j95Var.k2 = null;
                break;
            default:
                j95Var.y3 = null;
                break;
        }
    }
}
