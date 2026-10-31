package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ ep(qp qpVar, org.telegram.ui.ActionBar.x1[] x1VarArr, int i10, int i11) {
        this.a = i11;
        this.b = qpVar;
        this.c = x1VarArr;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = this.c;
                org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                if (x1Var != null) {
                    final int i10 = 1;
                    final qp qpVar = this.b;
                    final int i11 = this.d;
                    x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.gp
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    ConnectionsManager.getInstance(qpVar.currentAccount).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(qpVar.currentAccount).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    qpVar.showDialog(x1VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.x1[] x1VarArr2 = this.c;
                org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr2[0];
                if (x1Var2 != null) {
                    final int i12 = 0;
                    final qp qpVar2 = this.b;
                    final int i13 = this.d;
                    x1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.gp
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    ConnectionsManager.getInstance(qpVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(qpVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    qpVar2.showDialog(x1VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
