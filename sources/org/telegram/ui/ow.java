package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pw b;

    public /* synthetic */ ow(pw pwVar, int i7) {
        this.a = i7;
        this.b = pwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                pw pwVar = this.b;
                ww wwVar = pwVar.n0;
                Context context = pwVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                wwVar.showDialog(new ug.i0(3, i7, context, wwVar, null));
                break;
            default:
                ww wwVar2 = this.b.n0;
                uv uvVar = wwVar2.M0;
                if (uvVar != null) {
                    uvVar.dismiss();
                    wwVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
