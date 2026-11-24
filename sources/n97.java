// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class n97 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ n97(oc7 oc7Var, int i, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.getConnectionsManager().cancelRequest(i, true);
                break;
            default:
                oc7Var.getConnectionsManager().cancelRequest(i, true);
                break;
        }
    }
}
