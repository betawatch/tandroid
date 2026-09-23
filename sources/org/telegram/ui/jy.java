package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class jy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ky b;

    public /* synthetic */ jy(ky kyVar, int i10) {
        this.a = i10;
        this.b = kyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                ky kyVar = this.b;
                ry ryVar = kyVar.E0;
                Context context = kyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                ryVar.showDialog(new rg.j0(3, i10, context, ryVar, null));
                break;
            default:
                ry ryVar2 = this.b.E0;
                nx nxVar = ryVar2.M0;
                if (nxVar != null) {
                    nxVar.dismiss();
                    ryVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
