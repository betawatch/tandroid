package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class my implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny b;

    public /* synthetic */ my(ny nyVar, int i10) {
        this.a = i10;
        this.b = nyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                ny nyVar = this.b;
                uy uyVar = nyVar.E0;
                Context context = nyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                uyVar.showDialog(new rg.j0(3, i10, context, uyVar, null));
                break;
            default:
                uy uyVar2 = this.b.E0;
                qx qxVar = uyVar2.M0;
                if (qxVar != null) {
                    qxVar.dismiss();
                    uyVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
