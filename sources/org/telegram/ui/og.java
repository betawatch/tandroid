package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ og(un unVar, org.telegram.ui.ActionBar.e2[] e2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = unVar;
        this.c = e2VarArr;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.c;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    final int i10 = 0;
                    final un unVar = this.b;
                    final int i11 = this.d;
                    e2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.wg
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
                    unVar.showDialog(e2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.c;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr2[0];
                if (e2Var2 != null) {
                    final int i12 = 1;
                    final un unVar2 = this.b;
                    final int i13 = this.d;
                    e2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.wg
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
                    unVar2.showDialog(e2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.e2[] e2VarArr3 = this.c;
                org.telegram.ui.ActionBar.e2 e2Var3 = e2VarArr3[0];
                if (e2Var3 != null) {
                    final int i14 = 2;
                    final un unVar3 = this.b;
                    final int i15 = this.d;
                    e2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.wg
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
                    unVar3.showDialog(e2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
