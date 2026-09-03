package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ig(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.b;
                xnVar.Y8 = true;
                xnVar.W8 = 0;
                xnVar.nb = 0;
                xnVar.K4 = 0;
                xnVar.r9();
                xnVar.Nb(false);
                break;
            case 1:
                po poVar = (po) this.b;
                poVar.J0 = false;
                poVar.b = null;
                poVar.K0 = false;
                break;
            case 2:
                ((rp) this.b).n = null;
                break;
            default:
                xb0 xb0Var = (xb0) this.b;
                if (xb0Var.h >= 0) {
                    ConnectionsManager.getInstance(xb0Var.b).cancelRequest(xb0Var.h, true);
                    xb0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
