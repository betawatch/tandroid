package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.b;
                znVar.Y8 = true;
                znVar.W8 = 0;
                znVar.nb = 0;
                znVar.K4 = 0;
                znVar.r9();
                znVar.Nb(false);
                break;
            case 1:
                ro roVar = (ro) this.b;
                roVar.J0 = false;
                roVar.b = null;
                roVar.K0 = false;
                break;
            case 2:
                ((sp) this.b).n = null;
                break;
            default:
                yb0 yb0Var = (yb0) this.b;
                if (yb0Var.h >= 0) {
                    ConnectionsManager.getInstance(yb0Var.b).cancelRequest(yb0Var.h, true);
                    yb0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
