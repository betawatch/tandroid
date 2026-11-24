// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class km1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;

    public /* synthetic */ km1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                gs1 gs1Var = yv1Var.m2;
                if (gs1Var != null) {
                    gs1Var.c(false);
                    break;
                }
                break;
            case 1:
                yv1Var.D9();
                break;
            case 2:
                yv1Var.y6(false, true, 0.0f);
                break;
            case 3:
                yv1Var.y6(false, true, 0.0f);
                break;
            case 4:
                yv1Var.y6(false, true, 0.0f);
                break;
            case 5:
                yv1Var.y6(false, true, 0.0f);
                break;
            case 6:
                yv1Var.y6(false, true, 0.0f);
                break;
            case 7:
                yv1Var.y6(false, true, 0.0f);
                break;
            default:
                yv1Var.uc = null;
                break;
        }
    }
}
