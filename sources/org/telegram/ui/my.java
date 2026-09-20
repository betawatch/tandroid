package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
