package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                qy qyVar = jyVar.E0;
                Context context = jyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                qyVar.showDialog(new rg.j0(3, i10, context, qyVar, null));
                break;
            default:
                qy qyVar2 = this.b.E0;
                mx mxVar = qyVar2.M0;
                if (mxVar != null) {
                    mxVar.dismiss();
                    qyVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
