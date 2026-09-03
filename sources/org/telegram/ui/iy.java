package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jy b;

    public /* synthetic */ iy(jy jyVar, int i10) {
        this.a = i10;
        this.b = jyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                jy jyVar = this.b;
                qy qyVar = jyVar.B0;
                Context context = jyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                qyVar.showDialog(new eg.v0(3, i10, context, qyVar, null));
                break;
            default:
                qy qyVar2 = this.b.B0;
                nx nxVar = qyVar2.J0;
                if (nxVar != null) {
                    nxVar.dismiss();
                    qyVar2.J0 = null;
                    break;
                }
                break;
        }
    }
}
