package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                gc0 gc0Var = (gc0) this.b;
                if (gc0Var.h >= 0) {
                    ConnectionsManager.getInstance(gc0Var.b).cancelRequest(gc0Var.h, true);
                    gc0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
