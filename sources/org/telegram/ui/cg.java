package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                tn tnVar = (tn) this.b;
                tnVar.X8 = true;
                tnVar.V8 = 0;
                tnVar.mb = 0;
                tnVar.J4 = 0;
                tnVar.r9();
                tnVar.Nb(false);
                break;
            case 1:
                ko koVar = (ko) this.b;
                koVar.I0 = false;
                koVar.b = null;
                koVar.J0 = false;
                break;
            case 2:
                ((kp) this.b).n = null;
                break;
            default:
                mb0 mb0Var = (mb0) this.b;
                if (mb0Var.h >= 0) {
                    ConnectionsManager.getInstance(mb0Var.b).cancelRequest(mb0Var.h, true);
                    mb0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
