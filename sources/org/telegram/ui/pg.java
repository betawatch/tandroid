package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                bo boVar = (bo) this.b;
                boVar.b9 = true;
                boVar.Z8 = 0;
                boVar.pb = 0;
                boVar.N4 = 0;
                boVar.r9();
                boVar.Nb(false);
                break;
            case 1:
                wo woVar = (wo) this.b;
                woVar.M0 = false;
                woVar.b = null;
                woVar.N0 = false;
                break;
            case 2:
                ((wp) this.b).n = null;
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
