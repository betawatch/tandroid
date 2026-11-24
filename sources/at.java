// default package

import android.content.DialogInterface;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class at implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ at(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                oVar.c.e(true);
                break;
            default:
                oVar.l0 = null;
                break;
        }
    }
}
