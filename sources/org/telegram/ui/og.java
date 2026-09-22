package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ og(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.b;
                znVar.b9 = true;
                znVar.Z8 = 0;
                znVar.pb = 0;
                znVar.N4 = 0;
                znVar.r9();
                znVar.Nb(false);
                break;
            case 1:
                uo uoVar = (uo) this.b;
                uoVar.M0 = false;
                uoVar.b = null;
                uoVar.N0 = false;
                break;
            case 2:
                ((up) this.b).n = null;
                break;
            default:
                hc0 hc0Var = (hc0) this.b;
                if (hc0Var.h >= 0) {
                    ConnectionsManager.getInstance(hc0Var.b).cancelRequest(hc0Var.h, true);
                    hc0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
