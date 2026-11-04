package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mw b;

    public /* synthetic */ lw(mw mwVar, int i3) {
        this.a = i3;
        this.b = mwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        switch (this.a) {
            case 0:
                mw mwVar = this.b;
                uw uwVar = mwVar.o0;
                Context context = mwVar.getContext();
                i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                uwVar.showDialog(new vg.i0(3, i3, context, uwVar, null));
                break;
            default:
                uw uwVar2 = this.b.o0;
                rv rvVar = uwVar2.N0;
                if (rvVar != null) {
                    rvVar.dismiss();
                    uwVar2.N0 = null;
                    break;
                }
                break;
        }
    }
}
