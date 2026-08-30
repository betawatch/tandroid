package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                ((qp) this.b).n = null;
                break;
            default:
                wb0 wb0Var = (wb0) this.b;
                if (wb0Var.h >= 0) {
                    ConnectionsManager.getInstance(wb0Var.b).cancelRequest(wb0Var.h, true);
                    wb0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
