package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ oy(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                py pyVar = this.b;
                wy wyVar = pyVar.E0;
                Context context = pyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
                wyVar.showDialog(new rg.j0(3, i10, context, wyVar, null));
                break;
            default:
                wy wyVar2 = this.b.E0;
                sx sxVar = wyVar2.M0;
                if (sxVar != null) {
                    sxVar.dismiss();
                    wyVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
