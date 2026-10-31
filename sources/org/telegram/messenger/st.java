package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class st implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ st(int i10, int i11, Object obj, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
        this.d = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                j20 j20Var = (j20) this.d;
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                j20Var.a(null, "CANCELLED");
                break;
            default:
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) this.d;
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                x1VarArr[0] = null;
                break;
        }
    }
}
