// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
