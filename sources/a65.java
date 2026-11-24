// default package

import android.content.DialogInterface;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a65 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g95 b;

    public /* synthetic */ a65(g95 g95Var, byte b) {
        this.a = b;
        this.b = g95Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        g95 g95Var = this.b;
        switch (b) {
            case 0:
                d S = LaunchActivity.S();
                if (g95Var.r2 && (S instanceof yv1)) {
                    ((yv1) S).ia(true, true);
                    break;
                }
                break;
            case 1:
                g95Var.dismiss();
                break;
            case 2:
                g95Var.y3 = null;
                break;
            default:
                g95Var.k2 = null;
                break;
        }
    }
}
