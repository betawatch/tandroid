// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv7 b;

    public /* synthetic */ hv7(xv7 xv7Var, byte b) {
        this.a = b;
        this.b = xv7Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                xv7Var.y0(false);
                break;
            default:
                xv7Var.y0(false);
                break;
        }
    }
}
