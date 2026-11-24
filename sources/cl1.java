// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cl1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ cl1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                uq1 uq1Var = mu1Var.m2;
                if (uq1Var != null) {
                    uq1Var.c(false);
                    break;
                }
                break;
            case 1:
                mu1Var.t9();
                break;
            case 2:
                mu1Var.r6(false, true, 0.0f);
                break;
            case 3:
                mu1Var.r6(false, true, 0.0f);
                break;
            case 4:
                mu1Var.r6(false, true, 0.0f);
                break;
            case 5:
                mu1Var.r6(false, true, 0.0f);
                break;
            case 6:
                mu1Var.r6(false, true, 0.0f);
                break;
            case 7:
                mu1Var.r6(false, true, 0.0f);
                break;
            default:
                mu1Var.kc = null;
                break;
        }
    }
}
