// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lg6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rg6 b;

    public /* synthetic */ lg6(rg6 rg6Var, byte b) {
        this.a = b;
        this.b = rg6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        rg6 rg6Var = this.b;
        switch (b) {
            case 0:
                rg6Var.v0.finishFragment();
                break;
            default:
                rg6Var.v0.finishFragment();
                break;
        }
    }
}
