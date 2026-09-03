package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ pg(xn xnVar, org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = xnVar;
        this.c = d2VarArr;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.c;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    final int i10 = 0;
                    final xn xnVar = this.b;
                    final int i11 = this.d;
                    d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.yg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    xnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    xnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    xnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    xnVar.showDialog(d2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.c;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr2[0];
                if (d2Var2 != null) {
                    final int i12 = 1;
                    final xn xnVar2 = this.b;
                    final int i13 = this.d;
                    d2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.yg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    xnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    xnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    xnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    xnVar2.showDialog(d2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr3 = this.c;
                org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr3[0];
                if (d2Var3 != null) {
                    final int i14 = 2;
                    final xn xnVar3 = this.b;
                    final int i15 = this.d;
                    d2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.yg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    xnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    xnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    xnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    xnVar3.showDialog(d2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
