// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class g81 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z81 b;
    public final /* synthetic */ int c;

    public /* synthetic */ g81(z81 z81Var, int i, byte b) {
        this.a = b;
        this.b = z81Var;
        this.c = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.c;
        z81 z81Var = this.b;
        switch (b) {
            case 0:
                z81Var.getConnectionsManager().cancelRequest(i, true);
                break;
            default:
                z81Var.getConnectionsManager().cancelRequest(i, true);
                break;
        }
    }
}
