package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                co coVar = (co) this.b;
                coVar.b9 = true;
                coVar.Z8 = 0;
                coVar.qb = 0;
                coVar.N4 = 0;
                coVar.r9();
                coVar.Nb(false);
                break;
            case 1:
                xo xoVar = (xo) this.b;
                xoVar.M0 = false;
                xoVar.b = null;
                xoVar.N0 = false;
                break;
            case 2:
                ((xp) this.b).n = null;
                break;
            default:
                fc0 fc0Var = (fc0) this.b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
