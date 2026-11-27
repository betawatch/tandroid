// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kl1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ kl1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                hr1 hr1Var = zu1Var.m2;
                if (hr1Var != null) {
                    hr1Var.c(false);
                    break;
                }
                break;
            case 1:
                zu1Var.E9();
                break;
            case 2:
                zu1Var.y6(false, true, 0.0f);
                break;
            case 3:
                zu1Var.y6(false, true, 0.0f);
                break;
            case 4:
                zu1Var.y6(false, true, 0.0f);
                break;
            case 5:
                zu1Var.y6(false, true, 0.0f);
                break;
            case 6:
                zu1Var.y6(false, true, 0.0f);
                break;
            case 7:
                zu1Var.vc = null;
                break;
            default:
                zu1Var.y6(false, true, 0.0f);
                break;
        }
    }
}
