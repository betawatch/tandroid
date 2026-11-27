// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class n81 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i91 b;
    public final /* synthetic */ int c;

    public /* synthetic */ n81(i91 i91Var, int i, byte b) {
        this.a = b;
        this.b = i91Var;
        this.c = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.c;
        i91 i91Var = this.b;
        switch (b) {
            case 0:
                i91Var.getConnectionsManager().cancelRequest(i, true);
                break;
            default:
                i91Var.getConnectionsManager().cancelRequest(i, true);
                break;
        }
    }
}
