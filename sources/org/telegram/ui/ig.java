package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
