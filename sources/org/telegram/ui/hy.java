package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iy b;

    public /* synthetic */ hy(iy iyVar, int i10) {
        this.a = i10;
        this.b = iyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                iy iyVar = this.b;
                py pyVar = iyVar.B0;
                Context context = iyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                pyVar.showDialog(new fg.v0(3, i10, context, pyVar, null));
                break;
            default:
                py pyVar2 = this.b.B0;
                mx mxVar = pyVar2.J0;
                if (mxVar != null) {
                    mxVar.dismiss();
                    pyVar2.J0 = null;
                    break;
                }
                break;
        }
    }
}
