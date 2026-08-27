package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                rn rnVar = (rn) this.b;
                rnVar.X8 = true;
                rnVar.V8 = 0;
                rnVar.mb = 0;
                rnVar.J4 = 0;
                rnVar.r9();
                rnVar.Nb(false);
                break;
            case 1:
                jo joVar = (jo) this.b;
                joVar.I0 = false;
                joVar.b = null;
                joVar.J0 = false;
                break;
            case 2:
                ((jp) this.b).n = null;
                break;
            default:
                ob0 ob0Var = (ob0) this.b;
                if (ob0Var.h >= 0) {
                    ConnectionsManager.getInstance(ob0Var.b).cancelRequest(ob0Var.h, true);
                    ob0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
