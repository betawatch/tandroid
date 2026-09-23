package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ng(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.b;
                xnVar.b9 = true;
                xnVar.Z8 = 0;
                xnVar.pb = 0;
                xnVar.N4 = 0;
                xnVar.r9();
                xnVar.Nb(false);
                break;
            case 1:
                so soVar = (so) this.b;
                soVar.M0 = false;
                soVar.b = null;
                soVar.N0 = false;
                break;
            case 2:
                ((sp) this.b).n = null;
                break;
            default:
                ac0 ac0Var = (ac0) this.b;
                if (ac0Var.h >= 0) {
                    ConnectionsManager.getInstance(ac0Var.b).cancelRequest(ac0Var.h, true);
                    ac0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
