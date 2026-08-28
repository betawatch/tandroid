package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eg(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.b;
                qnVar.X8 = true;
                qnVar.V8 = 0;
                qnVar.mb = 0;
                qnVar.J4 = 0;
                qnVar.r9();
                qnVar.Nb(false);
                break;
            case 1:
                ho hoVar = (ho) this.b;
                hoVar.I0 = false;
                hoVar.b = null;
                hoVar.J0 = false;
                break;
            case 2:
                ((hp) this.b).n = null;
                break;
            default:
                kb0 kb0Var = (kb0) this.b;
                if (kb0Var.h >= 0) {
                    ConnectionsManager.getInstance(kb0Var.b).cancelRequest(kb0Var.h, true);
                    kb0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
