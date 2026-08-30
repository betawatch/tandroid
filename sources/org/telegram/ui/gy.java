package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hy b;

    public /* synthetic */ gy(hy hyVar, int i10) {
        this.a = i10;
        this.b = hyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                hy hyVar = this.b;
                oy oyVar = hyVar.B0;
                Context context = hyVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                oyVar.showDialog(new eg.v0(3, i10, context, oyVar, null));
                break;
            default:
                oy oyVar2 = this.b.B0;
                lx lxVar = oyVar2.J0;
                if (lxVar != null) {
                    lxVar.dismiss();
                    oyVar2.J0 = null;
                    break;
                }
                break;
        }
    }
}
