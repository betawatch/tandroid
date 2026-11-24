// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bn9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ on9 b;

    public /* synthetic */ bn9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                on9Var.K0 = null;
                break;
            default:
                on9Var.dismiss();
                break;
        }
    }
}
