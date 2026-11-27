// default package

import android.content.DialogInterface;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class lt implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ lt(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                oVar.l0 = null;
                break;
            default:
                oVar.c.e(true);
                break;
        }
    }
}
