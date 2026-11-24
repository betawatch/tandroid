// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class k77 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ k77(na7 na7Var, int i, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.getConnectionsManager().cancelRequest(i, true);
                break;
            default:
                na7Var.getConnectionsManager().cancelRequest(i, true);
                break;
        }
    }
}
