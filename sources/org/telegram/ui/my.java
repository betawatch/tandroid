package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                uyVar.showDialog(new rg.k0(3, i10, context, uyVar, null));
                break;
            default:
                uy uyVar2 = this.b.E0;
                ox oxVar = uyVar2.M0;
                if (oxVar != null) {
                    oxVar.dismiss();
                    uyVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
