// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class eg3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;

    public /* synthetic */ eg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                if (cj3Var.W3 != null) {
                    cj3Var.getMessagesController().n4(0L, cj3Var.W3);
                    cj3Var.W3 = null;
                    cj3Var.c5();
                    break;
                }
                break;
            case 1:
                cj3Var.y3(true);
                break;
            case 2:
                cj3Var.y3(true);
                break;
            default:
                cj3Var.U3();
                break;
        }
    }
}
