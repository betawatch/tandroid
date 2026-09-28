package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
