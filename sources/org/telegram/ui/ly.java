package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ my b;

    public /* synthetic */ ly(my myVar, int i10) {
        this.a = i10;
        this.b = myVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                my myVar = this.b;
                ty tyVar = myVar.E0;
                Context context = myVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                tyVar.showDialog(new rg.j0(3, i10, context, tyVar, null));
                break;
            default:
                ty tyVar2 = this.b.E0;
                px pxVar = tyVar2.M0;
                if (pxVar != null) {
                    pxVar.dismiss();
                    tyVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
