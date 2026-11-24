// default package

import android.content.DialogInterface;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bu implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ bu(o oVar, byte b) {
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
