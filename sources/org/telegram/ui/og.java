package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ og(un unVar, org.telegram.ui.ActionBar.x1[] x1VarArr, int i10, int i11) {
        this.a = i11;
        this.b = unVar;
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
                    final un unVar = this.b;
                    final int i11 = this.d;
                    x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.wg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    unVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    unVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    unVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    unVar.showDialog(x1VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.x1[] x1VarArr2 = this.c;
                org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr2[0];
                if (x1Var2 != null) {
                    final int i12 = 0;
                    final un unVar2 = this.b;
                    final int i13 = this.d;
                    x1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.wg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    unVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    unVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    unVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    unVar2.showDialog(x1VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.x1[] x1VarArr3 = this.c;
                org.telegram.ui.ActionBar.x1 x1Var3 = x1VarArr3[0];
                if (x1Var3 != null) {
                    final int i14 = 2;
                    final un unVar3 = this.b;
                    final int i15 = this.d;
                    x1Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.wg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    unVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    unVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    unVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    unVar3.showDialog(x1VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
