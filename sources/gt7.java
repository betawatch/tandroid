// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt7 b;

    public /* synthetic */ gt7(wt7 wt7Var, byte b) {
        this.a = b;
        this.b = wt7Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                wt7Var.y0(false);
                break;
            default:
                wt7Var.y0(false);
                break;
        }
    }
}
